import java.util.Scanner;

public class Task_1
{
  public static void main(String Abhi[])
  {
    
    String b="Abhishek";
    
    System.out.println("          Login          \n");
    System.out.println("Enter the Username:");
    Scanner s=new Scanner(System.in);
    String a=s.nextLine();

    if(a.equals(b))
    {
      
      System.out.println("Enter Your Password:");
      int pwd=s.nextInt();

      if(pwd==1234)
      {
        System.out.println("\n");
        System.out.println("           Welcome " +a );
        System.out.println("\n");
      
        System.out.println("Please enter your reservation details.\n");
        System.out.print("Train number:");
        int  Train=s.nextInt();
        System.out.println("Class type: ");
        String classType = s.nextLine();
        System.out.print("Date of journey: ");
        String date = s.nextLine();
        System.out.print("From (place): ");
        String from = s.nextLine();
        System.out.print("To (destination):");
        String to = s.nextLine();
       System.out.println("\n\n");
        System.out.println("    |||||| Your Ticket is Here ||||||");

        System.out.println("Name: "+a+"  | PRN :ABC1234   |   Date: "+date+"\n");
        System.out.println("Train No.: "+Train+"- Deccan Express  ");
        System.out.println("Class:   | From : "+from+"  To: "+to+" |     ");
      }
      System.out.println(" Do you Have to Cancle Ticket ?");
      System.out.println("Press 1 for Yes' / Press 2 for 'No'");
      String Yes=s.nextLine();
      
      String y="1";
      if(Yes.equals(y))
      {
        System.out.println(" Enter your PRN Number :");
        String PRN=s.nextLine();
        String prn="ABC1234";

        if(PRN.equals(prn))
        {
            System.out.println("Confirm to Cancle By Pressing 1 and 2 for Not");
            int x=s.nextInt();
        }
          else 
          {
             
          }

        
      
        
        
      }
      else
      {
        System.out.println("Wrong Password");
      }
    }
    else
    {
      System.out.println("Username Does Not Exists...!");
    }
  }
}