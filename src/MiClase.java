// Este trabajo se realizo en grupo con Maynor Morales, Adalid Solis, Kevin Lanza Y Yo Junior Zelaya



public class MiClase
{
	//devuelve la suma de a y b
	static int sumarNumeros(int a, int b)
	{
		return a+b; //se suman  los dos numeros a y b para obtener resultado
	}
	
	//devuelve la resta de a y b
	static int restarNumeros(int a, int b)
	{
		return a-b; // se resta los dos numeros a y b para obtener resultado
	}
	
	//devuelve la multiplicación de a y b
	static int multiplicarNumeros(int a, int b)
	{
		return a*b; // se multiplica los dos numeros a y b para obtener resultado
	}
	
	//devuelve true si num es par, de lo contrario, devuelve false
	static boolean esPar(int num)
	{
		if ( (num % 2)== 0) // se evalua la condicion if para evaluar el residuo
		{
			return true; // devuelve true si es verdadero
		}
		return false; // devuelve false si no cumple la funcion
	}
	
	//devuelve el numero mayor entre a, b o c
	static int getMayor(int a, int b, int c)
	{
		int resultado = 0;
		{
			if ( a>b && a>c) // se usa para la variable a
			{
				return a;
			}
			if (b>c && b>a) // se usa para la variable b
			{
				return b;
			}
			if (c > a && c > b) // se usa para la variable c
			{
				return c;
			}
		}
		return resultado;
		
			}
	
	//devuelve num elevado a la potencia
	static int potencia(int num, int potencia)
	{
	int total;
	total = (int) Math.pow(num, potencia); // se calcula el potencial del numero
	return total; // devvuelve el resultado
	}
	
	//devuelve el numero mayor del arreglo
	static int sumarArreglo(int arreglo[])
	{
		int suma = 0; // se establece una variable
		for (int i = 0; i < arreglo.length;i++) // se hace un ciclo para recorrer el arreglo
			suma += arreglo[i]; // se establece la igualdad entre la condicion y el arreglo
		return suma; //devuelve el resultado
	}
	
	//devuelve el numero mayor de un arreglo
	static int getMayorArreglo(int arreglo[])
	{
		  int resultado = arreglo[0]; //se establece la variable
	        
	        for(int x=0; x<arreglo.length; x++) // se hace un ciclo para recorrer el arreglo
	        { 
	            if(arreglo[x] > resultado) // se evalua la condicion
	        { 
	                resultado = arreglo[x]; 
	        } 
	        } 
	            return resultado; // devuelve el resultado
	    }
		
	
	//devuelve el numero menor de un arreglo
	static int getMenorArreglo(int arreglo[])
	{
	
	int resultado = arreglo[0]; // se estable una variable
    
    for(int x=0; x<arreglo.length; x++) // se hace un ciclo para recorrer el arreglo
    { 
        if(arreglo[x] < resultado) // se evalua la condicion
    { 
            resultado = arreglo[x]; // se devuelve el resultado
    } 
    } 
        return resultado; 
}
	
	//devuelve true si encuentra cadena dentro arreglo
	static boolean existe(String arreglo[],String cadena)
	{
	    for(int x=0; x<arreglo.length; x++) // se hace un ciclo parea recorrer el arreglo
        {
            if(arreglo[x].equals(cadena)) // se evalua la condicion
        {
                return true; // devuelve tru si es verdadero
        }
        }
            return false; // devuelve false si no cumple la funcion
    }
    
    
    public static void main(String args[])
    {
        
    }

	}
