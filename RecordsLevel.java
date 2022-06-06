import greenfoot.*;  
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
public class RecordsLevel extends World
{
    int value=Stats.acum;
    int death=Shoot.win + Granate.lose1 + Boss.lose2 + Mine.lose3;

    public RecordsLevel()
    {    
        super(600, 400, 1); 
        getBackground().drawImage(new GreenfootImage("Press R for Return Menu",35, new Color(250,0,0), null),50,350);
        RecordsManager recordsManager = new RecordsManager("score.txt", 10);
        
        if(death==1){
            GameRecord gameRecord = new GameRecord(Greenfoot.ask("playerName"), value);
            recordsManager.save(gameRecord);
        }
        Shoot.win=0;
        Granate.lose1=0;
        Boss.lose2=0;
        Mine.lose3=0;
                   
        List<GameRecord> records = recordsManager.getRecords();
        
        int i = 0;
        for (GameRecord record: records)
        {
            Counter score = new Counter();
            
            score.setValue(record.getScore());
            addObject(score, 450,100+i);
            this.showText(record.getPlayerName(), 120, 100+i);
            
            i+=80;
        }
    }
    public void act(){
        if(Greenfoot.isKeyDown("r")){
            Greenfoot.setWorld(new Intro());
            Stats.acum=0;
        }
    }
}
