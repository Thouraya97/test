package com.example.test.Repositories;

import com.example.test.Models.Client;
import com.example.test.Models.Facture;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FactureRepo extends JpaRepository<Facture, Long> {
    List<Facture> getFactureByClient(Client client);
}
