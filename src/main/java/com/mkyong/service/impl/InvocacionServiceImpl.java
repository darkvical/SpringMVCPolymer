package com.mkyong.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mkyong.domain.Valor;
import com.mkyong.service.InvocacionService;

@Service
public class InvocacionServiceImpl implements InvocacionService {

	@Autowired
	private PicServiceHelper picServiceHelper;
	@Override
	public List<Valor> obtenerDatosLista(String codigoLista) {
		return picServiceHelper.obtenerValor(codigoLista);
	}
}
