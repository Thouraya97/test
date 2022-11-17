package com.example.test.Models;

import com.example.test.Enum.CategorieClient;
import com.example.test.Enum.Profession;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.xml.crypto.Data;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idClient;
    private String nom ;
    private  String prenom ;
    private Date dateNaissance;
    private String email ;
    private  String password;
    @Enumerated(EnumType.STRING)
    private CategorieClient categorieClient;
    @Enumerated(EnumType.STRING)
    private Profession profession ;

    @OneToMany(mappedBy = "client")
    private List<Facture> factures ;
}
