public class Dispenser {
    String name;
    boolean isOccuped;

    public Dispenser(String name, boolean isOccuped) {
        this.name = name;
        this.isOccuped = isOccuped;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isOccuped() {
        return isOccuped;
    }

    public void setOccuped(boolean occuped) {
        isOccuped = occuped;
    }
}
