package main;

public class Jogo {
	
	private Time timeCasa;
	private Time timeVisitante;
	
	public void setTimes(Time timeCasa, Time timeVisitante) {
		this.timeCasa = timeCasa;
		this.timeVisitante = timeVisitante;
	}
	
	public void addGols(int golsTimeCasa, int golsTimeVisitante) {
		this.timeCasa.setGolsFeitos(golsTimeCasa + this.timeCasa.getGolsFeitos());
		this.timeCasa.setGolsSofridos(golsTimeVisitante + this.timeCasa.getGolsSofridos());

		this.timeVisitante.setGolsFeitos(golsTimeVisitante + this.timeVisitante.getGolsFeitos());
		this.timeVisitante.setGolsSofridos(golsTimeCasa + this.timeVisitante.getGolsSofridos());
	}
	
	public void addGolsContra(int golsContraTimeCasa, int golsContraTimeVisitante) {
		this.timeCasa.setGolsContra(golsContraTimeCasa + this.timeCasa.getGolsContra());
		
		this.timeVisitante.setGolsContra(golsContraTimeVisitante + this.timeVisitante.getGolsContra());

	}
	
	public void setResultado(int golsTimeCasa, int golsTimeVisitante) {
		
		if (golsTimeCasa > golsTimeVisitante) {
			this.timeCasa.setPontos(3 + this.timeCasa.getPontos());
		} else if (golsTimeVisitante > golsTimeCasa) {
			this.timeVisitante.setPontos(3 + this.timeVisitante.getPontos());
		} else {
			this.timeVisitante.setPontos(1 + this.timeVisitante.getPontos());
			this.timeCasa.setPontos(1 + this.timeCasa.getPontos());
		}
		
	}
}
