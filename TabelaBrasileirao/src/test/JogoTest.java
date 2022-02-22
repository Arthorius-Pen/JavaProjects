package test;

import static org.junit.Assert.*;

import org.junit.Test;

import main.Jogo;
import main.Time;

public class JogoTest {

	@Test
	public void testSetTimes() {
		Time fluminense = new Time("fluminense");
		Time vasco = new Time("vasco");
		
		Jogo jogo = new Jogo();

		
		assertTrue(jogo.setTimes(fluminense, vasco));
		assertFalse(jogo.setTimes(fluminense, fluminense));
	}

	@Test
	public void testAddGols() {
		Time flamengo = new Time("flamengo");
		Time vasco = new Time("vasco");
		
		vasco.setGolsFeitos(10);
		flamengo.setGolsFeitos(20);
		
		Jogo jogo = new Jogo();
		
		jogo.setTimes(flamengo, vasco);
		
		int golsTimeCasa = 5;
		int golsTimeVisitante = 3;
		
		jogo.addGols(golsTimeCasa, golsTimeVisitante);
		
		assertEquals(13, vasco.getGolsFeitos());
		assertEquals(5, vasco.getGolsSofridos());
		
		assertEquals(25, flamengo.getGolsFeitos());
		assertEquals(3, flamengo.getGolsSofridos());

	}

	@Test
	public void testSetPlacar() {
		Time flamengo = new Time("flamengo");
		Time vasco = new Time("vasco");
		
		int pontosTimeCasa = 0;
		int pontosTimeVisitante = 0;
		
		Jogo jogo = new Jogo();
		
		jogo.setTimes(flamengo, vasco);
		
		pontosTimeCasa = 2;
		pontosTimeVisitante = 0;
		
		jogo.setPlacar(pontosTimeCasa, pontosTimeVisitante);
		
		assertEquals(0, vasco.getPontos());
		assertEquals(3, flamengo.getPontos());
		
		pontosTimeCasa = 0;
		pontosTimeVisitante = 1;

		jogo.setPlacar(pontosTimeCasa, pontosTimeVisitante);

		assertEquals(3, vasco.getPontos());
		assertEquals(3, flamengo.getPontos());
		
		pontosTimeCasa = 4;
		pontosTimeVisitante = 4;
		
		jogo.setPlacar(pontosTimeCasa, pontosTimeVisitante);
		
		assertEquals(4, vasco.getPontos());
		assertEquals(4, flamengo.getPontos());

	}

	@Test
	public void testSetGolsContra() {
		Time flamengo = new Time("flamengo");
		Time vasco = new Time("vasco");
		
		int golsContraTimeCasa = 0;
		int golsContraTimeVisitante = 0;
		
		vasco.setGolsContra(2);
		flamengo.setGolsContra(1);
		
		Jogo jogo = new Jogo();
		
		jogo.setTimes(flamengo, vasco);
		
		golsContraTimeCasa = 3;
		golsContraTimeVisitante = 5;
		
		jogo.setGolsContra(golsContraTimeCasa, golsContraTimeVisitante);
		
		assertEquals(7, vasco.getGolsContra());
		assertEquals(4, flamengo.getGolsContra());
		

	}

}
