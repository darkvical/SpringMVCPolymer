package com.mkyong.service;

import java.util.List;

import com.mkyong.domain.Valor;

public interface InvocacionService {
	
	List<Valor> obtenerDatosLista(String codigoLista);
}
