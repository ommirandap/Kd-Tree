
public class Testest {
    
    static public void main(String []args){

        PointGenerator GI;
        GI = new RandomPointGenerator(20);

		Point DATA[];
        DATA = GI.generateInstance();
        System.out.println(GI.toString());

		for(int i = 0; i < DATA.length; i++){
            System.out.print("Point N°: "+i+" -> ");
            System.out.println(DATA[i].toString());
            System.out.println(DATA[i].distanceTo(new Point(0,0)));
		}
    }
}

