import greenfoot.*; 
public class Mine extends Item
{
    public void act()
    {
        Actor Soldier=getOneObjectAtOffset(0,0,Soldier.class);
        if(Soldier!=null){
            Level2 level2=(Level2)getWorld();
            getWorld().removeObject(Soldier);
            level2.lifes.decrease();
            getWorld().addObject(new Soldier(),50,340);
            if(level2.lifes.returnCont()==0){
                GameOver gameover=new GameOver();
                getWorld().addObject(gameover,((getWorld().getWidth()/2)+50),((getWorld().getHeight()/2)+150));
            }
        }
    }
}
