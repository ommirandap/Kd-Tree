
public class LowDiscrepancyPointGenerator extends PointGenerator {

	Point []result;

	public LowDiscrepancyPointGenerator(int i){
		super(i);
	}

	@Override
	public Point[] generateInstance(){

		result = new Point[size];

		for(int index = 0; index < size; index++){
			double x = getHaltonNumber(index, 2)*(max_range);
			double y = getHaltonNumber(index, 3)*(max_range);
			result[index] = new Point(x, y, index);
		}

		return result;	
	}

    public double getHaltonNumber(int index, int primeBase){

    	if(index < 0)
    		index = 0;

    	index++;

    	double res = 0;
    	double factor = 1.0/primeBase;
       	
       	int i = index;
       	
       	while(i > 0)
       	{
       		res = res + factor * (i % primeBase);
       		i = i / primeBase;
       		factor = factor / primeBase;
       	}
       	return res;
    }

   }
