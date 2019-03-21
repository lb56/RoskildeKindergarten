import java.io.*;
import java.util.Scanner;

public class KindergartenSystem {
    // Make scanner objects
    Scanner sConsole = new Scanner(System.in);

    public void systemRun() throws Exception {
        // Make a printstream object to write text to a file called "children.txt"
        PrintStream out = new PrintStream(new FileOutputStream("children.txt", true));
        PrintStream telephoneList = new PrintStream(new FileOutputStream("telephone list.txt", true));
        FileReader fr = new FileReader("telephone list.txt");
        BufferedReader br = new BufferedReader(fr);
        String tlfUdskriv = null;
        boolean running = true;
        // While loop, so that the program runs until the user stops it manually with "case 0"
        while (running) {
            // Welcome message and start menu;
            System.out.println("****** Velkommen Til Roskilde Fri Børnehave Administrative System ******");
            System.out.println("Du er ved at logge ind. Identificer hvem du er:");
            System.out.println("1: Bestyrer");
            System.out.println("2: Medarbejder");
            System.out.println("0: Luk programmet");
            int input = sConsole.nextInt();
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
                                    System.out.print("Du har brugt 3 loginforsøg. Logger ud ");
                                    Thread.sleep(1000);
                                    System.out.print(".");
                                    Thread.sleep(1000);
                                    System.out.print(".");
                                    Thread.sleep(1000);
                                    System.out.println(".");
                                    Thread.sleep(1000);
                                    System.out.println("");
                                    login = false;
                                    break;
                                }
                            }
                        }
                        while (login) {
                            System.out.println("Vælg hvad du vil gøre:");
                            System.out.println("1: Indskriv et barn.");
                            System.out.println("0: Log ud.");
                            int adminInput = sConsole.nextInt();
                            sConsole.nextLine();
                            boolean adminWhile = true;
                            while (adminWhile) {
                                switch (adminInput) {
                                    // Enrollment
                                    case 1:
                                        System.out.println("Indtast navnet på barnet:");
                                        String childName = sConsole.nextLine();
                                        if (childName.equalsIgnoreCase("Annuller")){
                                            adminWhile = false;
                                            break;
                                        }
                                        System.out.println("Indtast fødselsdatoen for barnet med formatet (Dag/Måned/År):");
                                        String dateOfBirth = sConsole.nextLine();
                                        if (dateOfBirth.equalsIgnoreCase("Annuller")){
                                            adminWhile = false;
                                            break;
                                        }
                                        System.out.println("Indtast alderen på barnet:");
                                        String age = sConsole.nextLine();
                                        if (age.equalsIgnoreCase("Annuller")){
                                            adminWhile = false;
                                            break;
                                        }
                                        System.out.println("Indtast første forælders navn:");
                                        String parent1 = sConsole.nextLine();
                                        if (parent1.equalsIgnoreCase("Annuller")){
                                            adminWhile = false;
                                            break;
                                        }
                                        System.out.println("Indtast " + parent1 + "'s Hjemme tlf nr.");
                                        String parent1Prim = sConsole.nextLine();
                                        if (parent1Prim.equalsIgnoreCase("Annuller")){
                                            adminWhile = false;
                                            break;
                                        }
                                        System.out.println("Indtast " + parent1 + "'s Arbejds tlf nr.");
                                        String parent1Sec = sConsole.nextLine();
                                        if (parent1Sec.equalsIgnoreCase("Annuller")){
                                            adminWhile = false;
                                            break;
                                        }
                                        System.out.println("Indtast anden forælders navn:");
                                        String parent2 = sConsole.nextLine();
                                        if (parent2.equalsIgnoreCase("Annuller")){
                                            adminWhile = false;
                                            break;
                                        }
                                        System.out.println("Indtast " + parent2 + "'s Hjemme tlf nr.");
                                        String parent2Prim = sConsole.nextLine();
                                        if (parent2Prim.equalsIgnoreCase("Annuller")){
                                            adminWhile = false;
                                            break;
                                        }
                                        System.out.println("Indtast " + parent2 + "'s Arbejde tlf nr.");
                                        String parent2Sec = sConsole.nextLine();
                                        if (parent2Sec.equalsIgnoreCase("Annuller")){
                                            adminWhile = false;
                                            break;
                                        }
                                        System.out.println("Indtast forældres adresse:");
                                        String address = sConsole.nextLine();
                                        if (address.equalsIgnoreCase("Annuller")){
                                            adminWhile = false;
                                            break;
                                        }
                                        System.out.println("Indtast forældres E-mail:");
                                        String email = sConsole.nextLine();
                                        if (email.equalsIgnoreCase("Annuller")){
                                            adminWhile = false;
                                            break;
                                        }
                                        // Calling the constructor of Child
                                        Child child = new Child(childName + " | ", dateOfBirth + " | ", age, " | " + parent1 + " | ", parent1Prim + " | ", parent1Sec + " | ", parent2 + " | ", parent2Prim + " | ", parent2Sec + " | ", address + " | ", email + " | ");
                                        // Writing the input by the user to the text file "children.txt"
                                        out.println(child);
                                        // Calling the constructor of TelephoneList
                                        TelephoneList tlfList = new TelephoneList(childName + " | ", parent1 + " | ", parent1Prim + " | ", parent1Sec + " | ", parent2 + " | ", parent2Prim + " | ", parent2Sec + " | ");
                                        // Writing the input by the user to the text file "telephone list.txt"
                                        telephoneList.println(tlfList);
                                        System.out.println("Barn Indskrevet");
                                        Thread.sleep(500);
                                        System.out.println();
                                        adminWhile = false;
                                        continue;

                                    case 0:
                                        adminWhile = false;
                                        login = false;
                                }
                            }
                        }
                    }continue;
                    //Medarbejder Login
                case 2:
                    boolean medarbejder = true;
                    while (medarbejder) {
                        System.out.println("Vælg hvad du vil gøre");
                        System.out.println("1: Udvælg et barn, og se dets oplysninger");
                        System.out.println("2: Se telefon listen");
                        System.out.println("0: Log ud");
                        int staffInput = sConsole.nextInt();
                        switch (staffInput) {
                            case 1:
                                System.out.println("Vælg et barn fra listen");
                                //UDSKRIV LISTE AF ALLE BØRNENAVNE HER + FØDSELSDATO
                                System.out.println("<BARN Valgt> her er alle dets oplysninger");
                                //UDSKRIV BARNETS OPLYSNINGER HER
                                System.out.println("");
                                continue;


                            case 2:
                                System.out.println("Barns Navn | Forældre 1 | Hjemme Tlf | Arbejds tlf | Forældre 2 | Hjemme tlf 1 | Arbejds tlf");
                                while ((tlfUdskriv = br.readLine()) != null) {
                                    System.out.println(tlfUdskriv);
                                    System.out.println("");
                                }continue;


                            case 0:
                                medarbejder = false;
                                break;
                        }
                    }
                    continue;
                    // Shuts down the program
                case 0:
            running = false;}
        }
    }
}