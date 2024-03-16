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

// git config --global user.name NomeUsuarioGit
// git config --global user.email EmailUsuarioGit

