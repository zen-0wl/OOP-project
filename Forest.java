import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Forest extends World
{
    int start = 0;
    private int timer;
    public static int score = 0;
    SimpleTimer time = new SimpleTimer();
    
    public Forest()
    {    
        super(1000, 500, 1); 
        prepare();
        timer = 500;
        showTimer();
    }
  
    public void act()
    {
        showText("Score: " + score, 300, 20);
        
        if (start == 1)
        {
            if (time.millisElapsed() > 1000)
            {
                time.mark();
            }
        }
        
        if (Greenfoot.isKeyDown("enter"))
        {
            start = 1;
            time.mark();
        }
        
        if(getObjects(Birds.class).isEmpty()){
            Greenfoot.setWorld(new EndGame(Color.BLACK, Color.GREEN, "YOU WON!"));
        }
        
        illusionOfTimer();
    }
    
    private void prepare()
    {
        addObject(new Hunter(), 50, 250);

        addObject(new Birds(),100,200);
        addObject(new Birds(),430,300);
        addObject(new Birds(),250,100);
        addObject(new Birds(),550,400);
        addObject(new Birds(),650,80);
        addObject(new Birds(),50,450); 
        addObject(new Birds(),100,200);
        addObject(new Birds(),430,300);
        addObject(new Birds(),250,100);
        addObject(new Birds(),550,400);
        addObject(new Birds(),650,80);
        addObject(new Birds(),50,450); 
        addObject(new Birds(),100,200);
        addObject(new Birds(),430,300);
        addObject(new Birds(),250,100);
        
        score = 0;
    }
    
    public void illusionOfTimer()
   {
       timer = timer - 1;
       showTimer();
       if(timer == 0)
       {
           Greenfoot.stop();
           Greenfoot.setWorld(new EndGame());
       }
   }
   
   public void showTimer()
   {
       showText("Time Left: " + timer, 90, 20);
   }
}
