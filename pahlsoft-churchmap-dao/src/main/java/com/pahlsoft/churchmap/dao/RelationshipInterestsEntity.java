package com.pahlsoft.churchmap.dao;

import javax.persistence.*;

/**
 * Created by aj on 17/08/14.
 */
@Entity
@Table(name = "RELATIONSHIP_INTERESTS", schema = "", catalog = "churchmap")
public class RelationshipInterestsEntity {
    private int interestsId;
    private Integer parishionerId;
    private Integer interestId;

    @Id
    @Column(name = "INTERESTS_ID", nullable = false, insertable = true, updatable = true)
    public int getInterestsId() {
        return interestsId;
    }

    public void setInterestsId(int interestsId) {
        this.interestsId = interestsId;
    }

    @Basic
    @Column(name = "PARISHIONER_ID", nullable = true, insertable = true, updatable = true)
    public Integer getParishionerId() {
        return parishionerId;
    }

    public void setParishionerId(Integer parishionerId) {
        this.parishionerId = parishionerId;
    }

    @Basic
    @Column(name = "INTEREST_ID", nullable = true, insertable = true, updatable = true)
    public Integer getInterestId() {
        return interestId;
    }

    public void setInterestId(Integer interestId) {
        this.interestId = interestId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RelationshipInterestsEntity that = (RelationshipInterestsEntity) o;

        if (interestsId != that.interestsId) return false;
        if (interestId != null ? !interestId.equals(that.interestId) : that.interestId != null) return false;
        if (parishionerId != null ? !parishionerId.equals(that.parishionerId) : that.parishionerId != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = interestsId;
        result = 31 * result + (parishionerId != null ? parishionerId.hashCode() : 0);
        result = 31 * result + (interestId != null ? interestId.hashCode() : 0);
        return result;
    }
}
