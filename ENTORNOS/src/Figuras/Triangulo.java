package Figuras;

public class Triangulo 
{
	private int base;
    private int  altura;
	
    public Triangulo () 
    {
    	this.base = 5;
    	this.altura=10;
    }
    
    public  Triangulo(int base, int altura) 
    {
      this.base=base;
      this.altura=altura;
    }

    public void Setbase(int base) 
    {
        this.base=base;
    }

    public int GetBase() 
    {
        return this.base;
    }

    public void SetAltura(int altura) 
    {
      this.altura=altura;
    }

    public int GetAltura() 
    {
        return this.altura;
    }

    public int  getarea() 
    {
        return (base*altura)/2;
    }
}
