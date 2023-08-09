import java.util.Scanner;
public class StackApp {
	 public static void main(String[] args) {
	        Scanner scan=new Scanner(System.in);
	        System.out.print("Enetr the Stack Length:");
	        int len=scan.nextInt();
	        System.out.println();
	        Stack stack=new Stack(len);
	        while(true){
	            System.out.println("Enter 1 to Push Element");
	            System.out.println("Enter 2 to Pop the Element");
	            System.out.println("Enter 3 to Display the Elements of Stack");
	            System.out.println("Enter Other any number to Exit");
	            System.out.println("Enter your Choice");
	            int choice=scan.nextInt();
	            switch (choice) {
	                case 1:
	                    stack.push();
	                    break;
	                case 2:
	                    stack.pop();
	                    break;
	                case 3:
	                    stack.displsy();
	                    break;        
	            
	                default:
	                    System.exit(0);
	            }
	            
	                

	            

	        }
	    }
}
