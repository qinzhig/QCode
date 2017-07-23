import java.io.IOException;
import java.util.Scanner;

public class GPA{

	public static void main(String[] args) throws Exception {
		//Create symbol table of grades and values	
		ST<String, Double> grades = new ST<String,Double>();
		
		grades.put("A",  4.00);
        grades.put("B",  3.00);
        grades.put("C",  2.00);
        grades.put("D",  1.00);
        grades.put("F",  0.00);
        grades.put("A+", 4.33);
        grades.put("B+", 3.33);
        grades.put("C+", 2.33);
        grades.put("A-", 3.67);
        grades.put("B-", 2.67);

        int n =0;
        double total = 0.0;
        
        System.out.print("Start accept the input score!\n");
        
        Scanner stdin = new Scanner(System.in);
        String line = stdin.nextLine();
        
        for(n=0; line.length() != 0; n++){
        	String grade = line;
        	double value = grades.get(grade);
        	total = total + value;
        	line = stdin.nextLine();
        }
        
        double gpa =  total / n;
        System.out.println("GPA = " +gpa);
        
	}
	
}