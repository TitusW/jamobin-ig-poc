package com.example.webhook.controller;


import com.example.webhook.entity.ClientWebhook;
import com.example.webhook.entity.MessageIn;
import com.example.webhook.service.WebhookService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/webhook")
@AllArgsConstructor
public class WebhookController {

    private final WebhookService webhookService;

//    @GetMapping("{webhook_id}")
//    public ClientWebhook fetchClientWebhook(@PathVariable("webhook_id") String webhook_id) {
//        ClientWebhook cw = new ClientWebhook();
//        return cw;
//    }

    @PostMapping()
    public void postMessage(@RequestBody MessageIn messageIn) {
        webhookService.postMessage(messageIn);
    }
}
