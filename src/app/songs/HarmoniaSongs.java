package app.songs;

import org.jfugue.pattern.Pattern;
import org.jfugue.pattern.PatternProducer;

public class HarmoniaSongs implements Song{

	@Override
	public PatternProducer run() {
		//notas também podem ser tocadas em harmonia usando o "+" entre as notas
		Pattern axiom = new Pattern("C5q+E5q+G5q");
		
		return axiom;
	}

}
