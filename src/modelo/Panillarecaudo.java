/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author oscar
 */
@Entity
@Table(name = "panillarecaudo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Panillarecaudo.findAll", query = "SELECT p FROM Panillarecaudo p")
    , @NamedQuery(name = "Panillarecaudo.findByIdPanillaRecaudo", query = "SELECT p FROM Panillarecaudo p WHERE p.idPanillaRecaudo = :idPanillaRecaudo")
    , @NamedQuery(name = "Panillarecaudo.findByRuta", query = "SELECT p FROM Panillarecaudo p WHERE p.ruta = :ruta")
    , @NamedQuery(name = "Panillarecaudo.findByVial", query = "SELECT p FROM Panillarecaudo p WHERE p.vial = :vial")
    , @NamedQuery(name = "Panillarecaudo.findByRecorrido", query = "SELECT p FROM Panillarecaudo p WHERE p.recorrido = :recorrido")
    , @NamedQuery(name = "Panillarecaudo.findByFecha", query = "SELECT p FROM Panillarecaudo p WHERE p.fecha = :fecha")
    , @NamedQuery(name = "Panillarecaudo.findByInicioTorniquete", query = "SELECT p FROM Panillarecaudo p WHERE p.inicioTorniquete = :inicioTorniquete")
    , @NamedQuery(name = "Panillarecaudo.findByFinalTorniquete", query = "SELECT p FROM Panillarecaudo p WHERE p.finalTorniquete = :finalTorniquete")
    , @NamedQuery(name = "Panillarecaudo.findByHoraSalida", query = "SELECT p FROM Panillarecaudo p WHERE p.horaSalida = :horaSalida")
    , @NamedQuery(name = "Panillarecaudo.findByNumeroPasajeros", query = "SELECT p FROM Panillarecaudo p WHERE p.numeroPasajeros = :numeroPasajeros")
    , @NamedQuery(name = "Panillarecaudo.findByProducidoBruto", query = "SELECT p FROM Panillarecaudo p WHERE p.producidoBruto = :producidoBruto")})
public class Panillarecaudo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idPanillaRecaudo")
    private Integer idPanillaRecaudo;
    @Column(name = "ruta")
    private String ruta;
    @Basic(optional = false)
    @Column(name = "vial")
    private String vial;
    @Column(name = "recorrido")
    private String recorrido;
    @Column(name = "fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @Column(name = "inicioTorniquete")
    private Integer inicioTorniquete;
    @Column(name = "finalTorniquete")
    private Integer finalTorniquete;
    @Column(name = "horaSalida")
    @Temporal(TemporalType.DATE)
    private Date horaSalida;
    @Column(name = "numeroPasajeros")
    private Integer numeroPasajeros;
    @Column(name = "producidoBruto")
    private Integer producidoBruto;
    @JoinColumn(name = "idgasto", referencedColumnName = "idgasto")
    @OneToOne
    private Gasto idgasto;
    @JoinColumn(name = "idPersona", referencedColumnName = "idPersona")
    @ManyToOne
    private Persona idPersona;

    public Panillarecaudo() {
    }

    public Panillarecaudo(Integer idPanillaRecaudo) {
        this.idPanillaRecaudo = idPanillaRecaudo;
    }

    public Panillarecaudo(Integer idPanillaRecaudo, String vial) {
        this.idPanillaRecaudo = idPanillaRecaudo;
        this.vial = vial;
    }

    public Integer getIdPanillaRecaudo() {
        return idPanillaRecaudo;
    }

    public void setIdPanillaRecaudo(Integer idPanillaRecaudo) {
        this.idPanillaRecaudo = idPanillaRecaudo;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public String getVial() {
        return vial;
    }

    public void setVial(String vial) {
        this.vial = vial;
    }

    public String getRecorrido() {
        return recorrido;
    }

    public void setRecorrido(String recorrido) {
        this.recorrido = recorrido;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Integer getInicioTorniquete() {
        return inicioTorniquete;
    }

    public void setInicioTorniquete(Integer inicioTorniquete) {
        this.inicioTorniquete = inicioTorniquete;
    }

    public Integer getFinalTorniquete() {
        return finalTorniquete;
    }

    public void setFinalTorniquete(Integer finalTorniquete) {
        this.finalTorniquete = finalTorniquete;
    }

    public Date getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(Date horaSalida) {
        this.horaSalida = horaSalida;
    }

    public Integer getNumeroPasajeros() {
        return numeroPasajeros;
    }

    public void setNumeroPasajeros(Integer numeroPasajeros) {
        this.numeroPasajeros = numeroPasajeros;
    }

    public Integer getProducidoBruto() {
        return producidoBruto;
    }

    public void setProducidoBruto(Integer producidoBruto) {
        this.producidoBruto = producidoBruto;
    }

    public Gasto getIdgasto() {
        return idgasto;
    }

    public void setIdgasto(Gasto idgasto) {
        this.idgasto = idgasto;
    }

    public Persona getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(Persona idPersona) {
        this.idPersona = idPersona;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPanillaRecaudo != null ? idPanillaRecaudo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Panillarecaudo)) {
            return false;
        }
        Panillarecaudo other = (Panillarecaudo) object;
        if ((this.idPanillaRecaudo == null && other.idPanillaRecaudo != null) || (this.idPanillaRecaudo != null && !this.idPanillaRecaudo.equals(other.idPanillaRecaudo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.Panillarecaudo[ idPanillaRecaudo=" + idPanillaRecaudo + " ]";
    }
    
}
