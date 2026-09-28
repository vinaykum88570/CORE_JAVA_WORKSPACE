package R_HAS_A_Relationship;

public class Collage {

	 private String collagName;
	 private String collageLocation;
	
	 @Override
	public String toString() {
		return "Collage [collagName=" + collagName + ", collageLocation=" + collageLocation + "]";
	}



	public Collage(String collagName, String collageLocation ) {
		this.collagName=collagName;
		this.collageLocation=collageLocation;
	}

	
	
	public String getCollagName() {
		return collagName;
	}

	
	public String getCollageLocation() {
		return collageLocation;
	}

	
}
