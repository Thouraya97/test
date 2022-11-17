package com.example.test.Models;

import com.example.test.Enum.CategorieProduit;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;


@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class DetailProduit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idDetailProduit;
    private Date dateCreation;
    private Date dateDerniereModification;
    private CategorieProduit categorieProduit;

    @OneToOne
    private Produit produit;
}
