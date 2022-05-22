package com.example.webhook.controller;


import com.example.webhook.entity.ClientWebhook;
import com.example.webhook.entity.MessageIn;
import com.example.webhook.service.WebhookService;
import lombok.AllArgsConstructor;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.*;

import java.util.Map;

@RestController
@RequestMapping("/webhook")
@AllArgsConstructor
public class WebhookController {

    private final WebhookService webhookService;

    @GetMapping()
    public String fetchClientWebhook(
            @RequestParam Map<String,String> allRequestParams, ModelMap model
        ) {
//        ClientWebhook cw = new ClientWebhook();
//        System.out.println(hub_mode);
        System.out.println("at get");
        System.out.println(allRequestParams.keySet());
        System.out.println(allRequestParams.get("hub.challenge"));
        return allRequestParams.get("hub.challenge");
    }

    @PostMapping()
    public void post2(RequestEntity<String> request) {
        String body = request.getBody();
        System.out.println("at post");
        System.out.println(body);
    }

//    @PostMapping()
//    public void postMessage(@RequestBody MessageIn messageIn) {
//        webhookService.postMessage(messageIn);
//    }
}
