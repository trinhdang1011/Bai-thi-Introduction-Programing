import javax.lang.model.element.Name;
import java.util.ArrayList;
//Cau 6
public class Student {
    private int StudentID;
    private String Name;
    public Student(int StudentID, String Name){
        this.StudentID = StudentID;
        this.Name = Name;
    }
    public static void main(String[] args) {
        ArrayList<String> StuArr = new ArrayList<>();
        StuArr.add("Student1");
        StuArr.add("Student2");
        StuArr.add("Student3");
        System.out.println(StuArr);
        }
    }

