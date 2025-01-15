package sn.seydou.commentsAPI.services;

import org.springframework.stereotype.Service;
import sn.seydou.commentsAPI.entities.Client;
import sn.seydou.commentsAPI.repositories.ClientRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ClientService {

//    @Autowired
//    ClientRepository clientRepository;

    private ClientRepository clientRepository;

    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public void create(Client client) {
        clientRepository.save(client);
    }

    public Client findOrCreate(Client client) {
        Client clientbdd = clientRepository.findByEmail(client.getEmail());
        if (clientbdd == null) {
            clientRepository.save(client);
        }
        return clientbdd;
    }

    public List<Client> getAllClients() {
        return clientRepository.findAll();
    }

    public Client findByEmail(String email) {
        return clientRepository.findByEmail(email);
    }

    public Optional<Client> findById(int id) {
        return clientRepository.findById(id);
    }
}
