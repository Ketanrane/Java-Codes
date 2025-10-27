import java.util.Scanner;

class BmiCalculator
	{

    public static void main(String[] args)
		{
        double  poundToKg= 0.45359237;
        double inchToMetre = 0.0254;

        Scanner sc = new Scanner(System.in);

         
        System.out.print("Enter weight in pounds: ");
        double weightInPounds = sc.nextDouble();
        
        
        System.out.print("Enter height in inches: ");
        double heightInInches = sc.nextDouble();

        
        double weightInKg = weightInPounds * poundToKg;
        double heightInMeters = heightInInches * inchToMetre;

        // Calculate BMI
        double bmi = weightInKg / (heightInMeters * heightInMeters);

        
        System.out.printf("BMI is "+ bmi);

			 if (bmi < 18.5) {                               
            System.out.println("Category: Underweight"); 
        } else if (bmi < 24.9) {                        
            System.out.println("Category: Normal weight");
        } else if (bmi < 29.9) {                       
            System.out.println("Category: Overweight");  
        } else {                                        
            System.out.println("Category: Obese");      
        }

        
        sc.close();
	}
}

