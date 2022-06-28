package com.desafio.tipocambio.dao;

import com.desafio.tipocambio.domain.model.Divisa;
import com.desafio.tipocambio.domain.model.TipoCambio;
import com.desafio.tipocambio.request.DivisaRequest;
import com.desafio.tipocambio.request.TipoCambioRequest;

import reactor.core.publisher.Mono;

public interface TipoCambioDao {

	
	Mono<TipoCambio>    addTipoCambio(TipoCambioRequest tipoCambioRequest);
}
