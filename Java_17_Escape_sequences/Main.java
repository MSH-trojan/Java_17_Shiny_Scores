package main;
 // importing Scanner from libraries so we can have Scanner object.
import java.util.Scanner; 
public class Main {

	public static void main(String[] args) {
		
		// Making variables
		
		String a,b,c,d;
		int e,f,g,h,i,j,k,l;

		//making scanner object
		Scanner input = new Scanner(System.in);
		
		// using Escape sequences:
				// \n for break and going to next line
				// \s for a space
				// \t for a tab 
				// \\ for counting as one backslash : \ in our output.
				//for the star looking shape, we use spaces and next line sequences gradually so  it would be an oriented shape.
		
		System.out.println("Let's do some printing :)");
		
		System.out.println();
		
		System.out.println("\s\s*"
					    + "\n\s***"
					    +  "\n*****"
					    + "\n\s***"
					    +"\n\s\s*");
		
		System.out.println();
		
		System.out.println("////////////////\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
		
		System.out.println("\s\s\s\s\s\s\s\s\s\s" + "Enter info");
		
		System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\////////////////");
		
		System.out.println();
		
		//now asking the user to enter the info of 4 students(their name, mark, bonus).
		
		System.out.println("Enter students names: ");
		a = input.nextLine();
		b = input.nextLine();
		c = input.nextLine();
		d = input.nextLine();
		
		System.out.println();
		
		System.out.println("Enter students lab marks: ");
		e = input.nextInt();
		f = input.nextInt();
		g = input.nextInt();
		h = input.nextInt();
		System.out.println();
		
		System.out.println("Enter students bonus marks: ");
		i = input.nextInt();
		j = input.nextInt();
		k = input.nextInt();
		l = input.nextInt();
		
		// now, we show the inputs from the user in a table called student info.
		// we also count the total mark for each student by defining them below:
		
		System.out.println("////////////////\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
		
		System.out.println("\s\s\s\s\s\s\s\s\s" + "Student info");
		
		System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\////////////////");
		
		System.out.println();
		
		//now, we make 2 tabs of space in between each column (also using \s for it to become more in order) and each line as info for a specific student:
		
		System.out.println("Name" + "\t\t\t" + "lab" + "\t\t\t" + "bonus" + "\t\t\t" + "Total");
		System.out.println("----" + "\t\t\t" + "---" + "\t\t\t" + "-----" + "\t\t\t" + "-----");
		
		int Total_1 = e + i;
		int Total_2 = f + j;
		int Total_3 = g + k;
		int Total_4 = h + l;
		
		System.out.println(a + "\t\t\t" + e + "\t\t\t\s\s" + i + "\t\t\t\s\s" + Total_1);
		System.out.println(b + "\t\t\t" + f + "\t\t\t\s\s" + j + "\t\t\t\s\s" + Total_2);
		System.out.println(c + "\t\t\t" + g + "\t\t\t\s\s" + k + "\t\t\t\s\s" + Total_3);
		System.out.println(d + "\t\t\t" + h + "\t\t\t\s\s" + l + "\t\t\t\s\s" + Total_4);
		
		System.out.println();
	
		//for the star shape, we have to add \s (spaces) before an star if it needs or in between two stars so it would be an oriented shape.
		
		System.out.println(
		 "\s\s\s\s"+          "*"  
		+"\n\s\s"+	        "*   *"
		+"\n\s"+          "*     *"
		+"\n"+          "*       *"
		+"\n\s"+          "*     *"
		+"\n\s\s"+          "*   *"
		+"\n\s\s\s\s"+        "*"  
		);		
			
		System.out.println();
		
		// and lastly, two \ as one \ and 10 \ as 5 \.
		
		System.out.println("\\ 'Enjoy the term!'  \\\\\\\\\\");
	}
}
