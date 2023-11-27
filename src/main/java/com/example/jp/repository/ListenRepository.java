package com.example.jp.repository;

import com.example.jp.entity.ListenEntity;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ListenRepository extends JpaRepository<ListenEntity,Long> {
    void deleteByNameVideo(String nameVideo);

    List<ListenEntity> findAllByLevel(String level, Pageable page);

}
