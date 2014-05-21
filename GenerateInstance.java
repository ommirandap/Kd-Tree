public abstract class GenerateInstance{
	
	public int i;
	public double c;
	public long size;
	public double max_range;

	public GenerateInstace(long i){
		this.i = i;
		// Si i = 2 -> size = 2²
		this.c = Math.Random();
		// [0, 1) ... falta el 1...
		this.size = Math.pow(2, i);
		this.max_range = Math.random()*(c*i);		
	}

	abstract public Point[] generate();

}