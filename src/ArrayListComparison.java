import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListComparison {
    public static void main(String[] args) {
        // Create two ArrayLists
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(1, 2, 3));


        boolean isEqual = list1.equals(list2);


        if (isEqual) {
            System.out.println("ArrayLists равны.");
        } else {
            System.out.println("ArrayLists не равны.");
        }
    }
}