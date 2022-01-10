import java.util.Arrays;

public class Producto {
    private int[][] matrizA;
    private int[][] matrizB;

    public void setMatrizA(int[][] matrizA){
        this.matrizA = matrizA;
    }

    public void setMatrizB(int[][] matrizB){
        this.matrizB = matrizB;
    }

    public int[][] getMatrizA(){
        return matrizA;
    }

    public int[][] getMatrizB(){
        return matrizB;
    }

    public Producto(){

    }

    public Producto(int[][] matrizA, int[][] matrizB){
        this.matrizA = matrizA;
        this.matrizB = matrizB;
    }

    public int[][] productoMatriz () throws Exception{

        int[][] matrizP = new int[matrizA.length][matrizB[0].length];

        if( matrizA[0].length == matrizB.length){ // condicion de producto

            for(int i = 0; i<matrizA.length;i++){ // Opercion producto
                for (int j = 0; j < matrizB[0].length; j++) {
                    int acu = 0;
                    for(int k=0;k<matrizA[0].length;k++){ // K --> Contador
                        acu+=matrizA[i][k]*matrizB[k][j];
                    }

                    matrizP[i][j] = acu;

                    //System.out.println(acu);
                }
            }

        }else{
            throw new Exception ("El matriz no cumple los requisitos.");
        }

        return matrizP;
    }

    public static void main(String[] args){
        
        int[][] matrizA = {{1,2},
                           {3,4},
                           {5,6}};

        int[][] matrizB = {{1,2,3},
                           {3,4,5}};

        int[][] resultado;

        Producto producto = new Producto(matrizA, matrizB);
        
        try {
            resultado = producto.productoMatriz();
            System.out.println("Producto de Matrices A * B");
            for(int [] v :resultado){
                System.out.println(Arrays.toString(v));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.exit(0);
    }

}
