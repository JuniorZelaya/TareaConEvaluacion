
public class Extra {
	

	static int factorial(int n)
	{
		int resultado;
		if (n<2)
		{
			resultado =1;
		}else
		{
			resultado = n* factorial(n-1);
		}
	
	  return resultado;
	}
	
	
		
	public static void main(String[] args)
	{
		System.out.print(factorial(5));
	

	}

}
