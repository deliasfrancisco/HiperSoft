package br.com.fatecpp.hipersoft.model.domain;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author DiegoFrancisco
 */
@Entity
@Table(name = "usuario")
@NamedQueries({
    @NamedQuery(name = "Usuario_1.findAll", query = "SELECT u FROM Usuario_1 u")
    , @NamedQuery(name = "Usuario_1.findByUsuCod", query = "SELECT u FROM Usuario_1 u WHERE u.usuCod = :usuCod")
    , @NamedQuery(name = "Usuario_1.findByUsuNome", query = "SELECT u FROM Usuario_1 u WHERE u.usuNome = :usuNome")
    , @NamedQuery(name = "Usuario_1.findByUsuSenha", query = "SELECT u FROM Usuario_1 u WHERE u.usuSenha = :usuSenha")})
public class Usuario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "usu_cod")
    private Integer usuCod;
    @Column(name = "usu_nome")
    private String usuNome;
    @Column(name = "usu_senha")
    private String usuSenha;

    public Usuario() {
    }
    
    public Usuario(String nome, String senha) {
        this.usuNome = nome;
        this.usuSenha = senha;
    }

    public Usuario(Integer usuCod) {
        this.usuCod = usuCod;
    }

    public Integer getUsuCod() {
        return usuCod;
    }

    public void setUsuCod(Integer usuCod) {
        this.usuCod = usuCod;
    }

    public String getUsuNome() {
        return usuNome;
    }

    public void setUsuNome(String usuNome) {
        this.usuNome = usuNome;
    }

    public String getUsuSenha() {
        return usuSenha;
    }

    public void setUsuSenha(String usuSenha) {
        this.usuSenha = usuSenha;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (usuCod != null ? usuCod.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usuario)) {
            return false;
        }
        Usuario other = (Usuario) object;
        if ((this.usuCod == null && other.usuCod != null) || (this.usuCod != null && !this.usuCod.equals(other.usuCod))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.fatecpp.model.domain.Usuario_1[ usuCod=" + usuCod + " ]";
    }
    
}
