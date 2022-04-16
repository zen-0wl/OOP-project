import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Window extends World
{
    public Window()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 500, 1); 
        prepare();
    }
    
    private void prepare()
    {
    }
    
    public void act()
    {
        if (Greenfoot.isKeyDown("enter"))
        Greenfoot.setWorld(new Forest()); 
    }
}
