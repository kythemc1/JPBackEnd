package com.example.jp.service.Service;

import com.example.jp.entity.GrammarEntity;
import com.example.jp.entity.VocabularyEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface GrammarService {
    List<GrammarEntity> getAllN1(int page);
    List<GrammarEntity> getAllN2(int page);
    List<GrammarEntity> getAllN3(int page);
    List<GrammarEntity> getAllN4(int page);
    List<GrammarEntity> getAllN5(int page);
}
