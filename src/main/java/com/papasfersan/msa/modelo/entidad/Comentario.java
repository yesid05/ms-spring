package com.papasfersan.msa.modelo.entidad;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "comentario")
public class Comentario {
	
	@Id
	private String id;
	
	private int idMenu;
	
	private String usuario;
	
	private String comentario;

	public Comentario() {}
	
	public Comentario(String id, int idMenu, String usuario, String comentario) {
		super();
		this.id = id;
		this.idMenu = idMenu;
		this.usuario = usuario;
		this.comentario = comentario;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getIdMenu() {
		return idMenu;
	}

	public void setIdMenu(int idMenu) {
		this.idMenu = idMenu;
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
