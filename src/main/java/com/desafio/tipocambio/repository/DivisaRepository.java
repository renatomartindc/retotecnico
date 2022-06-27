package com.desafio.tipocambio.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.desafio.tipocambio.domain.model.Divisa;
import reactor.core.publisher.Mono;

@Repository
public interface DivisaRepository extends ReactiveMongoRepository<Divisa, String> {

	@Query(value = "{'codigo': ?0 }")
	Mono<Divisa> findByCodigo(String codigo);
	
}
