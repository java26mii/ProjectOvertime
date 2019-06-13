/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author ASUS
 */
@Entity
@Table(name = "OVERTIMEREQUESTS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OvertimeRequest.findAll", query = "SELECT o FROM OvertimeRequest o")
    , @NamedQuery(name = "OvertimeRequest.findById", query = "SELECT o FROM OvertimeRequest o WHERE o.id = :id")
    , @NamedQuery(name = "OvertimeRequest.findByReqdate", query = "SELECT o FROM OvertimeRequest o WHERE o.reqdate = :reqdate")
    , @NamedQuery(name = "OvertimeRequest.findByStarttime", query = "SELECT o FROM OvertimeRequest o WHERE o.starttime = :starttime")
    , @NamedQuery(name = "OvertimeRequest.findByEndtime", query = "SELECT o FROM OvertimeRequest o WHERE o.endtime = :endtime")
    , @NamedQuery(name = "OvertimeRequest.findByActivity", query = "SELECT o FROM OvertimeRequest o WHERE o.activity = :activity")
    , @NamedQuery(name = "OvertimeRequest.findByIsdelete", query = "SELECT o FROM OvertimeRequest o WHERE o.isdelete = :isdelete")})
public class OvertimeRequest implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @Basic(optional = false)
    @Column(name = "REQDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date reqdate;
    @Basic(optional = false)
    @Column(name = "STARTTIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date starttime;
    @Basic(optional = false)
    @Column(name = "ENDTIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date endtime;
    @Basic(optional = false)
    @Column(name = "ACTIVITY")
    private String activity;
    @Basic(optional = false)
    @Column(name = "ISDELETE")
    private Character isdelete;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "overtimerequest", fetch = FetchType.LAZY)
    private List<OvertimeRequestStatus> overtimeRequestStatusList;
    @JoinColumn(name = "EMPLOYEE", referencedColumnName = "ID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Employee employee;
    @JoinColumn(name = "OVERTIMETYPE", referencedColumnName = "ID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private OvertimeType overtimetype;

    public OvertimeRequest() {
    }

    public OvertimeRequest(Long id) {
        this.id = id;
    }

    public OvertimeRequest(Long id, Date reqdate, Date starttime, Date endtime, String activity, Character isdelete) {
        this.id = id;
        this.reqdate = reqdate;
        this.starttime = starttime;
        this.endtime = endtime;
        this.activity = activity;
        this.isdelete = isdelete;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getReqdate() {
        return reqdate;
    }

    public void setReqdate(Date reqdate) {
        this.reqdate = reqdate;
    }

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    public Character getIsdelete() {
        return isdelete;
    }

    public void setIsdelete(Character isdelete) {
        this.isdelete = isdelete;
    }

    @XmlTransient
    public List<OvertimeRequestStatus> getOvertimeRequestStatusList() {
        return overtimeRequestStatusList;
    }

    public void setOvertimeRequestStatusList(List<OvertimeRequestStatus> overtimeRequestStatusList) {
        this.overtimeRequestStatusList = overtimeRequestStatusList;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public OvertimeType getOvertimetype() {
        return overtimetype;
    }

    public void setOvertimetype(OvertimeType overtimetype) {
        this.overtimetype = overtimetype;
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
        if (!(object instanceof OvertimeRequest)) {
            return false;
        }
        OvertimeRequest other = (OvertimeRequest) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "models.OvertimeRequest[ id=" + id + " ]";
    }
    
}
