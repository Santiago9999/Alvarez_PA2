import java.util.Scanner;

public class Decryption {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int array[]= new int[5];
		int userint = 0;
		int decryptedarray[] = new int[5];
		int j;
		System.out.print("Please input number to be decrypted: ");
		//convoluted method making user input into separate value to be manipulated. 
		userint=scnr.nextInt();
		for(j=0;j<4;j++)
		{
			array[j]=(int) (userint/Math.pow(10,3-j ));				
		}
		//decryption
		for (j=0;j<4;j++)
		{
			array[j]=array[j]%10;
			array[j]=(array[j]+3)%10;		
		}
		
		decryptedarray[0] = array[2];
		decryptedarray[1] = array[3]; 
		decryptedarray[2] = array[0];
		decryptedarray[3] = array[1];
		System.out.print("\nDecrypted Value: ");
		for (j=0;j<4;j++)			
		{
			System.out.print(decryptedarray[j]);			
		}
		scnr.close();
	}

}
