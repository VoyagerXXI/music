package app.songs;

import org.jfugue.pattern.Pattern;
import org.jfugue.pattern.PatternProducer;

public class MelodiaSongs implements Song{

	@Override
	public PatternProducer run() {
		
		Pattern axiom = new Pattern("“C5q E5q G5q");
		
		return axiom;
	}

}
