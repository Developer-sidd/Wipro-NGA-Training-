public class Main {

    public static void main(String[] args) {
        Employee e1=new Employee("James",EmployeeType.MANAGER);
        Employee e2=new Employee("Alex",EmployeeType.ENGINEER);
        Employee e3=new Employee("Cris",EmployeeType.SALESPERSON);

        e1.performDuties();
        e2.performDuties();
        e3.performDuties();
        System.out.println();


    }

}