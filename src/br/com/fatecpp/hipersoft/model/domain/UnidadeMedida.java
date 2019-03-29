package br.com.fatecpp.hipersoft.model.domain;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author DiegoFrancisco
 */
@Entity
@Table(name = "unidade_medida")
@NamedQueries({
    @NamedQuery(name = "UnidadeMedida.findAll", query = "SELECT u FROM UnidadeMedida u")
    , @NamedQuery(name = "UnidadeMedida.findByCodUniMed", query = "SELECT u FROM UnidadeMedida u WHERE u.codUniMed = :codUniMed")
    , @NamedQuery(name = "UnidadeMedida.findByUniNome", query = "SELECT u FROM UnidadeMedida u WHERE u.uniNome = :uniNome")})
public class UnidadeMedida implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "cod_uni_med")
    private Integer codUniMed;
    @Column(name = "uni_nome")
    private String uniNome;

    public UnidadeMedida() {
    }

    public UnidadeMedida(Integer codUniMed) {
        this.codUniMed = codUniMed;
    }

    public Integer getCodUniMed() {
        return codUniMed;
    }

    public void setCodUniMed(Integer codUniMed) {
        this.codUniMed = codUniMed;
    }

    public String getUniNome() {
        return uniNome;
    }

    public void setUniNome(String uniNome) {
        this.uniNome = uniNome;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codUniMed != null ? codUniMed.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UnidadeMedida)) {
            return false;
        }
        UnidadeMedida other = (UnidadeMedida) object;
        if ((this.codUniMed == null && other.codUniMed != null) || (this.codUniMed != null && !this.codUniMed.equals(other.codUniMed))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.fatecpp.model.domain.UnidadeMedida[ codUniMed=" + codUniMed + " ]";
    }
    
}
