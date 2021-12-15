package com.papasfersan.msa.modelo.iRepositorio;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.papasfersan.msa.modelo.entidad.Replica;

@Repository
public interface IReplicaRepositorio extends MongoRepository<Replica, String>{
	
	@Query("{'idComentario': ?0}")
	public List<Replica> buscarPorIdComentario(String unIdComentaro);
	
}
