package com.crowdlending.vo.collectionAgency

import com.fasterxml.jackson.annotation.JsonFormat
import static com.crowdlending.util.VOUtil.*

class CollectionAgencyCompanyVO {

    @JsonFormat(pattern = JSON_DATE_FORMAT)
    private Date dateCreated
    @JsonFormat(pattern = JSON_DATE_FORMAT)
    private Date lastUpdated
    private String uuid
    private String companyName
    private String companyIdentityNumberOne
    private String companyIdentityNumberTwo
    private String companyIdentityNumberThree
    private String companyIdentityNumberFour
    private String companyIdentityNumberFive
    private String companyIdentityNumberSix
    private String companyTextVariable1
    private String companyTextVariable2
    private String companyTextVariable3
    private String companyTextVariable4
    private String companyTextVariable5
    private String companyTextVariable6
    private String companyTextVariable7
    private String companyTextVariable8
    private String companyTextVariable9
    private String companyTextVariable10
    private String companyDateVariable1
    private String companyDateVariable2
    private String companyDateVariable3
    private String companyDateVariable4
    private String gstNumber
    private String companyRegistrationNumber
    private String companyTurnover
    private String companyBalance
    private String companyIndustry
    private String companyDescription
    private String noOfEmployees
    private String positionInCompany
    private String companyAge
    private String addressUuid
    private String addressOneUuid
    private String collectionAgencyUuid
    private Long tenantId

    CollectionAgencyCompanyVO() {}

