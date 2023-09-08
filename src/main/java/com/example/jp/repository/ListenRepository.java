package com.example.jp.repository;

import com.example.jp.entity.ListenEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ListenRepository extends JpaRepository<ListenEntity,Long> {
}
