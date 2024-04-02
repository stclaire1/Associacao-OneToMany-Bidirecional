package br.edu.iftm.onetomany.repository;

import org.springframework.data.repository.CrudRepository;
import br.edu.iftm.onetomany.domain.Item;

public interface ItemRepository extends CrudRepository<Item,Long> {
    
}