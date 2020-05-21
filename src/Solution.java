import org.omg.CORBA.INTERNAL;

import java.util.ArrayList;
import java.util.Random;

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> listaNomes = new ArrayList<>();
        listaNomes.add("Rafael");
        listaNomes.add("Pedro");
        listaNomes.add("Joao");
        listaNomes.add("Paulo");
        listaNomes.add("Lucas");
        listaNomes.add("Matheus");

        ArrayList<Integer> listaIdade = new ArrayList<>();
        insereIdadeAleatoria(listaIdade);

        System.out.println("Lista desordenada:");
        System.out.println("Nome e idade: " + listaNomes + listaIdade);

        ordenaLista(listaNomes, listaIdade);

        System.out.println("Lista ordenada:");
        System.out.println("Nome e idade: " + listaNomes + listaIdade);
        System.out.println("-----------------------------------------------------------------------------");

        ArrayList<Integer> listaQuantidadeCarac = new ArrayList<>();
        for(int i = 0; i < 6; i++){
            listaQuantidadeCarac.add(listaNomes.get(i).length());
        }

        System.out.println("Lista desordenada:");
        System.out.println("Nome e quantidade caracteres: " + listaNomes + listaQuantidadeCarac);

        ordenaLista(listaNomes, listaQuantidadeCarac);

        System.out.println("Lista ordenada:");
        System.out.println("Nome e quantidade caracteres: " + listaNomes + listaQuantidadeCarac);
    }

    static void insereIdadeAleatoria(ArrayList<Integer> lista){
        Random random = new Random();
        int idadeAleatoria;
        for(int i = 0; i < 6; i++){
            idadeAleatoria = random.nextInt(70);
            lista.add(idadeAleatoria);
        }
    }

    static void ordenaLista(ArrayList<String> lista1, ArrayList<Integer> lista2){
        int auxIdade = 0;
        String auxNome;
        for(int i = 0; i < 6; i++){
            for(int j = 0; j < 6; j++){
                if((lista2.get(i)).compareTo(lista2.get(j)) < 0) { //nao consegue comparar objetos normalmente. Se item da lista1 eh menor que item da lista2, retorna < 0
                    auxIdade = lista2.get(i); //recebe o conteudo do indice
                    lista2.set(i, lista2.get(j)); //altera no indice o conteudo
                    lista2.set(j, auxIdade);
                    auxNome = lista1.get(i);
                    lista1.set(i, lista1.get(j));
                    lista1.set(j, auxNome);
                }
            }
        }
    }
}
