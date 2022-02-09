import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot und MouseInfo)

/**
 * Spaceship is superclass of all Ships
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
    private int moveDeltaX, moveDeltaY;
    private int roundForMoveNeeded;
    private int currentMoveRound;
   
    

    /**
     * Spaceship appears on positio
     */
    public Spaceship(Position pos, int velocity){
        this.position = pos;
        this.velocity = velocity;
    }

    /**
     * Spaceship appears on position of Planet
     */
    public Spaceship(Planet planet, int velocity){
        this(planet.getPosition(), velocity);
    }
    
    public abstract void onFinish();
    public abstract String getName();

    /**
     * Moves Ship after every round
     */
    public void act() 
    {
    if(currentMoveRound < roundForMoveNeeded) {
           this.setPosition(new Position(this.getX() + moveDeltaX, this.getY() + moveDeltaY));
           this.setLocation(this.getPosition().getX(), this.getPosition().getY());
           this.currentMoveRound++;
        }else {
            onFinish();
        }
        
    } 
    
    /**
     * Spaceship moves in some rounds (based on velocity) to the given endposition
    */
    public void setEndPosition(Position endPosition){
        
        if((roundForMoveNeeded = roundNeededForMove(endPosition)) == 0)
            roundForMoveNeeded = 1;
        currentMoveRound = 0;
        moveStartPosition = position;
        moveEndPosition = endPosition;
        moveDeltaX = (moveStartPosition.getX() - moveEndPosition.getX()) / roundForMoveNeeded;
        moveDeltaY = (moveStartPosition.getY() - moveEndPosition.getY()) / roundForMoveNeeded;
    }
    
    /**
     * Removes actor from Space-Map
     */
    private void removeActor() {
         Space.getWorld().removeObject(this);
    }
    
    /**
     * Returns needed number of rounds for move to Position
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