package com.example.jp.service.Service;

import com.example.jp.entity.ListenEntity;
import com.example.jp.entity.VocabularyEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ListenService {
    List<ListenEntity> getAllN1(int page);
    List<ListenEntity> getAllN2(int page);
    List<ListenEntity> getAllN3(int page);
    List<ListenEntity> getAllN4(int page);
    List<ListenEntity> getAllN5(int page);

}
