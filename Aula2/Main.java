package Aula2;

public class Main {
    public static void main(String[] args) { // Digitar Main

        Calculadora calc = new Calculadora(); // Chamada da classe Calculadora como objeto (classe Objeto = novo objeto)
        calc.numA = 2.0; // Definir valor numA
        calc.numB = 3.0; // Definir valor numB

        System.out.println("Somar: " + calc.numA + " + " + calc.numB + " = " + calc.somar()); // (string + chamadaDoObjeto.variavel()) 
        System.out.println("Subtrair: " + calc.numA + " - " + calc.numB + " = " + calc.subtrair()); // Digitar sistout 
        System.out.println("Multiplicar: " + calc.numA + " x " + calc.numB + " = " + calc.multiplicar());
        System.out.println("Dividir: " + calc.numA + " / " + calc.numB + " = " + calc.dividir());
    }
}

// Passo a Passo
// 1 - github: Criar repositório git
// 2 - cmd: git clone https://github.com/danielhenriq21/UCBPOO.git na pasta que desejar
// 3 - cmd: entrar na pasta 
// 4 - cmd: . code
// 5 - vscode: Criar pasta e arquivo .java

// git config --global user.name NomeUsuarioGit
// git config --global user.email EmailUsuarioGit

