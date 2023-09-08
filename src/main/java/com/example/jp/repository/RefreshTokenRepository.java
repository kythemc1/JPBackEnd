package com.example.jp.repository;

import java.util.Optional;

import com.example.jp.entity.RefreshTokenEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RefreshTokenRepository extends JpaRepository<RefreshTokenEntity, Long> {
    Optional<RefreshTokenEntity> findByRefreshToken(String refreshToken);
//    @Modifying
//    int deleteByUser(UserEntity userEntity);
}