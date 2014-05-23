
public class Node {
	
	public Node left;
	public Node right;
	public Boolean isLeaf;
	public Point point;
	public double axisValue;
	public boolean axisX;
	// TRUE -> EJE X ... FALSE -> EJE Y

	public Node(){
		this.left = null;
		this.right = null;
		this.isLeaf = true;
		this.point = null;
		this.axisValue = 0;
		this.axisX = false;
	}

	public Node(Node l, Node r, double axisValue, Boolean axisX){
		this.left = l;
		this.right = r;
		this.isLeaf = false;
		this.axisValue = axisValue;
		this.axisX = axisX;
	}

	public Node(Point p){
		this.p = p;
		this.left = null;
		this.right = null;
	}

	public Node(Node l, Node r){
		this.left = l;
		this.right = r;
		this.isLeaf = false;
		this.line = null;
		this.p = null;
	}

	public boolean isXaxis(){
		return axis.getX() < 0;
	}

	public boolean isYAxis(){
		return axis.getY() < 0;
	}

	public void setAxisAsX(){
		this.axis = new Point(-1, 0);
	}

	public void setAxisAsY(){
		this.axis = new Point(0, -1);
	}

	public void setLeft(Node l){
		this.isLeaf = false;
		this.left = l;
	}

	public void setRight(Node r){
		this.isLeaf = false;
		this.right = r;
	}

	public String printNode(){
		return "Node: "+(this.p).toString();
	}
}