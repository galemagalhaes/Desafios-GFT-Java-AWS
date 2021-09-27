/*Desafio
Você terá o desafio de ler um valor inteiro, que é o tempo de duração em segundos 
de um determinado evento em uma loja, e informe-o expresso no formato 
horas:minutos:segundos.

Entrada
O arquivo de entrada contém um valor inteiro N.

Saída
Imprima o tempo lido no arquivo de entrada (segundos), convertido para 
horas:minutos:segundos, conforme exemplo fornecido. */

//Solução
import java.util.Scanner;

public class Main {
    //complete os espaços em branco com sua solução
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sec;
        sec = input.nextInt();
       
        int hour = sec / 3600;
        //sec = sec-(hour);

        int min = sec / 60;
        //sec = sec-(min);
                
        sec = sec % 60;

        System.out.println(hour+":"+min+ ":"+sec);
    }
}