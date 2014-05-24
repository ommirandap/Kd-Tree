
public class RandomPointGenerator extends PointGenerator {

    Point []result;
    
    public RandomPointGenerator(int i){
    	super(i);
    }

    @Override
    public Point[] generateInstance(){
		
        result = new Point[size];

        for(int index = 0; index < size; index++){
            double x = (Math.random())*(max_range);
            double y = (Math.random())*(max_range);
            result[index] = new Point(x,y, index);
        }

        return result;
   
    }

}
