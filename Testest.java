
public class Testest {
    
    static public void main(String []args){

        PointGenerator GI;
        //GI = new RandomPointGenerator(5);
        GI = new LowDiscrepancyPointGenerator(7);

		Point DATA[];

        DATA = GI.generateInstance();
        System.out.println(GI.toString());

		for(int i = 0; i < DATA.length; i++){
            System.out.print("Point N°: "+i+" -> ");
            System.out.println(DATA[i].toString());
		}
    }
}

