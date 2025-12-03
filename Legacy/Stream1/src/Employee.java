public class Employee{

    String company;
    String grade;
    String Location;

    @Override
    public String toString() {
        return "Employee{" +
                "company='" + company + '\'' +
                ", grade='" + grade + '\'' +
                ", Location='" + Location + '\'' +
                '}';
    }

    public Employee(String company, String grade, String location) {
        this.company = company;
        this.grade = grade;
        Location = location;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }
}
