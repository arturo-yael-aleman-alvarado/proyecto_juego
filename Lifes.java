import greenfoot.*;
public class Lifes extends Medidores
{
    private int lifes=3;
    public void Diminish()
    {
        lifes--;
        if(lifes==0){
            Greenfoot.stop();
        }
    }
}
