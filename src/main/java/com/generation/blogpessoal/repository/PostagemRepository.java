package com.generation.blogpessoal.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.generation.blogpessoal.model.Postagem;

/* JpaRepository traz os métodos para manipular a tabela

A Classe Postagem, que é a Entidade que será mapeada em nosso Banco de dados
(Lembre-se que a Classe Postagem foi quem gerou a nossa tabela tb_postagens)

O Long representa a nossa Chave Primária (Primary Key), que é o Atributo que recebeu
a anotação @Id na nossa Classe Postagem (o Atributo também se chama id em nossa Classe Postagem).
*/

public interface PostagemRepository extends JpaRepository<Postagem, Long>{
	
	public List <Postagem> findAllByTituloContainingIgnoreCase(@Param("titulo") String titulo);
	
}
