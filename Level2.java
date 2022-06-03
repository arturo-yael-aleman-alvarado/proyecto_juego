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
        addObject(soldier,50,340);
        NPCLvF lvF = new NPCLvF();
        addObject(lvF,570,350);
        Mine mine = new Mine();
        addObject(mine,196,368);
        objLife=new Lifes();
        points=new Stats(0,"Score: ");
        lifes=new Stats(5,"Lifes: ");
        addObject(points,150,85);
        addObject(lifes,300,85);
        prepare();
    }
    private void prepare()
    {
        Mine mine = new Mine();
        addObject(mine,32,235);
        Mine mine2 = new Mine();
        addObject(mine2,100,233);
        Mine mine3 = new Mine();
        addObject(mine3,19,180);
        removeObject(mine2);
        Mine mine7 = new Mine();
        addObject(mine7,85,255);
        Mine mine5 = new Mine();
        addObject(mine5,219,321);
        Mine mine6 = new Mine();
        addObject(mine6,218,274);
        Mine mine8 = new Mine();
        addObject(mine8,221,228);
        Mine mine9 = new Mine();
        addObject(mine9,219,180);
        Mine mine10 = new Mine();
        addObject(mine10,185,140);
        Mine mine11 = new Mine();
        addObject(mine11,150,102);
        Mine mine12 = new Mine();
        addObject(mine12,212,101);
        Mine mine13 = new Mine();
        addObject(mine13,242,138);
        Mine mine14 = new Mine();
        addObject(mine14,266,104);
        Mine mine15 = new Mine();
        addObject(mine15,508,376);
        Mine mine16 = new Mine();
        addObject(mine16,506,330);
        Mine mine17 = new Mine();
        addObject(mine17,508,285);
        Mine mine18 = new Mine();
        addObject(mine18,362,178);
        Mine mine19 = new Mine();
        addObject(mine19,396,138);
        removeObject(mine18);
        Mine mine21 = new Mine();
        addObject(mine21,403,53);
        Mine mine22 = new Mine();
        addObject(mine22,437,17);
        Mine mine23 = new Mine();
        addObject(mine23,493,17);
        Mine mine24 = new Mine();
        addObject(mine24,556,19);
        Mine mine25 = new Mine();
        addObject(mine25,373,230);
        Mine mine26 = new Mine();
        addObject(mine26,369,270);
        removeObject(mine18);
        removeObject(mine25);
        removeObject(mine26);
        Mine mine32 = new Mine();
        addObject(mine32,393,177);
        Mine mine33 = new Mine();
        addObject(mine33,378,216);
        Mine mine34 = new Mine();
        addObject(mine34,369,255);
        Mine mine27 = new Mine();
        addObject(mine27,367,293);
        Mine mine28 = new Mine();
        addObject(mine28,505,234);
        Mine mine29 = new Mine();
        addObject(mine29,485,68);
        Mine mine30 = new Mine();
        addObject(mine30,555,109);
        removeObject(mine28);
        Mine mine35 = new Mine();
        addObject(mine35,417,90);
    }
}
