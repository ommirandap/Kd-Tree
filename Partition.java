
public class Partition {
	
	static public PointGenerator GI;
	static public Point []SetPoints;
	static public Point []X_OrderedPoints;
	static public Point []Y_OrderedPoints;
	static private Point[] numbers;
	static private Point[] helper;
	static private int size;
	
	static public int[] leftMedianPartition;
	static public int[] rightMedianPartition; 

    
    static public Point[] mySort(Point[] inputData, boolean axis) {
        // AXIS -> X = TRUE % Y = FALSE
		numbers = inputData;
	    size = inputData.length;
	    helper = new Point[size];

	    mergesort(0, size - 1, axis);
        
        return numbers;
    }

    static private void mergesort(int low, int high, boolean axis) {
    	if (low < high) {
    		int middle = low + (high - low) / 2;
	      	mergesort(low, middle, axis);
	      	mergesort(middle + 1, high, axis);
	      	if(axis)
	      		mergeByX(low, middle, high);
	      	else
	      		mergeByY(low, middle, high);
	    }
	}

	static private void mergeByX(int low, int middle, int high) {

	    for (int i = low; i <= high; i++) {
	    	helper[i] = new Point(numbers[i]);
	    }

	    int i = low;
	    int j = middle + 1;
	    int k = low;

	    while (i <= middle && j <= high) {
	    	if ((helper[i].getX()) <= (helper[j].getX())) {
	    		numbers[k] = new Point(helper[i]);
	    		i++;
	    	} else {
	    		numbers[k] = new Point(helper[j]);
	    		j++;
	    	}
	    	k++;
	    }
	    
	    while (i <= middle) {
	    	numbers[k] = new Point(helper[i]);
	    	k++;
	    	i++;
	    }
	}

	static private void mergeByY(int low, int middle, int high) {

	    for (int i = low; i <= high; i++) {
	    	helper[i] = new Point(numbers[i]);
	    }

	    int i = low;
	    int j = middle + 1;
	    int k = low;
	    
	    while (i <= middle && j <= high) {
	    	if ((helper[i].getY()) <= (helper[j].getY())) {
	    		numbers[k] = new Point(helper[i]);
	    		i++;
	    	} else {
	    		numbers[k] = new Point(helper[j]);
	    		j++;
	    	}
	    	k++;
	    }
	    
	    while (i <= middle) {
	    	numbers[k] = new Point(helper[i]);
	    	k++;
	    	i++;
	    }
	}

	static public int[] meanPartition(int indexInput[], boolean axis){

		int []result;

		if(!axis){
			// EJE Y en boolean -> divido con eje X
			int indexMin = indexInput[0];
			int indexMax = indexInput[indexInput.length - 1];
			double divideLine = (SetPoints[indexMax].getX() + SetPoints[indexMin].getX()) / 2;
			int volatileSize = 0;
			for(int i=0; i < X_OrderedPoints.length; i++){
				if(X_OrderedPoints[i].getX() <= divideLine)
					volatileSize++;
				else break;
			}
			result = new int[volatileSize];
			for(int i=0; i < result.length; i++){
				result[i] = X_OrderedPoints[i].getIndex();
			}
		}

		else{
			// EJE X en boolean -> divido con eje Y
			int indexMin = indexInput[0];
			int indexMax = indexInput[indexInput.length - 1];
			double divideLine = (SetPoints[indexMax].getY() + SetPoints[indexMin].getY()) / 2;
			int volatileSize = 0;
			for(int i=0; i < Y_OrderedPoints.length; i++){
				if(Y_OrderedPoints[i].getY() <= divideLine)
					volatileSize++;
				else break;
			}
			result = new int[volatileSize];
			for(int i=0; i < result.length; i++){
				result[i] = Y_OrderedPoints[i].getIndex();
			}
		}
		
		return result;
	}

	static public void main(String []args){

        GI = new RandomPointGenerator(3);
		SetPoints = GI.generateInstance();

		X_OrderedPoints = mySort(SetPoints, false);
		Y_OrderedPoints = mySort(SetPoints, true);
		
		int a[], b[];
		int indexX[];
		a = null;
		indexX = new int[X_OrderedPoints.length];
		
		for(int i = 0; i < X_OrderedPoints.length; i++){
			System.out.println(X_OrderedPoints[i].toString());
			indexX[i] = X_OrderedPoints[i].getIndex();
		}

		a = meanPartition(indexX,false);

		for(int i =0; i<a.length; i++){
			System.out.print(a[i]+" - ");
		}

		/*
		for(int i = 0; i < SetPoints.length; i++){
			System.out.println(SetPoints[i].toString());
		}
		for(int i = 0; i < Y_OrderedPoints.length; i++){
			System.out.println(Y_OrderedPoints[i].toString());
		}
		*/

	}
}