package br.edu.iftm.onetomany;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.edu.iftm.onetomany.Repository.PostCommentRepository;
import br.edu.iftm.onetomany.Repository.PostRepository;
import br.edu.iftm.onetomany.domain.Post;
import br.edu.iftm.onetomany.domain.PostComment;

@SpringBootApplication
public class OnetomanyApplication implements CommandLineRunner {

	@Autowired
	private PostRepository postRepository;

	@Autowired
	private PostCommentRepository postCommentRepository;

	public static void main(String[] args) {
		SpringApplication.run(OnetomanyApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//criando um novo post
		Post publicacao = new Post();
		publicacao.setTitle("Vem aí...");
		postRepository.save(publicacao);

		//criando comentarios
		PostComment comentario1 = new PostComment();
		comentario1.setReview("Vem oq??");
		postCommentRepository.save(comentario1);
		publicacao.addComment(comentario1);

		PostComment comentario2 = new PostComment();
		comentario2.setReview("Ansiosaaaa");
		postCommentRepository.save(comentario2);
		publicacao.addComment(comentario2);

		postRepository.save(publicacao);

		// buscando todos os posts e comentarios
		System.out.println("\n------------------------------\n Posts e comentários");
		Iterable<Post> posts = postRepository.findAll();
		posts.forEach(post -> {
			System.out.println(post.getTitle());
			post.getComments().forEach(comment -> {
				System.out.println(" -" + comment.getReview());
			});
		});
		System.out.println("\n------------------------------");
	}

}
