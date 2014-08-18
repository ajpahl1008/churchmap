package com.pahlsoft.churchmap.dao;

import javax.persistence.*;

/**
 * Created by aj on 17/08/14.
 */
@Entity
@Table(name = "INTERESTS", schema = "", catalog = "churchmap")
public class InterestsEntity {
    private int interestId;
    private String interestName;
    private String interestSchedule;

    @Id
    @Column(name = "INTEREST_ID", nullable = false, insertable = true, updatable = true)
    public int getInterestId() {
        return interestId;
    }

    public void setInterestId(int interestId) {
        this.interestId = interestId;
    }

    @Basic
    @Column(name = "INTEREST_NAME", nullable = false, insertable = true, updatable = true, length = 45)
    public String getInterestName() {
        return interestName;
    }

    public void setInterestName(String interestName) {
        this.interestName = interestName;
    }

    @Basic
    @Column(name = "INTEREST_SCHEDULE", nullable = false, insertable = true, updatable = true, length = 45)
    public String getInterestSchedule() {
        return interestSchedule;
    }

    public void setInterestSchedule(String interestSchedule) {
        this.interestSchedule = interestSchedule;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        InterestsEntity that = (InterestsEntity) o;

        if (interestId != that.interestId) return false;
        if (interestName != null ? !interestName.equals(that.interestName) : that.interestName != null) return false;
        if (interestSchedule != null ? !interestSchedule.equals(that.interestSchedule) : that.interestSchedule != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = interestId;
        result = 31 * result + (interestName != null ? interestName.hashCode() : 0);
        result = 31 * result + (interestSchedule != null ? interestSchedule.hashCode() : 0);
        return result;
    }
}
