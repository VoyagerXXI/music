package app;

import org.jfugue.player.Player;

import app.songs.*;


import javax.sound.midi.MidiUnavailableException;

public class Main {

	public static void main(String[] args) throws MidiUnavailableException {
		Player player = new Player();

		player.play(new DuracaoSongs().run());
		player.play(new EquivalenciaSongs().run());
		player.play(new AcordesSongs().run());
		player.play(new InverterAcordesSongs().run());
		player.play(new LacoSongs().run());
		player.play(new MelodiaSongs().run());
		player.play(new HarmoniaSongs().run());
		player.play(new HarmoniaMelodiaSongs().run());
		player.play(new VelocidadesAtaqueDecaimentoSongs().run());
	}
	
}
