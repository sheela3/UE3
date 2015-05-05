
package aufgabe05;

/**
 *
 * @author sheela
 */

public class Vehicle01 extends Benennbar01
{
    private short wheels;
    private String name;

    public Vehicle01(short w, Color f, short ps, short d)
    {
        wheels = w;
        farbe = f;
        this.ps = ps;
        doors = d;
        started = false;
        this.speed = 0;
    }

    public Vehicle01()
    {

    }
    
    @Override
    public String getName()
    {
        return name;
    }

    @Override
    public void setName(String _n)
    {
        name = _n;
    }

    @Override
    public String toString()
    {
        return "Mein Vehicle hat " + getPs() + " PS und fährt mit " + getSpeed() + " km/h";
    }

    public enum Color
    {

        Black, Silver, Red, Grey, Yellow, Blue;
    }
    
    private Color farbe;
    private short ps;
    private short doors;
    private boolean started;
    private short speed;

    public void start()
    {
        started = true;
    }

    public void stop() 
    {
        started = false;
    }

    public void accelerate(short speed)
    {
        if (started == true && ps >= 0)
        {
            ps += ps + speed;
        } 
        
        else 
        {
            System.out.println("Das Fahrzeug ist nicht gestartet oder die Geschwindigkeit ist über 250");

        }
    }

    public void slow(short speed) 
    {
        if (started == true && ps <= 250) 
        {
            ps += ps + speed;
        } 
        
        else
        {
            System.out.println("Das Fahrzeug ist nicht gestartet oder die Geschwindigkeit ist über 250");
        }
    }

    public short getWheels()
    {
        return wheels;
    }

    public void setWheels(short wheels) 
    {
        this.wheels = wheels;
    }

    public Color getFarbe() 
    {
        return farbe;
    }

    public void setFarbe(Color farbe)
    {
        this.farbe = farbe;
    }

    public short getPs() 
    {
        return ps;
    }

    public void setPs(short ps)
    {
        this.ps = ps;
    }

    public short getDoors()
    {
        return doors;
    }

    public void setDoors(short doors)
    {
        this.doors = doors;
    }

    public boolean isStarted() 
    {
        return started;
    }

    public void setStarted(boolean started) 
    {
        this.started = started;
    }

    public short getSpeed()
    {
        return speed;
    }

    public void setSpeed(short speed)
    {
        this.speed = speed;
    }

}
