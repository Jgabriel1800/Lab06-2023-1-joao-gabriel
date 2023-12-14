package ordenadores;
import java.util.Arrays;
public class OrdenarPorContagemSimples implements Ordenador {

    @Override
    public int[] ordene(int[] array) {
        if (array == null || array.length == 0) {
            return array; 
        }
        
        int tam = array.length;
        int[] valor = new int[tam];   
        int maximo = Arrays.stream(array).max().getAsInt();
        int[] contador = new int[maximo + 1];
        for (int i = 0; i < tam; i++) {
            contador[array[i]]++;
        }
        for (int i = 1; i <= maximo; i++) {
            contador[i] += contador[i - 1];
        }
        for (int i = tam - 1; i >= 0; i--) {
            valor[contador[array[i]] - 1] = array[i];
            contador[array[i]]--;
        }
        return valor;
    }
}

