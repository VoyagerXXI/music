package app.enums;

public enum Nota {

	DO(60,"C"),
	RE(62,"D"),
	MI(64,"E"),
	FÁ(65,"F"),
	SOL(67,"G"),
	LÁ(69,"A"),
	SI(70,"B");

	public int octave;
	public String nota;

	Nota(int octave, String nota) {
		this.octave = octave;
		this.nota = nota;
	}

	public static Nota intByInstance(int octave) {
		for (Nota nota : Nota.values() ) {
		    if(nota.octave == octave)return nota;
		}
		return null;
	}
	
	@Override
	public String toString() {
		return octave+"";
	}
	
}
