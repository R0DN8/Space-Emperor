import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
import java.util.Random;

/**
 * Write a description of class Enemy here.
 * 
 * TODO: -Aktionen nach Wahrscheinlichkeit starten 
 * und Angriff erst ab bestimmter Runde.
 * -Upgrade: Truppenanzahl erhöhen oder nach Skilltree???
 * -Nichts tun implementieren
 * -Pro runde maximal einer angreifen
 * 
 * 
 * @author Jason, Luca
 * @version 23.03.2022
 */
public class Enemy extends Actor
{
    private static final int ATTACK_PROBATILITY = 5; //In percent. Range: 0 - 100;

    private static boolean attack = false;
    private static ArrayList<Enemy> existingEnemys;

    private int numActions = 1;
    private Planet planet;

    static {
        existingEnemys = new ArrayList<>();
    }

    public Enemy(Planet planet){
        this.planet = planet;
        existingEnemys.add(this);
    }

    public void act()
    {
        attack = false;
        for(Enemy enemy : existingEnemys) {
            enemy.execute();
        }
    }

    public void execute(){
        Random random = new Random();
        Actions[] allActions = Actions.values();

        //Execute random actions
        for(int i = 0; i < numActions; i++){
            //Check for attack
            if(random.nextInt(100) <= ATTACK_PROBATILITY && !attack){
                attack = true;
                executeAttack();
            }
            else {
                Actions action;
                do{
                    action = allActions[random.nextInt(allActions.length)];
                } while(action != Actions.ATTACK);
                if(action == Actions.UPGRADE) executeUpgrade();
            }
        }
    }

    public void executeAttack(){
        ArrayList<Planet> planets = (ArrayList<Planet>) getWorld().getObjects(Planet.class);

        planets.remove(planet);
        int target = new Random().nextInt(planets.size());

        //TODO wait for fightsystem
    }

    public void executeUpgrade(){
        //TODO upgrade auf Variable planet
    }

    public enum Actions{
        NOTHING,
        ATTACK,
        UPGRADE
    }
}
