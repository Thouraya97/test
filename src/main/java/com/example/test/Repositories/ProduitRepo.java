package com.example.test.Repositories;

import com.example.test.Models.Produit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProduitRepo extends JpaRepository<Produit, Long> {
    
}
