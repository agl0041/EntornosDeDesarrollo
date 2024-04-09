package Figuras;

/*
 * Clase Rectangulo. Permite crear rectangulos y calcular su area y perimetro 
 * 
 * @author Alvaro
 */

public class Rectangulo extends Figura
{
	private int base;
    private int  altura;
    
    /*
     * Constructor por defecto. Crea un rectangulo con base y altura 1, en metros
     */

    public  Rectangulo() 
    {
    	this.base = 1;
        this.altura = 1;
     
    }
    
    /*
     * Constructor que crea un rectangulo con la basey la altura especificadas, en metros
     * 
     * @param base	la base del rectangulo, en metros
     * @parem altura	la altura del rectangulo, en metros
     */
    
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
    
    /*
     * @see modelos.Figura#area()
     */
    
    @Override
    public double area()
    {
    	return this.base * this.altura;
    }
    
    /*
     * @see modelos.Figura#perimetro()
     */
    
    @Override
    public double perimetro()
    {
    	return 2*base + 2*altura;
    }

}
