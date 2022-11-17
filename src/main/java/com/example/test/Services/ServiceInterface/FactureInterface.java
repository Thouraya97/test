package com.example.test.Services.ServiceInterface;

import com.example.test.Models.Facture;

import java.util.List;

public interface FactureInterface {

    List<Facture> retrieveAllFactures();
    void cancelFacture(Long id);
    Facture retrieveFacture(Long id);
    List<Facture> getFactureByClient(long idClient);
}
