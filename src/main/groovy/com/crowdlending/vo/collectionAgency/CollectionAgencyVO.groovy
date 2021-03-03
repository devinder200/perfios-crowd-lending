package com.crowdlending.vo.collectionAgency

import com.crowdlending.enums.Enums
import com.fasterxml.jackson.annotation.JsonFormat
import static com.crowdlending.util.VOUtil.*

class CollectionAgencyVO {

    @JsonFormat(pattern = JSON_DATE_FORMAT)
    private Date dateCreated
    @JsonFormat(pattern = JSON_DATE_FORMAT)
    private Date lastUpdated
    private String uuid
    private String identifierNumberOne
    private Long tenantId
    private String name
    private String firstName
    private String middleName
    private String secondLastName
    private String lastName
    private String fullName
    private String ownershipType
    private String title
    private String dateOfBirth
    private String gender
    private String citizenship
    private Enums.CollectionAgencyType type
    private Enums.CollectionAgencyStatus status

    CollectionAgencyVO() {}

    CollectionAgencyVO(Object collectionAgency) {
        this.dateCreated = collectionAgency?.getDateCreated()
        this.lastUpdated = collectionAgency?.getLastUpdated()
        this.uuid = collectionAgency?.getUuid()
        this.identifierNumberOne = collectionAgency?.getIdentifierNumberOne()
        this.tenantId = collectionAgency.getTenantId()
        this.name = collectionAgency.getName()
        this.firstName = collectionAgency.getFirstName()
        this.middleName = collectionAgency.getMiddleName()
        this.secondLastName = collectionAgency.getSecondLastName()
        this.lastName = collectionAgency.getLastName()
        this.fullName = collectionAgency.getFullName()
        this.ownershipType = collectionAgency.getOwnershipType()
        this.title = collectionAgency.getTitle()
        this.dateOfBirth = dateToString(collectionAgency.getDateOfBirth())
        this.gender = collectionAgency.getGender()
        this.citizenship = collectionAgency.getCitizenship()
        this.type = collectionAgency.getType()
        this.status = collectionAgency.getStatus()
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

    String getUuid() {
        return uuid
    }

    void setUuid(String uuid) {
        this.uuid = uuid
    }

    String getIdentifierNumberOne() {
        return identifierNumberOne
    }

    void setIdentifierNumberOne(String identifierNumberOne) {
        this.identifierNumberOne = identifierNumberOne
    }

    Long getTenantId() {
        return tenantId
    }

    void setTenantId(Long tenantId) {
        this.tenantId = tenantId
    }

    String getName() {
        return name
    }

    void setName(String name) {
        this.name = name
    }

    String getFirstName() {
        return firstName
    }

    void setFirstName(String firstName) {
        this.firstName = firstName
    }

    String getMiddleName() {
        return middleName
    }

    void setMiddleName(String middleName) {
        this.middleName = middleName
    }

    String getSecondLastName() {
        return secondLastName
    }

    void setSecondLastName(String secondLastName) {
        this.secondLastName = secondLastName
    }

    String getLastName() {
        return lastName
    }

    void setLastName(String lastName) {
        this.lastName = lastName
    }

    String getFullName() {
        return fullName
    }

    void setFullName(String fullName) {
        this.fullName = fullName
    }

    String getOwnershipType() {
        return ownershipType
    }

    void setOwnershipType(String ownershipType) {
        this.ownershipType = ownershipType
    }

    String getTitle() {
        return title
    }

    void setTitle(String title) {
        this.title = title
    }

    String getDateOfBirth() {
        return dateOfBirth
    }

    void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth
    }

    String getGender() {
        return gender
    }

    void setGender(String gender) {
        this.gender = gender
    }

    String getCitizenship() {
        return citizenship
    }

    void setCitizenship(String citizenship) {
        this.citizenship = citizenship
    }

    Enums.CollectionAgencyType getType() {
        return type
    }

    void setType(Enums.CollectionAgencyType type) {
        this.type = type
    }

    Enums.CollectionAgencyStatus getStatus() {
        return status
    }

    void setStatus(Enums.CollectionAgencyStatus status) {
        this.status = status
    }
}
