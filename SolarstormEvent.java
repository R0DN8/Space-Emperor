import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SolarstormEvent here.
 * 
 * @author Jason
 * @version 16.03.2022
 */
public class SolarstormEvent extends Event
{
    GifImage gifImage = new GifImage("sunstorm.gif");
    public void startEvent(Planet target){
        setImage(gifImage.getCurrentImage());
    }
}
