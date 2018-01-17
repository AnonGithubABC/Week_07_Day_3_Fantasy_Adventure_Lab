public abstract class Player {

    private int health;
    private String tool;


    public Player(int health, String tool){
        this.health = health;
        this.tool = tool;
    }

    public String hasTool(String toolName){
        return "I have a " + toolName + " tool";
    }

    public int getHealth(){
        return this.health;
    }




}
