package com.example.messageapi.service;

import com.example.messageapi.entity.MessageIn;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
@AllArgsConstructor
public class MessageAPIService {

    private final WebClient webClient;

//    public MessageAPIService(WebClient.Builder builder) {
//        WebClient wb = builder.baseUrl("/something.com").build();
//    }
    public void postMessage(MessageIn messageIn) {
        MessageIn test = webClient.post()
                .uri("/webhook")
                .body(Mono.just(messageIn), MessageIn.class)
                .retrieve()
                .bodyToMono(MessageIn.class).block();
        System.out.println(test);
    }
}
