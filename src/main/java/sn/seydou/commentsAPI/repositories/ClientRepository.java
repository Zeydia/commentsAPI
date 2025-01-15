package sn.seydou.commentsAPI.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sn.seydou.commentsAPI.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Integer> {

    Client findByEmail(String email);
}