
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
			numTotal += (numero + i);
		}
		return numTotal;
	}
}
