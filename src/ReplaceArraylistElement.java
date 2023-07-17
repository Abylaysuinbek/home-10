import java.util.ArrayList;

public class ReplaceArraylistElement {
    public static void main(String[] args) {


            ArrayList<String> list = new ArrayList<>();


            list.add("Apple");
            list.add("Banana");
            list.add("Orange");
            list.add("Mango");


            System.out.println("Original ArrayList: " + list);


            String newElement = "Grapes";


            list.set(1, newElement);


            System.out.println("Updated ArrayList: " + list);


        }



    }
