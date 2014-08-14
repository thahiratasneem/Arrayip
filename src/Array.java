import java.io.DataInputStream;
import java.util.Scanner;


public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Number[] n = new Number[5];
int i;
System.out.println("enter the number:");
Scanner sca = new Scanner(System.in);

	i=sca.nextInt();


System.out.println("enter the number:");
Scanner sc = new Scanner(System.in);
int k=i;
for(int j=0;j<k;j++)
{
	n[j]=sc.nextInt();
	}
System.out.println("array numbers are:");

for(int l=0;l<n.length;l++)
{
	System.out.println("" +n[l]);

}
	}

}
