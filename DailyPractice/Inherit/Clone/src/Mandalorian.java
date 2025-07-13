public class Mandalorian implements Cloneable{
    String name;
    String armourColor;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArmourColor() {
        return armourColor;
    }

    public void setArmourColor(String armourColor) {
        this.armourColor = armourColor;
    }

    public Mandalorian(String name, String armourColor) {
        this.name = name;
        this.armourColor = armourColor;
    }

    @Override
    public Mandalorian clone() {
        try {
            Mandalorian clone = (Mandalorian) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
