public class Weapon {

    private WeaponType weaponType;;

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
