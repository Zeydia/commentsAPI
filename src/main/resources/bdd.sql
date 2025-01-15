CREATE DATABASE IF NOT EXISTS commentsBDD;

-- CLIENT
CREATE TABLE client (
    id_client INTEGER NOT NULL PRIMARY KEY AUTO_INCREMENT,
    email VARCHAR(50)
);

-- SENTIMENT
CREATE TABLE sentiment (
    id_sentiment INTEGER NOT NULL PRIMARY KEY AUTO_INCREMENT,
    texte VARCHAR(50),
    type VARCHAR(10),
    id_client INTEGER,
    CONSTRAINT fk_sentimentClient FOREIGN KEY (id_client) REFERENCES client(id_client)
)