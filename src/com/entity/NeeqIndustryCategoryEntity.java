package com.entity;

/**
 * Created by bj on 16/7/27.
 */
public class NeeqIndustryCategoryEntity {
    private int id;
    private String name;
    private Integer parentid;
    private String smallPhoto;
    private String bigPhoto;
    private String savePhoto;
    private String type;
    private Byte status;
    private Integer createdAt;
    private Integer updateAt;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getParentid() {
        return parentid;
    }

    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }

    public String getSmallPhoto() {
        return smallPhoto;
    }

    public void setSmallPhoto(String smallPhoto) {
        this.smallPhoto = smallPhoto;
    }

    public String getBigPhoto() {
        return bigPhoto;
    }

    public void setBigPhoto(String bigPhoto) {
        this.bigPhoto = bigPhoto;
    }

    public String getSavePhoto() {
        return savePhoto;
    }

    public void setSavePhoto(String savePhoto) {
        this.savePhoto = savePhoto;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Integer getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Integer createdAt) {
        this.createdAt = createdAt;
    }

    public Integer getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Integer updateAt) {
        this.updateAt = updateAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        NeeqIndustryCategoryEntity that = (NeeqIndustryCategoryEntity) o;

        if (id != that.id) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (parentid != null ? !parentid.equals(that.parentid) : that.parentid != null) return false;
        if (smallPhoto != null ? !smallPhoto.equals(that.smallPhoto) : that.smallPhoto != null) return false;
        if (bigPhoto != null ? !bigPhoto.equals(that.bigPhoto) : that.bigPhoto != null) return false;
        if (savePhoto != null ? !savePhoto.equals(that.savePhoto) : that.savePhoto != null) return false;
        if (type != null ? !type.equals(that.type) : that.type != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (createdAt != null ? !createdAt.equals(that.createdAt) : that.createdAt != null) return false;
        if (updateAt != null ? !updateAt.equals(that.updateAt) : that.updateAt != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (parentid != null ? parentid.hashCode() : 0);
        result = 31 * result + (smallPhoto != null ? smallPhoto.hashCode() : 0);
        result = 31 * result + (bigPhoto != null ? bigPhoto.hashCode() : 0);
        result = 31 * result + (savePhoto != null ? savePhoto.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (createdAt != null ? createdAt.hashCode() : 0);
        result = 31 * result + (updateAt != null ? updateAt.hashCode() : 0);
        return result;
    }
}
