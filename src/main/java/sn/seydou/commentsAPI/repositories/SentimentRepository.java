package sn.seydou.commentsAPI.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import sn.seydou.commentsAPI.entities.Sentiment;

@Repository
public interface SentimentRepository extends JpaRepository<Sentiment, Integer> {
}