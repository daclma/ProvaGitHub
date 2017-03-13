package exercici2;

/**
 * @author Jana
 * Clase para representar y operar con numeros complejos. Un numero complejo es un par opdenado
 * (a, b) donde a es la parte real y b es la parte imaginaria.
 * Tienen las operaciones:
 * Suma: (a,b)+(c,d)=(a+c)+(b+d)
 * Multiplicación: (a,b)*(c,d)=(ac-bd)(ac+bd)
 * Igualdad: (a,b)=(c,d)< =>(a=c)y(b=d)
 */
public class NumComplejos {
     private double Real;   
     private double Imaginario; 

     public NumComplejos(double re, double imag) {
         Real = re;     
         Imaginario = imag;   
     }      
     
     public double getReal() {
         return Real;   
     }      
     
     public double getImaginario() {
         return Imaginario;   
     }
     
     public NumComplejos suma(NumComplejos c) { 
         return new NumComplejos(getReal() + c.getReal(), getImaginario()+ c.getImaginario());
     }  
     
     public NumComplejos multiplicacion(NumComplejos c) {
         double re = getReal()*c.getReal() - getImaginario()*c.getImaginario();
         double imag = getImaginario()*c.getReal() + getReal()*c.getImaginario();
         return new NumComplejos(re, imag);   
     }
     
       
     public boolean igual(Object anObject) {
         if (anObject instanceof NumComplejos) { 
             NumComplejos c = (NumComplejos) anObject;
             return ((c.getReal() == getReal()) && (c.getImaginario()== getImaginario()));
         }else
             return false;
     }
} 