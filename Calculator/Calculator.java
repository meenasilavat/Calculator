
import java.util.Scanner;
public class Calculator {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int select;
	int  a,b,result;
do {

	System.out.println("select an operation");
	System.out.println("1 Addition(+)");
	System.out.println("2 Substraction(-)");
	System.out.println("3 Multiplication(*)");
	System.out.println("4 Division(/)");
	System.out.println("Enter your no");
	select=sc.next().charAt(0);
	System.out.println("Enter first number:");
	a=sc.nextInt();
	System.out.println("Enter second number:");
	b=sc.nextInt();

	switch(select){
	case '1':
		result=a+b;
		System.out.println("Result:" +result);
		break;
	case '2':
		result=a-b;
		System.out.println("Result :" +result);
		break;
	case'3':
		result=a*b;
		System.out.println("Result :"+result);
		break;
	case'4':
		if(b !=0) {
		result=a/b;
		System.out.println("Result :" +result);
		break;
	
	}else {
		System.out.println("Error");
	}
		break;
		default:
		System.out.println("Invalid choice");
}
	System.out.print("Do you want to perform another operation please enter 0:");
	select=sc.nextInt();
}while(select==0);
sc .close();
}
}

