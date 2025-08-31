
package asignacion1_00000267437;

public class BolsaEjemplo extends Bolsa<String> {
    public BolsaEjemplo(int tamBolsa) {
        super(tamBolsa);
    }

    public void Contenido() {
        System.out.println("Contenido de la bolsa:");
        for (String fruta : obtenObjetos()) {
            System.out.println("- " + fruta);
        }
    }
}

