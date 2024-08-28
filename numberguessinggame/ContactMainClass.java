package numberguessinggame;

import java.time.LocalDate;

public class ContactMainClass {
    public static void main(String[] args) {
        System.out.println("Contact Details with their own Constructors.\n");
        Contact contact=new Contact(967701115,"Raju","periyasamy6804@gmail.com");
        LocalDate dob=LocalDate.of(2004,8,06);
        Person person=new Person(967701115,"Raju","periyasamy6804@gmail.com",dob);
        Company company=new Company(967701115,"Raju","periyasamy6804@gmail.com",6238,2022);
        Employee employee=new Employee(967701115,"Raju","periyasamy6804@gmail.com","Intern",10000);
        System.out.println("Name: " + contact.name + "\nPhone Number: " + contact.phoneNumber + "\nEmailId: " + contact.emailId + "\nDate Of Birth: " + person.calculateAge(dob) + "\nGST Number: " + company.gstNumber + "\nEstablished Year: " + company.establishedYear + "\nDesignation: " + employee.designation + "\nSalary: " + employee.salary);

        System.out.println("\nContact Details with SubClass Constructors");
        Contact contact1=new Person(967701115,"Raju","periyasamy6804@gmail.com",dob);
        Contact contact2=new Company(967701115,"Raju","periyasamy6804@gmail.com",6238,2022);
        Contact contact3=new Employee(967701115,"Raju","periyasamy6804@gmail.com","Intern",10000);
        System.out.println("Name: " + contact1.name + "\nPhone Number: " + contact1.phoneNumber + "\nEmailId: " + contact1.emailId + "\nDate Of Birth: " + ((Person) contact1).calculateAge(dob) + "\nGST Number: " + ((Company) contact2).gstNumber + "\nEstablished Year: " + ((Company) contact2).establishedYear + "\nDesignation: " + ((Employee) contact3).designation + "\nSalary: " + ((Employee) contact3).salary);

//        Person contactperson=new Contact(967701115,"Raju","periyasamy6804@gmail.com");
        // We cannot access subclass from superclass.
    }
}
