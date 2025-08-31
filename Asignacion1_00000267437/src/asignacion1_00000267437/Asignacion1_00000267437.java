package asignacion1_00000267437;

/**
 *
 * @author jesus
 */
public class Asignacion1_00000267437 {

    public static void main(String[] args) {
        // Cilindro
        Cilindro cil = new Cilindro(3, 5) {};
        System.out.println("Área: " + cil.area());
        System.out.println("Volumen: " + cil.volumen());

        System.out.println("------------------------------");
        
        // Bolsa
        BolsaEjemplo bolsa = new BolsaEjemplo(5);

        bolsa.agrega("Manzana");
        bolsa.agrega("Pera");
        bolsa.agrega("Manzana");

        System.out.println("Número de objetos: " + bolsa.obtenNumObjetos());
        System.out.println("¿Está vacía? " + bolsa.vacia());
        System.out.println("¿Contiene 'Pera'? " + bolsa.contiene("Pera"));
        System.out.println("Cantidad de 'Manzana': " + bolsa.cuenta("Manzana"));

        bolsa.Contenido();

        System.out.println("Removiendo al azar: " + bolsa.remueve());
        System.out.println("Removiendo 'Pera': " + bolsa.remueve("Pera"));

        bolsa.Contenido();

        bolsa.limpia();
        System.out.println("¿Está vacía después de limpiar? " + bolsa.vacia());
    }
    
}
