import greenfoot.*;
public class SoldierHud extends Actor
{
    private int score;
    private int level;
    private int lifes;
    
    public void setScore(int score){
        this.score=score;
    }
    
    public void act(){
        refresh();
    }
    
    public void refresh()
    {
        getWorld().showText("Nivel: " + level,100,30);
        getWorld().showText("Lifes: " + lifes,250,30);
        getWorld().showText("Score: " + score,400,30);
    }
}
