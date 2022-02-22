package com.art.artfood.jpa;

import org.springframework.context.ApplicationContext;

import java.util.List;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;

import com.art.artfood.ArtfoodApiApplication;
import com.art.artfood.domain.model.Cidade;
import com.art.artfood.domain.model.Cozinha;
import com.art.artfood.domain.model.Estado;
import com.art.artfood.domain.model.FormaPagamento;
import com.art.artfood.domain.model.Permissao;
import com.art.artfood.domain.model.Restaurante;
import com.art.artfood.domain.repository.CidadeRepository;
import com.art.artfood.domain.repository.CozinhaRepository;
import com.art.artfood.domain.repository.EstadoRepository;
import com.art.artfood.domain.repository.FormaPagamentoRepository;
import com.art.artfood.domain.repository.PermissaoRepository;
import com.art.artfood.domain.repository.RestauranteRepository;

public class AllTablesMain {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new SpringApplicationBuilder(ArtfoodApiApplication.class)
				.web(WebApplicationType.NONE).run(args);

		RestauranteRepository restauranteRepository = applicationContext.getBean(RestauranteRepository.class);
		CozinhaRepository cozinhaRepository = applicationContext.getBean(CozinhaRepository.class);
		EstadoRepository estadoRepository = applicationContext.getBean(EstadoRepository.class);
		CidadeRepository cidadeRepository = applicationContext.getBean(CidadeRepository.class);
		FormaPagamentoRepository formaPagamentoRepository = applicationContext.getBean(FormaPagamentoRepository.class);
		PermissaoRepository permissaoRepository = applicationContext.getBean(PermissaoRepository.class);

		System.out.println("=========RESTAURANTE============");
		

		List<Restaurante> restaurantes = restauranteRepository.listar();

		for (Restaurante restaurante : restaurantes) {
			System.out.printf("Nome: %s\nTaxaFrete: %d\n\n", restaurante.getNome(), restaurante.getTaxaFrete());
		}

		System.out.println("=========COZINHA============");
		
		List<Cozinha> cozinhas = cozinhaRepository.listar();

		for (Cozinha cozinha : cozinhas) {
			System.out.printf("Nome: %s\n\n", cozinha.getNome());
		}
		
		System.out.println("=========ESTADO============");
		
		List<Estado> estados = estadoRepository.listar();

		for (Estado estado : estados) {
			System.out.printf("Nome: %s\n\n", estado.getNome());
		}
		
		System.out.println("=========CIDADE============");
		
		List<Cidade> cidades = cidadeRepository.listar();

		for (Cidade cidade : cidades) {
			System.out.printf("Nome: %s\n\n", cidade.getNome());
		}
		
		System.out.println("=========FORMA DE PAGAMENTO============");
		
		List<FormaPagamento> formasPagamento = formaPagamentoRepository.listar();

		for (FormaPagamento formaPagamento : formasPagamento) {
			System.out.printf("Descriçao: %s\n\n", formaPagamento.getDescricao());
		}
		
		System.out.println("=========PERMISSAO============");
		
		List<Permissao> permissoes = permissaoRepository.listar();

		for (Permissao permissao : permissoes) {
			System.out.printf("Nome: %s\nDescriçao: %s\n\n",permissao.getNome(), permissao.getDescricao());
		}
	}
}
