package com.example.test.Services.ServiceImpl;

import com.example.test.Models.Client;
import com.example.test.Models.Facture;
import com.example.test.Repositories.ClientRepo;
import com.example.test.Repositories.FactureRepo;
import com.example.test.Services.ServiceInterface.FactureInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FactureImpl implements FactureInterface {
    final
    FactureRepo factureRepo;

    final
    ClientRepo clientRepo;

    public FactureImpl(FactureRepo factureRepo, ClientRepo clientRepo) {
        this.factureRepo = factureRepo;
        this.clientRepo = clientRepo;
    }


    @Override
    public List<Facture> retrieveAllFactures() {
        return factureRepo.findAll();
    }

    @Override
    public void cancelFacture(Long id) {
        Facture facture= factureRepo.findById(id).orElse(null);
        facture.setActive(false);


    }

    @Override
    public Facture retrieveFacture(Long id) {
        return factureRepo.findById(id).orElse(null);
    }

    @Override
    public List<Facture> getFactureByClient(long idClient) {
        Client c =clientRepo.findById(idClient).orElse(null);
        if(c!=null)
        {
        return factureRepo.getFactureByClient(c); }
        return null;
    }
}
