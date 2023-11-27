package com.example.jp.service.Ipml;

import com.example.jp.entity.VocabularyEntity;
import com.example.jp.repository.VocabularyRepository;
import com.example.jp.service.Service.VocabularyService;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Pageable;

import java.util.List;

@Service
public class VocabularyServiceImpl implements VocabularyService {
    private final VocabularyRepository vocabularyRepository;

    public VocabularyServiceImpl(VocabularyRepository vocabularyRepository) {
        this.vocabularyRepository = vocabularyRepository;
    }

    @Override
    public List<VocabularyEntity> getAllN1(int page) {
        Pageable pageable1 = PageRequest.of(page-1,20);
        List<VocabularyEntity> vocabularyEntityList =vocabularyRepository.findAllByLevel("N1",pageable1);

        return vocabularyEntityList;
    }

    @Override
    public List<VocabularyEntity> getAllN2(int page) {
        Pageable pageable1 = PageRequest.of(page-1,20);
        List<VocabularyEntity> vocabularyEntityList =vocabularyRepository.findAllByLevel("N2",pageable1);

        return vocabularyEntityList;
    }

    @Override
    public List<VocabularyEntity> getAllN3(int page) {
        Pageable pageable1 = PageRequest.of(page-1,20);
        List<VocabularyEntity> vocabularyEntityList =vocabularyRepository.findAllByLevel("N3",pageable1);

        return vocabularyEntityList;
    }

    @Override
    public List<VocabularyEntity> getAllN4(int page) {
        Pageable pageable1 = PageRequest.of(page-1,20);
        List<VocabularyEntity> vocabularyEntityList =vocabularyRepository.findAllByLevel("N4",pageable1);

        return vocabularyEntityList;
    }

    @Override
    public List<VocabularyEntity> getAllN5(int page) {
        Pageable pageable1 = PageRequest.of(page-1,20);
        List<VocabularyEntity> vocabularyEntityList =vocabularyRepository.findAllByLevel("N5",pageable1);

        return vocabularyEntityList;
    }
}
