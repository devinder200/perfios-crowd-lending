package com.crowdlending.vo.experian.cais.accountDetails

import com.crowdlending.util.ExperianVOUtil
import com.fasterxml.jackson.databind.JsonNode

class CAISHolderAddressDetailsVO {
    String firstLineOfAddressNonNormalized
    String secondLineOfAddressNonNormalized
    String thirdLineOfAddressNonNormalized
    String fifthLineOfAddressNonNormalized
    String addressIndicatorNonNormalized
    String cityNonNormalized
    String stateNonNormalized
    String zipPostalCodeNonNormalized
    String residenceCodeNonNormalized
    String countryCodeNonNormalized

    CAISHolderAddressDetailsVO(JsonNode jsonNode) {
        this.firstLineOfAddressNonNormalized = jsonNode.get("First_Line_Of_Address_non_normalized").toString().replace("\"", "")
        this.secondLineOfAddressNonNormalized = jsonNode.get("Second_Line_Of_Address_non_normalized").toString().replace("\"", "")
        this.thirdLineOfAddressNonNormalized = jsonNode.get("Third_Line_Of_Address_non_normalized").toString().replace("\"", "")
        this.fifthLineOfAddressNonNormalized = jsonNode.get("Fifth_Line_Of_Address_non_normalized").toString().replace("\"", "")
        this.addressIndicatorNonNormalized = jsonNode.get("Address_indicator_non_normalized").toString().replace("\"", "")
        this.cityNonNormalized = jsonNode.get("City_non_normalized").toString().replace("\"", "")
        this.stateNonNormalized = ExperianVOUtil.fetchState(jsonNode.get("State_non_normalized").toString().replace("\"", ""))
        this.zipPostalCodeNonNormalized = jsonNode.get("ZIP_Postal_Code_non_normalized").toString().replace("\"", "")
        this.residenceCodeNonNormalized = jsonNode.get("Residence_code_non_normalized").toString().replace("\"", "")
        this.countryCodeNonNormalized = jsonNode.get("CountryCode_non_normalized").toString().replace("\"", "")
    }

    String getFullAddress() {
        String fullAddress = ''
        if (firstLineOfAddressNonNormalized) {
            fullAddress = firstLineOfAddressNonNormalized + ' '
        }
        if (secondLineOfAddressNonNormalized) {
            fullAddress = fullAddress + secondLineOfAddressNonNormalized + ' '
        }
        if (thirdLineOfAddressNonNormalized) {
            fullAddress = fullAddress + thirdLineOfAddressNonNormalized + ' '
        }
        if (fifthLineOfAddressNonNormalized) {
            fullAddress = fullAddress + fifthLineOfAddressNonNormalized + ' '
        }
        if (addressIndicatorNonNormalized) {
            fullAddress = fullAddress + addressIndicatorNonNormalized + ' '
        }
        if (cityNonNormalized) {
            fullAddress = fullAddress + cityNonNormalized + ' '
        }
        if (stateNonNormalized) {
            fullAddress = fullAddress + stateNonNormalized + ' '
        }
        if (zipPostalCodeNonNormalized) {
            fullAddress = fullAddress + zipPostalCodeNonNormalized + ' '
        }
        if (countryCodeNonNormalized) {
            fullAddress = fullAddress + countryCodeNonNormalized
        }
        return fullAddress
    }

}
