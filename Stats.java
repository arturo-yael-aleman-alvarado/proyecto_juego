import greenfoot.*; 

public class Stats extends Visualizers
{
    private GreenfootImage image;
    private int cont;
    private String message;
    public Stats(int c, String Message){
        cont=c;
        Message=message;
        image=new GreenfootImage(250,150);
        image.setColor(new Color(255,200,0,255));
        image.setFont(new Font("Verdana",true,true,24));
        draw();
    }
    public void draw(){
        image.clear();
        image.drawString(message+cont,20,20);
        setImage(image);
    }
    public void increase(){
        cont++;
        draw();
    }
    public void decrease(){
        cont--;
        draw();
    }
    public int returnCont(){
        return cont;
    }
    public void act()
    {
        
    }
}
