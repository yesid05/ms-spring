package com.papasfersan.msa.modelo.iRepositorio;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.papasfersan.msa.modelo.entidad.Comentario;

@Repository
public interface IComentarioRepositorio  extends MongoRepository<Comentario, String>{
	
	@Query("{'idMenu': ?0}")
	public List<Comentario> buscarPorIdMenu(long unIdMenu);
	
}
