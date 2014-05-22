
public class Point {
	
	public double x, y;

	public Point(double x, double y){
		this.x = x;
		this.y = y;
	}
	
	public double getX(){
		return this.x;
	}

	public double getY(){
		return this.y;
	}

	public String toString(){
		return "(".concat(this.x + ", " + this.y+")");
	}

	public void setX(double x){
		this.x = x;
	}

	public void setY(double y){
		this.y = y;
	}

	public double distanceTo(Point p2){
		double aux1 = Math.abs(this.x - p2.getX());
		double aux2 = Math.abs(this.y - p2.getY());
		return Math.sqrt(aux1*aux1 + aux2*aux2);
	}


}