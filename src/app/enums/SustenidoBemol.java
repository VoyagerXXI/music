package app.enums;

public enum SustenidoBemol {
	
	Sustenido("#","##"),
	Bemol("b","bb"); 
	
	public String sharps;
	public String doubleSharps;
	
	SustenidoBemol(String sharps, String doubleSharps){
		this.sharps = sharps;
		this.doubleSharps = doubleSharps;
	}
	
	public static SustenidoBemol stringByInstance(String sustenido) {
		for (SustenidoBemol sustenidoBemol : SustenidoBemol.values() ) { 
		    if(	sustenidoBemol.sharps.equals(sustenido) || 
		    	sustenidoBemol.doubleSharps.equals(sustenido))return sustenidoBemol;
		}
		return null;
	}
	
	@Override
	public String toString() {
		return sharps+"";
	}
	
}
