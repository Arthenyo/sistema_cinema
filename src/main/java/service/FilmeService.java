package service;

import entity.Filme;
import entity.Genero;
import repository.FilmeRepository;
import repository.GeneroRepository;

import java.util.Scanner;

public class FilmeService {

    Scanner scanner = new Scanner(System.in);

    FilmeRepository filmeRepository = new FilmeRepository();
    GeneroRepository generoRepository;
    Filme filme = new Filme();

    public void menu(){
        System.out.println("Escolha uma opção:");
        System.out.println("1 - criar um filme");
        System.out.println("2 - listar os filmes");
        System.out.println("3 - updade em filmes");
        System.out.println("4 - deletar filmes");
        System.out.println("0 - Sair");
    }

    public void criarFilme(){
        System.out.println("Digite o nome do filmes:");
        String nome = scanner.next();
        generoRepository.ler();
        System.out.println("Digite o id do genero: ");
        int id = scanner.nextInt();
        filme = new Filme();
        filme.setNome(nome);
        filme.setGeneros(generoRepository.generos.get(id));
        filmeRepository.criar(filme);
        System.out.println("filme cadastrado com sucesso!");
    }

    public  void listarFilme(){
        filmeRepository.ler();
    }

    public void atualizarFilme(){
        System.out.println("Digite o ID do filme que deseja atualizar:");
        int id = scanner.nextInt();

        System.out.println("Digite o novo nome do filme:");
        String nome = scanner.next();

        filme = new Filme();
        filme.setNome(nome);

        filmeRepository.atualizar(id,filme);
        System.out.println("filme atualizado com sucesso!");
    }
    public void deletarFilme(){
        System.out.println("Digite o ID do filme que deseja excluir:");
        int id = scanner.nextInt();
        filmeRepository.excluir(id);
        System.out.println("filme excluído com sucesso!");
    }

    public Filme dao(int id){
        return filmeRepository.filmes.get(id);
    }

}
