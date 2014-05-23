
public class KDTree {
	

	public Node construirRandom(int n){

		Node root = new Node(new Point(0,0));
		Node left = new Node(new Point(0,0));
		Node right = new Node(new Point(0,0));

		if(n==0){
			root.setRight(right);
			root.setLeft(left);
			return root;
		} 
		else{
			root.setLeft(left);
			root.setRight(right);
			return construirRandom(n--);
			//return construirRandom(n--);
		}

	}

	static public void main(String []args){

		Node root;

		root = new Node(null, null, new Point(Math.random(),Math.random()), null);


		System.out.println(root.printNode());



	}

}