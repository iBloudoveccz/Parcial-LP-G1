/*
Carlos Gabriel Rios Caro
2.- Escriba un programa que ponga cero en la segunda  y penultima columna de la matriz.
*/
import java.util.*;
public class P_G2_Ej_2{
   public static void main(String[] args){
   
      int[][] mat=new int[100][100];
      int n;
      Scanner sc=new Scanner(System.in);
            
      System.out.println("numero de la matriz");
      n=sc.nextInt();
      
      for(int i = 1; i <= n; i++){
         System.out.println("ingresar fila #"+i);     
         for(int j = 1; j <= n; j++){
            mat[i][j]=sc.nextInt();
         }
      }
      System.out.println("");
      //mostrar matriz
      System.out.println("Matriz Original");
      for ( int i=1; i <=n; i++ ) {
         for ( int j=1; j <=n; j++ ){
            System.out.print(mat[i][j]+" ");
         }
         System.out.println("");
      }
      System.out.println("");
      
      //cambiar segunda Columna
      for ( int i=1; i <=n; i++ ){
         for ( int j=2; j <=2; j++ ){
            mat[i][j]=0;
         }
      }
      //cambiar penultima Columna
      for ( int i=1; i <=n; i++ ) {
         for ( int j=n-1; j <=n-1; j++ ){
            mat[i][j]=0;
         }
      }
      //mostrar cambio
      System.out.println("Matriz Cambiada");
      for ( int i=1; i <=n; i++ ) {
         for ( int j=1; j <=n; j++ ){
            System.out.print(mat[i][j]+" ");
         }
         System.out.println("");
      }
   }
}