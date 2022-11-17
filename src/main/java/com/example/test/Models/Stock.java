package com.example.test.Models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Stock {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long iStock;
    private int qteStock ;
    private int qteMin ;
    private String libelleStock ;

    @OneToMany(mappedBy = "stock")
    private List<Produit> produits ;
}
