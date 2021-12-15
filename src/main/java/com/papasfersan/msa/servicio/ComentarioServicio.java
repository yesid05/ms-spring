package com.papasfersan.msa.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import com.papasfersan.msa.iservicio.IComentarioServicio;
import com.papasfersan.msa.modelo.entidad.Comentario;
import com.papasfersan.msa.modelo.iRepositorio.IComentarioRepositorio;

@Service
public class ComentarioServicio implements IComentarioServicio{
	
	@Autowired
	private IComentarioRepositorio iComentarioRepositorio;
	
	@Override
	public Comentario guardar(Comentario unComentario) {
		return (Comentario)iComentarioRepositorio.insert(unComentario);		
	}
	
	@Override
	public List<Comentario> buscarPorIdMenu(long unIdMenu){
		return iComentarioRepositorio.buscarPorIdMenu(unIdMenu);
	}

	@Override
	public List<Comentario> buscarTodos() {
		return iComentarioRepositorio.findAll();
	}

}
