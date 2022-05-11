package app.songs;

import org.jfugue.pattern.Pattern;
import org.jfugue.pattern.PatternProducer;

public class EquivalenciaSongs implements Song{

	@Override
	public PatternProducer run() {
		
		Pattern axiom = new Pattern("Eq*3:2 Fq*3:2 Gq*3:2");
		 // i = oitavo q = quarto s = décimoSexto
		axiom = new Pattern("Ci*5:4 Ei*5:4 Gi*5:4 Ei*5:4 Gi*5:4").repeat(2);
		//axiom = new Pattern("Cq*5:4 Eq*5:4 Gq*5:4 Eq*5:4 Gq*5:4").repeat(12);
		//axiom = new Pattern("Cs*5:4 Ei*5:4 Gq*5:4 Ei*5:4 Gs*5:4").repeat(12);
		
		return axiom;
	}

}
