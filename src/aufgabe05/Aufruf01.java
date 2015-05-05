/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aufgabe05;

/**
 *
 * @author sheela
 */
public class Aufruf01 
{
    public static void main(String[] args)
    {
     Liste01<Benennbar01> a =  new Liste01(3);
     Benennbar01 b = new Car01();
     Benennbar01 c = new Boat01();
     Benennbar01 d = new Vehicle01();
     
     a.save(b);
     a.save(c);
     a.save(d);
   
     System.out.println(a.toString());
     
    } 
}
