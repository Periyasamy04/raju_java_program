public class Manager extends Employee{
    String department;

    public Manager(String name, double salary,String department){
        super(name, salary);
        this.department=department;
    }

    public static void main(String[] args) {
        Manager manager= new Manager("raju", 20000.00,"Sales");
        System.out.println("Name: "+name +"\nSalary: "+salary +"\nDepartment: "+department);
    }
}
