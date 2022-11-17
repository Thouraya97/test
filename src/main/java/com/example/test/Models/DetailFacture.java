package com.example.test.Models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class DetailFacture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idDetailFacture;
    private int qte ;
    private float prixTotal ;
    private int pourcentageRemise ;
    private int montantRemise;

    @ManyToOne
    private Facture facture;

    @ManyToOne
    private Produit produit;

}
