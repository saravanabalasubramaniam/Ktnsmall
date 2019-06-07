import java.io.*;
import java.util.*;
public class Ktnsmall
{
	public static void main(String[] args) 
	{
	    Scanner input=new Scanner(System.in);
        int size=input.nextInt();
        int arr[]=new int[size];
	int small=input.nextInt();
        int b;
        for(int i=0;i<size;i++)
        {
            arr[i]=input.nextInt();   
        }
        
        for (int i= 0; i <size; i++) 
        {
            for (int j=i+1; j <size; j++)
            {
                if (arr[i] > arr[j]) 
                {
                    b =  arr[i];
                    arr[i] = arr[j];
                    arr[j] = b;
                }
            }
        }
            System.out.println(arr[small-1]);
	}
}
