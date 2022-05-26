import greenfoot.*;  
import java.util.*;
public class Level1 extends World
{
    public Lifes objLife;
    Stats points;
    Stats lifes;
    public Level1()
    {    
        super(600, 400, 1); 
        setPaintOrder(GameOver.class,Stats.class,Granate.class,Soldier.class);        
        Soldier soldier = new Soldier();
        addObject(soldier,50,300);
        NPC npc = new NPC();
        addObject(npc,570,60);
        crearGranate(10);
        objLife=new Lifes();
        points=new Stats(0,"Score: ");
        lifes=new Stats(3,"Lifes: ");
        addObject(points,150,85);
        addObject(lifes,300,85);
    }
    public void crearGranate(int numero){
        for(int i=0;i<numero;i++){
            Granate r=new Granate();
            int x=Greenfoot.getRandomNumber(getWidth());
            int y=Greenfoot.getRandomNumber(getHeight());
            addObject(r,x,y);
        }
    }
}
