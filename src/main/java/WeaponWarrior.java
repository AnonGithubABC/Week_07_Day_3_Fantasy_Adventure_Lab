public abstract class WeaponWarrior extends Player implements IFight{

    private String location;
    private String weapon;

    public WeaponWarrior(int health, String tool, String location, String weapon){
        super(health, tool);
        this.location = location;
        this.weapon = weapon;
    }

    public String getLocation() {
        return this.location;
    }

    public String fight(){
        return "I'm in " + this.location + " and i fight with a " + this.weapon;
    }
}
