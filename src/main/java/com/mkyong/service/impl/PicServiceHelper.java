package com.mkyong.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.mkyong.domain.Valor;

@Component
@EnableAsync
public class PicServiceHelper {

	@Autowired
	private RestTemplate restTemplate;
	
	public List<Valor> obtenerValor(String codigoLista){
		List<Valor> valores = new ArrayList<Valor>();
		StringBuilder url = new StringBuilder("http://118.220.35.142:8090/PICREST/api/configuracion/valores?codigoLista=");
		url.append(codigoLista);
		ResponseEntity<Valor[]> responseEntity = null;
		try {
			responseEntity = restTemplate.exchange(url.toString(), HttpMethod.GET, null, Valor[].class);
		} catch (Exception e) {
			System.out.println("");
		}
		if(responseEntity != null){
			for(Valor valorEncotrado : responseEntity.getBody()){
				valores.add(valorEncotrado);
			}
		}
		return valores;
	}
}
