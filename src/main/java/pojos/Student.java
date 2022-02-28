package pojos;

import lombok.Data;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
// PAT: 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

@Qualifier("student")
@Component
@Data
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
                append(name).append("\nStandard: ").append(std).toString();
    }
}
