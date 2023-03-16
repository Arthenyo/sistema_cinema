package repository;

import entity.Sala;

import java.util.ArrayList;
import java.util.List;

public class SalaRepository {

    public List<Sala> salas = new ArrayList<>();

    public void criar(Sala sala) {
        salas.add(sala);
    }

    public List<Sala> ler() {
        for (Sala g: salas) {
            System.out.println(g);
        }
        return salas;
    }

    public void atualizar(int id, Sala sala) {
        salas.set(id, sala);
    }

    public void excluir(int id) {
        salas.remove(id);
    }

}
