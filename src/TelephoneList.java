public class TelephoneList {

    private String parent1Name;
    private String parent2Name;
    private String primaryPhone;
    private String secondaryPhone;
    private String childName;

    public TelephoneList(String parent1Name, String parent2Name, String primaryPhone, String secondaryPhone, String childName){
        this.parent1Name = parent1Name;
        this.parent2Name = parent2Name;
        this.primaryPhone = primaryPhone;
        this.secondaryPhone = secondaryPhone;
        this.childName = childName;
    }


    public String toString(){
        String minString = (parent1Name + " " + parent2Name + " " + primaryPhone + " " + secondaryPhone + " " + childName + " ");
        return minString;
    }

}
