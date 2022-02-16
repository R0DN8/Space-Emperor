import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot und MouseInfo)

/**
 * Hintergrund (Weltraum) 
 * 
 * IN ENGLISH PLEASE!!
 * 
 * @author (Nico,Nils,Laurenz, Justin) Tin
 * @version 03.02.2022
 */

public class Space extends World
{
    private GreenfootImage[] backgroundimages;
    /**
     * Konstruktor für Objekte der Klasse Space
     * 
     */
    public Space()
    {    
        // Erstellt eine neue Welt mit 1280x720 Zellen und einer Zell-Größe von 1x1 Pixeln.
        super(1090, 875, 1); //Auflösung und Pixelgröße
        //private GifImage g = new GifImage("BackgroundSpace.gif");
        
        
        //folgende Objecte werden mit der Welt geladen:
        SideBarMenu sideBarMenu = new SideBarMenu();
            addObject(new SideBarMenu(), 983, 400);
        Skilltree skilltree = new Skilltree();
            addObject(new Skilltree(), 1000, 600);
    }
    /* Diese Methode verhindert, dass Objekte angezeigt werden.
     * Was genau sie anstellt, keine Ahnung. Vielleicht zeigt sie die Objekte hinter dem 
     * Hintergrund an, vielleicht werden sie gar nicht gerendert..
    public void addObject(Actor object, int x, int y){
    
    }*/
}