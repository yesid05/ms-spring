package com.papasfersan.msa.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.papasfersan.msa.iservicio.IReplicaServicio;
import com.papasfersan.msa.modelo.entidad.Replica;

@CrossOrigin(origins = {"*"})
@RestController
@RequestMapping("/api-rest")
public class ReplicaControlador {
	
	@Autowired
	private IReplicaServicio iReplicaServicio;
	
	@PostMapping(value = "/replica")
	public Replica guardar(@RequestBody Replica unaReplica) {
		return iReplicaServicio.guardar(unaReplica);
	}
	
	@GetMapping(value = "/replica/{id}")
	public List<Replica> buscarPorIdComentario(@PathVariable String id){
		return iReplicaServicio.buscarPorIdComentario(id);
	}
}
