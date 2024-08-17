package exerciciosfor;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
			int N = sc.nextInt();
			
			for(int i = 0; i<N; i++)
			{
				double v1 = sc.nextDouble();
				double v2 = sc.nextDouble();
				
				if (v2 == 0)
				{
					System.out.println("divisao impossivel");
				}
				else 
				{
					double div = (double) v1 / v2;
					System.out.printf("%.1f%n", div);
				}
				
			}
			
		sc.close();
	}

}
