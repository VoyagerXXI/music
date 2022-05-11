package app.songs;

import org.jfugue.pattern.Pattern;
import org.jfugue.pattern.PatternProducer;

public class AcordesSongs implements Song{

	@Override
	public PatternProducer run() {
		
		Pattern axiom = new Pattern("Amaj Bmaj Amin Bmin Adom7 Bdom7 Admin7 Bmin7 " +
									"Amaj Bmaj Amin Bmin Adom7 Bdom7 Admin7 Bmin7 "+
									"Amaj Bmaj Amin Bmin Adom7 Bdom7 Admin7 Bmin7 ");


		return axiom;
	}

}
