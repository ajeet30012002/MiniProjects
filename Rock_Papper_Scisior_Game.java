import java.util.*;
public class Rock_Papper_Scisior_Game {
  static int comp=0;
  static int human=0;
  static void winner(int x,int y)
  {
    if((x==0 && y==2) || (x==1 && y==0) || (x==2 && y==1))
    {
        comp++;
    }
    else if((x==0 && y==0) ||(x==1 && y==1) || (x==2 && y==2))
    {
        // comp++;
        // human++;
    }
    else 
    {
        human++;
    }
  }
    public static void main(String[] args) {
        //r->0
        //p->1
        //s->2
        Scanner scan= new Scanner(System.in);
        Random rand = new Random();
        System.out.println("-----------------##############--------------------");
        System.out.println("Total 5 matches are played between computer and user");
        System.out.println("-----------------##############--------------------");
        for(int i=0;i<5;i++)
        {
            System.out.println("For rock->0   For Papper->1   For Scisor->2");
            System.out.println("********************");
            System.out.printf("Round no: %d\n",i+1);
            System.out.println("********************");
            System.out.println("\nThe computer has Enter his choice ");
            int num= rand.nextInt(3);
            System.out.println("Enter you choice");
            int usernum= scan.nextInt();
            System.out.println("The choice made by both player are");
            System.out.printf("\ncomputer %d  user  %d",num,usernum);
            winner(num, usernum);
            System.out.println("\n-----------------***********--------------------");
        }
        if(comp>human)
        {
            System.out.println("Winner is computer");
        }
        else if(comp==human)
        {
            System.out.println("Tie");
        }
        else{
            System.out.println("Winner is user");
        }
    }
}
