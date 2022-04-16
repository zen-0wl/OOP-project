import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Birds extends Actor
{
    int i = 3;

    public void act()
    {
        setLocation(getX() + i, getY());
        
        if ((getX() > 590) || (getX() < 10))
        {
            i = i * -1;
        }
        
        //to make bird move through the screen
        move(5);
        if(Greenfoot.getRandomNumber(50) == 1) {
            setRotation(Greenfoot.getRandomNumber(360));
        }
        
        edgeTurn();
        moveSideways();
    }
    
    //bird makes a turn when reached an edge 
    public void edgeTurn() 
    {
        if (isAtEdge()) 
        {
            turn(17);
        }         
    }
    
    //bird moves right and left 
    public void moveSideways() 
    {
        if (Greenfoot.isKeyDown("left")) 
        {
         turn(-5);
        }
       
        if (Greenfoot.isKeyDown("right")) 
        {
         turn(5);
        }
    }
}

