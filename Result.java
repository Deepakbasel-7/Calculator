import java.util.Scanner;
public class Result {
public static void main(String [] args){
int marks;
System.out.println("Enter the marks obtained: ");
Scanner d = new Scanner (System.in);
marks= d.nextInt();
if(marks>=60 && marks<=80)
{
System.out.println("Congratulations!!! You have passed securing 1st devision!");
}
else if(marks>80 && marks<=100)
{
System.out.println(" Congratulations!!! You have passed securing Distinction!");
}
else 
{
System.out.println("Sorry! You have failed...");
}
}
}