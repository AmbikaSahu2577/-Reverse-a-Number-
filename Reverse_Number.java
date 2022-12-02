import java.util.Scanner;
class Reverse_Number
{
	public static void main(String[] args) 
	{
		int number,rem;
		System.out.println("enter any number");
		Scanner sc = new Scanner(System.in);
		 number=sc.nextInt();
		 while(number>0)
		 {
            rem = number%10;
            System.out.print(rem);
            number=number/10;
		 }
	}
}