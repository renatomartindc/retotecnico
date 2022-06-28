package com.desafio.tipocambio.domain.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@Builder
@RequiredArgsConstructor

@Document(collection = "tipoCambio")
public class TipoCambio {

	
	@Id
	private String id;
	private Divisa origen;
	private Divisa destino;
	private double tipocambio;
	private User usuario;
	private Date fecha_modificacion;
	
}
