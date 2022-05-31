import greenfoot.*;
public class Lifes extends Visualizers
{
    public int l=5;
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
