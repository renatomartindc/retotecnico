package com.desafio.tipocambio.domain.map;

import com.desafio.tipocambio.domain.model.Divisa;
import com.desafio.tipocambio.domain.model.TipoCambio;
import com.desafio.tipocambio.request.DivisaRequest;
import com.desafio.tipocambio.request.TipoCambioRequest;

public class TipoCambioMap {

	
	public void mappingTipoCambio(TipoCambioRequest tipoCambioRequest, TipoCambio tipoCambio ) {
		
		Divisa origen = new Divisa();
		origen.setCodigo(tipoCambioRequest.getCod_divisa_o());
		Divisa destino = new Divisa();
		destino.setCodigo(tipoCambioRequest.getCod_divisa_d());

		tipoCambio.setOrigen(origen);
		tipoCambio.setOrigen(destino);
		tipoCambio.setTipocambio(tipoCambioRequest.getTipocambio());
							
}
	
}
