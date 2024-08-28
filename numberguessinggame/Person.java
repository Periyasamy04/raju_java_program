package numberguessinggame;

import java.time.LocalDate;

import java.util.Scanner;
import java.time.Period;

public class Person extends Contact {
        LocalDate dateofbirth;

        public Person(int phoneNumber, String name, String emailId,LocalDate dateOfBirth){
                super(phoneNumber,name,emailId);
                this.dateofbirth=dateOfBirth;
        }

        public int calculateAge(LocalDate dateOfBirth) {
                Period period = Period.between(dateOfBirth, LocalDate.now());
                return period.getYears();
        }

}