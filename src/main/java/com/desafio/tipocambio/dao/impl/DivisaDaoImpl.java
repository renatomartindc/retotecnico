package com.desafio.tipocambio.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import com.desafio.tipocambio.dao.DivisaDao;
import com.desafio.tipocambio.domain.map.DivisaMap;
import com.desafio.tipocambio.domain.model.Divisa;
import com.desafio.tipocambio.http.error.GlobalException;
import com.desafio.tipocambio.repository.DivisaRepository;
import com.desafio.tipocambio.request.DivisaRequest;
import com.desafio.tipocambio.util.Constant;

import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Mono;

@Component
@Slf4j
public class DivisaDaoImpl implements DivisaDao {
	
	@Autowired
	DivisaRepository divisaRepository;

	@Override
	public Mono<Divisa> addDivisa(DivisaRequest divisaRequest) {
		   
		   Divisa Divisa = new Divisa();
		   DivisaMap divisaMap = new DivisaMap();	   
		   divisaMap.mappingDivisa(divisaRequest, Divisa);
		   
		   return this.findbyCodigo(Divisa.getCodigo()).doOnSuccess(divisa -> {
			   if(divisa!=null) {
				   throw new GlobalException(HttpStatus.BAD_REQUEST, Constant.DIVISA_EXISTS);
			   }
			   
		   }).switchIfEmpty(divisaRepository.save(Divisa));
	}

	@Override
	public Mono<Divisa> findbyCodigo(String codigo) {
		return divisaRepository.findByCodigo(codigo);
	}

}
