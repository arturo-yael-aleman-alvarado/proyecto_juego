import greenfoot.*; 
public class Level2 extends World
{
    public Lifes objLife;
    Stats points;
    Stats lifes;
    public Level2()
    {   
        super(600, 400, 1); 
        setPaintOrder(GameOver.class,Stats.class,Mine.class,Soldier.class);
        Soldier soldier = new Soldier();
        addObject(soldier,50,300);
        Mine mine = new Mine();
        addObject(mine,166,368);
        objLife=new Lifes();
        points=new Stats(0,"Score: ");
        lifes=new Stats(3,"Lifes: ");
        addObject(points,150,85);
        addObject(lifes,300,85);
    }
}
