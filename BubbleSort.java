public class BubbleSort {
    public static void main(String args[]) {

        int[] vetor = {3,6,8,1,4,9,0};
        //System.out.println(" ");
        System.out.print("Vetor não ordenado: ");
        mostrarVetor(vetor);

        System.out.println("");
        System.out.println("\nOrdenações: ");
        ordenarVetor(vetor);

        System.out.print("\nVetor ordenado por Bubble sort: ");
        mostrarVetor(vetor);
    }

    public static void ordenarVetor(int[] vetor) {

        for(int i = 0; i < vetor.length - 1; i++) {

            boolean estaOrdenado = true;

            for(int j = 0; j < vetor.length - 1 - i; j++) {
                if(vetor[j] > vetor[j + 1]) {
                    int aux = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = aux;
                    estaOrdenado = false;
                    mostrarVetor(vetor);
                    System.out.println("");
                }

            }

            if(estaOrdenado)
                break;
        }
    }

    public static void mostrarVetor(int[] vetor) {
        for(int num : vetor) {
            System.out.print(num + " ");
        }
    }
}
