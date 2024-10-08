package employeedetails;

public class EmployeeJDBC {

    //Employment Details
    public String jobTitle;
    public String department;
    public String managerId;
    public String dateofJoining;
    public String employmentstatus;
    public String salary;
    public String workSalary;
    //Additional Information
    public String emergencyContact;
    public String skills;
    public String education;
    public String certification;
    public String performanceReviews;
    //Compliance and Documentation
    private String panNumber;
    private String aadharNumber;
    private String bankAccountDetails;
    private String employmentEligibilityVerification;
    private String backGroundCheckStatus;

    EmployeeJDBC(String jobTitle, String department,
              String managerId, String dateOfJoining,
              String employmentStatus, String salary,
              String workSalary,String emergencyContact,
              String skills, String education,
              String certification, String performanceReviews){
        this.jobTitle = jobTitle;
        this.department = department;
        this.managerId = managerId;
        this.dateofJoining = dateOfJoining;
        this.employmentstatus = employmentStatus;
        this.salary = salary;
        this.workSalary = workSalary;
        this.emergencyContact = emergencyContact;
        this.skills = skills;
        this.education = education;
        this.certification = certification;
        this.performanceReviews = performanceReviews;
    }
    //Getter & Setter
    //PAN Number
    public String getPanNumber(){
        return panNumber;
    }
    public void setPanNumber(String panNumber){
        this.panNumber = panNumber;
    }
    //Aadhar Number
    public String getAadharNumber(){
        return aadharNumber;
    }
    public void setAadharNumber(String Aadhar_Number){
        this.aadharNumber = Aadhar_Number;
    }
    //Bank Account Details
    public String getBankAccountDetails(){
        return bankAccountDetails;
    }
    public void setBankAccountDetails(String Bank_Account_Details){
        this.bankAccountDetails = Bank_Account_Details;
    }
    //Employment Eligibility Verification
    public String getEmploymentEligibilityVerification(){
        return employmentEligibilityVerification;
    }
    public void setEmploymentEligibilityVerification(String Employment_Eligibility_Verification){
        this.employmentEligibilityVerification = Employment_Eligibility_Verification;
    }
    //BackGround Check Status
    public String getBackGroundCheckStatus(){
        return backGroundCheckStatus;
    }
    public void setBackGroundCheckStatus(String BackGround_Check_Status){
        this.backGroundCheckStatus = BackGround_Check_Status;
    }

    public void printDetails() {
        System.out.println("Job Title: " + jobTitle + "\n" + "Department: " + department + "\n"
                        + "Manager ID: " + managerId + "\n" + "Date of Joining: " + dateofJoining + "\n"
                        + "Employment_Status: " + employmentstatus + "\n" + "Salary; " + salary + "\n"
                        + "Work_Salary: " + workSalary + "\n" + "Emergency_Contact: " + emergencyContact + "\n"
                        + "Skills: " + skills + "\n" + "Education: " + education + "\n"
                        + "Certification: " + certification + "\n" + "Performance Reviews: " + performanceReviews + "\n"
                        + "PAN Number: " + panNumber + "\n" + "Aadhar Number: " + aadharNumber + "\n"
                        + "BackGround Check Status: " + backGroundCheckStatus);
    }

    public static void main(String[] args) {
        EmployeeJDBC employeeJDBC = new EmployeeJDBC("Intern","BCA",
                "CI2404","15-06-2024","Full-Time","Employee's Salary","Medavakkam","8825850642","Java","BCA","Interning at C-Cubics","Growth");
        employeeJDBC.setPanNumber("ABCD123456");
        employeeJDBC.setAadharNumber("1234567890235678");
        employeeJDBC.setBackGroundCheckStatus("Good Background with No Arrears, No Redo, No Suspends");
        BankDetails bankDetails = new BankDetails("Periyasamy S","123456789","Axis Bank","Korattur");
        EmploymentEligibilityVerification employmentEligibilityVerification1 = new EmploymentEligibilityVerification("86","Saveetha252410040","Saveetha25");
        employeeJDBC.printDetails();
        System.out.println(bankDetails);
        System.out.println(employmentEligibilityVerification1);
    }
}