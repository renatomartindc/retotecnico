package com.desafio.tipocambio.domain.map;

import java.util.ArrayList;

import org.springframework.http.HttpStatus;

import com.desafio.tipocambio.domain.model.Divisa;
import com.desafio.tipocambio.request.DivisaRequest;

public class DivisaMap {

	
	public void mappingDivisa(DivisaRequest divisaRequest, Divisa divisa ) {
		
			divisa.setCodigo(divisaRequest.getCodigo());
			divisa.setDescripcion(divisaRequest.getDescripcion());

								
	}
	
}
