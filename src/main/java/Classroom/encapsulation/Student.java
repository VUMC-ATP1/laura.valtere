package Classroom.encapsulation;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;

@ToString(callSuper = true)
//@AllArgsConstructor
//@NoArgsConstructor
public class Student extends Person {

    public Student() {

    }

    private final String MAIL_DOMAIN = "@lu.lv";
    public int graduationYear;
    @Getter
    private String email;

    private int CURRENT_YEAR = LocalDate.now().getYear();

    public Student(String accountName) {
        this.email = accountName + MAIL_DOMAIN;
    }



//    public String getEmail() {
//        return email;
//    }

    public void setEmail(String email) {
        if (this.email.equals(MAIL_DOMAIN)) {
            this.email = email;
        } else {
            System.out.printf("Your e-mail is: %s which is correct one, and it will be not changed\n", this.email);
        }
    }

    public int getGraduationYear() {
        return graduationYear;
    }



    public void setGraduationYear(int graduationYear) {
        if (graduationYear > CURRENT_YEAR) {
            System.out.println("Value cannot be set! Current year is: " + CURRENT_YEAR);
        } else {
            this.graduationYear = graduationYear;
        }
    }



    //    @Override
//    public String toString() {
//        return "Student{" +
//                "MAIL_DOMAIN='" + MAIL_DOMAIN + '\'' +
//                ", graduationYear=" + graduationYear +
//                ", email='" + email + '\'' +
//                ", CURRENT_YEAR=" + CURRENT_YEAR +
//                ", name='" + name + '\'' +
//                ", lastname='" + lastname + '\'' +
//                ", age=" + age +
//                '}';
//    }
}
