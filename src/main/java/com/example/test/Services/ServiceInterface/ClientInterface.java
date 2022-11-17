package com.example.test.Services.ServiceInterface;

import com.example.test.Models.Client;

import java.util.List;

public interface ClientInterface {
    List<Client> retrieveAllClients();
    Client addClient(Client c);
    void deleteClient(Long id);
    Client updateClient(Client c);
    Client retrieveClient(Long id);

}
