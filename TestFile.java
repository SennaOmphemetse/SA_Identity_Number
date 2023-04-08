import java.util.Scanner;

public class TestFile {

    public static void main(String[] args)
    {
        System.out.print("\f");

        SAIdentityDoc[] arrIDs = new SAIdentityDoc[10];
        FileClass fileClass = new FileClass();

        fileClass.readFromFile("C:\\Users\\Omphe\\Desktop\\ps\\SAIdentityDocuments\\src\\SA.txt");

        arrIDs = fileClass.getSAIdentityDocA();
        int count = fileClass.getCounter();

        fileClass.writeFile("SolvedSA.txt");
        displayData(arrIDs);
        System.out.print("\n");
    }

    public static void displayData(SAIdentityDoc [] arrSA)
    {
        int count = 0;

        System.out.print("List of students\n");
        System.out.print(String.format("%-15s %-15s %-15s %-15s %-15s\n","   FIRST NAME", "   LAST NAME", "   GENDER", "   AGE", "   CITIZENSHIP"));
        System.out.print("   ------------------------------------------------------------------------------\n");
        for(int i = 0; i < arrSA[0].getCountNum();i++)
        {
            System.out.println((i+1) + ". "+arrSA[i].toString());
        }
    }
}
