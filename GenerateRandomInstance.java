public class GenerateRandomInstance implements GenerateInstance {
	
	public GenerateRandomInstance(long i){
		super(i);
	}

	public Point[] GenerateInstance(){
		
		Point []result = new Point[size];

		for(int i = 0; i < size; i++){
			double x = (Math.random())*(max_range);
			double y = (Math.random())*(max_range);

			result[i] = new Point(x,y);
		}

		return result;

	}

}