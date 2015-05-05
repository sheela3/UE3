
package aufgabe02;

import aufgabe02.Vehicle.Color;


/**
 *
 * @author sheela
 */

public class Aufruf 
{
    public static void main(String[] args)
    { 
        Car bmw = new Car((short) 4, Color.Silver, (short) 220, (short) 5, (short) 4);
        Car audi = new Car((short) 4, Color.Black, (short) 180, (short) 5, (short) 8);   
        Boat titanic = new Boat((short) 0, Color.Blue, (short) 51000, (short) 0, (short) 10.54, (short) 3, 100.000);
    
        System.out.println(bmw.toString());
        System.out.println(audi.toString());
        System.out.println(titanic.toString());

     //Aufgabe 2
     Benennbar namedCar = new Car(); 
     namedCar.setName("Sheela Breitfuss");
     System.out.println("Es heißt " + namedCar.getName());
    }        
}
