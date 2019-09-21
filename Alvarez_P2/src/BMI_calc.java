import java.util.Scanner;
public class BMI_calc {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Metric(0) or Imperial (1)?: ");
		int system = input.nextInt();
		double  weight=0.0;
		double height=0.0;
		double  bmi=0.0;
		if (system==0)
		{
			System.out.println("Enter weight in Kilograms: ");
			weight= input.nextDouble();
			System.out.println("Enter height in Meters: ");
			height= input.nextDouble();		
			bmi=weight/Math.pow(height, 2.0);

		}
		if (system!=0)
		{
			System.out.println("Enter weight in Pounds: ");
			weight= input.nextDouble();
			System.out.println("Enter height in Inches: ");
			height= input.nextDouble();		
			bmi=703*weight/Math.pow(height, 2.0);

		}
		System.out.println("Calculated BMI:"+ bmi);
		System.out.println("BMI Categories:\nUnderweight: <18.5\nNormal Weight: 18.5-24.9\nOverweight: 25-29.9\nObesity >=30");
		input.close();
	}

}
