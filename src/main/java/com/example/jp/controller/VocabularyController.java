package com.example.jp.controller;

import com.example.jp.entity.VocabularyEntity;
import com.example.jp.repository.VocabularyRepository;
import com.example.jp.service.Service.VocabularyService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
@Controller
@RequestMapping(value = "/api/vocabulary")
public class VocabularyController {
    private final VocabularyRepository vocabularyRepository;
    private final VocabularyService vocabularyService;

    public VocabularyController(VocabularyRepository vocabularyRepository, VocabularyService vocabularyService) {
        this.vocabularyRepository = vocabularyRepository;
        this.vocabularyService = vocabularyService;
    }

    @PostMapping(value = "add-vocabulary")
    public ResponseEntity<?> addVocabulary(@RequestBody VocabularyEntity vocabularyEntity){
        vocabularyRepository.save(vocabularyEntity);
        return ResponseEntity.ok("ok");
    }

    @GetMapping(value = "get-all-n1/{page}")
    public ResponseEntity<?> getAllVocabularyN1(@PathVariable int page){
        return ResponseEntity.ok(vocabularyService.getAllN1(page));
    }
    @GetMapping(value = "get-all-n2/{page}")
    public ResponseEntity<?> getAllVocabularyN2(@PathVariable int page){
        return ResponseEntity.ok(vocabularyService.getAllN2(page));
    }
    @GetMapping(value = "get-all-n3/{page}")
    public ResponseEntity<?> getAllVocabularyN3(@PathVariable int page){
        return ResponseEntity.ok(vocabularyService.getAllN3(page));
    }
    @GetMapping(value = "get-all-n4/{page}")
    public ResponseEntity<?> getAllVocabularyN4(@PathVariable int page){
        return ResponseEntity.ok(vocabularyService.getAllN4(page));
    }
    @GetMapping(value = "get-all-n5/{page}")
    public ResponseEntity<?> getAllVocabularyN5(@PathVariable int page){
        return ResponseEntity.ok(vocabularyService.getAllN5(page));
    }

    @DeleteMapping(value = "delete/{word}")
    public ResponseEntity<?> deleteByName(@PathVariable String word){
        vocabularyRepository.deleteByWord(word);
        return ResponseEntity.ok("xoa thanh cong");
    }
}

