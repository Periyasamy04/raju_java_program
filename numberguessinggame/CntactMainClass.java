package numberguessinggame;

public class CntactMainClass {
    public static void main(String[] args) {
        Contact contact=new Contact();
        Person person=new Person();
        Company company=new Company();
        Employee employee=new Employee();

        System.out.println("Name: " + contact.name + "\nPhone Number: " + contact.phoneNumber + "\nEmailId: " + contact.emailId + "\nDate Of Birth: " + person.calculateAge() + "\nGST Number: " + company.gstNumber + "\nEstablished Year: " + company.establishedYear + "\nDesignation: " + employee.designation + "\nSalary: " + employee.salary);
    }
}
