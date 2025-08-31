package asignacion1_00000267437;
import java.util.ArrayList;
import java.util.Random;

public abstract class Bolsa<B> {
private int tamBolsa;
    private ArrayList<B> objetos;

 
    public Bolsa(int tamBolsa) {
        this.tamBolsa = tamBolsa;
        this.objetos = new ArrayList<>();
    }

    
    public int obtenNumObjetos() {
        return objetos.size();
    }

    
    public boolean vacia() {
        return objetos.isEmpty();
    }


    public boolean agrega(B objeto) {
        if (objetos.size() < tamBolsa) {
            objetos.add(objeto);
            return true;
        }
        return false;
    }

    
    public B remueve() {
        if (objetos.isEmpty()) return null;
        Random rand = new Random();
        int index = rand.nextInt(objetos.size());
        return objetos.remove(index);
    }

   
    public B remueve(B objeto) {
        if (objetos.remove(objeto)) {
            return objeto;
        }
        return null;
    }

    
    public void limpia() {
        objetos.clear();
    }

  
    public int cuenta(B objeto) {
        int count = 0;
        for (B o : objetos) {
            if (o.equals(objeto)) count++;
        }
        return count;
    }

   
    public boolean contiene(B objeto) {
        return objetos.contains(objeto);
    }

  
    public ArrayList<B> obtenObjetos() {
        return new ArrayList<>(objetos); 
    } 
}
