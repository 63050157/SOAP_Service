/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Piyaporn
 */
@Entity
@Table(name = "COVIDPROJECT")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Covidproject.findAll", query = "SELECT c FROM Covidproject c"),
    @NamedQuery(name = "Covidproject.findByYearnum", query = "SELECT c FROM Covidproject c WHERE c.yearnum = :yearnum"),
    @NamedQuery(name = "Covidproject.findByWeeknum", query = "SELECT c FROM Covidproject c WHERE c.weeknum = :weeknum"),
    @NamedQuery(name = "Covidproject.findByNewCase", query = "SELECT c FROM Covidproject c WHERE c.newCase = :newCase"),
    @NamedQuery(name = "Covidproject.findByTotalCase", query = "SELECT c FROM Covidproject c WHERE c.totalCase = :totalCase"),
    @NamedQuery(name = "Covidproject.findByNewCaseExcludeabroad", query = "SELECT c FROM Covidproject c WHERE c.newCaseExcludeabroad = :newCaseExcludeabroad"),
    @NamedQuery(name = "Covidproject.findByTotalCaseExcludeabroad", query = "SELECT c FROM Covidproject c WHERE c.totalCaseExcludeabroad = :totalCaseExcludeabroad"),
    @NamedQuery(name = "Covidproject.findByNewRecovered", query = "SELECT c FROM Covidproject c WHERE c.newRecovered = :newRecovered"),
    @NamedQuery(name = "Covidproject.findByTotalRecovered", query = "SELECT c FROM Covidproject c WHERE c.totalRecovered = :totalRecovered"),
    @NamedQuery(name = "Covidproject.findByNewDeath", query = "SELECT c FROM Covidproject c WHERE c.newDeath = :newDeath"),
    @NamedQuery(name = "Covidproject.findByTotalDeath", query = "SELECT c FROM Covidproject c WHERE c.totalDeath = :totalDeath"),
    @NamedQuery(name = "Covidproject.findByCaseForeign", query = "SELECT c FROM Covidproject c WHERE c.caseForeign = :caseForeign"),
    @NamedQuery(name = "Covidproject.findByCasePrison", query = "SELECT c FROM Covidproject c WHERE c.casePrison = :casePrison"),
    @NamedQuery(name = "Covidproject.findByCaseWalkin", query = "SELECT c FROM Covidproject c WHERE c.caseWalkin = :caseWalkin"),
    @NamedQuery(name = "Covidproject.findByCaseNewPrev", query = "SELECT c FROM Covidproject c WHERE c.caseNewPrev = :caseNewPrev"),
    @NamedQuery(name = "Covidproject.findByCaseNewDiff", query = "SELECT c FROM Covidproject c WHERE c.caseNewDiff = :caseNewDiff"),
    @NamedQuery(name = "Covidproject.findByDeathNewPrev", query = "SELECT c FROM Covidproject c WHERE c.deathNewPrev = :deathNewPrev"),
    @NamedQuery(name = "Covidproject.findByDeathNewDiff", query = "SELECT c FROM Covidproject c WHERE c.deathNewDiff = :deathNewDiff"),
    @NamedQuery(name = "Covidproject.findByUpdateDate", query = "SELECT c FROM Covidproject c WHERE c.updateDate = :updateDate")})
