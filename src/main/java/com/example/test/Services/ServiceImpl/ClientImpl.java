package com.example.test.Services.ServiceImpl;

import com.example.test.Models.Client;
import com.example.test.Repositories.ClientRepo;
import com.example.test.Services.ServiceInterface.ClientInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientImpl implements ClientInterface {
@Autowired
    ClientRepo clientRepo ;

    @Override
    public List<Client> retrieveAllClients() {
        return clientRepo.findAll();
    }

    @Override
    public Client addClient(Client c) {
        return clientRepo.save(c);
    }

    @Override
    public void deleteClient(Long id) {
       Client c =  clientRepo.findById(id).orElse(null);
       clientRepo.delete(c);
    }

    @Override
    public Client updateClient(Client c) {
        return clientRepo.save(c);
    }

    @Override
    public Client retrieveClient(Long id) {
        return clientRepo.findById(id).orElse(null);
    }
}
