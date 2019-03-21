public class childList {

    private String childName;
    private String dateOfBirth;
    private String age;
    private String parent1Prim;
    private String address;
    private String email;

    public childList(String childName, String age, String address, String dateOfBirth, String email, String parent1Prim) {
        this.childName = childName;
        this.dateOfBirth = dateOfBirth;
        this.age = age;
        this.parent1Prim = parent1Prim;
        this.address = address;
        this.email = email;
    }

    public String toString() {
        String minString = (childName + " " + age + " " + age + " " + address + " " + dateOfBirth + " " + email + " " + parent1Prim);
        return minString;
    }

}