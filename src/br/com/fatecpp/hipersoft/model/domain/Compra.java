package br.com.fatecpp.hipersoft.model.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author DiegoFrancisco
 */
@Entity
@Table(name = "compra")
@NamedQueries({
    @NamedQuery(name = "Compra.findAll", query = "SELECT c FROM Compra c")
    , @NamedQuery(name = "Compra.findByCodCom", query = "SELECT c FROM Compra c WHERE c.codCom = :codCom")
    , @NamedQuery(name = "Compra.findByFornecedorCodFor", query = "SELECT c FROM Compra c WHERE c.fornecedorCodFor = :fornecedorCodFor")
    , @NamedQuery(name = "Compra.findByTpPag", query = "SELECT c FROM Compra c WHERE c.tpPag = :tpPag")
    , @NamedQuery(name = "Compra.findByDataCom", query = "SELECT c FROM Compra c WHERE c.dataCom = :dataCom")
    , @NamedQuery(name = "Compra.findByNumNota", query = "SELECT c FROM Compra c WHERE c.numNota = :numNota")
    , @NamedQuery(name = "Compra.findByTotalCom", query = "SELECT c FROM Compra c WHERE c.totalCom = :totalCom")
    , @NamedQuery(name = "Compra.findByParcCom", query = "SELECT c FROM Compra c WHERE c.parcCom = :parcCom")})
public class Compra implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "cod_com")
    private Integer codCom;
    @Basic(optional = false)
    @Column(name = "fornecedor_cod_for")
    private int fornecedorCodFor;
    @Column(name = "tp_pag")
    private String tpPag;
    @Column(name = "data_com")
    @Temporal(TemporalType.DATE)
    private Date dataCom;
    @Column(name = "num_nota")
    private Integer numNota;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "total_com")
    private BigDecimal totalCom;
    @Column(name = "parc_com")
    private Integer parcCom;

    public Compra() {
    }

    public Compra(Integer codCom) {
        this.codCom = codCom;
    }

    public Compra(Integer codCom, int fornecedorCodFor) {
        this.codCom = codCom;
        this.fornecedorCodFor = fornecedorCodFor;
    }

    public Integer getCodCom() {
        return codCom;
    }

    public void setCodCom(Integer codCom) {
        this.codCom = codCom;
    }

    public int getFornecedorCodFor() {
        return fornecedorCodFor;
    }

    public void setFornecedorCodFor(int fornecedorCodFor) {
        this.fornecedorCodFor = fornecedorCodFor;
    }

    public String getTpPag() {
        return tpPag;
    }

    public void setTpPag(String tpPag) {
        this.tpPag = tpPag;
    }

    public Date getDataCom() {
        return dataCom;
    }

    public void setDataCom(Date dataCom) {
        this.dataCom = dataCom;
    }

    public Integer getNumNota() {
        return numNota;
    }

    public void setNumNota(Integer numNota) {
        this.numNota = numNota;
    }

    public BigDecimal getTotalCom() {
        return totalCom;
    }

    public void setTotalCom(BigDecimal totalCom) {
        this.totalCom = totalCom;
    }

    public Integer getParcCom() {
        return parcCom;
    }

    public void setParcCom(Integer parcCom) {
        this.parcCom = parcCom;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codCom != null ? codCom.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Compra)) {
            return false;
        }
        Compra other = (Compra) object;
        if ((this.codCom == null && other.codCom != null) || (this.codCom != null && !this.codCom.equals(other.codCom))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.fatecpp.model.domain.Compra[ codCom=" + codCom + " ]";
    }
    
}
