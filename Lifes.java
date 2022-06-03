import greenfoot.*;
public class Lifes extends Visualizers
{
    public int lifes=5;
    public Lifes(){
        
    }
    public void Diminish()
    {
        lifes--;
        if(lifes==0){
            Greenfoot.stop();
        }
    }
}
