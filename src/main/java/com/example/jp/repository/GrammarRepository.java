package com.example.jp.repository;

import com.example.jp.entity.GrammarEntity;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GrammarRepository extends JpaRepository<GrammarEntity,Long> {
    void deleteByGrammar(String word);

    List<GrammarEntity> findAllByLevel(String level, Pageable page);
}
