import java.util.Scanner;


public class Holala {

	public static void main(String[] args) 
	{
		int notas [] [] = new int [4] [3];
		Scanner s = new Scanner(System.in);
		while(true)
		{
			System.out.print("Ingrese 1 para ver notas 2 para ingresar y 3 para salir");
			int opcion = s.nextInt();
			if (opcion==1)
			{
				System.out.print("Ingrese el numero del alumno: ");
				int alumno = s.nextInt();
				for(int i = 0; i <3; i++)
				{
				 System.out.println(notas[alumno][i]);
				}
			}
			if(opcion==2)
			{
				System.out.print("Ingrese el numero del alumno: ");
				int alumno = s.nextInt();
				for(int i=0; i <3; i++)
				{
					System.out.print("Ingrese una nota: ");
					notas[alumno][i] =s.nextInt();
				}
			}
			if(opcion==3)
			{
				
			}
		}
	}
}
	
				
					
		
