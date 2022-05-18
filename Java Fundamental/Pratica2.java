/* 

CASTING 
-> É a transformação de uma variável menos específico para um tipo mais esecífico ou vice versa.

## TIPOS
UPCAST -> Faz a promoção de um tipo de menor capacidade de armazenamento para maior, é implícito porque não precisa declarar o tipo de varíariavel.
DOWNCAST -> Faz o rebaixamento de um tipo de maior capacidade de armazenamento para menor, é explícita porque obrigatoriamente precisa ser declarado o tipo de variável.

Exemplos:
*/
class Pratica3 
{
    public static void main(String[] args) 
    {

    int contaBancaria = 100;
    long novaContaBancaria;
    novaContaBancaria = contaBancaria;

    System.out.println(novaContaBancaria);

    long dividaDeFuncionarios = 50000;
    int novaDividaDeFuncionarios;
    novaDividaDeFuncionarios = (int) dividaDeFuncionarios;

    System.out.println (novaDividaDeFuncionarios);

    }
}