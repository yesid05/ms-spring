package com.papasfersan.msa.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.papasfersan.msa.iservicio.IReplicaServicio;
import com.papasfersan.msa.modelo.entidad.Replica;
import com.papasfersan.msa.modelo.iRepositorio.IReplicaRepositorio;

@Service
public class ReplicaServicio implements IReplicaServicio{
	
	@Autowired
	private IReplicaRepositorio iReplicaRepositorio;

	@Override
	public Replica guardar(Replica unaReplica) {
		return (Replica)iReplicaRepositorio.insert(unaReplica);
	}

	@Override
	public List<Replica> buscarPorIdComentario(String unIdComentario) {
		return iReplicaRepositorio.buscarPorIdComentario(unIdComentario);
	}
	
	

}
