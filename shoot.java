import greenfoot.*; 
public class Shoot extends Item
{
    private int shotImage=1;
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
        if((getX()>=getWorld().getWidth()-5||(getX()<=5))){
            getWorld().removeObject(this);
        }
        else
        if((getY()>=getWorld().getHeight()-5||(getY()<=5))){
            getWorld().removeObject(this);
        }
    }
}

