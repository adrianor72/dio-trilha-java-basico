import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        String nomeCliente;
        String agencia;
        int conta = 1021;
        Double saldo;
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o seu nome: ");
        nomeCliente = scanner.next();
        System.out.println("Usuário: " + conta);
        
        System.out.println("Agencia numero: ");
        agencia = scanner.next();
        System.out.println("Saldo valor: ");
        saldo = scanner.nextDouble();
        
           
        System.out.println( "Olá " + nomeCliente.concat(" ") + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia.concat(" ") +  "conta " + conta + " e seu saldo " + saldo + " já está disponível para saque.");
         
    }
}
