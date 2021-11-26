package com.art.artfood;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.art.artfood.di.service.AtivacaoClienteService;
import com.art.artfood.di.modelo.Cliente;


@Controller
public class MeuPrimeiroController {
	
	private AtivacaoClienteService ativacaoClienteService;
	
	public MeuPrimeiroController(AtivacaoClienteService ativacaoClienteService) {
		this.ativacaoClienteService = ativacaoClienteService;
		}

	@GetMapping("/hello")
	@ResponseBody
	public String hello() {
		Cliente joao = new Cliente("João", "joao@email.com", "1243949349");
		
		ativacaoClienteService.ativar(joao);

		return "Hello!";
	}
}
