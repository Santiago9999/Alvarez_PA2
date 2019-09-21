import java.util.Scanner;
import java.util.Random;
public class Survey {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random rand = new Random();
		String[] topics = new String[5];
		int[][] responses = new int[5][12];
		int sentinel=-1;
		double averagerating[]=new double[5];
		double sum[]=new double[5];
		double usernumber=0.0;
		int i;
		int j;
		int k=0;
		int l=0;
		int userrating;

		topics[0]="Global Warming";
		topics[1]="Gun Control";
		topics[2]="Planned Parenthood";
		topics[3]="Death Penalty";
		topics[4]="Immigration";

		//Takes in the user's input
		while(sentinel!=0) 
		{
			System.out.println("\nRate topics 1-10 10 being most important.");
			for(i = 0;i<5;i++) 
			{
				System.out.println(topics[i]+(": "));
				userrating= input.nextInt();
				//userrating= rand.nextInt((10 - 1) + 1) + 1;
				responses[i][userrating-1]+=1;

			}
			System.out.println("Additonal Users? No(0) Yes(1);");
			sentinel=input.nextInt();
			usernumber++;
		}
		input.close();

		//Calculate the sums
		for(i=0;i<5;i++) 
		{
			for(j=0;j<10;j++) 
			{
				sum[i]+=(responses[i][j]*(j+1));
			}
			//			System.out.println("Sum for topic: " + (i+1) + "\n"+ sum[i]);
		}
		//finding average for each topic
		for(i=0;i<5;i++) 
		{
			averagerating[i]=sum[i]/usernumber;
			//		System.out.println("Average for Topic: " + (i+1) + "\n"+ averagerating[i]);

		}
		double max=averagerating[0];
		double min=averagerating[0];

		//Determining highest average

		for(j=0;j<5;j++)
		{
			if(averagerating[j]>max)
			{

				max=averagerating[j];
				k=j;
			}
		}


		//Determining lowest average

		for(j=0;j<5;j++)
		{
			if(averagerating[j]<min)
			{

				min=averagerating[j];
				l=j;
			}
		}



		//Tabular Report
		System.out.printf("%32d%8d%8d%8d%8d%8d%8d%8d%8d%8d%20s\n",1,2,3,4,5,6,7,8,9,10,"Average: ");
		for(i=0;i<5;i++) 
		{
			System.out.printf("%24s",topics[i]);
			for(j=0;j<10;j++) 
			{
				System.out.printf("%8d",responses[i][j]);
			}

			System.out.printf("%19f\n",averagerating[i]);

		}
		System.out.println("The Topic with the highest rating was: "+topics[k]+"\nWith an average rating of: " +averagerating[k]);
		System.out.println("The Topic with the lowest rating was: "+topics[(l)]+"\nWith an average rating of: " +averagerating[l]);	

	}

}



