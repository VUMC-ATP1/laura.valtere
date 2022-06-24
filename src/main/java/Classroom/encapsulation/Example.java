package Classroom.encapsulation;

public class Example {
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "Laura";
        person.lastname = "Valtere";
        person.age = 32;

        Student student = new Student();
        student.graduationYear = 2022;
        student.name = "Laura";
        student.lastname = "Valtere";
        student.age = 32;

        student.isHasMood();
        System.out.println(student.isHasMood());
        student.setHasMood(true);
        System.out.println(student.isHasMood());

        Student student3 = new Student("laura.valtere");
        System.out.println(student3.getEmail());
        student3.setEmail("Laura@valtere.me");
        System.out.println(student3.getEmail());

        Student john = new Student("");
        System.out.println(john.getEmail());
        john.setEmail("john.doe@lu.lv");
        System.out.println(john.getEmail());

        Student student2 = new Student();
        student2.setGraduationYear(2030);
        student2.setGraduationYear(2020);
        System.out.println(student2.graduationYear);
        System.out.println(john);

//        Student arny = new Student(2020, "arny@lu.lv", 2022);





    }
}
