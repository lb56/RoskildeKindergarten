public class Child {

    private String childName;
    private String dateOfBirth;
    private String age;
    private String parent1Name;
    private String parent1Prim;
    private String parent1Sec;
    private String parent2Name;
    private String parent2Prim;
    private String parent2Sec;
    private String address;
    private String email;

    public Child(String childName, String dateOfBirth, String age, String parent1Name, String parent1Prim, String parent1Sec, String parent2Name, String parent2Prim, String parent2Sec, String address, String email) {
        this.childName = childName;
        this.dateOfBirth = dateOfBirth;
        this.age = age;
        this.parent1Name = parent1Name;
        this.parent1Prim = parent1Prim;
        this.parent1Sec = parent1Sec;
        this.parent2Name = parent2Name;
        this.parent2Prim = parent2Prim;
        this.parent2Sec = parent2Sec;
        this.address = address;
        this.email = email;
    }

    public String toString() {
        String minString = (childName + " " + dateOfBirth + " " + age + " " + parent1Name + " " + parent1Prim + " " + parent1Sec + " " + parent2Name + " " + parent2Prim + " " + parent2Sec + " " + address + " " + email);
        return minString;
    }

}


