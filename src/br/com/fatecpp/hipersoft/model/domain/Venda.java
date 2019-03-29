package br.com.fatecpp.hipersoft.model.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
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
@Table(name = "venda")
@NamedQueries({
    @NamedQuery(name = "Venda.findAll", query = "SELECT v FROM Venda v")
    , @NamedQuery(name = "Venda.findByVendaCod", query = "SELECT v FROM Venda v WHERE v.vendaCod = :vendaCod")
    , @NamedQuery(name = "Venda.findByCaixaCxCod", query = "SELECT v FROM Venda v WHERE v.caixaCxCod = :caixaCxCod")
    , @NamedQuery(name = "Venda.findByCodCli", query = "SELECT v FROM Venda v WHERE v.codCli = :codCli")
    , @NamedQuery(name = "Venda.findByVenTotal", query = "SELECT v FROM Venda v WHERE v.venTotal = :venTotal")
    , @NamedQuery(name = "Venda.findByDataVen", query = "SELECT v FROM Venda v WHERE v.dataVen = :dataVen")
    , @NamedQuery(name = "Venda.findByCxCod", query = "SELECT v FROM Venda v WHERE v.cxCod = :cxCod")})
public class Venda implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "venda_cod")
    private Integer vendaCod;
    @Basic(optional = false)
    @Column(name = "caixa_cx_cod")
    private int caixaCxCod;
    @Basic(optional = false)
    @Column(name = "cod_cli")
    private int codCli;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "ven_total")
    private BigDecimal venTotal;
    @Column(name = "data_ven")
    @Temporal(TemporalType.DATE)
    private Date dataVen;
    @Column(name = "cx_cod")
    private Integer cxCod;

    public Venda() {
    }

    public Venda(Integer vendaCod) {
        this.vendaCod = vendaCod;
    }

    public Venda(Integer vendaCod, int caixaCxCod, int codCli) {
        this.vendaCod = vendaCod;
        this.caixaCxCod = caixaCxCod;
        this.codCli = codCli;
    }

    public Integer getVendaCod() {
        return vendaCod;
    }

    public void setVendaCod(Integer vendaCod) {
        this.vendaCod = vendaCod;
    }

    public int getCaixaCxCod() {
        return caixaCxCod;
    }

    public void setCaixaCxCod(int caixaCxCod) {
        this.caixaCxCod = caixaCxCod;
    }

    public int getCodCli() {
        return codCli;
    }

    public void setCodCli(int codCli) {
        this.codCli = codCli;
    }

    public BigDecimal getVenTotal() {
        return venTotal;
    }

    public void setVenTotal(BigDecimal venTotal) {
        this.venTotal = venTotal;
    }

    public Date getDataVen() {
        return dataVen;
    }

    public void setDataVen(Date dataVen) {
        this.dataVen = dataVen;
    }

    public Integer getCxCod() {
        return cxCod;
    }

    public void setCxCod(Integer cxCod) {
        this.cxCod = cxCod;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (vendaCod != null ? vendaCod.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Venda)) {
            return false;
        }
        Venda other = (Venda) object;
        if ((this.vendaCod == null && other.vendaCod != null) || (this.vendaCod != null && !this.vendaCod.equals(other.vendaCod))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.fatecpp.model.domain.Venda[ vendaCod=" + vendaCod + " ]";
    }
    
}
