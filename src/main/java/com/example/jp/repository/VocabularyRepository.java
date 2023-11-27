package com.example.jp.repository;

import com.example.jp.entity.VocabularyEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import org.springframework.data.domain.Pageable;
import java.util.List;

@Repository
public interface VocabularyRepository extends JpaRepository<VocabularyEntity,Long> {
    void deleteByWord(String word);

    List<VocabularyEntity> findAllByLevel(String level, Pageable page);
}