    public CollectionAgencyCompanyVO(Object company) {
        this.dateCreated = company.getDateCreated()
        this.lastUpdated = company.getLastUpdated()
        this.uuid = company.getUuid()
        this.companyName = company.getCompanyName()
        this.companyIdentityNumberOne = company.getCompanyIdentityNumberOne()
        this.companyIdentityNumberTwo = company.getCompanyIdentityNumberTwo()
        this.companyIdentityNumberThree = company.getCompanyIdentityNumberThree()
        this.companyIdentityNumberFour = company.getCompanyIdentityNumberFour()
        this.companyIdentityNumberFive = company.getCompanyIdentityNumberFive()
        this.companyIdentityNumberSix = company.getCompanyIdentityNumberSix()
        this.companyTextVariable1 = company.getCompanyTextVariable1()
        this.companyTextVariable2 = company.getCompanyTextVariable2()
        this.companyTextVariable3 = company.getCompanyTextVariable3()
        this.companyTextVariable4 = company.getCompanyTextVariable4()
        this.companyTextVariable5 = company.getCompanyTextVariable5()
        this.companyTextVariable6 = company.getCompanyTextVariable6()
        this.companyTextVariable7 = company.getCompanyTextVariable7()
        this.companyTextVariable8 = company.getCompanyTextVariable8()
        this.companyTextVariable9 = company.getCompanyTextVariable9()
        this.companyTextVariable10 = company.getCompanyTextVariable10()
        this.companyDateVariable1 = dateToString(company.getCompanyDateVariable1())
        this.companyDateVariable2 = dateToString(company.getCompanyDateVariable2())
        this.companyDateVariable3 = dateToString(company.getCompanyDateVariable3())
        this.companyDateVariable4 = dateToString(company.getCompanyDateVariable4())
        this.gstNumber = company.getGstNumber()
        this.companyRegistrationNumber = company.getCompanyRegistrationNumber()
        this.companyTurnover = company.getCompanyTurnover()
        this.companyBalance = company.getCompanyBalance()
        this.companyIndustry = company.getCompanyIndustry()
        this.companyDescription = company.getCompanyDescription()
        this.noOfEmployees = company.getNoOfEmployees()
        this.positionInCompany = company.getPositionInCompany()
        this.companyAge = company.getCompanyAge()
        this.addressUuid = company.getAddressUuid()
        this.addressOneUuid = company.getAddressOneUuid()
        this.collectionAgencyUuid = company.getCollectionAgencyUuid()
        this.tenantId = company.getTenantId()
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

    String getCompanyName() {
        return companyName
    }

    void setCompanyName(String companyName) {
        this.companyName = companyName
    }

    String getCompanyIdentityNumberOne() {
        return companyIdentityNumberOne
    }

    void setCompanyIdentityNumberOne(String companyIdentityNumberOne) {
        this.companyIdentityNumberOne = companyIdentityNumberOne
    }

    String getCompanyIdentityNumberTwo() {
        return companyIdentityNumberTwo
    }

    void setCompanyIdentityNumberTwo(String companyIdentityNumberTwo) {
        this.companyIdentityNumberTwo = companyIdentityNumberTwo
    }

    String getCompanyIdentityNumberThree() {
        return companyIdentityNumberThree
    }

    void setCompanyIdentityNumberThree(String companyIdentityNumberThree) {
        this.companyIdentityNumberThree = companyIdentityNumberThree
    }

    String getCompanyIdentityNumberFour() {
        return companyIdentityNumberFour
    }

    void setCompanyIdentityNumberFour(String companyIdentityNumberFour) {
        this.companyIdentityNumberFour = companyIdentityNumberFour
    }

    String getCompanyIdentityNumberFive() {
        return companyIdentityNumberFive
    }

    void setCompanyIdentityNumberFive(String companyIdentityNumberFive) {
        this.companyIdentityNumberFive = companyIdentityNumberFive
    }

    String getCompanyIdentityNumberSix() {
        return companyIdentityNumberSix
    }

    void setCompanyIdentityNumberSix(String companyIdentityNumberSix) {
        this.companyIdentityNumberSix = companyIdentityNumberSix
    }

    String getCompanyTextVariable1() {
        return companyTextVariable1
    }

    void setCompanyTextVariable1(String companyTextVariable1) {
        this.companyTextVariable1 = companyTextVariable1
    }

    String getCompanyTextVariable2() {
        return companyTextVariable2
    }

    void setCompanyTextVariable2(String companyTextVariable2) {
        this.companyTextVariable2 = companyTextVariable2
    }

    String getCompanyTextVariable3() {
        return companyTextVariable3
    }

    void setCompanyTextVariable3(String companyTextVariable3) {
        this.companyTextVariable3 = companyTextVariable3
    }

    String getCompanyTextVariable4() {
        return companyTextVariable4
    }

    void setCompanyTextVariable4(String companyTextVariable4) {
        this.companyTextVariable4 = companyTextVariable4
    }

    String getCompanyTextVariable5() {
        return companyTextVariable5
    }

    void setCompanyTextVariable5(String companyTextVariable5) {
        this.companyTextVariable5 = companyTextVariable5
    }

    String getCompanyTextVariable6() {
        return companyTextVariable6
    }

    void setCompanyTextVariable6(String companyTextVariable6) {
        this.companyTextVariable6 = companyTextVariable6
    }

    String getCompanyTextVariable7() {
        return companyTextVariable7
    }

    void setCompanyTextVariable7(String companyTextVariable7) {
        this.companyTextVariable7 = companyTextVariable7
    }

    String getCompanyTextVariable8() {
        return companyTextVariable8
    }

    void setCompanyTextVariable8(String companyTextVariable8) {
        this.companyTextVariable8 = companyTextVariable8
    }

    String getCompanyTextVariable9() {
        return companyTextVariable9
    }

    void setCompanyTextVariable9(String companyTextVariable9) {
        this.companyTextVariable9 = companyTextVariable9
    }

    String getCompanyTextVariable10() {
        return companyTextVariable10
    }

    void setCompanyTextVariable10(String companyTextVariable10) {
        this.companyTextVariable10 = companyTextVariable10
    }

    String getCompanyDateVariable1() {
        return companyDateVariable1
    }

    void setCompanyDateVariable1(String companyDateVariable1) {
        this.companyDateVariable1 = companyDateVariable1
    }

    String getCompanyDateVariable2() {
        return companyDateVariable2
    }

    void setCompanyDateVariable2(String companyDateVariable2) {
        this.companyDateVariable2 = companyDateVariable2
    }

    String getCompanyDateVariable3() {
        return companyDateVariable3
    }

    void setCompanyDateVariable3(String companyDateVariable3) {
        this.companyDateVariable3 = companyDateVariable3
    }

    String getCompanyDateVariable4() {
        return companyDateVariable4
    }

    void setCompanyDateVariable4(String companyDateVariable4) {
        this.companyDateVariable4 = companyDateVariable4
    }

    String getGstNumber() {
        return gstNumber
    }

    void setGstNumber(String gstNumber) {
        this.gstNumber = gstNumber
    }

    String getCompanyRegistrationNumber() {
        return companyRegistrationNumber
    }

    void setCompanyRegistrationNumber(String companyRegistrationNumber) {
        this.companyRegistrationNumber = companyRegistrationNumber
    }

    String getCompanyTurnover() {
        return companyTurnover
    }

    void setCompanyTurnover(String companyTurnover) {
        this.companyTurnover = companyTurnover
    }

    String getCompanyBalance() {
        return companyBalance
    }

    void setCompanyBalance(String companyBalance) {
        this.companyBalance = companyBalance
    }

    String getCompanyIndustry() {
        return companyIndustry
    }

    void setCompanyIndustry(String companyIndustry) {
        this.companyIndustry = companyIndustry
    }

    String getCompanyDescription() {
        return companyDescription
    }

    void setCompanyDescription(String companyDescription) {
        this.companyDescription = companyDescription
    }

    String getNoOfEmployees() {
        return noOfEmployees
    }

    void setNoOfEmployees(String noOfEmployees) {
        this.noOfEmployees = noOfEmployees
    }

    String getPositionInCompany() {
        return positionInCompany
    }

    void setPositionInCompany(String positionInCompany) {
        this.positionInCompany = positionInCompany
    }

    String getCompanyAge() {
        return companyAge
    }

    void setCompanyAge(String companyAge) {
        this.companyAge = companyAge
    }

    String getAddressUuid() {
        return addressUuid
    }

    void setAddressUuid(String addressUuid) {
        this.addressUuid = addressUuid
    }

    String getAddressOneUuid() {
        return addressOneUuid
    }

    void setAddressOneUuid(String addressOneUuid) {
        this.addressOneUuid = addressOneUuid
    }

    String getCollectionAgencyUuid() {
        return collectionAgencyUuid
    }

    void setCollectionAgencyUuid(String collectionAgencyUuid) {
        this.collectionAgencyUuid = collectionAgencyUuid
    }

    Long getTenantId() {
        return tenantId
    }

    void setTenantId(Long tenantId) {
        this.tenantId = tenantId
    }
}
