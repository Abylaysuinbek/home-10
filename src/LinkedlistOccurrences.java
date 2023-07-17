import java.util.LinkedList;

public class LinkedlistOccurrences {
    public static void main(String[] args) {

        LinkedList<Integer> linkedList = new LinkedList<>();


        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);
        linkedList.add(20);
        linkedList.add(40);
        linkedList.add(20);
        linkedList.add(50);


        int elementToFind = 20;


        int firstOccurrence = linkedList.indexOf(elementToFind);


        int lastOccurrence = linkedList.lastIndexOf(elementToFind);


        System.out.println(" Первое вхождение " + elementToFind + ": " + firstOccurrence);
        System.out.println("Последнее вхождение " + elementToFind + ": " + lastOccurrence);
    }
}
