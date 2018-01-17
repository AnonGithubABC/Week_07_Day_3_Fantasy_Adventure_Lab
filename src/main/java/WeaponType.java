import sun.tools.tree.AssignBitXorExpression;

public enum WeaponType {

    SWORD(20),
    AXE(30),
    CLUB(40),
    FIREBALL(50),
    LIGHTING_STRIKE(60);

    private final int value;

    WeaponType(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }

}
