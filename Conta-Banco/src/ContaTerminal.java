import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        // criando o Scanner
        Scanner scanner = new Scanner(System.in);

        // colhendo dados
        System.out.println("Digite seu nome");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome");
        String sobrenome = scanner.next();

        System.out.println("Digite sua agência com dígito");
        String agencia = scanner.next();       
      
        System.out.println("Digite sua conta");
        int conta = scanner.nextInt();
        
        double saldoInicial = 199.99;

        System.out.println("Olá, " + nome +" "+ sobrenome +". Obrigado por criar uma conta em nosso banco. Sua agência é "
         + agencia +", conta "+conta+" e seu saldo R$"+ saldoInicial +" já está disponível para saque.");
    }         
}