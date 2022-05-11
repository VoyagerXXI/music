package app.enums;

public enum Duracao {
	/* nota<duraçao> ou nota/1.0 sendo "/1.0" ha duracao variando de 0.1 a o infinito */
	inteiro("w"),
	metade("h"),
	quarto("q"),
	oitavo("i"),
	décimoSexto("s"),
	trigésimoSegundo("t"),
	sexagésimoQuarto("x"),
	umVigésimoOitavo("o");
	
	public String tempo;
	
	Duracao(String tempo){
		this.tempo = tempo;
	}
	

	public static Duracao intByInstance(String tempo) {
		for (Duracao duracao : Duracao.values() ) {
		    if(duracao.tempo.equals(tempo))return duracao;
		}
		return null;
	}

	@Override
	public String toString() {
		return tempo;
	}
}
