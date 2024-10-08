package employeedetails;

public class EmploymentEligibilityVerification {
    public String cgpaPercentage;
    public String degreeRegisteredNumber;
    public String tcNumber;

    public EmploymentEligibilityVerification(String cgpaPercentage, String degreeRegisteredNumber, String tcNumber) {
        this.cgpaPercentage = cgpaPercentage;
        this.degreeRegisteredNumber = degreeRegisteredNumber;
        this.tcNumber = tcNumber;
    }

    @Override
    public String toString() {
        return "CGPA Percentage: " + cgpaPercentage + "\n"
                + "Degree Number: " + degreeRegisteredNumber + "\n"
                + "TC Number: " + tcNumber;
    }
}

