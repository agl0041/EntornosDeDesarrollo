package Figuras;

public class Main020424 
{
	public static void main(String[] args) 
	{
		Triangulo t1 = new Triangulo();
		
		t1.Setbase(1);
		t1.SetAltura(2);
		System.out.println("Area del triangunlo 1 con base 1 y altura 2: " + t1.getarea());
		
		t1.Setbase(2);
		System.out.println("Area del triangulo 1 con base 2 y altura 2: " + t1.getarea());
		
		Circulo c1 = new Circulo(/*Radio*/2);
		c1.getarea();
		c1.SetRadio(3);
		System.out.println("El perimetro del circulo 1 con radio 3 es: " + c1.getperimetro());
	}
}
