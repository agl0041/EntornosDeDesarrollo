
public abstract class Algoritmos 
{
	/*
	 * Devuelve el sumatorio del numero especificado
	 * 
	 * @param numero	el numero del que queremos calcular el sumatorio
	 * @return			el sumatorio del numero especificado
	 */
	public static int sumatorio(int numero)
	{
		int numTotal = 0;
		for (int i = 0; i < numero; i++)
		{
			numTotal += (1 + i);
		}
		return numTotal;
	}
	
	public static int factorial(int numero) 
	{
	    int numTotal = 1;
	    for (int i = 1; i <= numero; i++)
	    {
	        numTotal *= i;
	    }
	    return numTotal;
	}

}
