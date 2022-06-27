package com.desafio.tipocambio.dao;

import com.desafio.tipocambio.domain.model.Divisa;
import com.desafio.tipocambio.request.DivisaRequest;

import reactor.core.publisher.Mono;

public interface DivisaDao {
	
	Mono<Divisa>    addDivisa(DivisaRequest divisaRequest);
	Mono<Divisa> findbyCodigo(String codigo);	
}
