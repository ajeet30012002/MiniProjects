import java.util.*;
class guess{
    public int guess_number;
    public int take_input;
    public static int times=0;
    Random rand=new Random();
    guess()
    {
        System.out.println("\nComputer Has choosen a Number ");
        this.guess_number=rand.nextInt(100);
    } 
    public void input_a_no()
    {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter your Number ");
        take_input= scan.nextInt();
    }
    public int ckeck_a_no()
    {
        times++;
        if(guess_number==take_input)
        {
            return 0;
        }
        if(guess_number>take_input)
        {
            System.out.println("The guess No is large Than your Number");
        }
        else
        {
            System.out.println("The guess No is small than your ");
        }
        return 1;
    }
}
class guess_game
{
    public static void main(String[] args) {
        guess g= new guess();
        int x=1;
        while(x>0){
            System.out.println("--------##########-----------");
            g.input_a_no();
            int b=g.ckeck_a_no();
            x=b;
            System.out.println("--------##########-----------");
    }
    System.out.println("The Number of times it take to Guess the number is "+ g.times);
    }
}