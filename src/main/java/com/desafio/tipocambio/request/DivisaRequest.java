package com.desafio.tipocambio.request;

import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DivisaRequest {
	
	private String codigo; //Example: USD; SOL, EUR
	private String descripcion;

}
