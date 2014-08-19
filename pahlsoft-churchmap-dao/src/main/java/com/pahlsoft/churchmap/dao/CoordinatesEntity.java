package com.pahlsoft.churchmap.dao;

import javax.persistence.*;

/**
 * Created by aj on 18/08/14.
 */
@Entity
@Table(name = "COORDINATES", schema = "", catalog = "churchmap")
public class CoordinatesEntity {
    private int coordinateId;
    private String latitude;
    private String longitude;

    @Id
    @Column(name = "COORDINATE_ID", nullable = false, insertable = true, updatable = true)
    public int getCoordinateId() {
        return coordinateId;
    }

    public void setCoordinateId(int coordinateId) {
        this.coordinateId = coordinateId;
    }

    @Basic
    @Column(name = "LATITUDE", nullable = false, insertable = true, updatable = true, length = 45)
    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    @Basic
    @Column(name = "LONGITUDE", nullable = false, insertable = true, updatable = true, length = 45)
    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CoordinatesEntity that = (CoordinatesEntity) o;

        if (coordinateId != that.coordinateId) return false;
        if (latitude != null ? !latitude.equals(that.latitude) : that.latitude != null) return false;
        if (longitude != null ? !longitude.equals(that.longitude) : that.longitude != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = coordinateId;
        result = 31 * result + (latitude != null ? latitude.hashCode() : 0);
        result = 31 * result + (longitude != null ? longitude.hashCode() : 0);
        return result;
    }
}
