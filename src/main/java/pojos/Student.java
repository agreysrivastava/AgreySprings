package pojos;

import org.springframework.stereotype.Component;

@Component
public class Student {
    int rollno;
    String name;
    String std;

    Student(){
        rollno = 0;
        name = "ABC";
        std = "NA";
        System.out.println("Object Created: Student");
    }

    public String toString(){
        return  new StringBuilder("Roll no. :").append(rollno).append("\nName : ").
                append(name).append("\n Standard").append(std).toString();
    }
}
