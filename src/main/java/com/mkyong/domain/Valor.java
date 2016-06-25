package com.mkyong.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class Valor {

	private Long id;
	public Long getId() { return this.id; }
	public void setId(Long id) { this.id = id; }

	private Long padre;
	public Long getPadre() { return this.padre; }
	public void setPadre(Long padre) { this.padre = padre; }
	
	private String codigo;
	public String getCodigo() { return this.codigo; }
	public void setCodigo(String codigo) { this.codigo = codigo; }
	
	private String nombre;
	public String getNombre() { return this.nombre; }
	public void setNombre(String nombre) { this.nombre = nombre; }
	
	private String descripcion;
	public String getDescripcion() { return this.descripcion; }
	public void setDescripcion(String descripcion) { this.descripcion = descripcion; }
	
	private String valor;
	public String getValor() { return this.valor; }
	public void setValor(String valor) { this.valor = valor; }
	
	private Integer orden;
	public Integer getOrden() { return this.orden; }
	public void setOrden(Integer orden) { this.orden = orden; }
	
	private String estado;
	public String getEstado() { return this.estado; }
	public void setEstado(String estado) { this.estado = estado; }
	
	private Lista lista;
	public Lista getLista() { return lista; }
	public void setLista(Lista lista) { this.lista = lista; }

	
}
