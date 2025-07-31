public class EmployeeNode {
    private Employee emp;
    private EmployeeNode next;

    public Employee getEmp() {
        return emp;
    }

    public EmployeeNode(Employee emp) {
        this.emp = emp;
    }

    public void setEmp(Employee emp) {
        this.emp = emp;
    }

    public EmployeeNode getNext() {
        return next;
    }

    public void setNext(EmployeeNode next) {
        this.next = next;
    }
}
