package com.example.jp.controller;

import com.example.jp.entity.ListenEntity;
import com.example.jp.repository.ListenRepository;
import com.example.jp.service.Service.ListenService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/api/listen")
public class ListenController {
    private final ListenService listenService;
    private final ListenRepository listenRepository;

    public ListenController(ListenService listenService, ListenRepository listenRepository) {
        this.listenService = listenService;
        this.listenRepository = listenRepository;
    }

    @PostMapping(value = "add-listen")
    public ResponseEntity<?> addListen(@RequestBody ListenEntity listenEntity){
        listenRepository.save(listenEntity);
        return ResponseEntity.ok("ok");
    }

    @GetMapping(value = "get-all-n1/{page}")
    public ResponseEntity<?> getAllListenN1(@PathVariable int page){
        return ResponseEntity.ok(listenService.getAllN1(page));
    }
    @GetMapping(value = "get-all-n2/{page}")
    public ResponseEntity<?> getAllListenN2(@PathVariable int page){
        return  ResponseEntity.ok(listenService.getAllN2(page));
    }
    @GetMapping(value = "get-all-n3/{page}")
    public ResponseEntity<?> getAllListenN3(@PathVariable int page){
        return  ResponseEntity.ok(listenService.getAllN3(page));
    }
    @GetMapping(value = "get-all-n4/{page}")
    public ResponseEntity<?> getAllListenN4(@PathVariable int page){
        return  ResponseEntity.ok(listenService.getAllN4(page));
    }
    @GetMapping(value = "get-all-n5/{page}")
    public ResponseEntity<?> getAllListenN5(@PathVariable int page){
        return  ResponseEntity.ok(listenService.getAllN5(page));
    }

    @DeleteMapping(value = "delete/{videoName}")
    public ResponseEntity<?> deleteByName(@PathVariable String videoName){
        listenRepository.deleteByNameVideo(videoName);
        return ResponseEntity.ok("xoa thanh cong");
    }
}
