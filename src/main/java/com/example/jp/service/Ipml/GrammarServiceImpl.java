package com.example.jp.service.Ipml;

import com.example.jp.entity.GrammarEntity;
import com.example.jp.repository.GrammarRepository;
import com.example.jp.service.Service.GrammarService;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GrammarServiceImpl implements GrammarService {
    private final GrammarRepository grammarRepository;

    public GrammarServiceImpl(GrammarRepository grammarRepository) {
        this.grammarRepository = grammarRepository;
    }

    @Override
    public List<GrammarEntity> getAllN1(int page) {
        Pageable pageable1 = PageRequest.of(page-1,20);
        List<GrammarEntity> grammarEntityList =grammarRepository.findAllByLevel("N1",pageable1);

        return grammarEntityList;
    }

    @Override
    public List<GrammarEntity> getAllN2(int page) {
        Pageable pageable1 = PageRequest.of(page-1,20);
        List<GrammarEntity> grammarEntityList =grammarRepository.findAllByLevel("N2",pageable1);

        return grammarEntityList;
    }

    @Override
    public List<GrammarEntity> getAllN3(int page) {
        Pageable pageable1 = PageRequest.of(page-1,20);
        List<GrammarEntity> grammarEntityList =grammarRepository.findAllByLevel("N3",pageable1);

        return grammarEntityList;    }

    @Override
    public List<GrammarEntity> getAllN4(int page) {
        Pageable pageable1 = PageRequest.of(page-1,20);
        List<GrammarEntity> grammarEntityList =grammarRepository.findAllByLevel("N4",pageable1);

        return grammarEntityList;
    }

    @Override
    public List<GrammarEntity> getAllN5(int page) {
        Pageable pageable1 = PageRequest.of(page-1,20);
        List<GrammarEntity> grammarEntityList =grammarRepository.findAllByLevel("N5",pageable1);

        return grammarEntityList;    }
}
