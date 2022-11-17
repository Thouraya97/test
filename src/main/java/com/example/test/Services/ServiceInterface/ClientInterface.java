package com.example.test.Services.ServiceInterface;

import com.example.test.Enum.CategorieClient;
import com.example.test.Models.Client;

import java.util.Date;
import java.util.List;

public interface ClientInterface {
    List<Client> retrieveAllClients();
    Client addClient(Client c);
    void deleteClient(Long id);
    Client updateClient(Client c);
    Client retrieveClient(Long id);
    public float getChiffreAffaireParCategorieClient(CategorieClient categorieClient,
                                                     Date startDate, Date endDate);

}
