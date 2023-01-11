
class Player {
    String name;
    String score;
    
    private String getName()
    {
        return name;
    }
    private setName(String name)
    {
        this.name=name;
    }
    private String getScore()
    {
        return score;
    }
    private setScore(String score)
    {
        this.score=score;
    }
    
    public Player(String name, String score)
    {
        this.name=name;
        this.score=score;
    }
}
public class ScoreCard
{
    Player player = null;
    
    public ScoreCard(Player p)
    {
        this.p=p;
    }
    public String getPlayer()
    {
        this.player;
    }
    
    public String arrangeScore(int data)
    {
        this.player.score=data;
    }
}
    public static void main(String[] args) {
        
    }
}
