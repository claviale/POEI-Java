package fr.m2i.docker_with_database.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity @Table(name = "patisseries")
@Data @NoArgsConstructor @AllArgsConstructor
public class Patisserie {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nom;
    private String saveur;
    private Float prix;
}
