package com.papasfersan.msa.modelo.entidad;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "replica")
public class Replica {
	
	@Id
	private String id;
	
	private String idComentario;
	
	private String usuario;
	
	private String comentario;
	
	public Replica() {}

	public Replica(String id, String idComentario, String usuario, String comentario) {
		super();
		this.id = id;
		this.idComentario = idComentario;
		this.usuario = usuario;
		this.comentario = comentario;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getIdComentario() {
		return idComentario;
	}

	public void setIdComentario(String idComentario) {
		this.idComentario = idComentario;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	
	
	
}
