package repository;

import entity.Filme;
import entity.Sala;

import java.util.ArrayList;
import java.util.List;

public class SalaRepository implements DaoRepository<Sala>{

    public List<Sala> salas = new ArrayList<>();


    @Override
    public void criar(Sala object) {
        salas.add(object);
    }

    @Override
    public List<Sala> ler() {
        for (Sala g: salas) {
            System.out.println(g);
        }
        return salas;
    }

    @Override
    public void atualizar(int id, Sala object) {
        salas.set(id, object);
    }

    @Override
    public void deletar(int id) {
        salas.remove(id);
    }
}
