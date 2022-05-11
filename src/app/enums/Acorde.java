package app.enums;

public enum Acorde {

	major("maj"),
	minor("min"),
	augmented("aug"),
	diminished("dim"),
	sevenThDominant("dom7"),
	major7Th("maj7"),
	minor7Th("min7"),
	suspended4th("sus4"),
	suspended2nd("sus2"),
	sixThMajor("maj6"),
	minor6th("min6"),
	nineThDominant("dom9"),
	major9th("maj9"),
	minor9th("min9"),
	diminished7th("dim7"),
	add9("add9"),
	minor11th("min11"),
	th11Dominant("dom11"),
	th13Dominant("dom13"),
	minor13th("min13"),
	major13th("maj13");
	/*sevenFiveDominant("dom7<5"),
	sevenPlusFiveDominant("dom7>5"),
	major75("maj7<5"),
	major7Plus5("maj7>5"),
	minorMajor7("minmaj7"),
	sevenFiveNineDominant("dom7<5<9"),
	sevenFivePlusNineDominant("dom7<5>9"),
	sevenPlusFiveNineDominant("dom7>5<9"),
	sevenPlusFivePlusNineDominant("dom7>5>9");*/

	public String acorde;

	Acorde(String acorde){
		this.acorde = acorde;
	}

}
