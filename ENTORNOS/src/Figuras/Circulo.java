package Figuras;

public class Circulo 
{
	private int Radio;
	   
    public  Circulo(int Radio) 
    {
        this.Radio=15;
    }

    public void SetRadio(int Radio) 
    {
    	 this.Radio=Radio;
    }

    public int GetRadio() 
    {   
        return this.Radio;
    }

    public int  getarea() 
    {
        return (int) (Math.PI*(Radio^2));
    }

    public int getperimetro() 
    {
        return (int) (2*Math.PI*Radio);
    }

}
