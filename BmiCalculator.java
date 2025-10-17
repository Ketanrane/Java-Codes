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

	}
}
