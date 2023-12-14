package ordenadores;
public class OrdenarQuick implements Ordenador{

    @Override
    public int[] ordene(int[] array) {

        return array;
    }

    public int quickParticio(int[] array, int inicio, int fim){
        int pivo= array[fim];
        int j= inicio-1;
        for(int i=inicio;i<fim;i++){
            if(array[i]<pivo){
                j++;
                int t=array[j];
                array[j]=array[i];
                array[i]=t;
            }
        }
    return j; 
    }
}

