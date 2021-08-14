package com.company;

import java.util.Scanner;

public class Main {

    public static void test1(){
        int numbers[] = {1,3,4,2,7,0};

        loopTwoNumbers:
        for(int i=0; i<numbers.length; i++){
            for(int j=0; j<numbers.length; j++){
                if(numbers[i]+numbers[j]==10){
                    System.out.println(numbers[i]+" "+numbers[j]);
                    break loopTwoNumbers;
                }
            }
        }
    }

    public static void test2(){
        int myArray[]={15,27,344,67,67,12,344};
        int aux=0;

        for(int i=0; i<myArray.length; i++){

            aux=(myArray[i]>aux) ? myArray[i] : aux;

        }
        System.out.println(aux);
    }

    public static void cuadrado(){
        Scanner teclado = new Scanner(System.in);

        System.out.print("Por favor ingrese el tamaño del cuadrado: ");
        int n = teclado.nextInt();

        if(n >= 0 && n<=50) {
            //Linea superior
            for(int i = 0; i < n; i++) {
                System.out.print("*");
            }
            System.out.println();

            //centro de la forma
            for(int i = 0; i < n-2; i++) {
                System.out.print("*");
                for(int j = 0; j < n-2; j++) {
                    System.out.print(" ");
                }
                System.out.println("*");
            }

            //Linea inferior
            for(int i = 0; i < n; i++) {
                System.out.print("*");
            }
        }else {
            System.out.println("Error. El dato a ingresar de "
                    + "estar entre 0 y 50");
        }

    }

    public static void main(String[] args) {
        int n=5;
       for(int i=0;i<n*n;i++){
           if(i%5==0 && i!=0){
               System.out.println();
           }
           if(i%2==0){
               System.out.print("X");
           }else{
               System.out.print("_");
           }

       }
    }

}



