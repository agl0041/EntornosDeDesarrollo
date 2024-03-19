package Figuras;

public class Rectangulo 
{
	private int base;
    private int altura;
    
	public Rectangulo()
	{
		this.base = 1;
    	this.altura = 1;
    }

    public void Rectangulo(int base, int altura) 
    {
    	this.base = base;
    	this.altura = altura;
    }

    public int getArea() 
    {
        return (this.base*this.altura);
    }

    public int getPerimetro() 
    {
        return ((this.base*2) + (this.altura*2));
    }

    public int getBase() 
    {
        return this.base;
    }

    public int getaltura() 
    {
        return this.altura;
    }

    public void setBase(int base) 
    {
    	this.base = base;
    }

    public void setAltura(int altura) 
    {
    	this.altura = altura;
    }

}
