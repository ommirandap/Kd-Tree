
public class RandomPointGenerator extends PointGenerator {

    Point []result;
    
    public RandomPointGenerator(int i){
    	super(i);
    }

    @Override
    public Point[] generateInstance(){
		
        result = new Point[size];

        for(int i = 0; i < size; i++){
            double x = (Math.random())*(max_range);
            double y = (Math.random())*(max_range);
            result[i] = new Point(x,y);
        }

        return result;
   
    }

}
