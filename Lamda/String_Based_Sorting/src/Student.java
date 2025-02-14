public class Student {
    int id;
    String name;
    double physics;
    double Chemistry;
    double Maths;
    double totalScore;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPhysics() {
        return physics;
    }

    public double getChemistry() {
        return Chemistry;
    }

    public double getMaths() {
        return Maths;
    }

    public double getTotalScore() {
        return totalScore;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhysics(double physics) {
        this.physics = physics;
    }

    public void setChemistry(double chemistry) {
        Chemistry = chemistry;
    }

    public void setMaths(double maths) {
        Maths = maths;
    }

    public void setTotalScore(double totalScore) {
        this.totalScore = totalScore;
    }

    public Student(int id, String name, double physics, double chemistry, double maths, double totalScore) {
        this.id = id;
        this.name = name;
        this.physics = physics;
        Chemistry = chemistry;
        Maths = maths;
        this.totalScore = totalScore;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", physics=" + physics +
                ", Chemistry=" + Chemistry +
                ", Maths=" + Maths +
                ", totalScore=" + totalScore +
                '}';
    }
}
