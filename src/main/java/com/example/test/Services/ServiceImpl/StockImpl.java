package com.example.test.Services.ServiceImpl;

import com.example.test.Models.Produit;
import com.example.test.Models.Stock;
import com.example.test.Repositories.ProduitRepo;
import com.example.test.Repositories.StockRepo;
import com.example.test.Services.ServiceInterface.StockInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockImpl implements StockInterface {
    @Autowired
    StockRepo stockRepo;
    @Autowired
    ProduitRepo produitRepo;

    @Override
    public List<Stock> retrieveAllStocks() {
        return stockRepo.findAll();
    }

    @Override
    public Stock addStock(Stock s) {
        return stockRepo.save(s);
    }

    @Override
    public Stock updateStock(Stock u) {
        return stockRepo.save(u);
    }

    @Override
    public Stock retrieveStock(Long id) {
        return stockRepo.findById(id).orElse(null);
    }

    @Override
    public void assignProduitToStock(Long idProduit, Long idStock) {

        Produit p = produitRepo.findById(idProduit).orElse(null);
        Stock s= stockRepo.findById(idStock).orElse(null);
        List<Produit> products = s.getProduits();
        if(p!=null&&s!=null)
            products.add(p);
        stockRepo.save(s);
    }
}
