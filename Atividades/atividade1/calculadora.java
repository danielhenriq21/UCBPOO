package Atividades.atividade1;

public class calculadora {

    int numA;
    int numB;
    int n;

    int somar(){
        return numA + numB;
    }

    int subtrair(){
        return numA - numB;
    }

    int multiplicar(){
        return numA * numB;
    }

    double dividir(){
        return (double) numA / numB;
    }

    boolean verificarNumeroPrimo(int n){
        if(n <= 1){ // Verifica se o número(n) é igual ou menor que 1

            return false;
        }

        if((n != 2) && (n % 2 == 0)){ // Verifica se N é DIFERENTE de 2 ou se AO DIVIDIR por 2 o RESTO(%) é 0
            return false;
        }

        for(int i = 3; i < n; i += 2){
            if(n % i == 0){
            return false;
            }
        }

        return true;
    }
}
