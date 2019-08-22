import java.util.Scanner;

public class Student{
	
	public static void main(String args[]){
		
		Scanner vs  = new Scanner(System.in);

		System.out.println("Enter the number of subjects");
		int n = vs.nextInt();
		Grades_calc(n);

	}



	public static void Grades_calc(int n){
	
		Scanner vs  = new Scanner(System.in);
		double marks[] = new double[n];
		int grades[] = new int[n];
		int credits[] = new int[n];
		int total_credits = 0;
		int sgpa_temp=0;

		for(int i = 0; i< n; i++){
				System.out.println("Enter the marks in subject " + (i+1));
				marks[i] = vs.nextDouble();
				System.out.println("Enter the credits of subject " + (i+1));
				credits[i] = vs.nextInt();

				double m = marks[i];
				if(m>=90)
					grades[i] = 10;
				else if(m>=75)
					grades[i] = 9;
				else if(m>=65)
					grades[i] = 8;
				else if(m>=55)
					grades[i] = 5;
				else if(m>=40)
					grades[i] = 4;
				else
					grades[i] = 0;
					
				sgpa_temp += grades[i]*credits[i];
				total_credits += credits[i];
		}
		
		SGPA(total_credits, sgpa_temp);
	}

	public static void SGPA(int total_credits, int sgpa_temp){
			
			double sgpa;
			sgpa = (double)sgpa_temp/total_credits;
			System.out.println("YOUR SGPA IS OwO - "+ sgpa);	
	}

}
