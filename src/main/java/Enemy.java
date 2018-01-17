public class Enemy extends Player{

    private String name;

    public Enemy(int health, String tool, String name){
        super(health, tool);
        this.name = name;
    }
}
