package service;

import entity.Genero;
import entity.Sala;
import repository.GeneroRepository;
import repository.SalaRepository;

import java.util.Scanner;

public class SalaService {

    Scanner scanner = new Scanner(System.in);

    SalaRepository salaRepository = new SalaRepository();
    Sala sala = new Sala();

    public void menu(){
        System.out.println("Escolha uma opção:");
        System.out.println("1 - criar um sala");
        System.out.println("2 - listar os sala");
        System.out.println("3 - updade em sala");
        System.out.println("4 - deletar sala");
        System.out.println("0 - Sair");
    }

    public void criarSala(){
        System.out.println("Digite o numero da sala:");
        int nome = scanner.nextInt();

        sala = new Sala();
        sala.setNumeroSala(nome);

        salaRepository.criar(sala);
        System.out.println("sala cadastrada com sucesso!");
    }

    public  void listarSala(){
        salaRepository.ler();
    }

    public void atualizarSala(){
        System.out.println("Digite o ID da sala que deseja atualizar:");
        int id = scanner.nextInt();

        System.out.println("Digite o novo numero da sala:");
        int nome = scanner.nextInt();

        sala = new Sala();
        sala.setNumeroSala(nome);

        salaRepository.atualizar(id,sala);
        System.out.println("sala atualizada com sucesso!");
    }
    public void deletarSala(){
        System.out.println("Digite o ID da sala que deseja excluir:");
        int id = scanner.nextInt();
        salaRepository.excluir(id);
        System.out.println("sala excluída com sucesso!");
    }

    public Sala dao(int id){
        return salaRepository.salas.get(id);
    }

}
