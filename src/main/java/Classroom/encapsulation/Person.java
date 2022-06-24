package Classroom.encapsulation;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
public class Person {

    @Getter @Setter
    protected String name = "John";
    @Getter @Setter
    public String lastname = "Doe";
    private boolean hasMood;
    int age = 0;

    public boolean isHasMood() {
        return hasMood;
    }

    public void setHasMood(boolean hasMood) {
        this.hasMood = hasMood;
    }
}
