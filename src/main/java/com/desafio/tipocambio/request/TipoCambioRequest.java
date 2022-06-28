package com.desafio.tipocambio.request;

import com.desafio.tipocambio.domain.model.Divisa;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TipoCambioRequest {

	
	private String cod_divisa_o;
	private String cod_divisa_d;
	private double tipocambio;
}
