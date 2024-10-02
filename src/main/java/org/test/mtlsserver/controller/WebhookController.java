package org.test.mtlsserver.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.test.mtlsserver.dto.WebhookEvent;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;

@RestController
@RequestMapping("/api/v1/webhook")
public class WebhookController {
    @Autowired
    private ObjectMapper objectMapper;
    ArrayList<WebhookEvent> logs = new ArrayList<>();

    @PostMapping("")
    public ResponseEntity<String> receiverWebhookEvent(@RequestBody() String event) throws JsonProcessingException {
        WebhookEvent webhookEvent = objectMapper.readValue(event, WebhookEvent.class);
        logs.add(webhookEvent);
        return ResponseEntity.ok().body("");
    }

    @GetMapping("/logs")
    public ResponseEntity<ArrayList<WebhookEvent>> getWebhookLogs() {
        return ResponseEntity.ok().body(logs);
    }
}
