package com.entity;

/**
 * Created by bj on 16/7/27.
 */
public class NeeqCompanyEntity {
    private int id;
    private int code;
    private String name;
    private String shortname;
    private String transferMode;
    private int industryid;
    private int specialid;
    private int area;
    private Long listingDate;
    private String website;
    private String address;
    private String phone;
    private String postcode;
    private byte type;
    private String fax;
    private String legalRepresentative;
    private String secretaries;
    private String desc;
    private String totalStockEquity;
    private String englishName;
    private byte status;
    private Integer createdAt;
    private Integer updateAt;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShortname() {
        return shortname;
    }

    public void setShortname(String shortname) {
        this.shortname = shortname;
    }

    public String getTransferMode() {
        return transferMode;
    }

    public void setTransferMode(String transferMode) {
        this.transferMode = transferMode;
    }

    public int getIndustryid() {
        return industryid;
    }

    public void setIndustryid(int industryid) {
        this.industryid = industryid;
    }

    public int getSpecialid() {
        return specialid;
    }

    public void setSpecialid(int specialid) {
        this.specialid = specialid;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public Long getListingDate() {
        return listingDate;
    }

    public void setListingDate(Long listingDate) {
        this.listingDate = listingDate;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public byte getType() {
        return type;
    }

    public void setType(byte type) {
        this.type = type;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getLegalRepresentative() {
        return legalRepresentative;
    }

    public void setLegalRepresentative(String legalRepresentative) {
        this.legalRepresentative = legalRepresentative;
    }

    public String getSecretaries() {
        return secretaries;
    }

    public void setSecretaries(String secretaries) {
        this.secretaries = secretaries;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getTotalStockEquity() {
        return totalStockEquity;
    }

    public void setTotalStockEquity(String totalStockEquity) {
        this.totalStockEquity = totalStockEquity;
    }

    public String getEnglishName() {
        return englishName;
    }

    public void setEnglishName(String englishName) {
        this.englishName = englishName;
    }

    public byte getStatus() {
        return status;
    }

    public void setStatus(byte status) {
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

        NeeqCompanyEntity that = (NeeqCompanyEntity) o;

        if (id != that.id) return false;
        if (code != that.code) return false;
        if (industryid != that.industryid) return false;
        if (specialid != that.specialid) return false;
        if (area != that.area) return false;
        if (type != that.type) return false;
        if (status != that.status) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (shortname != null ? !shortname.equals(that.shortname) : that.shortname != null) return false;
        if (transferMode != null ? !transferMode.equals(that.transferMode) : that.transferMode != null) return false;
        if (listingDate != null ? !listingDate.equals(that.listingDate) : that.listingDate != null) return false;
        if (website != null ? !website.equals(that.website) : that.website != null) return false;
        if (address != null ? !address.equals(that.address) : that.address != null) return false;
        if (phone != null ? !phone.equals(that.phone) : that.phone != null) return false;
        if (postcode != null ? !postcode.equals(that.postcode) : that.postcode != null) return false;
        if (fax != null ? !fax.equals(that.fax) : that.fax != null) return false;
        if (legalRepresentative != null ? !legalRepresentative.equals(that.legalRepresentative) : that.legalRepresentative != null)
            return false;
        if (secretaries != null ? !secretaries.equals(that.secretaries) : that.secretaries != null) return false;
        if (desc != null ? !desc.equals(that.desc) : that.desc != null) return false;
        if (totalStockEquity != null ? !totalStockEquity.equals(that.totalStockEquity) : that.totalStockEquity != null)
            return false;
        if (englishName != null ? !englishName.equals(that.englishName) : that.englishName != null) return false;
        if (createdAt != null ? !createdAt.equals(that.createdAt) : that.createdAt != null) return false;
        if (updateAt != null ? !updateAt.equals(that.updateAt) : that.updateAt != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + code;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (shortname != null ? shortname.hashCode() : 0);
        result = 31 * result + (transferMode != null ? transferMode.hashCode() : 0);
        result = 31 * result + industryid;
        result = 31 * result + specialid;
        result = 31 * result + area;
        result = 31 * result + (listingDate != null ? listingDate.hashCode() : 0);
        result = 31 * result + (website != null ? website.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        result = 31 * result + (postcode != null ? postcode.hashCode() : 0);
        result = 31 * result + (int) type;
        result = 31 * result + (fax != null ? fax.hashCode() : 0);
        result = 31 * result + (legalRepresentative != null ? legalRepresentative.hashCode() : 0);
        result = 31 * result + (secretaries != null ? secretaries.hashCode() : 0);
        result = 31 * result + (desc != null ? desc.hashCode() : 0);
        result = 31 * result + (totalStockEquity != null ? totalStockEquity.hashCode() : 0);
        result = 31 * result + (englishName != null ? englishName.hashCode() : 0);
        result = 31 * result + (int) status;
        result = 31 * result + (createdAt != null ? createdAt.hashCode() : 0);
        result = 31 * result + (updateAt != null ? updateAt.hashCode() : 0);
        return result;
    }
}
