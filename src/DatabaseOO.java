import java.util.Scanner;

/**
 * Created by 47989768s on 14/02/17.
 */
public class DatabaseOO {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

//        File f = new File("Persons.data");

        while(true) {
            showMenu(sc);
        }



    }

    private static void showMenu(Scanner sc) {

        System.out.println("--------------------- DBOO PERSONAS (Selecciona una opció)---------------------");
        System.out.println("\t\t 1.- Afegeix una nova persona");
//        System.out.println("\t\t 2.- ");

        int option = sc.nextInt();

        switch (option) {

            case 1:
                addPerson(sc);
                break;

            default:
                System.out.println("Index no vàlid.");
                break;

        }

    }

    private static void addPerson(Scanner sc) {

        String name;
        String lastName;
        int age;

        System.out.println("Nom de la persona:");
        name = sc.next();
        System.out.println("Cognom de la persona:");
        lastName = sc.next();
        System.out.println("Edat de la persona:");
        age = sc.nextInt();

        Persona p = new Persona(name, lastName, age);

    }

}
