package Figuras;

public class Rectangulo 
{
	private int base;
    private int  altura;

    public  Rectangulo() 
    {
    	this.base = 1;
        this.altura = 1;
     
    }
    
    public Rectangulo(int base, int altura) 
    {
    	this.base=base;
    	this.altura=altura;
    }
   
    public void Setbase(int base) 
    {
       this.base= base;
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
        return base * altura;
    }

    public int getperimetro() 
    {        
        return 2*base + 2*altura;
    }

}
