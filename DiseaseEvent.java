import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Disease here.
 * 
* @author Jason
 * @version 16.03.2022
 */
public class DiseaseEvent extends Event
{
    GifImage gifImage = new GifImage("illness.gif");
    public void startEvent(Planet target){
        setImage(gifImage.getCurrentImage());
    }
}
