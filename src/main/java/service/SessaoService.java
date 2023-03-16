package service;

import entity.Filme;
import entity.Genero;
import entity.Sala;
import entity.Sessao;
import repository.FilmeRepository;
import repository.GeneroRepository;
import repository.SalaRepository;
import repository.SessaoRepository;

import java.util.Scanner;

public class SessaoService {

    Scanner scanner = new Scanner(System.in);

    SessaoRepository sessaoRepository = new SessaoRepository();
    Sessao sessao = new Sessao();
    FilmeRepository filmeRepository;
    SalaRepository salaRepository;

    public void menu(){
        System.out.println("Escolha uma opção:");
        System.out.println("1 - criar um entity.Sessao");
        System.out.println("2 - listar os entity.Sessao");
        System.out.println("3 - updade em entity.Sessao");
        System.out.println("4 - deletar entity.Sessao");
        System.out.println("0 - Sair");
    }

    public void criarSessao(){
        filmeRepository.ler();

        System.out.println("Digite o numero do id do filme:");
        int numero = scanner.nextInt();

        salaRepository.ler();

        System.out.println("Digite o numero da sala:");
        int numero1 = scanner.nextInt();

        Sessao sessao = new Sessao();
        sessao.setFilme(filmeRepository.filmes.get(numero));
        sessao.setSala(salaRepository.salas.get(numero1));

        sessaoRepository.criar(sessao);
        System.out.println("sessao cadastrada com sucesso!");
    }

    public  void listarSessao(){
        sessaoRepository.ler();
    }

    public void atualizarSessao(){
        System.out.println("Digite o ID da sessao que deseja atualizar:");
        int id = scanner.nextInt();

        filmeRepository.ler();

        System.out.println("Digite o novo filme da sessao:");
        int numero = scanner.nextInt();

        salaRepository.ler();

        System.out.println("Digite a nova sala da sessao:");
        int numero1 = scanner.nextInt();

        sessao = new Sessao();
        sessao.setFilme(filmeRepository.filmes.get(numero));
        sessao.setSala(salaRepository.salas.get(numero1));

        sessaoRepository.atualizar(id, sessao);
        System.out.println("sala atualizado com sucesso!");
    }

    public void deletarSessao(){
        System.out.println("Digite o ID da sala que deseja excluir:");
        int id = scanner.nextInt();
        sessaoRepository.excluir(id);
        System.out.println("sala excluído com sucesso!");
    }

}
