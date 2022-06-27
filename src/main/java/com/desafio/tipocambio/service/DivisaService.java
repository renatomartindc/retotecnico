package com.desafio.tipocambio.service;

import com.desafio.tipocambio.domain.model.Divisa;
import com.desafio.tipocambio.request.DivisaRequest;

import reactor.core.publisher.Mono;

public interface DivisaService {

	Mono<Divisa> addDivisa(DivisaRequest divisaRequest);
}
