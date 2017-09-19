
import java.util.Scanner;
import java.util.Vector;
import java.io.File;
import java.io.IOException;

public class lab1b {
    
	Vector <Double> doubleVector; 

    /** Constructor: calls method readFile that reads the doubles
     * contained in the file "<code>filename</code>" and computes the
     * sum of the elements.
     @param filename name of the file containing doubles.
    */
    public lab1b(String filename) {
	readFile(filename);
    }

    /** Reads double from a file named <code>filename</code> and
     * computes the sum of the elements contained in the file 
     * @param filename name of the file containing the doubles 
     */
    public void readFile(String filename) {
	try{
		File inputFile = new File(filename);
		Scanner input = new Scanner(inputFile);
		doubleVector = new Vector<Double>();
		while(input.hasNext()){
			double temp = input.nextDouble();
			doubleVector.addElement(temp);
		}//end while
		double sum = 0;
		for(double value:doubleVector)
			sum += value;
		System.out.printf("The sum of the values in the file is %f\n", sum);
		input.close();
	}
	catch (IOException e) {
	    System.err.println("IOException in reading input file!!!");
	}
    } //end readFile()
    
    

    /** main : creates a Lab1b Object with the filename passed in
     * argument*/
    public static void main(String args[]) {
    	args = new String[1];
    	args[0] = "Lab1b.dat";
	if (args.length == 0)
	    System.err.println("enter the data file name!");
	else
	    new lab1b(args[0]);
    } //end main
    
} //end class Lab1b
