package br.edu.iftm.onetomany.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import iftm.edu.br.postcomment.domain.PostComment;

@Repository
public interface PostCommentRepository extends CrudRepository<PostComment, Long>{
    
}
