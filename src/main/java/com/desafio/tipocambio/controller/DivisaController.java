package com.desafio.tipocambio.controller;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.desafio.tipocambio.domain.model.Divisa;
import com.desafio.tipocambio.request.DivisaRequest;
import com.desafio.tipocambio.service.DivisaService;
import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Mono;


@RestController()
@RequestMapping("/api/v1/divisa")
@CrossOrigin(origins = "*")
@Slf4j
public class DivisaController {

	@Autowired
	DivisaService divisaService;
	
	
	@PostMapping(value = "/", produces = { MediaType.APPLICATION_STREAM_JSON_VALUE,
			MediaType.APPLICATION_JSON_VALUE })
	
	public Mono<ResponseEntity<Divisa>> addDivisa(DivisaRequest divisaRequest) {
		
		
		return divisaService.addDivisa(divisaRequest).map(divisa ->		
			{			
				return new ResponseEntity<>(divisa, HttpStatus.OK);
			 }		
			)
			.defaultIfEmpty(ResponseEntity.notFound().build());
	}
	
	
	/*
	@PostMapping(
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public Single<ResponseEntity<BaseWebResponse>> addDivisa(@RequestBody DivisaRequest divisaRequest) {
        return service.addDivisa(divisaRequest)
                .subscribeOn(Schedulers.io())
                .map(s -> ResponseEntity.created(URI.create("/api/divisa/" + s)).body(BaseWebResponse.successNoData()));
    }
	*/
}
