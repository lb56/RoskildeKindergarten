import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class KindergartenSystem {
    // Make scanner objects
    Scanner sConsole = new Scanner(System.in);
    Scanner iConsole = new Scanner(System.in);

    public void systemRun() throws IOException {
        // Make a printstream object to write text to a file called "children.txt"
        PrintStream out = new PrintStream(new FileOutputStream("children.txt", true));
        PrintStream telephoneList = new PrintStream(new FileOutputStream("telephone list.txt", true));
        boolean running = true;
        // While loop, so that the program runs until the user stops it manually with "case 0"
        while (running) {
            // Welcome message and start menu;
            System.out.println("****** Velkommen Til Roskilde Fri Børnehave Administrative System ******");
            System.out.println("Du er ved at logge ind. Identificer hvem du er:");
            System.out.println("1: Bestyrer");
            System.out.println("2: Medarbejder");
            System.out.println("0: Luk programmet");
            int input = iConsole.nextInt();
            switch (input) {
                // Manager login
                case 1:
                    System.out.println("Vælg hvad du vil gøre:");
                    System.out.println("1: Indskriv et barn.");
                    System.out.println("0: Luk programmet.");
                    int adminInput = iConsole.nextInt();
                    switch (adminInput) {
                        // Enrollment
                        case 1:
                            System.out.println("Indtast navnet på barnet:");
                            String childName = sConsole.nextLine();
                            System.out.println("Indtast fødselsdatoen for barnet med formatet (Dag/Måned/År):");
                            String dateOfBirth = sConsole.nextLine();
                            System.out.println("Indtast alderen på barnet:");
                            int age = iConsole.nextInt();
                            System.out.println("Indtast første forælders navn:");
                            String parent1 = sConsole.nextLine();
                            System.out.println("Indtast anden forælders navn:");
                            String parent2 = sConsole.nextLine();
                            System.out.println("Indtast forældres adresse:");
                            String address = sConsole.nextLine();
                            System.out.println("Indtast forældres E-mail:");
                            String email = sConsole.nextLine();
                            System.out.println("Indtast forældres primære tlf. nummer:");
                            String phone1 = sConsole.nextLine();
                            System.out.println("Indtast forældres sekundære tlf. nummer:");
                            String phone2 = sConsole.nextLine();
                            // Calling the constructor of Child
                            Child child = new Child(childName + " | " , dateOfBirth + " | " , age , " | " + parent1 + " | " , parent2 + " | " , address + " | " , phone1 + " | " , phone2 + " | " );
                            // Writing the input by the user to the text file "children.txt"
                            out.println(child);
                            // Calling the constructor of TelephoneList
                            TelephoneList tlfList = new TelephoneList(parent1 + " | " , parent2 + " | " , phone1 + " | " , phone2 + " | ", childName);
                            // Writing the input by the user to the text file "telephone list.txt"
                            telephoneList.println(tlfList);
                            System.out.println("Barn Indskrevet");
                            System.out.println("");
                    }
                // Medarbejder Login
                case 2:
                    System.out.println("Vælg hvad du vil gøre");
                    System.out.println("1: Udvælg et barn, og se dets oplysninger");
                    System.out.println("2: Se telefon listen");
                    System.out.println("0: Luk Programmet");
                    int staffInput = iConsole.nextInt();
                    switch (staffInput) {
                        case 1:
                            System.out.println("Vælg et barn fra listen");
                            //UDSKRIV LISTE AF ALLE BØRNENAVNE HER
                            System.out.println("<BARN Valgt> her er alle dets oplysninger");
                            //UDSKRIV BARNETS OPLYSNINGER HER


                        case 2:
                            System.out.println("Forældre 1 | Forældre 2 | Telefon 1 | Telefon 2 | Barns Navn");
                            //UDSKRIV TELEFON LISTEN HER


                        case 0:
                            running = false;
                    }

                // Shuts down the program
                case 0:
                    running = false;
            }
        }
    }
}
