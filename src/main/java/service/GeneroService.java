package service;

import entity.Genero;
import repository.GeneroRepository;

import java.util.Scanner;

public class GeneroService {

    Scanner scanner = new Scanner(System.in);

    GeneroRepository generoRepository = new GeneroRepository();
    Genero genero = new Genero();

    public void menu(){
        System.out.println("Escolha uma opção:");
        System.out.println("1 - criar um genero");
        System.out.println("2 - listar os genero");
        System.out.println("3 - updade em genero");
        System.out.println("4 - deletar genero");
        System.out.println("0 - Sair");
    }

    public void criarGenero(){
        System.out.println("Digite o nome do genero:");
        String nome = scanner.next();

        genero = new Genero();
        genero.setNomeGenero(nome);

        generoRepository.criar(genero);
        System.out.println("entity.Genero cadastrado com sucesso!");
    }

    public  void listarGenero(){
        generoRepository.ler();
    }

    public void atualizarGenero(){
        System.out.println("Digite o ID do genero que deseja atualizar:");
        int id = scanner.nextInt();

        System.out.println("Digite o novo nome do genero:");
        String nome = scanner.next();

        genero = new Genero();
        genero.setNomeGenero(nome);

        generoRepository.atualizar(id,genero);
        System.out.println("entity.Genero atualizado com sucesso!");
    }
    public void deletarGenero(){
        System.out.println("Digite o ID do genero que deseja excluir:");
        int id = scanner.nextInt();
        generoRepository.deletar(id);
        System.out.println("entity.Genero excluído com sucesso!");
    }

    public Genero dao(int id){
        return generoRepository.generos.get(id);
    }

}
