package app.songs;

import org.jfugue.pattern.Pattern;
import org.jfugue.pattern.PatternProducer;

public class HarmoniaMelodiaSongs implements Song{

	@Override
	public PatternProducer run() {

		//Harmonia e melodia juntas
		Pattern axiom = new Pattern("C5h+E5q_G5q");
		
		return axiom;
	}

}
