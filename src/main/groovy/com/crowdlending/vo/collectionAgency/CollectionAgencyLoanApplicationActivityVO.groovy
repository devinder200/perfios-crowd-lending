package com.crowdlending.vo.collectionAgency

import com.crowdlending.enums.Enums
import com.fasterxml.jackson.annotation.JsonFormat
import static com.crowdlending.util.VOUtil.*

class CollectionAgencyLoanApplicationActivityVO {

    private String collectionAgencyUuid
    private String loanApplicationUuid
    @JsonFormat(pattern = JSON_DATE_FORMAT)
    private Date dateCreated
    @JsonFormat(pattern = JSON_DATE_FORMAT)
    private Date lastUpdated
    private String ipAddress
    private Long tenantId
    private Enums.Status status

    CollectionAgencyLoanApplicationActivityVO() {}

    CollectionAgencyLoanApplicationActivityVO(Object collectionAgencyLoanApplicationActivity) {
        this.collectionAgencyUuid = collectionAgencyLoanApplicationActivity.getCollectionAgencyUuid()
        this.loanApplicationUuid = collectionAgencyLoanApplicationActivity.getLoanApplicationUuid()
        this.dateCreated = collectionAgencyLoanApplicationActivity.getDateCreated()
        this.lastUpdated = collectionAgencyLoanApplicationActivity.getLastUpdated()
        this.ipAddress = collectionAgencyLoanApplicationActivity.getIpAddress()
        this.tenantId = collectionAgencyLoanApplicationActivity.getTenantId()
        this.status = collectionAgencyLoanApplicationActivity.getStatus()
    }

    String getCollectionAgencyUuid() {
        return collectionAgencyUuid
    }

    void setCollectionAgencyUuid(String collectionAgencyUuid) {
        this.collectionAgencyUuid = collectionAgencyUuid
    }

    String getLoanApplicationUuid() {
        return loanApplicationUuid
    }

    void setLoanApplicationUuid(String loanApplicationUuid) {
        this.loanApplicationUuid = loanApplicationUuid
    }

    Date getDateCreated() {
        return dateCreated
    }

    void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated
    }

    Date getLastUpdated() {
        return lastUpdated
    }

    void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated
    }

    String getIpAddress() {
        return ipAddress
    }

    void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress
    }

    Long getTenantId() {
        return tenantId
    }

    void setTenantId(Long tenantId) {
        this.tenantId = tenantId
    }

    Enums.Status getStatus() {
        return status
    }

    void setStatus(Enums.Status status) {
        this.status = status
    }
}
