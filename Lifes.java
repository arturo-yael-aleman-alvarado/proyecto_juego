import greenfoot.*;
public class Lifes extends Visualizers
{
    private int l=3;
    public Lifes(){
        
    }
    public void Diminish()
    {
        l--;
        if(l==0){
            Greenfoot.stop();
        }
    }
}
