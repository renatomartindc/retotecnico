package com.desafio.tipocambio.domain.model;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class TipoCambio {

	private Long id;
	private Divisa origen;
	private Divisa destino;
	private double tipocambio;
	private User usuario;
	private Date fecha_modificacion;
	
}
