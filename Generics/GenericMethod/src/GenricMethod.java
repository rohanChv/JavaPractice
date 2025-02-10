public class GenricMethod {
    public static <T> void printArray(T[] inputArray){
        for(T element:inputArray){
            System.out.println(element);
        }

    };
    public static void main(String[] args) {
        Integer[] firstArray={1,2,3};
        String[] secondArray={"Hello","World"};
        EmployeeClass[] employeeArray
        ={new EmployeeClass("Ramesh","khanna","Mumbai"),
                new EmployeeClass("Champaklal","gada","Bhachav"),
                new EmployeeClass("Roshansingh","Sodhi","Jalandar"),
                new EmployeeClass("Atmaram","Bhide","Ratnagiri")
        };

        printArray(firstArray);
        printArray(secondArray);
        printArray(employeeArray);
    }
}
