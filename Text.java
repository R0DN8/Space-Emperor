import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot und MouseInfo)

/**
 * Ergänzen Sie hier eine Beschreibung für die Klasse Text.
 * 
 * @author Nils
 * @version 16.3.
 */
public class Text extends Actor
{
    
    /**
     * Act - tut, was auch immer Text tun will. Diese Methode wird aufgerufen, 
     * sobald der 'Act' oder 'Run' Button in der Umgebung angeklickt werden. 
     */
    public void act() 
    {
        // Ergänzen Sie Ihren Quelltext hier...
    }    
    
    public Text() {
        setImage(new GreenfootImage("Nächste Runde", 20, Color.WHITE, null));
    }
    
    public void setText(String inputText, int boxWidth, int boxHeight, int fontSize) {
       GreenfootImage text = new GreenfootImage(boxWidth, boxHeight);
       text.setColor(Color.WHITE);
       text.setFont(new Font("Calibri", fontSize));
       text.drawString(inputText, 200, 200);

       setImage(text);
    }
}