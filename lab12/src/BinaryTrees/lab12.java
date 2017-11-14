package BinaryTrees;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class lab12 {
   public static void main(String[]args) {
	   try {
		   BinarySearchTree<StudentGPA> order = new BinarySearchTree<>();
		   TreeIterator<StudentGPA>a = (TreeIterator<StudentGPA>)order.iterator();
		   Scanner inputFile= new Scanner(new File("students.in"));
		   String b = inputFile.nextLine();
		   while(inputFile.hasNextLine())  {
			   Scanner other = new Scanner(b);
			   int id= other.nextInt();
			   String name= other.next();
			   double gpa= other.nextDouble();
			   if(!other.hasNext()) {
				   StudentGPA order1= new StudentGPA(id,name,gpa);
				   order.insert(order1);
			   }
			   else {
				   String ad = other.next();
				   GraduateStudentGPA order2= new GraduateStudentGPA(id,name,gpa,ad);
				   order.insert(order2);
			   }
			   if(!inputFile.hasNext()) {
				   break;
			   }
			   else {
				   b=inputFile.nextLine();
			   }
			}
		   inputFile.close();
		   a.printInorder();
	   }
	   catch(IOException e) {
		   System.err.println("IOError\n"+e);
		   System.exit(9);
	   }
   }

	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
   }
