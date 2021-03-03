package com.crowdlending.vo

import java.time.LocalDateTime

class AddressVO implements Serializable {

    private static final long serialVersionUID = 2L

    Long tenantId
    Long id
    String uuid
    LocalDateTime dateCreated
    LocalDateTime lastUpdated
//    Names
    String line1Name
    String line2Name
    String line3Name
    String subDistrictName
    String districtName
    String cityName
    String stateName
    String zipCodeName
    String countryName
    String livingSinceName
    String ownershipTypeName
//    Values
    String line1Value
    String line2Value
    String line3Value
    String subDistrictValue
    String districtValue
    String cityValue
    String stateValue
    String zipCodeValue
    String countryValue
    String livingSinceValue
    String ownershipTypeValue
    String typeOfAddressValue
    LocalDateTime livingSinceDateValue
    Integer sortIndex
    String addressName
    Boolean isDeletable
    Boolean isMandatory
//    BorrowerSignupSettingField borrowerSignupSettingField

    AddressVO() {
        line1Name = "line1"
        line2Name = "line2"
        line3Name = "line3"
        stateName = "state"
        cityName = "city"
        zipCodeName = "zipCode"
        countryName = "country"
        districtName = "district"
        subDistrictName = "subDistrict"
        ownershipTypeName = "ownershipType"
        livingSinceName = "livingSince"
    }
}