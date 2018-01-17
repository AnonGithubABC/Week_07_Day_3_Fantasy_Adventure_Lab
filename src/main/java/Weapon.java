public class Weapon {

    protected WeaponType weaponType;;

    public Weapon(WeaponType weaponType){
        this.weaponType = weaponType;
    }

    public WeaponType getWeaponType(){
        return this.weaponType;
    }

    public int getWeaponTypeValue() {
        return this.weaponType.getValue();
    }
}
