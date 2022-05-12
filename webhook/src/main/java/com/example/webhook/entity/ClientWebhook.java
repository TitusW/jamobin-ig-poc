package com.example.webhook.entity;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class ClientWebhook {
    private Integer webhook_id;
    private String application_id;
    private String application_name;
    private String page_id;
    private String page_name;
    private Integer client_id;
    private String client_name;
    private String verity_token;
    private String access_token;
    private String client_webhook_url;
}
