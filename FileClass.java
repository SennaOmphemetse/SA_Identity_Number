import java.util.Scanner;
import java.io.FileReader;
import java.io.FileWriter;
import javax.swing.JOptionPane;
import java.io.PrintWriter;

public class FileClass {

    private SAIdentityDoc [] arrID = new SAIdentityDoc[10];
    private int counter = 0;

    public void readFromFile(String SADoc)
    {
        try
        {
            Scanner input = new Scanner(new FileReader(SADoc));

            while (input.hasNext())
            {
                String Line = input.nextLine();
                String [] Splitter = Line.split(",");

                String FName = Splitter[0];
                String LName = Splitter[1];
                String myID = Splitter[2];

                int year = Integer.parseInt(myID.substring(0,2));
                int month = Integer.parseInt(myID.substring(2,4));
                int day = Integer.parseInt(myID.substring(4,6));
                int genders = Integer.parseInt(myID.substring(6,7));
                int citizen = Integer.parseInt(myID.substring(10,11));



                int currentYear = 2023;
                int Isage = 0;

                String gender = "";
                String citiz = "";

                if (year >= 0 && year <= 23 )
                {
                    int NewEra = 2000 + year;
                    Isage = currentYear - NewEra;
                }
                else
                {
                    int oldEra = 1900 + year;
                    Isage = currentYear - oldEra;
                }



                if(genders >= 5)
                {
                    gender = "Male";
                }
                else
                {
                    gender = "Female";
                }

                if(citizen == 0)
                {
                    citiz = "SA citizen";
                }
                else
                {
                    citiz = "Permanent Resident";
                }


                arrID[counter] = new SAIdentityDoc(FName,LName,Isage, gender, citiz);
                counter++;
            }
            input.close();
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null,"Error reading from File" + e.getMessage());
        }
    }

    public int getCounter()
    {
        return counter;
    }

    public SAIdentityDoc [] getSAIdentityDocA()
    {
        return arrID;
    }

    public void writeFile(String SADoc)
    {
        try
        {
            PrintWriter fileWrite = new PrintWriter(new FileWriter(SADoc));

            for (int i = 0;i < counter;i++)
            {
                fileWrite.println(arrID[i].getFname()+", "+ arrID[i].getLname()+", "+arrID[i].getAge()
                +", "+arrID[i].getGender()+", "+arrID[i].getCitizenship());
            }

            fileWrite.close();
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null,"File not created." + e.getMessage());
        }
    }
}
