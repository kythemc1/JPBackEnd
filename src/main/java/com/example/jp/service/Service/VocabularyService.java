package com.example.jp.service.Service;

import com.example.jp.entity.VocabularyEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface VocabularyService {
    List<VocabularyEntity> getAllN1(int page);
    List<VocabularyEntity> getAllN2(int page);
    List<VocabularyEntity> getAllN3(int page);
    List<VocabularyEntity> getAllN4(int page);
    List<VocabularyEntity> getAllN5(int page);
}
