package com.desafio.tipocambio.domain.model;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder

public class Cambio {
	
    private Long id;
	private double monto_cambiar;
	private double monto_resultado;
	private TipoCambio tipocambio;
	private User usuario;
	private Date fecha_consulta;

}
