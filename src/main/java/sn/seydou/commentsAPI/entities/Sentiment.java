package sn.seydou.commentsAPI.entities;

import jakarta.persistence.*;
import lombok.*;
import sn.seydou.commentsAPI.enums.TypeSentiment;

@Data
@Entity
@Table(name = "sentiment")
public class Sentiment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_sentiment", nullable = false)
    private Integer id;

    @Column(name = "texte", length = 50)
    private String texte;

    @Column(name = "type", length = 10)
    private TypeSentiment type;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE},fetch = FetchType.EAGER)
    @JoinColumn(name = "id_client")
    private Client client;

}