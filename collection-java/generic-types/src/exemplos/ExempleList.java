package exemplos;

import java.util.ArrayList;
import java.util.List;

public class ExempleList {
    public static void main(String[] args) {
        //exemplo sem generics
        List listaSemGenerics = new ArrayList();

        listaSemGenerics.add(100);
        listaSemGenerics.add("elemento1"); // Permite adicionar qualquer tipo de objeto
    
        //exemplo com generics
        List<String> listaGenerics = new ArrayList<>();
        listaGenerics.add("Elemento 1");
        listaGenerics.add("Elemento 2");

        // iterando sobre a lista com generics
        for (String elemento : listaGenerics) {
            System.out.println(elemento);
        }

        // iterando sobre a lista sem generics (necessario fazer cast)
        for(Object elementos : listaSemGenerics){
            String str = (String) elementos;
            System.out.println(str);
        }
    }
}   
