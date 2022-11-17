package com.example.test.Repositories;

import com.example.test.Models.Fournisseur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FournisseurRepo extends JpaRepository<Fournisseur,Long> {
}
