/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author ommirandap
 */
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
	this.max_range = Math.random()*(c*i);		
    }

    abstract public Point [] generateInstance();

}

