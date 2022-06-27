package com.desafio.tipocambio.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class User {

	private Long id;
	private String nombre;
	private String email;
	private String password;
	private String role; //Example 1=Admin, 2=User
    private TipoCambio tipoCambio;
    private Cambio cambio;
	
	
}
