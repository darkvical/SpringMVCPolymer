package com.mkyong.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class Lista {

	private Long id;
	public Long getId() { return this.id; }
	public void setId(Long id) { this.id = id; }
	
	private String codigo;
	public String getCodigo() { return this.codigo; }
	public void setCodigo(String codigo) { this.codigo = codigo; }
	
	private String nombre;
	public String getNombre() { return this.nombre; }
	public void setNombre(String nombre) { this.nombre = nombre; }
	
	private String descripcion;
	public String getDescripcion() { return this.descripcion; }
	public void setDescripcion(String descripcion) { this.descripcion = descripcion; }
	
	private String estado;
	public String getEstado() { return this.estado; }
	public void setEstado(String estado) { this.estado = estado; }
	
}