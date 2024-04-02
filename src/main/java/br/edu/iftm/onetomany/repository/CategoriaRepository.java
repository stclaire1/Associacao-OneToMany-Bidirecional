package br.edu.iftm.onetomany.repository;

import org.springframework.data.repository.CrudRepository;
import br.edu.iftm.onetomany.domain.Categoria;

public interface CategoriaRepository extends CrudRepository<Categoria,Long> {
    
}