public class Covidproject implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "YEARNUM")
    private Integer yearnum;
    @Column(name = "WEEKNUM")
    private Integer weeknum;
    @Column(name = "NEW_CASE")
    private Integer newCase;
    @Column(name = "TOTAL_CASE")
    private Integer totalCase;
    @Column(name = "NEW_CASE_EXCLUDEABROAD")
    private Integer newCaseExcludeabroad;
    @Column(name = "TOTAL_CASE_EXCLUDEABROAD")
    private Integer totalCaseExcludeabroad;
    @Column(name = "NEW_RECOVERED")
    private Integer newRecovered;
    @Column(name = "TOTAL_RECOVERED")
    private Integer totalRecovered;
    @Column(name = "NEW_DEATH")
    private Integer newDeath;
    @Column(name = "TOTAL_DEATH")
    private Integer totalDeath;
    @Column(name = "CASE_FOREIGN")
    private Integer caseForeign;
    @Column(name = "CASE_PRISON")
    private Integer casePrison;
    @Column(name = "CASE_WALKIN")
    private Integer caseWalkin;
    @Column(name = "CASE_NEW_PREV")
    private Integer caseNewPrev;
    @Column(name = "CASE_NEW_DIFF")
    private Integer caseNewDiff;
    @Column(name = "DEATH_NEW_PREV")
    private Integer deathNewPrev;
    @Column(name = "DEATH_NEW_DIFF")
    private Integer deathNewDiff;
    @Size(max = 80)
    @Column(name = "UPDATE_DATE")
    private String updateDate;

    public Covidproject() {
    }

    public Covidproject(Integer yearnum) {
        this.yearnum = yearnum;
    }

    public Integer getYearnum() {
        return yearnum;
    }

    public void setYearnum(Integer yearnum) {
        this.yearnum = yearnum;
    }

    public Integer getWeeknum() {
        return weeknum;
    }

    public void setWeeknum(Integer weeknum) {
        this.weeknum = weeknum;
    }

    public Integer getNewCase() {
        return newCase;
    }

    public void setNewCase(Integer newCase) {
        this.newCase = newCase;
    }

    public Integer getTotalCase() {
        return totalCase;
    }

    public void setTotalCase(Integer totalCase) {
        this.totalCase = totalCase;
    }

    public Integer getNewCaseExcludeabroad() {
        return newCaseExcludeabroad;
    }

    public void setNewCaseExcludeabroad(Integer newCaseExcludeabroad) {
        this.newCaseExcludeabroad = newCaseExcludeabroad;
    }

    public Integer getTotalCaseExcludeabroad() {
        return totalCaseExcludeabroad;
    }

    public void setTotalCaseExcludeabroad(Integer totalCaseExcludeabroad) {
        this.totalCaseExcludeabroad = totalCaseExcludeabroad;
    }

    public Integer getNewRecovered() {
        return newRecovered;
    }

    public void setNewRecovered(Integer newRecovered) {
        this.newRecovered = newRecovered;
    }

    public Integer getTotalRecovered() {
        return totalRecovered;
    }

    public void setTotalRecovered(Integer totalRecovered) {
        this.totalRecovered = totalRecovered;
    }

    public Integer getNewDeath() {
        return newDeath;
    }

    public void setNewDeath(Integer newDeath) {
        this.newDeath = newDeath;
    }

    public Integer getTotalDeath() {
        return totalDeath;
    }

    public void setTotalDeath(Integer totalDeath) {
        this.totalDeath = totalDeath;
    }

    public Integer getCaseForeign() {
        return caseForeign;
    }

    public void setCaseForeign(Integer caseForeign) {
        this.caseForeign = caseForeign;
    }

    public Integer getCasePrison() {
        return casePrison;
    }

    public void setCasePrison(Integer casePrison) {
        this.casePrison = casePrison;
    }

    public Integer getCaseWalkin() {
        return caseWalkin;
    }

    public void setCaseWalkin(Integer caseWalkin) {
        this.caseWalkin = caseWalkin;
    }

    public Integer getCaseNewPrev() {
        return caseNewPrev;
    }

    public void setCaseNewPrev(Integer caseNewPrev) {
        this.caseNewPrev = caseNewPrev;
    }

    public Integer getCaseNewDiff() {
        return caseNewDiff;
    }

    public void setCaseNewDiff(Integer caseNewDiff) {
        this.caseNewDiff = caseNewDiff;
    }

    public Integer getDeathNewPrev() {
        return deathNewPrev;
    }

    public void setDeathNewPrev(Integer deathNewPrev) {
        this.deathNewPrev = deathNewPrev;
    }

    public Integer getDeathNewDiff() {
        return deathNewDiff;
    }

    public void setDeathNewDiff(Integer deathNewDiff) {
        this.deathNewDiff = deathNewDiff;
    }

    public String getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(String updateDate) {
        this.updateDate = updateDate;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (yearnum != null ? yearnum.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Covidproject)) {
            return false;
        }
        Covidproject other = (Covidproject) object;
        if ((this.yearnum == null && other.yearnum != null) || (this.yearnum != null && !this.yearnum.equals(other.yearnum))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Covidproject[ yearnum=" + yearnum + " ]";
    }
    
}
