import java.util.*;
import java.io.*;
public class PatientRecordApp
{
    public static void main (String[]args)
    {
        try
        {
            LinkedList <PatientRecord> patientList = new LinkedList <>();
            Scanner in = new Scanner(System.in);
            
            FileReader fr = new FileReader ("PatientData.txt");// Input
            BufferedReader br = new BufferedReader (fr);      //   File
            FileReader fr1 = new FileReader ("MedicineList.txt");
            BufferedReader br1 = new BufferedReader (fr1);
            
            FileWriter fw = new FileWriter ("PatientReceipt.txt");//
            BufferedWriter bw = new BufferedWriter (fw);  //  Output file
            PrintWriter pw = new PrintWriter (bw); 
            
            int index=0;
            
            String name = null;
            String icNo = null;
            int disease = 0;
            int age = 0;
            String phoneNo = null;
            int found = 0;
            
            String input = null;
            while(br.readLine()!=null)
            {
                index++;
            }
            br.close();
            
            fr = new FileReader("PatientData.txt");
            br = new BufferedReader(fr);
            PatientRecord[] pr = new PatientRecord[index];
            int count = 0;
            while((input = br.readLine())!=null)
            {
                StringTokenizer st = new StringTokenizer(input,";");
                
                name = st.nextToken();
                System.out.println("NAME : " + name );
                icNo = st.nextToken();
                System.out.println("IC NO : " + icNo);
                disease = Integer.parseInt(st.nextToken());
                System.out.println("DISEASE : " + disease);
                age = Integer.parseInt(st.nextToken());
                System.out.println("AGE : " + age);
                phoneNo = st.nextToken();
                System.out.println("PHONE NO : " + phoneNo);
                
                /*p[count] = new Medicine(name,icNo,disease,age,phoneNo,type,price);
                p[count] = new Disease(name,icNo,disease,age,phoneNo,typeDisease);
                p[count] = new Doctor(name,icNo,disease,age,phoneNo,doctName,id,dPhoneNo);*/
            }
            
            System.out.println("~~~~~~~~~~WELCOME~~~~~~~~~~");
            System.out.println("(1) SEARCH PATIENT");
            System.out.println("(2) REGISTER NEW PATIENT");
            System.out.println("(3) ILLNESS");
            System.out.println("(4) PRINT RECEIPT");
            System.out.println("(5) EXIT");
            System.out.println("ENTER YOUR CHOICE : ");
            int ch = in.nextInt();
            
            System.out.println("DO YOU WANT TO PROCEED (Y/N): ");
            char proceed = in.next().charAt(0);
            
            while(proceed == 'Y' || proceed == 'y')
            {   //find registered patient 
                if(ch == 1)
                {
                    System.out.println("ENTER IC NO : ");
                    icNo = in.nextLine();
                    
                    PatientRecord p = (PatientRecord)patientList.getFirst();
                    while(p!=null)
                    {
                        if(p.getICNo().equals(icNo))
                        {
                            p.toString();
                        
                            found = 1;
                            break;
                        }
                        else
                        {
                            found = 0;
                        }
                        p = (PatientRecord)patientList.getNext();
                    }
                }
                else if(ch == 2)
                {
                    System.out.println("Enter patient's name : ");
                    name = in.nextLine();
                    System.out.println("\nEnter patient's IC : ");
                    icNo = in.nextLine();
                    System.out.println("Enter patient's disease : ");
                    disease = in.nextInt();
                    System.out.println("Enter patient's age : ");
                    age = in.nextInt();
                    System.out.println("Enter patient's phone no. : ");
                    phoneNo = in.nextLine();
                    
                    
                }
            }
                    
        }
        catch(FileNotFoundException e)
        {
            System.out.println ("Problem : " + e.getMessage()); 
        }
        catch(IOException ioe)
        {
            System.out.println ("Problem : " + ioe.getMessage()); 
        }
    }
}//end of program