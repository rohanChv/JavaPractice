public class Results {
    int id;
    String name="";
    double physics;
    double chemistry;
    double maths;

    public Results(int id,String name ,double physics,double chemistry,double maths) {
        this.id=id;
        this.name=name;
        this.physics=physics;
        this.chemistry=chemistry;
        this.maths=maths;
    }

    public double getChemistry() {
        return chemistry;
    }

    public void setChemistry(double chemistry) {
        this.chemistry = chemistry;
    }
}
