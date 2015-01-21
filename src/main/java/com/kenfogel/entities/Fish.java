package com.kenfogel.entities;

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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author omni__000
 */
@Entity
@Table(name = "fish", catalog = "aquarium", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Fish.findAll", query = "SELECT f FROM Fish f"),
    @NamedQuery(name = "Fish.findById", query = "SELECT f FROM Fish f WHERE f.id = :id"),
    @NamedQuery(name = "Fish.findByCommonname", query = "SELECT f FROM Fish f WHERE f.commonname = :commonname"),
    @NamedQuery(name = "Fish.findByLatin", query = "SELECT f FROM Fish f WHERE f.latin = :latin"),
    @NamedQuery(name = "Fish.findByPh", query = "SELECT f FROM Fish f WHERE f.ph = :ph"),
    @NamedQuery(name = "Fish.findByKh", query = "SELECT f FROM Fish f WHERE f.kh = :kh"),
    @NamedQuery(name = "Fish.findByTemp", query = "SELECT f FROM Fish f WHERE f.temp = :temp"),
    @NamedQuery(name = "Fish.findByFishsize", query = "SELECT f FROM Fish f WHERE f.fishsize = :fishsize"),
    @NamedQuery(name = "Fish.findBySpeciesorigin", query = "SELECT f FROM Fish f WHERE f.speciesorigin = :speciesorigin"),
    @NamedQuery(name = "Fish.findByTanksize", query = "SELECT f FROM Fish f WHERE f.tanksize = :tanksize"),
    @NamedQuery(name = "Fish.findByStocking", query = "SELECT f FROM Fish f WHERE f.stocking = :stocking"),
    @NamedQuery(name = "Fish.findByDiet", query = "SELECT f FROM Fish f WHERE f.diet = :diet")
})
public class Fish implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "COMMONNAME", length=45)
    private String commonname;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "LATIN", length=40)
    private String latin;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 12)
    @Column(name = "PH", length=12)
    private String ph;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 12)
    @Column(name = "KH", length=12)
    private String kh;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 12)
    @Column(name = "TEMP", length=12)
    private String temp;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 12)
    @Column(name = "FISHSIZE", length=12)
    private String fishsize;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 35)
    @Column(name = "SPECIESORIGIN", length=35)
    private String speciesorigin;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 38)
    @Column(name = "TANKSIZE", length=38)
    private String tanksize;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 28)
    @Column(name = "STOCKING", length=28)
    private String stocking;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 28)
    @Column(name = "DIET", length=28)
    private String diet;

    public Fish() {
    }

    public Fish(Integer id) {
        this.id = id;
    }

    public Fish(Integer id, String commonname, String latin, String ph, String kh, String temp, String fishsize, String speciesorigin, String tanksize, String stocking, String diet) {
        this.id = id;
        this.commonname = commonname;
        this.latin = latin;
        this.ph = ph;
        this.kh = kh;
        this.temp = temp;
        this.fishsize = fishsize;
        this.speciesorigin = speciesorigin;
        this.tanksize = tanksize;
        this.stocking = stocking;
        this.diet = diet;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCommonname() {
        return commonname;
    }

    public void setCommonname(String commonname) {
        this.commonname = commonname;
    }

    public String getLatin() {
        return latin;
    }

    public void setLatin(String latin) {
        this.latin = latin;
    }

    public String getPh() {
        return ph;
    }

    public void setPh(String ph) {
        this.ph = ph;
    }

    public String getKh() {
        return kh;
    }

    public void setKh(String kh) {
        this.kh = kh;
    }

    public String getTemp() {
        return temp;
    }

    public void setTemp(String temp) {
        this.temp = temp;
    }

    public String getFishsize() {
        return fishsize;
    }

    public void setFishsize(String fishsize) {
        this.fishsize = fishsize;
    }

    public String getSpeciesorigin() {
        return speciesorigin;
    }

    public void setSpeciesorigin(String speciesorigin) {
        this.speciesorigin = speciesorigin;
    }

    public String getTanksize() {
        return tanksize;
    }

    public void setTanksize(String tanksize) {
        this.tanksize = tanksize;
    }

    public String getStocking() {
        return stocking;
    }

    public void setStocking(String stocking) {
        this.stocking = stocking;
    }

    public String getDiet() {
        return diet;
    }

    public void setDiet(String diet) {
        this.diet = diet;
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
        if (!(object instanceof Fish)) {
            return false;
        }
        Fish other = (Fish) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.kenfogel.entities.Fish[ id=" + id + " ]";
    }
    
}
