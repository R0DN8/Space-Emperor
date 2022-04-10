import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot und MouseInfo)

/**
 * Hintergrund (Weltraum) 
 * 
 * IN ENGLISH PLEASE!!
 * 
 * @author (Nico,Nils,Laurenz, Justin) Tin
 * @version 03.02.2022
 */

public class Space extends World{
    GifImage gifImg = new GifImage("SB.gif");
    private static Space space;
    private static int currentRound = 0;
    HomePlanet homeBoy = new HomePlanet(450, 700);
    Alien1 alien1 = new Alien1(10, 10);
    Alien2 alien2 = new Alien2(10, 10);
    Alien3 alien3 = new Alien3(10, 10);
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

        addObject(alien1, 150, 650);
        addObject(alien2, 500, 400);
        addObject(alien3, 750, 100);

        addObject(homeBoy, 450, 700);

        //setPaintOrder(DieKlasseImVordergrund.class,DieKlasseImHintergrund.class);
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

    public static int getCurrentRound(){
        return currentRound;
    }

    public HomePlanet getHomeplanet(){
        return homeBoy;
    }

    public Alien1 getAlien1(){
        return alien1;
    }

    public Alien2 getAlien2(){
        return alien2;
    }

    public Alien3 getAlien3(){
        return alien3;
    }

    public void showMessage(String text, int fontSize, int textXCoord, int textYCoord)
    {
        /*
         * GreenfootImage /NAME/ = new GreenfootImage(/TEXT OR VARIABLE/, /FONT-SIZE/, Color.WHITE, null);
         * getBackground().drawImage(/NAME/, /X-COORDINATE/, /Y-COORDINATE/);
         * 
         * !To insert new Text: Copy above two lines; change the parameters in //
         */
        /*GreenfootImage test = new GreenfootImage(text, fontSize, Color.WHITE, null);
        getBackground().drawImage(test, textXCoord, textYCoord);*/
    }
}