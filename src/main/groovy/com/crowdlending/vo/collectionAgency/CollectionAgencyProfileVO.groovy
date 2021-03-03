package com.crowdlending.vo.collectionAgency

import com.fasterxml.jackson.annotation.JsonFormat
import static com.crowdlending.util.VOUtil.*

class CollectionAgencyProfileVO {

    @JsonFormat(pattern = JSON_DATE_FORMAT)
    private Date dateCreated
    @JsonFormat(pattern = JSON_DATE_FORMAT)
    private Date lastUpdated
    private String uuid
    private String identityNumberOne
    private String identityNumberTwo
    private String identityNumberThree
    private String identityNumberFour
    private String identityNumberFive
    private String identityNumberSix
    private String textVariable1
    private String textVariable2
    private String textVariable3
    private String textVariable4
    private String textVariable5
    private String textVariable6
    private String textVariable7
    private String textVariable8
    private String textVariable9
    private String textVariable10
    private String dateVariable1
    private String dateVariable2
    private String dateVariable3
    private String dateVariable4
    private String addressUuid
    private String addressOneUuid
    private String collectionAgencyUuid
    private Long tenantId

    CollectionAgencyProfileVO() {}

    CollectionAgencyProfileVO(Object profile) {
        this.dateCreated = profile.getDateCreated()
        this.lastUpdated = profile.getLastUpdated()
        this.uuid = profile.getUuid()
        this.identityNumberOne = profile.getIdentityNumberOne()
        this.identityNumberTwo = profile.getIdentityNumberTwo()
        this.identityNumberThree = profile.getIdentityNumberThree()
        this.identityNumberFour = profile.getIdentityNumberFour()
        this.identityNumberFive = profile.getIdentityNumberFive()
        this.identityNumberSix = profile.getIdentityNumberSix()
        this.textVariable1 = profile.getTextVariable1()
        this.textVariable2 = profile.getTextVariable2()
        this.textVariable3 = profile.getTextVariable3()
        this.textVariable4 = profile.getTextVariable4()
        this.textVariable5 = profile.getTextVariable5()
        this.textVariable6 = profile.getTextVariable6()
        this.textVariable7 = profile.getTextVariable7()
        this.textVariable8 = profile.getTextVariable8()
        this.textVariable9 = profile.getTextVariable9()
        this.textVariable10 = profile.getTextVariable10()
        this.dateVariable1 = dateToString(profile.getDateVariable1())
        this.dateVariable2 = dateToString(profile.getDateVariable2())
        this.dateVariable3 = dateToString(profile.getDateVariable3())
        this.dateVariable4 = dateToString(profile.getDateVariable4())
        this.addressUuid = profile.getAddressUuid()
        this.addressOneUuid = profile.getAddressOneUuid()
        this.collectionAgencyUuid = profile.getCollectionAgencyUuid()
        this.tenantId = profile.getTenantId()
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

    String getIdentityNumberOne() {
        return identityNumberOne
    }

    void setIdentityNumberOne(String identityNumberOne) {
        this.identityNumberOne = identityNumberOne
    }

    String getIdentityNumberTwo() {
        return identityNumberTwo
    }

    void setIdentityNumberTwo(String identityNumberTwo) {
        this.identityNumberTwo = identityNumberTwo
    }

    String getIdentityNumberThree() {
        return identityNumberThree
    }

    void setIdentityNumberThree(String identityNumberThree) {
        this.identityNumberThree = identityNumberThree
    }

    String getIdentityNumberFour() {
        return identityNumberFour
    }

    void setIdentityNumberFour(String identityNumberFour) {
        this.identityNumberFour = identityNumberFour
    }

    String getIdentityNumberFive() {
        return identityNumberFive
    }

    void setIdentityNumberFive(String identityNumberFive) {
        this.identityNumberFive = identityNumberFive
    }

    String getIdentityNumberSix() {
        return identityNumberSix
    }

    void setIdentityNumberSix(String identityNumberSix) {
        this.identityNumberSix = identityNumberSix
    }

    String getTextVariable1() {
        return textVariable1
    }

    void setTextVariable1(String textVariable1) {
        this.textVariable1 = textVariable1
    }

    String getTextVariable2() {
        return textVariable2
    }

    void setTextVariable2(String textVariable2) {
        this.textVariable2 = textVariable2
    }

    String getTextVariable3() {
        return textVariable3
    }

    void setTextVariable3(String textVariable3) {
        this.textVariable3 = textVariable3
    }

    String getTextVariable4() {
        return textVariable4
    }

    void setTextVariable4(String textVariable4) {
        this.textVariable4 = textVariable4
    }

    String getTextVariable5() {
        return textVariable5
    }

    void setTextVariable5(String textVariable5) {
        this.textVariable5 = textVariable5
    }

    String getTextVariable6() {
        return textVariable6
    }

    void setTextVariable6(String textVariable6) {
        this.textVariable6 = textVariable6
    }

    String getTextVariable7() {
        return textVariable7
    }

    void setTextVariable7(String textVariable7) {
        this.textVariable7 = textVariable7
    }

    String getTextVariable8() {
        return textVariable8
    }

    void setTextVariable8(String textVariable8) {
        this.textVariable8 = textVariable8
    }

    String getTextVariable9() {
        return textVariable9
    }

    void setTextVariable9(String textVariable9) {
        this.textVariable9 = textVariable9
    }

    String getTextVariable10() {
        return textVariable10
    }

    void setTextVariable10(String textVariable10) {
        this.textVariable10 = textVariable10
    }

    String getDateVariable1() {
        return dateVariable1
    }

    void setDateVariable1(String dateVariable1) {
        this.dateVariable1 = dateVariable1
    }

    String getDateVariable2() {
        return dateVariable2
    }

    void setDateVariable2(String dateVariable2) {
        this.dateVariable2 = dateVariable2
    }

    String getDateVariable3() {
        return dateVariable3
    }

    void setDateVariable3(String dateVariable3) {
        this.dateVariable3 = dateVariable3
    }

    String getDateVariable4() {
        return dateVariable4
    }

    void setDateVariable4(String dateVariable4) {
        this.dateVariable4 = dateVariable4
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
