package com.desafio.tipocambio.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import com.desafio.tipocambio.dao.TipoCambioDao;
import com.desafio.tipocambio.domain.map.DivisaMap;
import com.desafio.tipocambio.domain.map.TipoCambioMap;
import com.desafio.tipocambio.domain.model.Divisa;
import com.desafio.tipocambio.domain.model.TipoCambio;
import com.desafio.tipocambio.http.error.GlobalException;
import com.desafio.tipocambio.repository.DivisaRepository;
import com.desafio.tipocambio.repository.TipoCambioRepository;
import com.desafio.tipocambio.request.TipoCambioRequest;
import com.desafio.tipocambio.util.Constant;

import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Mono;

@Component
@Slf4j
public class TipoCambioDaoImpl implements TipoCambioDao {

	@Autowired
	TipoCambioRepository tipoCambioRepository;
	
	@Override
	public Mono<TipoCambio> addTipoCambio(TipoCambioRequest tipoCambioRequest) {
		   TipoCambio tipoCambio = new TipoCambio();
		   TipoCambioMap tipoCambioMap = new TipoCambioMap();
		   tipoCambioMap.mappingTipoCambio(tipoCambioRequest, tipoCambio);
		   
				   return tipoCambioRepository.findById(tipoCambio.getId()).doOnSuccess(item -> {			
						
						if (item == null) {				
							throw new GlobalException(HttpStatus.BAD_REQUEST, "Tipo de parametro no existe");
							
						} 				
		
						 tipoCambioRepository.save(tipoCambio);		 
					});
	}

}
