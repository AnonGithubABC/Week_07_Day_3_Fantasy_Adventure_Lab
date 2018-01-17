public abstract class WeaponWarrior extends Player implements IFight{

    private String location;
    private Weapon weapon;

    public WeaponWarrior(int health, String location, Weapon weapon){
        super(health);
        this.location = location;
        this.weapon = weapon;
    }

    public String getLocation() {
        return this.location;
    }

    public String fight(){
        return "I'm in " + this.location + " and i fight with a " + this.weapon;
    }

    public void getAttacked() {
        this.health -= this.weapon.getWeaponTypeValue();
    }
}
