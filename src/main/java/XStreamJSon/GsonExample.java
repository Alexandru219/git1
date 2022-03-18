package XStreamJSon;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;

public class GsonExample {
    public static void main(String[] args) {
//        Gson gson = new Gson();
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        try (Reader reader = new FileReader("staffGSon2022.json")) {
            Staff staff = gson.fromJson(reader, Staff.class);
            System.out.println(staff.toString());
            System.out.println(staff.getName());
            System.out.println(staff.getAge());
            System.out.println(Arrays.toString(staff.getPosition()));
            System.out.println(staff.getSkills());
            System.out.println(staff.getSalary());

//            JsonElement jsonElement = gson.fromJson(reader, JsonElement.class);
//            String jsonToString = gson.toJson(jsonElement);
//            System.out.println(jsonToString);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
