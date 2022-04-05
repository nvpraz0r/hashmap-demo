/**
 * The purpose of this application
 * is to build a better understanding
 * of hashmaps
*/
import java.util.*;

public class Hashmap {
    public static void main(String[] args) {

        //string integer hashmap
        HashMap<String, Integer> myHashmap = new HashMap<>();

        myHashmap.put("a", 10);
        myHashmap.put("b", 33);
        myHashmap.put("c", 2);

        System.out.println(myHashmap);
        System.out.println(myHashmap.get("c"));

        //string string hashmap
        HashMap<String,String> empIds = new HashMap<>();

        empIds.put("user1996", "user1996sPW");
        empIds.put("admin", "adminsPW");
        empIds.put("randomuser", "randomusersPW");

        System.out.println(empIds.containsKey("admin"));

        //integer string hashmap
        HashMap<Integer,String> elements = new HashMap<>();

        String[] myArray = {"Fire", "Earth", "Wind", "Water", "Light", "Dark"};
        for(String i: myArray){
            elements.put(i, myArray[i]);
        }
    }
}