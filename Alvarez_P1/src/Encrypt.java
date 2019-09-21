import java.util.Scanner;

public class Encrypt {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int array[]= new int[5];
		int userint = 0;
		int Encryptedarray[] = new int[5];
		int j;
		System.out.print("Please input number to be encrypted: ");
		//convoluted method making user input into separate value to be manipulated. 
		userint=scnr.nextInt();
		for(j=0;j<4;j++)
		{
			array[j]=(int) (userint/Math.pow(10,3-j ));				
		}
		
		for (j=0;j<4;j++)
		{
			array[j]=array[j]%10;
			array[j]=(array[j]+7)%10;			
		}
		
		
		Encryptedarray[0] = array[2];
		Encryptedarray[1] = array[3]; 
		Encryptedarray[2] = array[0];
		Encryptedarray[3] = array[1];
		System.out.print("\nEncrypted Value: ");
		for (j=0;j<4;j++)			
		{
			System.out.print(Encryptedarray[j]);			
		}
		scnr.close();
	}

}
