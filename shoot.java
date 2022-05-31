import greenfoot.*; 
public class Shoot extends Item
{
    private int speedShoot=6;
    private int position;
    
    public Shoot(int direction){
        position=direction;
    }
    public void act()
    {
        switch(position){
            case 0:
                setLocation(getX(),getY()-speedShoot);
            break;
            case 1:
                setLocation(getX(),getY()+speedShoot);
            break;
            case 2:
                setLocation(getX()+speedShoot,getY());
            break;
            case 3:
                setLocation(getX()-speedShoot,getY());
            break;
        }
        
        Actor Granate=getOneObjectAtOffset(0,0,Granate.class);
        if(Granate!=null){
            Level1 level1=(Level1)getWorld();
            level1.points.increase();
            level1.crearGranate(1);
            getWorld().removeObject(Granate);
        }
        else
        if((getX()>=getWorld().getWidth()-5||(getX()<=5))){
            getWorld().removeObject(Granate);
        }
        else
        if((getY()>=getWorld().getHeight()-5||(getY()<=5))){
            getWorld().removeObject(Granate);
        }
        
        Boss boss=(Boss)getOneIntersectingObject(Boss.class);
        if(boss!=null){
            FinalLevel finalevel=(FinalLevel)getWorld();
            //finalevel.points.increase();
            finalevel.lifeBoss.decrease();
            if(finalevel.lifeBoss.returnCont()==0){
                finalevel.removeObject(boss);
                finalevel.lifes.increase();
                finalevel.removeObject(finalevel.lifeBoss);
                Greenfoot.setWorld(new Final());
            }
        }
        else
        if((getX()>=getWorld().getWidth()-5||(getX()<=5))){
            getWorld().removeObject(this);
        }
        else
        if((getY()>=getWorld().getHeight()-5||(getY()<=5))){
            getWorld().removeObject(this);
        }
    }
}

