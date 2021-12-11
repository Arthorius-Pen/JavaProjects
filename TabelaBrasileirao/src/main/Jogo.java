package main;

public class Jogo {
	
	private Time timeCasa;
	private Time timeVisitante;
	
	public void setTimes(Time timeCasa, Time timeVisitante) {
		if (timeCasa != timeVisitante) {
			this.timeCasa = timeCasa;
			this.timeVisitante = timeVisitante;
		} else {
			System.out.println("Jogo intv�lido: Os times s�o iguais!");
		}
	}
	
	public void addGols(int golsTimeCasa, int golsTimeVisitante) {
		this.timeCasa.setGolsFeitos(golsTimeCasa + this.timeCasa.getGolsFeitos());
		this.timeCasa.setGolsSofridos(golsTimeVisitante + this.timeCasa.getGolsSofridos());

		this.timeVisitante.setGolsFeitos(golsTimeVisitante + this.timeVisitante.getGolsFeitos());
		this.timeVisitante.setGolsSofridos(golsTimeCasa + this.timeVisitante.getGolsSofridos());
	}
	
	public void setPlacar(int pontosTimeCasa, int pontosTimeVisitante) {
		
		if (pontosTimeCasa > pontosTimeVisitante) {
			this.timeCasa.setPontos(3 + this.timeCasa.getPontos());
		} else if (pontosTimeCasa > pontosTimeVisitante) {
			this.timeVisitante.setPontos(3 + this.timeVisitante.getPontos());
		} else {
			this.timeVisitante.setPontos(1 + this.timeVisitante.getPontos());
			this.timeCasa.setPontos(1 + this.timeCasa.getPontos());
		}
	}
	
	public void setGolsContra(int pontosTimeCasa, int golsTimeCasa, int pontosTimeVisitante, int golsTimeVisitante) {
		if( (golsTimeCasa - pontosTimeCasa) > 0 ) {
			int golsContra = golsTimeCasa - pontosTimeCasa;
			
			this.timeCasa.setGolsSofridos(this.timeCasa.getGolsSofridos() + golsContra);
			this.timeVisitante.setGolsFeitos(this.timeVisitante.getGolsFeitos() + golsContra);
			
			this.timeCasa.setGolsContra(golsContra);
		}
		
		if( (golsTimeVisitante - pontosTimeVisitante) > 0 ) {
			int golsContra = golsTimeVisitante - pontosTimeVisitante;
			
			this.timeVisitante.setGolsSofridos(this.timeVisitante.getGolsSofridos() + golsContra);
			this.timeCasa.setGolsFeitos(this.timeCasa.getGolsFeitos() + golsContra);
			
			this.timeVisitante.setGolsContra(golsContra);
		}
	}
}
