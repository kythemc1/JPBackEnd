package com.example.jp.repository;

import com.example.jp.entity.VocabularyEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VocabularyRepository extends JpaRepository<VocabularyEntity,Long> {
}
