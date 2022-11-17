package com.example.test.Services.ServiceInterface;

import com.example.test.Models.Stock;

import java.util.List;

public interface StockInterface {

    List<Stock> retrieveAllStocks();

    Stock addStock(Stock s);

    Stock updateStock(Stock u);

    Stock retrieveStock(Long id);

    void assignProduitToStock(Long idProduit, Long idStock);
}
