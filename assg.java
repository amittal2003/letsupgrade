import java.util.Scanner;

class assg{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num%3==0 && num%5==0)
        {
            System.out.println("Good Number");
        }
        else if(num%3==0)
        {
            System.out.println("Bad Number");
        }
        else if(num%5==0)
        {
            System.out.println("Poor Number");
        }
        else
        {
            System.out.println("-1");
        }
    }
}