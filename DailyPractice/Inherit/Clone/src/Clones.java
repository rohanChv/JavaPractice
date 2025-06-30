public class Clones extends Mandalorian {
    String slogan;

    public Clones(Mandalorian m) {
        super(m.name, m.armourColor);
    }
    public void createClone(){
        this.name="Clone1";
        this.armourColor="Brown";
        this.slogan="Not the Way";
    }

    public static void main(String[] args) {
        Mandalorian mando=new Mandalorian("Din Djarin","Silver");
        Clones newClone=new Clones(mando.clone());
        System.out.println();
    }

}
