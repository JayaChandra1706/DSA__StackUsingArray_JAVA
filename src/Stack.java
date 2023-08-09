import java.util.Scanner;
public class Stack {
	 private int s[];
	    private int top=-1;
	    private int size;
	    private Scanner scan=new Scanner(System.in);
	    public Stack(int len){
	        s=new int[len];
	        size=s.length;
	    }
		public void push(){
	        if(top==size-1){
	            System.out.println("Push is not possible because Stack is full");
	        }else{
	        System.out.print("Enter the element to Push:");
	        int ele=scan.nextInt();
	        System.out.println();
	        top++;
	        s[top]=ele;
	        System.out.println("Push is successful");
	        }
	     }
	    public void pop(){
	        if(top==-1){
	            System.out.println("Pop is not Possible because Stack is empty");
	        }else{
	            System.out.println("Deletion or Pop is Successful Element "+s[top]+" is Deleted or Poped");
	            top--;
	        }
	    }
	    public void displsy(){
	        if(top==-1){
	            System.out.println("There is No Elements Display");
	        }else{
	            for(int i=top;i>=0;i--){
	                System.out.println(s[i]);
	            }
	        }
	    }
}
