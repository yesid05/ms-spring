package com.papasfersan.msa.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.papasfersan.msa.iservicio.IComentarioServicio;
import com.papasfersan.msa.modelo.entidad.Comentario;

@CrossOrigin(origins = {"*"})
@RestController
@RequestMapping("/api-rest")
public class ComentarioControlador {
	
	@Autowired
	private IComentarioServicio iComentarioServicio;
	
	@PostMapping(value = "/comentario")
	public Comentario guardar(@RequestBody Comentario unComentario) {		
		return iComentarioServicio.guardar(unComentario);		
	}
	
	@GetMapping(value = "/comentario/{id}")
	public List<Comentario> buscarPorIdMenu(@PathVariable long id) {		
		return iComentarioServicio.buscarPorIdMenu(id);		
	}
	
	@GetMapping(value = "/comentario")
	public List<Comentario> buscarTodos(){
		return iComentarioServicio.buscarTodos();
	}
	
}
