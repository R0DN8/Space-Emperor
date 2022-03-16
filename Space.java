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
    GifImage gifImg = new GifImage("SB.gif");
    private static Space space;
    private static int currentRound = 0;
    /**
     * Konstruktor für Objekte der Klasse Space
     * 
     */
    public Space()
    {    
        // Erstellt eine neue Welt mit 1090x875 Zellen und einer Zell-Größe von 1x1 Pixeln.
        super(1090, 875, 1); //Auflösung und Pixelgröße
        space = this;

        //folgende Objecte werden mit der Welt geladen:
        SideBarMenu sideBarMenu = new SideBarMenu();
        addObject(new SideBarMenu(), 983, 440);
        Skilltree skilltree = new Skilltree();
        addObject(new Skilltree(), 1000, 600);

        NextRound nextround = new NextRound();
        addObject(new NextRound(), 926, 800);
    }

    public void gifAnimation()
    {
        setBackground(gifImg.getCurrentImage());
    }

    public void act()
    {
        gifAnimation();
        currentRound++;
    }

    public static void addSpaceship(Spaceship spaceship) {
        space.addObject(spaceship, spaceship.getX(), spaceship.getY());
    }

    public void showMessage(String text, int fontSize, int textXCoord, int textYCoord)
    {
        /*
         * GreenfootImage /NAME/ = new GreenfootImage(/TEXT OR VARIABLE/, /FONT-SIZE/, Color.WHITE, null);
         * getBackground().drawImage(/NAME/, /X-COORDINATE/, /Y-COORDINATE/);
         * 
         * !To insert new Text: Copy above two lines; change the parameters in //
         */
        GreenfootImage test = new GreenfootImage(text, fontSize, Color.WHITE, null);
        getBackground().drawImage(test, textXCoord, textYCoord);
    }

    /* Diese Methode verhindert, dass Objekte angezeigt werden.
     * Was genau sie anstellt, keine Ahnung. Vielleicht zeigt sie die Objekte hinter dem 
     * Hintergrund an, vielleicht werden sie gar nicht gerendert..
    public void addObject(Actor object, int x, int y){

    }*/
    
    public static int getCurrentRound(){
        return currentRound;
    }
}