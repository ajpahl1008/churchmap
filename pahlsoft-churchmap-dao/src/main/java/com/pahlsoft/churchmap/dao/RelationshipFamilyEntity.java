package com.pahlsoft.churchmap.dao;

import javax.persistence.*;

/**
 * Created by aj on 17/08/14.
 */
@Entity
@Table(name = "RELATIONSHIP_FAMILY", schema = "", catalog = "churchmap")
public class RelationshipFamilyEntity {
    private int relationshipId;
    private Integer familyId1;
    private Integer familyId2;

    @Id
    @Column(name = "RELATIONSHIP_ID", nullable = false, insertable = true, updatable = true)
    public int getRelationshipId() {
        return relationshipId;
    }

    public void setRelationshipId(int relationshipId) {
        this.relationshipId = relationshipId;
    }

    @Basic
    @Column(name = "FAMILY_ID1", nullable = true, insertable = true, updatable = true)
    public Integer getFamilyId1() {
        return familyId1;
    }

    public void setFamilyId1(Integer familyId1) {
        this.familyId1 = familyId1;
    }

    @Basic
    @Column(name = "FAMILY_ID2", nullable = true, insertable = true, updatable = true)
    public Integer getFamilyId2() {
        return familyId2;
    }

    public void setFamilyId2(Integer familyId2) {
        this.familyId2 = familyId2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RelationshipFamilyEntity that = (RelationshipFamilyEntity) o;

        if (relationshipId != that.relationshipId) return false;
        if (familyId1 != null ? !familyId1.equals(that.familyId1) : that.familyId1 != null) return false;
        if (familyId2 != null ? !familyId2.equals(that.familyId2) : that.familyId2 != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = relationshipId;
        result = 31 * result + (familyId1 != null ? familyId1.hashCode() : 0);
        result = 31 * result + (familyId2 != null ? familyId2.hashCode() : 0);
        return result;
    }
}
