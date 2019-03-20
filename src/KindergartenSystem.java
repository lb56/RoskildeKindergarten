import java.io.*;
import java.util.Scanner;

public class KindergartenSystem {
    // Make scanner objects
    Scanner sConsole = new Scanner(System.in);
    Scanner iConsole = new Scanner(System.in);

    public void systemRun() throws IOException {
        // Make a printstream object to write text to a file called "children.txt"
        PrintStream out = new PrintStream(new FileOutputStream("children.txt", true));
        PrintStream telephoneList = new PrintStream(new FileOutputStream("telephone list.txt", true));
        FileReader fr = new FileReader("telephone list.txt");
        BufferedReader br = new BufferedReader(fr);
        String line = null;
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
                    boolean login = true;
                    while (login) {
                        for (int n = 0; n < 3; n++) {
                            System.out.println("Indtast dit login: ");
                            String login1;
                            login1 = sConsole.next();
                            boolean b = login1.equals("Sandra");
                            if (b) {
                                System.out.println("Login godtaget - Logger ind... ");
                                // Hvis login fungere bruger vi break til at gå ud af loop, og forsætter koden.
                                break;
                            }
                            if (b == false) {
                                System.out.println();
                                System.out.println("Forkert login informationer, prøv igen.");
                                // Hvis n == 2, 3 forsøg er blevet brugt(n starter ved 0) og skulle stoppe programmet.
                                if (n >= 2) { // can also say if(n==2)
                                    System.out.println("Du har brugt 3 loginforsøg. Går ud af programmet");
                                    login = false;
                                    break;
                                }
                            }
                        }
                        while (login) {
                            System.out.println("Vælg hvad du vil gøre:");
                            System.out.println("1: Indskriv et barn.");
                            System.out.println("0: Luk programmet.");
                            int adminInput = iConsole.nextInt();
                            sConsole.nextLine();
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
                                    System.out.println("Indtast første forældres Hjemme tlf nr.");
                                    String parent1Prim = sConsole.nextLine();
                                    System.out.println("Indtast første forældres Arbejds tlf nr.");
                                    String parent1Sec = sConsole.nextLine();
                                    System.out.println("Indtast anden forælders navn:");
                                    String parent2 = sConsole.nextLine();
                                    System.out.println("Indtast anden forældres Hjemme tlf nr.");
                                    String parent2Prim = sConsole.nextLine();
                                    System.out.println("Indtast anden forældres Arbejde tlf nr.");
                                    String parent2Sec = sConsole.nextLine();
                                    System.out.println("Indtast forældres adresse:");
                                    String address = sConsole.nextLine();
                                    System.out.println("Indtast forældres E-mail:");
                                    String email = sConsole.nextLine();
                                    // Calling the constructor of Child
                                    Child child = new Child(childName + " | ", dateOfBirth + " | ", age, " | " + parent1 + " | ", parent1Prim + " | ", parent1Sec + " | ", parent2 + " | ", parent2Prim + " | ", parent2Sec + " | ",  address +" | ",  email + " | ");
                                    // Writing the input by the user to the text file "children.txt"
                                    out.println(child);
                                    // Calling the constructor of TelephoneList
                                    TelephoneList tlfList = new TelephoneList(childName + " | ", parent1 + " | ", parent1Prim + " | ", parent1Sec + " | ", parent2 + " | ",  parent2Prim+ " | ",  parent2Sec+ " | ");
                                    // Writing the input by the user to the text file "telephone list.txt"
                                    telephoneList.println(tlfList);
                                    System.out.println("Barn Indskrevet");
                                    System.out.println();

                                case 0:
                                    login = false;
                            }
                        }
                    }
                //Medarbejder Login
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
                            System.out.println("Barns Navn | Forældre 1 | Hjemme Tlf | Arbejds tlf | Forældre 2 | Hjemme tlf 1 | Arbejds tlf");
                            while((line = br.readLine()) != null){
                                System.out.println(line);
                        }


                        case 0:
                            running = false;
                    }

                    // Shuts down the program
                case 0:
                    running = false;}
        }
    }
}
