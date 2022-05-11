package app.songs;

import org.jfugue.pattern.Pattern;
import org.jfugue.pattern.PatternProducer;

public class LacoSongs implements Song{

	@Override
	public PatternProducer run() {
		// "-" sai do A e ir para o B
		Pattern axiom = new Pattern("A- B/2 A- C/2 B- A/2 A- C/2 ");
		
		axiom = new Pattern("G B G C- | C-w- | C- B A G");
		

		return axiom;
	}

}
