package app.songs;

import org.jfugue.pattern.Pattern;
import org.jfugue.pattern.PatternProducer;

public class DuracaoSongs implements Song{

	@Override
	public PatternProducer run() {
		
		 Pattern axiom = new Pattern("E/3.0 C/2.0 A/0.3");
		
		
		return axiom;
	}

}
