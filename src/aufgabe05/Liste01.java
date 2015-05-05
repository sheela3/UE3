
package aufgabe05;

/**
 *
 * @author sheela
 */

public class Liste01<L extends Benennbar01> 
{
    Benennbar01[] array;

    public Liste01(int size) 
    {
        array =  new  Benennbar01[size];
    }

    @Override
    public String toString()
    {
        String listenInhalt = "";
        
        for (Benennbar01 a : array)
        {
            listenInhalt += a+ "\n";
        }
        
        return listenInhalt; 
       }
    

    public void save(L value)
    {
        for (int i = 0; i < array.length;i++) 
        {

            if (array[i] == null)
            {
                array[i] = value;
                System.out.println("Es wurde gespeichert");
                break;
            } 
        }
    }
}
