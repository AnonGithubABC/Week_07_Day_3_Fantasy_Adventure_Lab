public abstract class Player {

    protected int health;


    public Player(int health){
        this.health = health;
    }

    public String hasTool(String toolName){
        return "I have a " + toolName + " tool";
    }

    public int getHealth(){
        return this.health;
    }



}
