package com.papasfersan.msa.iservicio;

import java.util.List;

import com.papasfersan.msa.modelo.entidad.Comentario;

public interface IComentarioServicio {

	public Comentario guardar(Comentario unComentario);
	
	public List<Comentario> buscarPorIdMenu(long unIdMenu);
	
	public List<Comentario> buscarTodos();
	
}
