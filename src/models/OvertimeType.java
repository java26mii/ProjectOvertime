/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author ASUS
 */
@Entity
@Table(name = "OVERTIMETYPES")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OvertimeType.findAll", query = "SELECT o FROM OvertimeType o")
    , @NamedQuery(name = "OvertimeType.findById", query = "SELECT o FROM OvertimeType o WHERE o.id = :id")
    , @NamedQuery(name = "OvertimeType.findByName", query = "SELECT o FROM OvertimeType o WHERE o.name = :name")
    , @NamedQuery(name = "OvertimeType.findByMinhour", query = "SELECT o FROM OvertimeType o WHERE o.minhour = :minhour")
    , @NamedQuery(name = "OvertimeType.findBySalary", query = "SELECT o FROM OvertimeType o WHERE o.salary = :salary")
    , @NamedQuery(name = "OvertimeType.findByIsdelete", query = "SELECT o FROM OvertimeType o WHERE o.isdelete = :isdelete")})
public class OvertimeType implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @Basic(optional = false)
    @Column(name = "NAME")
    private String name;
    @Basic(optional = false)
    @Column(name = "MINHOUR")
    private short minhour;
    @Basic(optional = false)
    @Column(name = "SALARY")
    private long salary;
    @Basic(optional = false)
    @Column(name = "ISDELETE")
    private Character isdelete;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "overtimetype", fetch = FetchType.LAZY)
    private List<OvertimeRequest> overtimeRequestList;

    public OvertimeType() {
    }

    public OvertimeType(Long id) {
        this.id = id;
    }

    public OvertimeType(Long id, String name, short minhour, long salary) {
        this.id = id;
        this.name = name;
        this.minhour = minhour;
        this.salary = salary;
    }
    
    public OvertimeType(Long id, String name, short minhour, long salary, Character isdelete) {
        this.id = id;
        this.name = name;
        this.minhour = minhour;
        this.salary = salary;
        this.isdelete = isdelete;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public short getMinhour() {
        return minhour;
    }

    public void setMinhour(short minhour) {
        this.minhour = minhour;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public Character getIsdelete() {
        return isdelete;
    }

    public void setIsdelete(Character isdelete) {
        this.isdelete = isdelete;
    }

    @XmlTransient
    public List<OvertimeRequest> getOvertimeRequestList() {
        return overtimeRequestList;
    }

    public void setOvertimeRequestList(List<OvertimeRequest> overtimeRequestList) {
        this.overtimeRequestList = overtimeRequestList;
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
        if (!(object instanceof OvertimeType)) {
            return false;
        }
        OvertimeType other = (OvertimeType) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "models.OvertimeType[ id=" + id + " ]";
    }
    
}
