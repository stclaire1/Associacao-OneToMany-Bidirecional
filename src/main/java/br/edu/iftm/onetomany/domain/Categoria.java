package br.edu.iftm.onetomany.domain;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Data
@Entity
public class Categoria {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        Long id;
        String nome;

        // Alteração para @OneToMany com mappedBy para indicar o "outro lado" da relação
        @OneToMany(mappedBy = "categoria")
        private List<Item> items = new ArrayList<Item>();
}