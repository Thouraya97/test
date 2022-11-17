package com.example.test.Repositories;

import com.example.test.Models.DetailProduit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DetailProduitRepo extends JpaRepository<DetailProduit, Long> {
}
