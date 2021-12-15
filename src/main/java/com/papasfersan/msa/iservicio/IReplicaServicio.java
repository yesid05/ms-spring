package com.papasfersan.msa.iservicio;

import java.util.List;

import com.papasfersan.msa.modelo.entidad.Replica;

public interface IReplicaServicio {
	
	public Replica guardar(Replica unaReplica);
	
	public List<Replica> buscarPorIdComentario(String unIdComentario);
	
}
