
package asignacion1_00000267437;

public abstract class Cilindro {
   public double radio;
   public double altura;

    public Cilindro(double radio, double altura) {
        this.radio = radio;
        this.altura = altura;
    }
    
    public double area (){
       return 2 * Math.PI * radio * (radio + altura ); 
   }
    
    public double volumen(){
        return Math.PI * Math.pow(radio, 2) * altura;
        
    }

    public double getRadio() {
        return radio;
    }

    public double getAltura() {
        return altura;
    }
    
    
    
}
