package C17ExceptionFileParsing;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class C1704JsonWithJacksonClass {
    public static void main(String[] args) {
//        "nation": "Korea", "name" : "korea university", "students": []
        ObjectMapper mapper = new ObjectMapper();
        File myPath = Paths.get("src/C17ExceptionFileParsing/test-data2.json").toFile();
        try {
            List<Student> stdList = new ArrayList<>();

            JsonNode data = mapper.readTree(myPath);
            JsonNode students = data.get("students");
            for(JsonNode j : students){
                Student student = mapper.readValue(j.toString(), Student.class);
                stdList.add(student);
            }
            System.out.println(stdList);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

class Student{
    int id;
    String name;
    String classNumber;
    String city;

    public Student(int id, String name, String classNumber, String city) {
        this.id = id;
        this.name = name;
        this.classNumber = classNumber;
        this.city = city;
    }
    public Student(){}

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getClassNumber() {
        return classNumber;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "id : " + this.id + "\nname : " + this.name + "\nclassNumber : " + this.classNumber + "\ncity : " + this.city;
    }
}