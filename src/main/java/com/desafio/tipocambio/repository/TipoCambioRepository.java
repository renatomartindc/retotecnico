package com.desafio.tipocambio.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.desafio.tipocambio.domain.model.Divisa;
import com.desafio.tipocambio.domain.model.TipoCambio;

public interface TipoCambioRepository extends ReactiveMongoRepository<TipoCambio, String> {

}
