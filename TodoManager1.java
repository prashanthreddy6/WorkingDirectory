package Test1;

import java.util.Scanner;

public class TodoManager1 {
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

		
		String[] todos=new String[5];
		int n=-1;
		int index=0;
		do {
			System.out.println("press 1 to add todo");
			System.out.println("press 2 to update todo");
			System.out.println("press 3 to delete todo");
			System.out.println("press 4 to search todo");
			System.out.println("press 5 to display all todo");
			System.out.println("press 0 to exit");
		n=sc.nextInt();
		  sc.nextLine();
		  
		 switch(n) {
		 case 1:
			 System.out.println("enter todo to add ");
			 String todo=   sc.nextLine();
			 todos[index++]=todo;
			 System.out.println(todo+" is successfully added");
			 break;
		 case 3:
			 System.out.println("enter todo to add ");
			 String todo1=   sc.nextLine();
			 todos[index++]=null;
			 System.out.println(todo1+" is successfully deleted");
			 
			 break;
		 
		 case 2: 
			 System.out.println("enter todo to add ");
			 String todo3=   sc.nextLine();
			 todos[index++]=todo3;
			 System.out.println(todo3+" is successfully updated");
			 
			 break;
		 
		 case 4:
			 System.out.println("enter todo to add ");
			 String todo2=   sc.nextLine();
			 todos[index++]=todo2;
			 System.out.println(todo2+" is successfully search");
			
			 break;
		 case 5: 
			 for(String td:todos) {
				 System.out.println(td);
			 }
			 break;
		 case 0:
			 System.out.println("existing todos thank you");
			 break;
		
		 default:
			 System.out.println("invalid input");
		 }
		}
		while(n!=0);
	}

	
		
	

}

