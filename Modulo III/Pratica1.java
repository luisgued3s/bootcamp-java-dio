import javax.print.event.PrintEvent;

// #1 Tipos de dados - Criar variáveis para cada tipo de dado.

class Aula1 
{
    public static void main(String[] args) 
    {
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