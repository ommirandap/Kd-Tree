
public abstract class PointGenerator {
	
    public int i;
    public double c;
    public int size;
    public double max_range;

    public PointGenerator(int i){
       	this.i = i;
    	// Si i = 2 -> size = 2²
        this.c = Math.random();
    	// [0, 1) ... falta el 1...
    	this.size = (int) Math.pow(2, i);
        this.max_range = Math.random()*(c*Math.pow(2,0.5*i));
        // [0, c*sqrt(i)]		
    }

    abstract public Point [] generateInstance();

    public String toString(){
        String ret = "Para i = "+i+" hay "+size+" puntos, entre 0 y "+max_range+" con c = "+c;
        return ret;
    }

}

