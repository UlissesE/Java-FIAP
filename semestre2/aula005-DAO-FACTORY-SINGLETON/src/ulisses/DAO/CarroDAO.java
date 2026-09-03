package ulisses.DAO;

import java.util.List;

public interface CarroDAO {

    public void salvar(Carro carro);
    public void atualizar(Carro carro);
    public void apagar(int id);
    public Carro obterPorId(int id);
    public List<Carro> listarTodos();

}
