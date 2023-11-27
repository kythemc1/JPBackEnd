package com.example.jp.service.Ipml;

import com.example.jp.entity.ListenEntity;
import com.example.jp.repository.ListenRepository;
import com.example.jp.service.Service.ListenService;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ListenServiceImpl implements ListenService {
    private final ListenRepository listenRepository;

    public ListenServiceImpl(ListenRepository listenRepository) {
        this.listenRepository = listenRepository;
    }

    @Override
    public List<ListenEntity> getAllN1(int page) {
        Pageable pageable1 = PageRequest.of(page-1,20);
        List<ListenEntity> listenEntityList =listenRepository.findAllByLevel("N1",pageable1);

        return listenEntityList;
    }

    @Override
    public List<ListenEntity> getAllN2(int page) {
        Pageable pageable1 = PageRequest.of(page-1,20);
        List<ListenEntity> listenEntityList =listenRepository.findAllByLevel("N2",pageable1);

        return listenEntityList;
    }

    @Override
    public List<ListenEntity> getAllN3(int page) {
        Pageable pageable1 = PageRequest.of(page-1,20);
        List<ListenEntity> listenEntityList =listenRepository.findAllByLevel("N3",pageable1);

        return listenEntityList;
    }

    @Override
    public List<ListenEntity> getAllN4(int page) {
        Pageable pageable1 = PageRequest.of(page-1,20);
        List<ListenEntity> listenEntityList =listenRepository.findAllByLevel("N4",pageable1);

        return listenEntityList;
    }

    @Override
    public List<ListenEntity> getAllN5(int page) {
        Pageable pageable1 = PageRequest.of(page-1,20);
        List<ListenEntity> listenEntityList =listenRepository.findAllByLevel("N5",pageable1);

        return listenEntityList;
    }
}
