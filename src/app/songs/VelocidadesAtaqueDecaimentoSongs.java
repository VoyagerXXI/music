package app.songs;

import org.jfugue.pattern.Pattern;
import org.jfugue.pattern.PatternProducer;

public class VelocidadesAtaqueDecaimentoSongs implements Song{

	@Override
	public PatternProducer run() {
		// Padrão: 64 para velocidade de ataque, 64 para velocidade
		// 0 .. 127
		//letras a e d, sendo a = ataque e decaimento
		//player.play("C5qa0d127"); // Sharp attack, long decay
		//player.play("E3wwd0"); // Default attack, sharp decay
		//player.play("C7maja30"); // C7, E7, and G7 (components of
		// C7maj) will all play with an
		// of attack 30
		
		
		Pattern axiom = new Pattern("C5qa0d127 E3wwd0 C7maja30");
		
		return axiom;
	}

}
