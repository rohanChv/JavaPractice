package com.rohan.statvar;

public class StatVar {
    public static int employeeId=0;
    final static String emailSuffix="@capgemini.com";

    public static int getEmployeeId() {
        return ++employeeId;
    }

    public static String getEmail(String firstName,String lastName,int empId) {
        return firstName + "." + lastName + empId + emailSuffix;
    }
}
