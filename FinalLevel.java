import greenfoot.*;  
public class FinalLevel extends World
{
    public Lifes objLife;
    Stats points;
    Stats lifes;
    StatsBoss lifeBoss;
    
    public FinalLevel()
    {    
        super(600, 400, 1); 
        setPaintOrder(GameOver.class,Stats.class,Soldier.class);        
        Soldier soldier = new Soldier();
        addObject(soldier,50,300);
        putBoss();
        objLife=new Lifes();
        points=new Stats(0,"Score: ");
        lifes=new Stats(5,"Lifes: ");
        addObject(points,150,85);
        addObject(lifes,300,85);
    }
    public void putBoss(){
        Boss boss=new Boss();
        addObject(boss,getWidth()-80,(getHeight()/2)+20);
        StatsBoss statsboss=new StatsBoss(100,0,0,20);
        addObject(statsboss,750,85);
    }
}
