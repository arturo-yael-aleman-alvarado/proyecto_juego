import greenfoot.*;  
public class MyWorld extends World
{
    public Lifes objLife;
    public MyWorld()
    {    
        super(600, 400, 1); 
        Soldier soldier = new Soldier();
        addObject(soldier,50,300);
        crearGranate(12);
        objLife=new Lifes();
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
