package com.desafio.tipocambio.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.desafio.tipocambio.dao.DivisaDao;
import com.desafio.tipocambio.domain.map.DivisaMap;
import com.desafio.tipocambio.domain.model.Divisa;
import com.desafio.tipocambio.request.DivisaRequest;
import com.desafio.tipocambio.service.DivisaService;

import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Mono;

@Service
@Slf4j
public class DivisaServiceImpl implements DivisaService {

   @Autowired
   DivisaDao divisaDao;

@Override
public Mono<Divisa> addDivisa(DivisaRequest divisaRequest) {
	
	DivisaMap divisaMap = new DivisaMap();
	
	return divisaDao.addDivisa(divisaRequest).map( flowDB -> {
		
		return flowDB;
		
	} );
}
   
   
	
}
