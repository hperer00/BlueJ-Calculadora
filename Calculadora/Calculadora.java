
/**
 * Write a description of class Calculadora here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Calculadora
{
    public void sumar (int sumando1, int sumando2)
    {
        int z;
        
        z=sumando1 + sumando2;
        System.out.println(z);
    }
    
    public void multiplicacion (int numero1, int numero2)
    {
        int z;
        
        z=numero1 * numero2;
        System.out.println(z);
        
    }
    
    public static void main(String arg[])
    {
        int x;
        int y;
        Calculadora miCalculadora=new Calculadora();
        
        
        
        
        x=8;
        y=6;
        x=4;
        
        miCalculadora.sumar(x,y);
        
        x=8;
        y=6;
        x=4;
        
        miCalculadora.multiplicacion(x,y);
        
        
        
    }
        
           
}
