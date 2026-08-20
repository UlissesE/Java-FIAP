package ulisses.eduardo;

import ulisses.eduardo.repository.PessoaRepository;
import ulisses.eduardo.service.PessoaService;

import java.util.Scanner;

public class Main {

    static void main() {
        Scanner scanner = new Scanner(System.in);

        PessoaRepository repository = new PessoaRepository();
        PessoaService service = new PessoaService(repository);

        System.out.println("\n════════════════════════════════════════");
        System.out.println("     SISTEMA DE CADASTRO DE CLIENTES    ");
        System.out.println("════════════════════════════════════════\n");

        System.out.println();

        exibirMenuPrincipal();


    }

    private static void exibirMenuPrincipal() {
        System.out.println("\n┌─────────────────────────────────┐");
        System.out.println("│         MENU PRINCIPAL           │");
        System.out.println("├─────────────────────────────────┤");
        System.out.println("│  1. Cadastrar Aluno             │");
        System.out.println("│  2. Cadastrar Professor         │");
        System.out.println("│  3. Listar todos os clientes     │");
        System.out.println("│  0. Sair e salvar                │");
        System.out.println("└─────────────────────────────────┘");
    }

}