import greenfoot.*;  
public class MyWorld extends World
{
    public MyWorld()
    {    
        super(600, 400, 1); 
        Soldier n1=new Soldier();
        addObject(n1,50,300);
        crearGranate(15);
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
