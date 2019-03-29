package br.com.fatecpp.hipersoft.model.dao;

import br.com.fatecpp.hipersoft.model.domain.Produto;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 * 
 * @author DiegoFrancisco
 */
public class ProdutoDAO implements DAOGenerico<Produto>{

    private static ProdutoDAO unicaInstancia;
    private EntityManager em;
    
    private ProdutoDAO(){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("HiperSoftPU");
        if (em == null){
            em = emf.createEntityManager();
        }
    }
    
    public static ProdutoDAO getUnicaInstancia(){
        if(unicaInstancia == null){
            unicaInstancia = new ProdutoDAO();
        }
        return unicaInstancia;
    }

    @Override
    public void inserir(Produto entidade) {
        try {
            em.getTransaction().begin();
            em.persist(entidade);
            em.getTransaction().commit();
        } catch(Exception ex) {
            System.out.println(ex.getMessage());
            em.getTransaction().rollback();
        }
    }

    @Override
    public void alterar(Produto entidade) {
        try {
            em.getTransaction().begin();
            em.merge(entidade);
            em.getTransaction().commit();
        } catch(Exception ex) {
            System.out.println(ex.getMessage());
            em.getTransaction().rollback();
        }
    }

    @Override
    public void excluir(Produto entidade) {
        em.getTransaction().begin();
        Produto p = em.merge(entidade);
        em.remove(p);
        em.merge(entidade);
        em.getTransaction().commit();
    }

    @Override
    public List<Produto> consultar(String opcao, String parametro) {
         Query q = null;
        if (opcao.equals("consultarTodos")) {
            q = em.createNamedQuery("Cliente.findAll");
        } else if (opcao.equals("consultarPorId")) {
            q = em.createNamedQuery("Cliente.findByIdCliente");
            q.setParameter("idCliente", Integer.parseInt(parametro));
        } else if (opcao.equals("consultarPorNome")) {
            q = em.createNamedQuery("Cliente.findByNome");
            q.setParameter("nome", "%" + parametro + "%");
        } else if (opcao.equals("consultarPorEmail")) {
            q = em.createNamedQuery("Cliente.findByEmail");
            q.setParameter("email", "%" + parametro + "%");
        }
        return q.getResultList();
    }
}
