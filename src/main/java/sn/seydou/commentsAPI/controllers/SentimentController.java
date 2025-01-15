package sn.seydou.commentsAPI.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sn.seydou.commentsAPI.entities.Sentiment;
import sn.seydou.commentsAPI.services.SentimentService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "sentiment")
public class SentimentController {

    private final SentimentService sentimentService;

    public SentimentController(SentimentService sentimentService) {
        this.sentimentService = sentimentService;
    }

    @PostMapping
    public ResponseEntity<Sentiment> create(@RequestBody Sentiment sentiment) {

        sentimentService.create(sentiment);
        return ResponseEntity.status(201).build();
    }

    @GetMapping
    public List<Sentiment> getAllSentiments() {
        return sentimentService.findAllSentiments();
    }
}
