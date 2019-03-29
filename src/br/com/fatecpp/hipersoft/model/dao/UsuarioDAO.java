package br.com.fatecpp.hipersoft.model.dao;

import br.com.fatecpp.hipersoft.model.domain.Usuario;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 * 
 * @author DiegoFrancisco
 */
public class UsuarioDAO implements DAOGenerico<Usuario>{
    
    private static UsuarioDAO unicaInstancia;
    private EntityManager em;
    
    private UsuarioDAO(){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("HiperSoftPU");
        if (em == null){
            em = emf.createEntityManager();
        }
    }
    
    public static UsuarioDAO getUnicaInstancia(){
        if(unicaInstancia == null){
            unicaInstancia = new UsuarioDAO();
        }
        return unicaInstancia;
    }

    @Override
    public void inserir(Usuario entidade) {
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
    public void alterar(Usuario entidade) {
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
    public void excluir(Usuario entidade) {
        em.getTransaction().begin();
        Usuario u = em.merge(entidade);
        em.remove(u);
        em.merge(entidade);
        em.getTransaction().commit();
    }

    @Override
    public List<Usuario> consultar(String opcao, String parametro) {
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
