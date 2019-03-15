/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cambiomatrices;

import java.util.Scanner;

/**
 *
 * @author 1DAM
 */
public class CambioMatrices {
    public static String imprimeMatriz(int[][]matriz){
        String matrizFin="";
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                matrizFin+=matriz[i][j]+" ";
            }
            matrizFin+="\n";
        }
        return matrizFin;
    }
    
    public static int[][] cambiaPos(int[][] matriz,int x1,int y1,int x2, int y2){
        int aux;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if((i==x1)&&(j==y1)){
                    aux=matriz[i][j];
                    matriz[i][j]=matriz[x2][y2];
                    matriz[x2][y2]=aux;
                }
            }
        }
        return matriz;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int[][] matriz= new int[3][3];
        
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                matriz[i][j]=0;
            }
        }
        matriz[1][2]=3;
        matriz[2][1]=9;
        System.out.println("Cambiar las posiciones de (1,2) y (2,1) :");
        System.out.println("Introduzca la coordenada X de la 1ra posicion: ");
        int x1=sca.nextInt();
        System.out.println("Introduzca la coordenada Y de la 1ra posicion: ");
        int y1=sca.nextInt();
        System.out.println("Introduzca la coordenada X de la 2da posicion: ");
        int x2=sca.nextInt();
        System.out.println("Introduzca la coordenada Y de la 2da posicion: ");
        int y2=sca.nextInt();
       
        
        System.out.println("Matriz incial: ");
        System.out.println(imprimeMatriz(matriz));
        
        System.out.println("Matriz cambiada: ");
        System.out.println(imprimeMatriz(cambiaPos(matriz,x1,y1,x2,y2)));
  
    }
    
}
