/**
 * Ergänzen Sie hier eine Beschreibung für die Klasse Position.
 * 
 * @author (Luca, Jason) Tin 
 * @version 03.02.2022
 */
public class Position  
{
    // Attribute -  ersetzen Sie das Beispiel hier mit ihren eigenen Attributen
    private int x;
    private int y;
    
    /**
     * Konstruktor für Objekte der Klasse Position
     */
    public Position(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
   

    public int getX(){
        return x;
    }
    public void setX(int x){
        this.x = x;
    }
    
    public int getY(){
        return y;
    }
    public void setY(int y){
        this.y = y;
    }
}