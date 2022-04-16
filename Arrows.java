import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Arrows extends Actor
{
    Forest thisGame;
    
    public void act()
    {
        setLocation(getX() + 8, getY());
        
        Birds b = (Birds) getOneIntersectingObject(Birds.class);
        if (b != null)
        {
            getWorld().removeObject(b);
            getWorld().removeObject(this);
            thisGame.score++;
        }
        else if (isAtEdge())
        {
            getWorld().removeObject(this);
        }
    }
}
