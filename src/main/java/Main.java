import entity.Filme;
import entity.Genero;
import entity.Sala;
import entity.Sessao;
import repository.FilmeRepository;
import repository.GeneroRepository;
import repository.SalaRepository;
import repository.SessaoRepository;
import service.FilmeService;
import service.GeneroService;
import service.SalaService;
import service.SessaoService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GeneroService generoService = new GeneroService();
        FilmeService filmeService = new FilmeService();
        SalaService salaService = new SalaService();
        SessaoService sessaoService = new SessaoService();

        int opcao = 0;
        do {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - CRUD genero");
            System.out.println("2 - CRUD filme");
            System.out.println("3 - CRUD sala");
            System.out.println("4 - CRUD sessao");
            System.out.println("0 - Sair");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    generoService.menu();
                    opcao = scanner.nextInt();

                    switch (opcao) {
                        case 1:
                            generoService.criarGenero();
                            break;
                        case 2:
                            generoService.listarGenero();
                            break;
                        case 3:
                            generoService.atualizarGenero();
                            break;
                        case 4:
                            generoService.deletarGenero();
                            break;
                        case 0:
                            System.out.println("Voltando ao menu principal...");
                            break;
                        default:
                            System.out.println("Opção inválida!");
                    }
                    break;
                case 2:
                    filmeService.menu();
                    opcao = scanner.nextInt();

                    switch (opcao) {
                        case 1:
                            filmeService.criarFilme();
                            break;
                        case 2:
                            filmeService.listarFilme();
                            break;
                        case 3:
                            filmeService.atualizarFilme();
                            break;
                        case 4:
                            filmeService.deletarFilme();
                            break;
                        case 0:
                            System.out.println("Voltando ao menu principal...");
                            break;
                        default:
                            System.out.println("Opção inválida!");
                    }

                    break;
                case 3:
                    salaService.menu();
                    opcao = scanner.nextInt();

                    switch (opcao) {
                        case 1:
                            salaService.criarSala();
                            break;
                        case 2:
                            salaService.listarSala();
                            break;
                        case 3:
                            salaService.atualizarSala();
                            break;
                        case 4:
                            salaService.deletarSala();
                            break;
                        case 0:
                            System.out.println("Voltando ao menu principal...");
                            break;
                        default:
                            System.out.println("Opção inválida!");
                    }
                    break;
                case 4:

                    sessaoService.menu();
                    opcao = scanner.nextInt();

                    switch (opcao) {
                        case 1:
                            sessaoService.criarSessao();
                            break;
                        case 2:
                            sessaoService.listarSessao();
                            break;
                        case 3:
                            sessaoService.atualizarSessao();
                            break;
                        case 4:
                            sessaoService.deletarSessao();
                            break;
                        case 0:
                            System.out.println("Voltando ao menu principal...");
                            break;
                        default:
                            System.out.println("Opção inválida!");
                    }
                    break;
                case 0:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        scanner.close();
    }
}
