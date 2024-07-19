package Models;

public class ConstructorMaxPoint {

	
	private String ConstructorName;
	private float points;
	
	
	public ConstructorMaxPoint(String constructorName, float points) {
		super();
		ConstructorName = constructorName;
		this.points = points;
	}


	public String getConstructorName() {
		return ConstructorName;
	}


	public void setConstructorName(String constructorName) {
		ConstructorName = constructorName;
	}


	public float getPoints() {
		return points;
	}


	public void setPoints(float points) {
		this.points = points;
	}
	
	
	
	
}
