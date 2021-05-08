import br.com.challenges.arrayschallenge1.Contact;
import br.com.challenges.arrayschallenge1.MobilePhone;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class ChallengeApplication {

    private static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) throws Exception {
        System.out.println("Iniciando telefone....");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("**************");
        System.out.println("Telefone iniciado");
        System.out.println("**************");
        MobilePhone mobilePhone = new MobilePhone();
        Contact contact;
        String nome, telefone;
        loop: while (true) {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Adicionar Contato");
            System.out.println("2 - Procurar Contato");
            System.out.println("3 - Alterar Contato");
            System.out.println("4 - Remover Contato");
            System.out.println("5 - Sair");
            String opcao = scanner.nextLine();
            switch (opcao) {
                case "1":
                    System.out.println("Digite o nome do contato: ");
                    nome = scanner.nextLine();
                    System.out.println("Digite o numero de telefone");
                    telefone = scanner.nextLine();
                    contact = new Contact(nome, telefone);
                    mobilePhone.adicionarContato(contact);
                    break;
                case "2":
                    System.out.println("Digite o nome do contato: ");
                    nome = scanner.nextLine();
                    contact = mobilePhone.obterContatoPorNome(nome);
                    if (contact != null) {
                        System.out.println("Contato encontrado. Telefone: " + contact.getPhoneNumber());
                    }
                    break;
                case "3":
                    System.out.println("Digite o nome do contato para altear: ");
                    nome = scanner.nextLine();
                    contact = mobilePhone.obterContatoPorNome(nome);
                    if (contact == null) {
                        System.out.println("Contato não encontrado");
                        break;
                    }
                    System.out.println("Digite um novo numero e telefone: ");
                    nome = scanner.nextLine();
                    telefone = scanner.nextLine();
                    contact.setName(nome);
                    contact.setPhoneNumber(telefone);
                    System.out.println("Contato alterado com sucesso para: ");
                    System.out.println("Nome: " + contact.getName());
                    System.out.println("Telefone: " + contact.getPhoneNumber());
                    break;
                case "4":
                    System.out.println("Digite o nome do contato para excluir: ");
                    nome = scanner.nextLine();
                    if (mobilePhone.removerContatoPorNome(nome)) {
                        System.out.println("Contato excluido com sucesso!");
                    } else {
                        System.out.println("Contato nao encontrado.");
                    }
                    break;
                case "5":
                    System.out.println("Thau!!");
                    break loop;
                default:
                    System.out.println("Opção inválida");
            }
        }
    }
}
