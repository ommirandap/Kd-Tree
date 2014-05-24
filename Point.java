
public class Point {
	
	public double x, y;
	public int index;

	public Point(double x, double y){
		this.x = x;
		this.y = y;
	}

	public Point(Point toCopy){
		this.x = toCopy.x;
		this.y = toCopy.y;
		this.index = toCopy.index;
	}

	public Point(double x, double y, int index){
		this.x = x;
		this.y = y;
		this.index = index;		
	}
	
	public double getX(){
		return this.x;
	}

	public double getY(){
		return this.y;
	}

	public int getIndex(){
		return this.index;
	}

	public String toString(){
		return "(".concat(this.x + ", " + this.y+") -> i ="+this.index);
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