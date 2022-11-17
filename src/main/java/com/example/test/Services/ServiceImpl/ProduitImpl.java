package com.example.test.Services.ServiceImpl;

import com.example.test.Models.Fournisseur;
import com.example.test.Models.Produit;
import com.example.test.Models.Rayon;
import com.example.test.Models.Stock;
import com.example.test.Repositories.FournisseurRepo;
import com.example.test.Repositories.ProduitRepo;
import com.example.test.Repositories.RayonRepo;
import com.example.test.Repositories.StockRepo;
import com.example.test.Services.ServiceInterface.ProduitInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class ProduitImpl implements ProduitInterface {

    final
    ProduitRepo produitRepo;
    final StockRepo stockRepo;
    final RayonRepo rayonRepo;
    final FournisseurRepo fournisseurRepo;

    public ProduitImpl(ProduitRepo produitRepo,StockRepo stockRepo, RayonRepo rayonRepo, FournisseurRepo fournisseurRepo) {
        this.produitRepo = produitRepo;
        this.stockRepo= stockRepo;
        this.rayonRepo=rayonRepo;
        this.fournisseurRepo=fournisseurRepo;
    }

    @Override
    public List<Produit> retrieveAllProduits() {
        return produitRepo.findAll();
    }

    @Override
    public Produit addProduit(Produit p, Long idRayon, Long idStock) {
        Rayon r = rayonRepo.findById(idRayon).orElse(null);
        Stock s = stockRepo.findById(idStock).orElse(null);
        if(r!=null && s!=null)
            p.setRayon(r);
            p.setStock(s);
        produitRepo.save(p);

        return p ;
    }

    @Override
    public Produit retrieveProduit(Long id) {
        return produitRepo.findById(id).orElse(null);
    }

    @Override
    public void assignFournisseurToProduit(Long fournisseurId, Long produitId) {
        Fournisseur f = fournisseurRepo.findById(fournisseurId).orElse(null);
        Produit p = produitRepo.findById(produitId).orElse(null);
        List<Fournisseur> fournisseurs= p.getFournisseurs();
        if(f!=null&&p!=null)
            fournisseurs.add(f);
        produitRepo.save(p);
    }
}
