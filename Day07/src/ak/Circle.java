package ak;

public class Circle {
	//variable
	private double myX;
	private double myY;
	private double myDiameter;
	
	//constructor
	public Circle() {
		myX=0;
		myY=0;
		myDiameter=100;
	}
	public Circle(double myY,double myX,double myDiameter)throws NegativeDiameterException{
		if (myDiameter<0) {
			throw new NegativeDiameterException("Diameter cannot be negative");
		}
		this.myDiameter=myDiameter;
		this.myX=myX;
		this.myY=myY;
	}
	public double getMyX() {
		return myX;
	}
	public double getMyY() {
		return myY;
	}
	public double getMyDiameter() {
		return myDiameter;
	}
	
}
