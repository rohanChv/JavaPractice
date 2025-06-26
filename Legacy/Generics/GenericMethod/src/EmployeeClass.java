public class EmployeeClass {
    static int AssignID=0;
    int employeeId;
    String name;
    String surName;
    String baseLocation;
    public EmployeeClass(String name,String surName,String baseLocation){
        this.name=name;
        this.surName=surName;
        this.employeeId=(++AssignID);
        this.baseLocation=baseLocation;
    }
    public String toString(){
        return ("\nemployeeId :"+employeeId+"\nname :"+name+"\nsurName :"+surName+"\nbaseLocation :"+baseLocation);
    }
}
