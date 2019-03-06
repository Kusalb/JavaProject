import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;
public class StoreStudent {
    public static void main(String[] args) throws Exception {
        String name;
        String course;
        int batch;
        int id;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        FileWriter writer = new FileWriter("students.txt");
        BufferedWriter buffer = new BufferedWriter(writer);
        for (int i = 1; i <= 10; i++) {
            System.out.println("Enter the student id");
            id = Integer.parseInt( br.readLine());
            System.out.println(id);
            System.out.println("Enter the student name");
            name = br.readLine();
            System.out.println(name);
            System.out.println("Enter the student course");
            course = br.readLine();
            System.out.println(course);
            System.out.println("Enter the student batch");
            batch = Integer.parseInt( br.readLine());
            System.out.println(batch);
            buffer.write("Student:"+i+" ");
            buffer.write(" id: "+id+" ");
            buffer.write(" name: "+name+" ");
            buffer.write(" course: "+course+" ");
            buffer.write(" batch: "+batch+"\n");
            System.out.println("Success");
        }
        buffer.close();
    }
}
