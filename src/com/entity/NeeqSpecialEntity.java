package com.entity;

/**
 * Created by bj on 16/7/27.
 */
public class NeeqSpecialEntity {
    private int id;
    private String name;
    private String fullName;
    private String foundTime;
    private String legalRepresentative;
    private String generalManager;
    private String registeredCapital;
    private String website;
    private String netAsset;
    private String netCapital;
    private String salesNum;
    private String officialAddress;
    private String post;
    private String address;
    private String email;
    private String licenseCode;
    private String type;
    private String business;
    private String summary;
    private String complaintCall;
    private String info;
    private Byte isNeeq;
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

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getFoundTime() {
        return foundTime;
    }

    public void setFoundTime(String foundTime) {
        this.foundTime = foundTime;
    }

    public String getLegalRepresentative() {
        return legalRepresentative;
    }

    public void setLegalRepresentative(String legalRepresentative) {
        this.legalRepresentative = legalRepresentative;
    }

    public String getGeneralManager() {
        return generalManager;
    }

    public void setGeneralManager(String generalManager) {
        this.generalManager = generalManager;
    }

    public String getRegisteredCapital() {
        return registeredCapital;
    }

    public void setRegisteredCapital(String registeredCapital) {
        this.registeredCapital = registeredCapital;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getNetAsset() {
        return netAsset;
    }

    public void setNetAsset(String netAsset) {
        this.netAsset = netAsset;
    }

    public String getNetCapital() {
        return netCapital;
    }

    public void setNetCapital(String netCapital) {
        this.netCapital = netCapital;
    }

    public String getSalesNum() {
        return salesNum;
    }

    public void setSalesNum(String salesNum) {
        this.salesNum = salesNum;
    }

    public String getOfficialAddress() {
        return officialAddress;
    }

    public void setOfficialAddress(String officialAddress) {
        this.officialAddress = officialAddress;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLicenseCode() {
        return licenseCode;
    }

    public void setLicenseCode(String licenseCode) {
        this.licenseCode = licenseCode;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBusiness() {
        return business;
    }

    public void setBusiness(String business) {
        this.business = business;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getComplaintCall() {
        return complaintCall;
    }

    public void setComplaintCall(String complaintCall) {
        this.complaintCall = complaintCall;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public Byte getIsNeeq() {
        return isNeeq;
    }

    public void setIsNeeq(Byte isNeeq) {
        this.isNeeq = isNeeq;
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

        NeeqSpecialEntity that = (NeeqSpecialEntity) o;

        if (id != that.id) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (fullName != null ? !fullName.equals(that.fullName) : that.fullName != null) return false;
        if (foundTime != null ? !foundTime.equals(that.foundTime) : that.foundTime != null) return false;
        if (legalRepresentative != null ? !legalRepresentative.equals(that.legalRepresentative) : that.legalRepresentative != null)
            return false;
        if (generalManager != null ? !generalManager.equals(that.generalManager) : that.generalManager != null)
            return false;
        if (registeredCapital != null ? !registeredCapital.equals(that.registeredCapital) : that.registeredCapital != null)
            return false;
        if (website != null ? !website.equals(that.website) : that.website != null) return false;
        if (netAsset != null ? !netAsset.equals(that.netAsset) : that.netAsset != null) return false;
        if (netCapital != null ? !netCapital.equals(that.netCapital) : that.netCapital != null) return false;
        if (salesNum != null ? !salesNum.equals(that.salesNum) : that.salesNum != null) return false;
        if (officialAddress != null ? !officialAddress.equals(that.officialAddress) : that.officialAddress != null)
            return false;
        if (post != null ? !post.equals(that.post) : that.post != null) return false;
        if (address != null ? !address.equals(that.address) : that.address != null) return false;
        if (email != null ? !email.equals(that.email) : that.email != null) return false;
        if (licenseCode != null ? !licenseCode.equals(that.licenseCode) : that.licenseCode != null) return false;
        if (type != null ? !type.equals(that.type) : that.type != null) return false;
        if (business != null ? !business.equals(that.business) : that.business != null) return false;
        if (summary != null ? !summary.equals(that.summary) : that.summary != null) return false;
        if (complaintCall != null ? !complaintCall.equals(that.complaintCall) : that.complaintCall != null)
            return false;
        if (info != null ? !info.equals(that.info) : that.info != null) return false;
        if (isNeeq != null ? !isNeeq.equals(that.isNeeq) : that.isNeeq != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (createdAt != null ? !createdAt.equals(that.createdAt) : that.createdAt != null) return false;
        if (updateAt != null ? !updateAt.equals(that.updateAt) : that.updateAt != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (fullName != null ? fullName.hashCode() : 0);
        result = 31 * result + (foundTime != null ? foundTime.hashCode() : 0);
        result = 31 * result + (legalRepresentative != null ? legalRepresentative.hashCode() : 0);
        result = 31 * result + (generalManager != null ? generalManager.hashCode() : 0);
        result = 31 * result + (registeredCapital != null ? registeredCapital.hashCode() : 0);
        result = 31 * result + (website != null ? website.hashCode() : 0);
        result = 31 * result + (netAsset != null ? netAsset.hashCode() : 0);
        result = 31 * result + (netCapital != null ? netCapital.hashCode() : 0);
        result = 31 * result + (salesNum != null ? salesNum.hashCode() : 0);
        result = 31 * result + (officialAddress != null ? officialAddress.hashCode() : 0);
        result = 31 * result + (post != null ? post.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (licenseCode != null ? licenseCode.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (business != null ? business.hashCode() : 0);
        result = 31 * result + (summary != null ? summary.hashCode() : 0);
        result = 31 * result + (complaintCall != null ? complaintCall.hashCode() : 0);
        result = 31 * result + (info != null ? info.hashCode() : 0);
        result = 31 * result + (isNeeq != null ? isNeeq.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (createdAt != null ? createdAt.hashCode() : 0);
        result = 31 * result + (updateAt != null ? updateAt.hashCode() : 0);
        return result;
    }
}
