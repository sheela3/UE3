
package aufgabe04;

/**
 *
 * @author sheela
 */

public class Liste<L> 
{
    L[] array;

    public Liste(int size)
    {
        array = (L[]) (new Object[size]);
    }

    public void save(L value) 
    {
        for (int i = 0; i < array.length; i++)
        {
            if (array[i] == null) 
            {
                array[i] = value;
                System.out.println("Es wurde gespeichert");
                break;
            }
        }

    }

    @Override
    public String toString() 
    {
        String listenInhalt = "";
        
        for (L a : array) 
        {
            listenInhalt += a + "\n";
        }
        
        return listenInhalt;
    }
}
