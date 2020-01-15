import java.util.Scanner;
class Calculator2{
public static void main(String args []){
	Scanner obj=new Scanner(System.in);
	int choice=0;
	float x=0,y=0;
	do{
System.out.println("Choose Operation");
System.out.println("1. Add");
System.out.println("2. Substract");
System.out.println("3. Multiply");
System.out.println("4. Divide");
System.out.println("5. Modulus");
System.out.println("6. Exit");
System.out.println("Enter Choice");
choice=obj.nextInt();
	
		
switch(choice){
case 1:
System.out.println("Enter Two numbers: ");
x=obj.nextInt();
y=obj.nextInt();
float i= x+y;
System.out.println("Addition is " + i);
break;
case 2:
System.out.println("Enter Two numbers: ");
x=obj.nextInt();
y=obj.nextInt();
float j= x-y;
System.out.println("Substraction is "+ j);
break;
case 3:
System.out.println("Enter Two numbers: ");
float k=x*y;
System.out.println("Multiplication is " + k);
x=obj.nextInt();
y=obj.nextInt();
break;
case 4:
System.out.println("Enter Two numbers: ");
x=obj.nextInt();
y=obj.nextInt();
float l;
try{
	l=x/y;
	System.out.println("Division is " + l);
}catch(ArithmeticException e){
	System.out.println("Cannot Divide by zero");
}
break;
case 5:
System.out.println("Enter Two numbers: ");
x=obj.nextInt();
y=obj.nextInt();
float t=x%y;
System.out.println("Modulus is " + t);
break;
case 6:
System.exit(0);
break;
}
}while(choice!=6);
}
}

