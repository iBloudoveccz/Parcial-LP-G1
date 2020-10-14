/*
Carlos Gabriel Rios Caro
3.- Escriba un programa que llene la diagonal principal de la matriz con números impares de 1,3,5,7,….N.
*/
import java.util.*;
public class P_G2_Ej_3{
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
      
      //cambiar diagonal principal
      int c=1;
      for ( int i=1; i <=n; i++ ){
         for ( int j=1; j <=n; j++ ){
            if (i==j){
               mat[i][j]=c;
               c=c+2;
            }
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