package com.desafio.tipocambio.domain.model;

import java.util.List;


import org.springframework.data.mongodb.core.mapping.Document;

import org.springframework.data.annotation.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Data
@AllArgsConstructor
@Builder
@RequiredArgsConstructor

@Document(collection = "divisa")
public class Divisa {
	
	@Id
	private String id;
	private String codigo; //Example: USD; SOL, EUR
	private String descripcion; //Dolares americanos, Nuevos Soles, Euro

}
