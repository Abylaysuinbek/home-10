import java.sql.SQLOutput;
import java.util.*;
import java.util.logging.Level;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();

        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");

        System.out.println("Colors: " + colors);


        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(1, 2, 3));


        boolean isEqual = list1.equals(list2);


        if (isEqual) {
            System.out.println("The ArrayLists are equal.");
        } else {
            System.out.println("The ArrayLists are not equal.");
        }



    }

    public static void printMessageForWeekdays() {
        for (Weekday weekday : Weekday.values()) {
            if (weekday.isHoliday()) {
                System.out.println(weekday + " is a holiday.");
            } else {
                System.out.println(weekday + " is not a holiday.");
            }
        }
        for (Colors myColors : Colors.values()) {
            System.out.println(myColors);


            List<Student> studentList = new ArrayList<>();


            studentList.add(new Student(90));
            studentList.add(new Student(80));
            studentList.add(new Student(95));


            for (Student student : studentList) {
                System.out.println("Grade: " + student.getGrade());


                class PhoneBook {
                    private static Map<String, String> contacts = new HashMap<>();

                    public static void main(String[] args) {
                        Scanner scanner = new Scanner(System.in);

                        while (true) {
                            System.out.println("Phone Book Menu:");
                            System.out.println("1. Add a new contact");
                            System.out.println("2. View all contacts");
                            System.out.println("3. Update a contact");
                            System.out.println("4. Search for a contact");
                            System.out.println("5. Exit");
                            System.out.print("Enter your choice: ");

                            int choice = scanner.nextInt();
                            scanner.nextLine(); // Consume the newline character

                            switch (choice) {
                                case 1:
                                    addContact(scanner);
                                    break;
                                case 2:
                                    viewContacts();
                                    break;
                                case 3:
                                    updateContact(scanner);
                                    break;
                                case 4:
                                    searchContact(scanner);
                                    break;
                                case 5:
                                    System.out.println("Exiting...");
                                    return;
                                default:
                                    System.out.println("Invalid choice, please try again.");
                            }
                        }
                    }

                    private static void addContact(Scanner scanner) {
                        System.out.print("Enter name: ");
                        String name = scanner.nextLine();
                        System.out.print("Enter phone number: ");
                        String phoneNumber = scanner.nextLine();

                        contacts.put(name, phoneNumber);
                        System.out.println("Contact added successfully.");
                    }

                    private static void viewContacts() {
                        if (contacts.isEmpty()) {
                            System.out.println("No contacts found.");
                            return;
                        }

                        System.out.println("Contacts:");
                        for (Map.Entry<String, String> entry : contacts.entrySet()) {
                            System.out.println("Name: " + entry.getKey() + ", Phone Number: " + entry.getValue());
                        }
                    }

                    private static void updateContact(Scanner scanner) {
                        System.out.print("Enter name to update: ");
                        String name = scanner.nextLine();

                        if (!contacts.containsKey(name)) {
                            System.out.println("Contact not found.");
                            return;
                        }

                        System.out.print("Enter new phone number: ");
                        String phoneNumber = scanner.nextLine();

                        contacts.put(name, phoneNumber);
                        System.out.println("Contact updated successfully.");
                    }

                    private static void searchContact(Scanner scanner) {
                        System.out.print("Enter name to search: ");
                        String name = scanner.nextLine();

                        if (!contacts.containsKey(name)) {
                            System.out.println("Contact not found.");
                            return;
                        }

                        System.out.println("Contact details:");
                        System.out.println("Name: " + name + ", Phone Number: " + contacts.get(name));



                        }
                    }
                }

            }

        }
    }


