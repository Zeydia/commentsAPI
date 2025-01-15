package sn.seydou.commentsAPI.services;

import org.springframework.stereotype.Service;
import sn.seydou.commentsAPI.entities.Client;
import sn.seydou.commentsAPI.entities.Sentiment;
import sn.seydou.commentsAPI.repositories.SentimentRepository;

import java.util.List;
import java.util.Optional;

@Service
public class SentimentService {

    private ClientService clientService;
    private final SentimentRepository sentimentRepository;

    public SentimentService(ClientService clientService, SentimentRepository sentimentRepository) {
        this.clientService = clientService;
        this.sentimentRepository = sentimentRepository;
    }

    public Optional<Sentiment> findSentimentById(int id) {
        return sentimentRepository.findById(id);
    }

    public void create(Sentiment sentiment) {
        Client clientbdd = clientService.findOrCreate(sentiment.getClient());

        sentiment.setClient(clientbdd);
        sentimentRepository.save(sentiment);
    }

    public List<Sentiment> findAllSentiments() {
        return sentimentRepository.findAll();
    }
}
