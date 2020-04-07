public class Player {
    private String name;
    private int score;

    public Player(String name){
        this.name = name;
        this.score = 0;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getScore(){
        return score;
    }
    public void setScore(){
        this.score = score;
    }
    public void addScore(int point){
        this.score += point;
    }
    
    @Override
    public String toString(){
        return name + " has " + score + " points.";
    }
}