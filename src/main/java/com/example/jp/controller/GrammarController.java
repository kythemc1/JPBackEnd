package com.example.jp.controller;

import com.example.jp.entity.GrammarEntity;
import com.example.jp.repository.GrammarRepository;
import com.example.jp.service.Service.GrammarService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
@Controller
@RequestMapping(value = "/api/grammar")
public class GrammarController {
    private final GrammarRepository grammarRepository;
    private final GrammarService grammarService;

    public GrammarController(GrammarRepository grammarRepository, GrammarService grammarService) {
        this.grammarRepository = grammarRepository;
        this.grammarService = grammarService;
    }

    @PostMapping(value = "add-grammar")
    public ResponseEntity<?> addGrammar(@RequestBody GrammarEntity grammarEntity){

        grammarRepository.save(grammarEntity);
        return ResponseEntity.ok("ok");
    }

    @GetMapping(value = "get-all-n1/{page}")
    public ResponseEntity<?> getAllGrammarN1(@PathVariable int page){
        return ResponseEntity.ok(grammarService.getAllN1(page));
    }
    @GetMapping(value = "get-all-n2/{page}")
    public ResponseEntity<?> getAllGrammarN2(@PathVariable int page){
        return ResponseEntity.ok(grammarService.getAllN2(page));
    }
    @GetMapping(value = "get-all-n3/{page}")
    public ResponseEntity<?> getAllGrammarN3(@PathVariable int page){
        return ResponseEntity.ok(grammarService.getAllN3(page));
    }
    @GetMapping(value = "get-all-n4/{page}")
    public ResponseEntity<?> getAllGrammarN4(@PathVariable int page){
        return ResponseEntity.ok(grammarService.getAllN4(page));
    }
    @GetMapping(value = "get-all-n5/{page}")
    public ResponseEntity<?> getAllGrammarN5(@PathVariable int page){
        return ResponseEntity.ok(grammarService.getAllN5(page));
    }

    @DeleteMapping(value = "delete/{grammar}")
    public ResponseEntity<?> deleteByGrammar(@PathVariable String grammar){
        grammarRepository.deleteByGrammar(grammar);
        return ResponseEntity.ok("xoa thanh cong");
    }

}
