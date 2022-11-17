package com.example.test.Models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Facture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idFacture;
    private float montantRemise ;
    private float montantFacture;
    private Date dateFacture;
    private boolean active ;

    @ManyToOne
    private Client client;

    @OneToMany(mappedBy = "facture")
    private List<DetailFacture>detailFactures ;
}
