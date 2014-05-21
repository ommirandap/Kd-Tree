/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ommirandap
 */
public class Testest {
    
    static public void main(String []args){

        PointGenerator GI;
        GI = new RandomPointGenerator(5);

	Point DATA[];
        DATA = GI.generateInstance();

	for(int i = 0; i < DATA.length; i++){
            System.out.println(DATA[i].toString());
	}
    }
}

