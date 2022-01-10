import java.util.Arrays;

public class Suma {
    private int[][] matrizA;
    private int[][] matrizB;

    public Suma(){

    }

    public Suma (int[][] matrizA, int[][] matrizB){
        this.matrizA = matrizA;
        this.matrizB = matrizB;
    }

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

    public int[][] sumaMatriz () throws Exception{

        int[][] mResult = new int[matrizA.length][matrizA[0].length];

        if(matrizA.length == matrizB.length && matrizA[0].length == matrizB[0].length){

            for(int i = 0; i<matrizA.length;i++){
                for (int j = 0; j < matrizA[i].length; j++) {
                mResult[i][j] = matrizA[i][j] + matrizB[i][j];
                }
            }

        }else{
            throw new Exception ("El tamaño de las matrices no son iguales.");
        }

        return mResult;
    }

    public static void main(String[] args){
        int[][] matrizA = {{2,1,4},
                           {3,2,3},
                           {1,2,4}};

        int[][] matrizB = {{2,1,4},
                           {6,5,3},
                           {3,1,2}};

        int[][] resultado;

        Suma suma = new Suma(matrizA, matrizB);
        
        try {
            resultado = suma.sumaMatriz();
            System.out.println("Suma de Matriz A + B");
            for(int [] v :resultado){
                System.out.println(Arrays.toString(v));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.exit(0);
    }
}

