import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot und MouseInfo)

/**
 * Spaceship ist eine Überklasse aller Raumschiffe.
 * 
 * IN ENGLISH PLEASE!!
 * 
 * @author (Luca, Jason) Tin
 * @version 03.02.2022
 */
public abstract class Spaceship extends Actor
{

    private Position position;
    
    private int velocity; //in x/y pro runde z.B. 10 pro runde
    
    private Position moveStartPosition;
    private Position moveEndPosition;
    private int roundForMoveNeeded;
    private int currentMoveRound;
    

    /**
     * Raumschiff erscheint an der Übergebenen Position
     */
    public Spaceship(Position pos, int velocity){
        this.position = pos;
        this.velocity = velocity;
    }

    /**
     * Raumschiff erscheint an der Position des Planeten
     * //TODO PLanet erstellen
     */
    /*
    public Spaceship(Planet planet, int velocity){
        this(planet.getPosition(), velocity);
    }
    */

    /**
     * Act - tut, was auch immer Spaceship tun will. Diese Methode wird aufgerufen, 
     * sobald der 'Act' oder 'Run' Button in der Umgebung angeklickt werden. 
     */
    public void act() 
    {

    } 
    
    public void onNextRound() {
     
        
        
    }
    
    /**
     * Raumschiff bewegt sich innerhalb der einer Anzahl von Runden zu der angegebenen Position
    */
    public void moveToPosition(Position endPosition){
        
        roundForMoveNeeded = roundNeededForMove(endPosition);
        currentMoveRound = 0;
        moveStartPosition = position;
        moveEndPosition = endPosition;
        moveDeltaX = (moveStartPosition.getX() - moveEndPosition.getX()) / roundForMoveNeeded;
        moveDeltaY = (moveStartPosition.getY() - moveEndPosition.getY()) / roundForMoveNeeded;
    }
    
    protected void move(int round){
        if(currentMoveRound < roundForMoveNeeded) {
            
        }
    }
    
    private Position moveStartPosition;
    private Position moveEndPosition;
    private int roundForMoveNeeded;
    private int currentMoveRound;
    private int moveDeltaX;
    private int moveDeltaY;
    
    /**
     * Gibt Anzahl der Runden zurück, die für eine Bewegung benötigt werden
     */
    public int roundNeededForMove(Position endPosition){
        int deltaX = position.getX() - endPosition.getX();
        int deltaY = position.getY() - endPosition.getY();
        double length = Math.sqrt(deltaX * deltaX - deltaY * deltaY);
        return (int) Math.round(length / velocity);
    }
    
    
    public Position getPosition() {
        return this.position;
    }
    
    public void setPosition(Position pos) {
        this.position = pos;
    }
}