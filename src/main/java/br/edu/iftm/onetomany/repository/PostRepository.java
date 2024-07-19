package br.edu.iftm.onetomany.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import iftm.edu.br.postcomment.domain.Post;

@Repository
public interface PostRepository extends CrudRepository<Post, Long>{
    
}
