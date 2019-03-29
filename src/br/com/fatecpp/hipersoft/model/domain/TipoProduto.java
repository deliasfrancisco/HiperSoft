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
@Table(name = "tipo_produto")
@NamedQueries({
    @NamedQuery(name = "TipoProduto_1.findAll", query = "SELECT t FROM TipoProduto_1 t")
    , @NamedQuery(name = "TipoProduto_1.findById", query = "SELECT t FROM TipoProduto_1 t WHERE t.id = :id")
    , @NamedQuery(name = "TipoProduto_1.findByDescricao", query = "SELECT t FROM TipoProduto_1 t WHERE t.descricao = :descricao")})
public class TipoProduto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "descricao")
    private String descricao;

    public TipoProduto() {
    }

    public TipoProduto(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoProduto)) {
            return false;
        }
        TipoProduto other = (TipoProduto) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.fatecpp.model.domain.TipoProduto_1[ id=" + id + " ]";
    }
    
}
