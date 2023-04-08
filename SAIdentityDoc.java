public class SAIdentityDoc {
    private String Fname;
    private String Lname;
    private int Age;
    private String Citizenship;
    private String Gender;
    private static int CountNum;

    public SAIdentityDoc()
    {
        CountNum++;
    }

    public SAIdentityDoc(String Fname, String Lname, int Age, String Gender, String Citizenship)
    {
        this.Fname = Fname;
        this.Lname =Lname;
        this.Age = Age;
        this.Gender = Gender;
        this.Citizenship = Citizenship;
        CountNum++;
    }

    public String getFname() {
        return Fname;
    }

    public String getLname() {
        return Lname;
    }

    public int getAge() {
        return Age;
    }

    public String getGender() {
        return Gender;
    }

    public String getCitizenship() {
        return Citizenship;
    }

    public static int getCountNum() {
        return CountNum;
    }

    public String toString() {
        String str = String.format("%-15s %-15s %-15s %-15d %-15s",Fname, Lname, Gender, Age, Citizenship);

        return str;
    }
}
