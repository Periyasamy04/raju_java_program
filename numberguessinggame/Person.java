package numberguessinggame;

import java.time.LocalDate;

import java.util.Scanner;
import java.time.Period;

public class Person extends Contact {
        LocalDate dateofbirth;

        public LocalDate DateOfBirth=LocalDate.of(2004,8,6);
        public int calculateAge(){
                LocalDate currentDate=LocalDate.now();
                Period period= Period.between(DateOfBirth,LocalDate.now());
                return period.getYears();
        }
}