package com.example.test.Repositories;

import com.example.test.Enum.CategorieClient;
import com.example.test.Models.Client;
import com.example.test.Models.Facture;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ClientRepo extends JpaRepository<Client, Long> {

    List<Client> findClientByCategorieClient(CategorieClient categorieClient);
}
