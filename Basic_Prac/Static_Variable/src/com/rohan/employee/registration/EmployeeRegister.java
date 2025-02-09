package com.rohan.employee.registration;

import com.rohan.statvar.StatVar;

import java.text.SimpleDateFormat;
import java.util.Date;

public class EmployeeRegister {
    int empId;
    String firstName;
    String lastName;
    String email;

    EmployeeRegister(String firstName,String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
        this.empId=StatVar.getEmployeeId();
        this.email=StatVar.getEmail(firstName,lastName,empId);
    }
    public String toString(){
        System.out.println("---X---X---X---X---");
        return "employeeID : "+empId+"\nfirst name : "+firstName+"\nlast name : "+lastName+"\nemail : "+email;
    }

    public static void main(String[] args) {
        EmployeeRegister employee1=new EmployeeRegister("Rajesh","Kumar");
        EmployeeRegister employee2=new EmployeeRegister("Rohan","Chavan");
        Date currentDate=new Date();
        SimpleDateFormat sdf=new SimpleDateFormat();

        System.out.println(sdf.format(currentDate));
        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(StatVar.getEmployeeId());
        System.out.println(StatVar.employeeId);
        System.out.println(Integer.toHexString(120912));

    }
}
