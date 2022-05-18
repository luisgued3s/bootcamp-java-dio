/*

Aula 1 - Tipos de dados 

## TIPO BOOLEAN
 -> Só pode assumir valor true ou false.


## TIPO CHAR
-> Armazena dados alfanuméricos em notação Unicode 16bits.


## TIPO BYTE  
-> Tipo inteiro de 8bits que pode assumir valores entre -27=-128 e 27-1=127


## TIPO SHORT  
-> Tipo Inteiro de 16 bits que pode assumir valores entre -2-15=-32.768 a 215-1=32.767.


## TIPO INT  
-> Tipo Inteiro de 32 bits que pode assumir valores entre -231=2.147.483.648 e 231-1=2.147.483.647.


## TIPO LONG  
-> Tipo Inteiro de 64 bits que pode assumir valores entre -263 e 263-1.


## TIPO FLOAT  
-> Numeros de notação de ponto flutuante de 32 bits sendo o menor valor positivo represntável por esse tipo 1.40239846e-46 e o maior 3.40282347e+38.


## TIPO DOUBLE  
-> Numeros de notação de ponto flutuante de 64 bits sendo o menor valor positivo represntável por esse tipo 4.94065645841246544e-324 e o maior 1.7976931348623157e+308.



Exemplo:

*/

class Pratica1 {
    public static void main(String[] args) {
        String meuNome = "Luis Guedes";
        char inicialdoNome = 'L';
        int minhaIdade = 24;
        float saldoBancario = 0.001f;
        boolean emprego = true;

        System.out.println("Nome: " + meuNome);
        System.out.println("Inicial do nome: " + inicialdoNome);
        System.out.println("Idade: " + minhaIdade + " anos");
        System.out.println("Saldo em conta corrente: " + "R$ " + saldoBancario);
        System.out.println("Quero muito um estágio?: " + emprego);
    }
}