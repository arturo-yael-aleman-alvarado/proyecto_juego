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
        RecordsManager recordsManager = new RecordsManager("score.txt", 10);
        
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
        if(death==1){
            GameRecord gameRecord = new GameRecord(Greenfoot.ask("playerName"), value);
            recordsManager.save(gameRecord);
        }
    }
}
