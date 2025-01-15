package sn.seydou.commentsAPI.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import sn.seydou.commentsAPI.entities.Client;
import sn.seydou.commentsAPI.services.ClientService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("client")
public class ClientController {

    private final ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public void create(@RequestBody Client client) {
        clientService.create(client);
    }

    @GetMapping
    public List<Client> getAllClients() {
        return clientService.getAllClients();
    }

    @GetMapping("{id}")
    public Client getClientById(@PathVariable int id) {
        Optional<Client> client = clientService.findById(id);

        return client.orElse(null);

    }

}
