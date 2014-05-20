
public class Node {
	
	public Node left;
	public Node right;
	public Boolean isLeaf;
	public Line line;
	public Point p;

	public Node(Node l, Node r, Point p, Line line){
		this.left = l;
		this.right = r;
		this.p = p;
		this.line = line;
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