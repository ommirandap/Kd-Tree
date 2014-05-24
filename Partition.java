
public class Partition {
	
	static public PointGenerator GI;
	static public Point []SetPoints;
	//public int [] X_OrderedPoints;
	//public int [] Y_OrderedPoints;
	
	static private Point[] numbers;
	static private Point[] helper;
	static private int size;
	
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
	      		mergeX(low, middle, high);
	      	else
	      		mergeY(low, middle, high);
	    }
	}

	static private void mergeX(int low, int middle, int high) {

	    // Copy both parts in the helper
	    for (int i = low; i <= high; i++) {
	    	helper[i] = new Point(numbers[i]);
	    }

	    int i = low;
	    int j = middle + 1;
	    int k = low;
	    
	    // Compares the smallest element of both arrays and copy them into the
	    // original array mantaining the order 

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
	    
	    // Copy the rest of the left side of the array into the target array
	    while (i <= middle) {
	    	numbers[k] = new Point(helper[i]);
	    	k++;
	    	i++;
	    }
	}

	static private void mergeY(int low, int middle, int high) {

	    // Copy both parts in the helper
	    for (int i = low; i <= high; i++) {
	    	helper[i] = new Point(numbers[i]);
	    }

	    int i = low;
	    int j = middle + 1;
	    int k = low;
	    
	    // Compares the smallest element of both arrays and copy them into the
	    // original array mantaining the order 

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
	    
	    // Copy the rest of the left side of the array into the target array
	    while (i <= middle) {
	    	numbers[k] = new Point(helper[i]);
	    	k++;
	    	i++;
	    }
	}

	static public void main(String []args){

        GI = new RandomPointGenerator(2);
		SetPoints = GI.generateInstance();


		for(int i = 0; i < SetPoints.length; i++){
			System.out.println(SetPoints[i].toString());
		}

		Point []X_OrderedPoints;
		Point []Y_OrderedPoints;
		X_OrderedPoints = mySort(SetPoints, true);
		
		for(int i = 0; i < X_OrderedPoints.length; i++){
			System.out.println(X_OrderedPoints[i].toString());
		}

		Y_OrderedPoints = mySort(SetPoints, false);
		
		for(int i = 0; i < Y_OrderedPoints.length; i++){
			System.out.println(Y_OrderedPoints[i].toString());
		}


	}
}