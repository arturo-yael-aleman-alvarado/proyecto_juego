import greenfoot.*;  
public class MyWorld extends World
{
    public MyWorld()
    {    
        super(600, 400, 1); 
        SoldierHud hud = new SoldierHud();
        addObject(hud,0,0);
        Soldier soldier = new Soldier(hud);
        addObject(soldier,50,300);
        crearGranate(12);
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
