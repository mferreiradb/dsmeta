package com.devsuperior.dsmeta.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dsmeta.entities.Sale;
import com.devsuperior.dsmeta.services.SaleService;
import com.devsuperior.dsmeta.services.SmsService;

@RestController //  CONFIGURA QUE É UM COMPONENTE/CONTROLADOR
@RequestMapping(value = "/sales") // VALUE É O VALOR DA ROTA/CAMINHO QUE VAI SER ACESSADO
public class SaleController {
	
	@Autowired
	public SaleService service;
	
	@Autowired
	private SmsService smsService;
	
	@GetMapping // GET É UM DOS VERBO HTTP PARA FAZER REQUISIÇÕES
	public Page<Sale> findSales(
			@RequestParam(value="minDate", defaultValue="") String minDate,
			@RequestParam(value="maxDate", defaultValue="") String maxDate,
			Pageable pageable) {
		return service.findSales(minDate, maxDate, pageable);
	}
	
	@GetMapping("/{id}/notification")
	public void notifySms(@PathVariable Long id) {
		smsService.sendSms(id);
	}
}
