package com.example.test.Services.ServiceInterface;

import com.example.test.Models.Produit;

import java.util.Date;
import java.util.List;

public interface ProduitInterface {
    List<Produit> retrieveAllProduits();

    Produit addProduit(Produit p, Long idRayon, Long idStock);

    Produit retrieveProduit(Long id);
    public void assignFournisseurToProduit(Long fournisseurId, Long produitId) ;
    float getRevenuBrutProduit(Long idProduit, Date startDate, Date endDate);
}
