enum EmployeeType {
    MANAGER, ENGINEER, SALESPERSON
}

class Employee {
    private String name;
    private EmployeeType type;

    public Employee(String name,EmployeeType type){
        this.name=name;
        this.type=type;

    }
    public EmployeeType getType() {
        return type;
    }

    public void performDuties() {
        switch(this.type) {
            case MANAGER:
                System.out.println(name +" is managing the team");
                break;
            case ENGINEER:
                System.out.println(name +" is coding");
                break;
            case SALESPERSON:
                System.out.println(name +" Selling products");
                break;
            default:
                System.out.println("Invalid employee type");

        }
    }
}