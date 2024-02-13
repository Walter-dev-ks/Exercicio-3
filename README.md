
# Sistema de Notas Escolares

## Descrição
Este programa lê o nome de um aluno e suas notas nos três trimestres do ano, onde o primeiro trimestre vale 30 pontos e os dois últimos valem 35 cada. Em seguida, calcula a nota final do aluno no ano e determina se ele foi aprovado ou não. Se reprovado, informa quantos pontos faltam para o aluno obter o mínimo necessário para ser aprovado (60% da nota total). O programa utiliza a classe `Student` para resolver o problema.

## Exemplos

### Exemplo 1
#### Entrada
```
Alex Green
17.0
20.0
15.0
```
#### Saída
```
Nota final = 52.0
Reprovado
Faltam 8.0 pontos
```

### Exemplo 2
#### Entrada
```
Alex Green
27.0
31.0
32.0
```
#### Saída
```
Nota final = 90.0
Aprovado
```

## Código
```java
import Entities.Students;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Students student = new Students();

        System.out.println("Sistema de Notas Escolares\n");
        System.out.println("Insira o nome do aluno: ");
        student.name = sc.next();

        System.out.print("Digite a primeira nota: ");
        student.noteT1 = sc.nextDouble();

        System.out.print("Digite a segunda nota: ");
        student.noteT2 = sc.nextDouble();

        System.out.print("Digite a terceira nota: ");
        student.noteT3 = sc.nextDouble();

        System.out.println(student.resultPass());

        sc.close();
    }
}

package Entities;

public class Students {
    public String name;
    public double noteT1;
    public double noteT2;
    public double noteT3;
    public String result;

    public String resultPass(){
        double r = this.noteT1 + this.noteT2 + this.noteT3 ;

        if(r >= 60){
            this.result = "Nota final: " + r + "\nAluno " + this.name + " aprovado!!";
            return this.result;
        }   else {
            double failed = 60 - r;
            this.result = "Nota final: " + r + "\nAluno " + this.name + " reprovado!" + "\nFaltam " + failed + " pontos para passar";
            return this.result;
        }
    }
}
```

## Execução
Para executar o programa, compile e execute o arquivo `Main.java`.

## Autor
Este programa foi escrito por @_walter_ks_ utilizando a linguagem de programação Java.

Espero que isso te ajude! Se precisar de mais alguma coisa, estou por aqui.
