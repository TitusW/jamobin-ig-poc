package com.example.webhook.entity;

import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;

public class MessageIn {
    @Id
    private String trx_id;
    private String message_id;
    private String webhook_id;
    private Object json;
    private String sender_id;
    private LocalDateTime date_incoming;
    private String client_webhook_url;
    private LocalDateTime date_hit;
    private LocalDateTime date_response;
    private Integer http_status;
    private String response_body;

    public String getTrx_id() {
        return trx_id;
    }

    public void setTrx_id(String trx_id) {
        this.trx_id = trx_id;
    }

    public String getMessage_id() {
        return message_id;
    }

    public void setMessage_id(String message_id) {
        this.message_id = message_id;
    }

    public String getWebhook_id() {
        return webhook_id;
    }

    public void setWebhook_id(String webhook_id) {
        this.webhook_id = webhook_id;
    }

    public Object getJson() {
        return json;
    }

    public void setJson(Object json) {
        this.json = json;
    }

    public String getSender_id() {
        return sender_id;
    }

    public void setSender_id(String sender_id) {
        this.sender_id = sender_id;
    }

    public LocalDateTime getDate_incoming() {
        return date_incoming;
    }

    public void setDate_incoming(LocalDateTime date_incoming) {
        this.date_incoming = date_incoming;
    }

    public String getClient_webhook_url() {
        return client_webhook_url;
    }

    public void setClient_webhook_url(String client_webhook_url) {
        this.client_webhook_url = client_webhook_url;
    }

    public LocalDateTime getDate_hit() {
        return date_hit;
    }

    public void setDate_hit(LocalDateTime date_hit) {
        this.date_hit = date_hit;
    }

    public LocalDateTime getDate_response() {
        return date_response;
    }

    public void setDate_response(LocalDateTime date_response) {
        this.date_response = date_response;
    }

    public Integer getHttp_status() {
        return http_status;
    }

    public void setHttp_status(Integer http_status) {
        this.http_status = http_status;
    }

    public String getResponse_body() {
        return response_body;
    }

    public void setResponse_body(String response_body) {
        this.response_body = response_body;
    }
}
