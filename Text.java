import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot und MouseInfo)

/**
 * Ergänzen Sie hier eine Beschreibung für die Klasse Text.
 * 
 * @author Nils
 * @version 16.3.
 */
public class Text extends Actor
{
    private int x, y;
    /**
     * Act - tut, was auch immer Text tun will. Diese Methode wird aufgerufen, 
     * sobald der 'Act' oder 'Run' Button in der Umgebung angeklickt werden. 
     */
    public void act() 
    {
        // Ergänzen Sie Ihren Quelltext hier...
    }    

    public Text() {
        /* !!! hier in der Final Version "Test" entfernen zu ""; 
         * damit kann man das Object beim reinspawenen sehen
         */
        setImage(new GreenfootImage("Test", 20, Color.WHITE, null));
    }

    public void setText(String inputText, int boxWidth, int boxHeight, int fontSize) {
        GreenfootImage text = new GreenfootImage(boxWidth, boxHeight);
        text.setColor(Color.WHITE);
        text.setFont(new Font("Calibri", fontSize));
        text.drawString(inputText, 100, 50);

        setImage(text);
    }

    public void setPos(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }
}