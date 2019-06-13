/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ASUS
 */
@Entity
@Table(name = "OVERTIMEREQUESTSTATUS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OvertimeRequestStatus.findAll", query = "SELECT o FROM OvertimeRequestStatus o")
    , @NamedQuery(name = "OvertimeRequestStatus.findById", query = "SELECT o FROM OvertimeRequestStatus o WHERE o.id = :id")
    , @NamedQuery(name = "OvertimeRequestStatus.findByStatusdate", query = "SELECT o FROM OvertimeRequestStatus o WHERE o.statusdate = :statusdate")})
public class OvertimeRequestStatus implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @Basic(optional = false)
    @Column(name = "STATUSDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date statusdate;
    @JoinColumn(name = "OVERTIMEREQUEST", referencedColumnName = "ID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private OvertimeRequest overtimerequest;
    @JoinColumn(name = "STATUS", referencedColumnName = "ID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Status status;

    public OvertimeRequestStatus() {
    }

    public OvertimeRequestStatus(Long id) {
        this.id = id;
    }

    public OvertimeRequestStatus(Long id, Date statusdate) {
        this.id = id;
        this.statusdate = statusdate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getStatusdate() {
        return statusdate;
    }

    public void setStatusdate(Date statusdate) {
        this.statusdate = statusdate;
    }

    public OvertimeRequest getOvertimerequest() {
        return overtimerequest;
    }

    public void setOvertimerequest(OvertimeRequest overtimerequest) {
        this.overtimerequest = overtimerequest;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
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
        if (!(object instanceof OvertimeRequestStatus)) {
            return false;
        }
        OvertimeRequestStatus other = (OvertimeRequestStatus) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "models.OvertimeRequestStatus[ id=" + id + " ]";
    }
    
}
