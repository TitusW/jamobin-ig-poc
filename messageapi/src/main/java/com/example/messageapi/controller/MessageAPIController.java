package com.example.messageapi.controller;

import com.example.messageapi.entity.MessageIn;
import com.example.messageapi.service.MessageAPIService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class MessageAPIController {

    private final MessageAPIService messageAPIService;

    @PostMapping
    public void postMessage(@RequestBody MessageIn messageIn) {
        messageAPIService.postMessage(messageIn);
    }

}
