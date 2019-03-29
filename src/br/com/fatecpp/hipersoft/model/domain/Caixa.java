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
@Table(name = "caixa")
@NamedQueries({
    @NamedQuery(name = "Caixa.findAll", query = "SELECT c FROM Caixa c")
    , @NamedQuery(name = "Caixa.findByCxCod", query = "SELECT c FROM Caixa c WHERE c.cxCod = :cxCod")
    , @NamedQuery(name = "Caixa.findByCodUsu", query = "SELECT c FROM Caixa c WHERE c.codUsu = :codUsu")
    , @NamedQuery(name = "Caixa.findByUsuCod", query = "SELECT c FROM Caixa c WHERE c.usuCod = :usuCod")
    , @NamedQuery(name = "Caixa.findByCxSaldoIni", query = "SELECT c FROM Caixa c WHERE c.cxSaldoIni = :cxSaldoIni")
    , @NamedQuery(name = "Caixa.findByCxSaldoFim", query = "SELECT c FROM Caixa c WHERE c.cxSaldoFim = :cxSaldoFim")
    , @NamedQuery(name = "Caixa.findByCxAber", query = "SELECT c FROM Caixa c WHERE c.cxAber = :cxAber")
    , @NamedQuery(name = "Caixa.findByCxFecha", query = "SELECT c FROM Caixa c WHERE c.cxFecha = :cxFecha")})
public class Caixa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "cx_cod")
    private Integer cxCod;
    @Basic(optional = false)
    @Column(name = "cod_usu")
    private int codUsu;
    @Column(name = "usu_cod")
    private Integer usuCod;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "cx_saldo_ini")
    private BigDecimal cxSaldoIni;
    @Column(name = "cx_saldo_fim")
    private BigDecimal cxSaldoFim;
    @Column(name = "cx_aber")
    @Temporal(TemporalType.DATE)
    private Date cxAber;
    @Column(name = "cx_fecha")
    @Temporal(TemporalType.DATE)
    private Date cxFecha;

    public Caixa() {
    }

    public Caixa(Integer cxCod) {
        this.cxCod = cxCod;
    }

    public Caixa(Integer cxCod, int codUsu) {
        this.cxCod = cxCod;
        this.codUsu = codUsu;
    }

    public Integer getCxCod() {
        return cxCod;
    }

    public void setCxCod(Integer cxCod) {
        this.cxCod = cxCod;
    }

    public int getCodUsu() {
        return codUsu;
    }

    public void setCodUsu(int codUsu) {
        this.codUsu = codUsu;
    }

    public Integer getUsuCod() {
        return usuCod;
    }

    public void setUsuCod(Integer usuCod) {
        this.usuCod = usuCod;
    }

    public BigDecimal getCxSaldoIni() {
        return cxSaldoIni;
    }

    public void setCxSaldoIni(BigDecimal cxSaldoIni) {
        this.cxSaldoIni = cxSaldoIni;
    }

    public BigDecimal getCxSaldoFim() {
        return cxSaldoFim;
    }

    public void setCxSaldoFim(BigDecimal cxSaldoFim) {
        this.cxSaldoFim = cxSaldoFim;
    }

    public Date getCxAber() {
        return cxAber;
    }

    public void setCxAber(Date cxAber) {
        this.cxAber = cxAber;
    }

    public Date getCxFecha() {
        return cxFecha;
    }

    public void setCxFecha(Date cxFecha) {
        this.cxFecha = cxFecha;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cxCod != null ? cxCod.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Caixa)) {
            return false;
        }
        Caixa other = (Caixa) object;
        if ((this.cxCod == null && other.cxCod != null) || (this.cxCod != null && !this.cxCod.equals(other.cxCod))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.fatecpp.model.domain.Caixa[ cxCod=" + cxCod + " ]";
    }
    
}
