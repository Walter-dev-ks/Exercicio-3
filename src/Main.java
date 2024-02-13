/*

    Fazer um programa para ler o nome de um aluno e as tres notas
    que ele obteve no três trimestres do ano(primeiro trimestre vale
    30 e o segundo e terceiro, avlem 35 cada). Ao final, mostrar qual a nota
    final do aluno no ano. Dizer também se o aluno está aprovado ou nã
    e, em caso de negativo, quantos pontos faltam para o aluno obter
    o minímo para ser aprovado ( 60% da nota ). Você deve criar a classe
    Student para resolver o problema

    * Exemplo

            Entrada:

                Alex Green
                17.0
                20.0
                15.0

            Saída:

                Nota final = 52.0
                Reprovado
                Faltam 8.0 pontos

            * Exemplo 2

                Entrada:

                Alex Green
                27.0
                31.0
                32.0

            Saída:

                Nota final = 90.0
                Aprovado

 */

import Entities.Students;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Students student = new Students();


        System.out.println("System notes school\n");
        System.out.println("Enter the student´s name: ");
        student.name = sc.next();

        System.out.print("Type the first note: ");
        student.noteT1 = sc.nextDouble();

        System.out.print("Type the second note: ");
        student.noteT2 = sc.nextDouble();

        System.out.print("Type the third note: ");
        student.noteT3 = sc.nextDouble();

        System.out.println(student.resultPass());


        sc.close();


    }
}