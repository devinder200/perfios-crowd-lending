package com.crowdlending.vo.experian.caps.capsApplicationDetails

import com.crowdlending.util.ExperianVOUtil
import com.fasterxml.jackson.databind.JsonNode

class CAPSApplicantAddressDetails {
    String flatNoPlotNoHouseNo
    String bldgNoSocietyName
    String roadNoNameAreaLocality
    String city
    String landmark
    String state
    String pinCode
    String countryCode

    CAPSApplicantAddressDetails(JsonNode jsonNode) {
        this.flatNoPlotNoHouseNo = jsonNode.get("FlatNoPlotNoHouseNo").toString().replace("\"", "")
        this.bldgNoSocietyName = jsonNode.get("BldgNoSocietyName").toString().replace("\"", "")
        this.roadNoNameAreaLocality = jsonNode.get("RoadNoNameAreaLocality").toString().replace("\"", "")
        this.city = jsonNode.get("City").toString().replace("\"", "")
        this.landmark = jsonNode.get("Landmark").toString().replace("\"", "")
        this.state = ExperianVOUtil.dateConverterForExperian(jsonNode.get("State").toString().replace("\"", ""))
        this.pinCode = jsonNode.get("PINCode").toString().replace("\"", "")
        this.countryCode = jsonNode.get("Country_Code").toString().replace("\"", "")
    }

    String getFullAddress() {
        String fullAddress = ''
        if (flatNoPlotNoHouseNo) {
            fullAddress = flatNoPlotNoHouseNo + ' '
        }
        if (bldgNoSocietyName) {
            fullAddress = fullAddress + bldgNoSocietyName + ' '
        }
        if (roadNoNameAreaLocality) {
            fullAddress = fullAddress + roadNoNameAreaLocality + ' '
        }
        if (landmark) {
            fullAddress = fullAddress + landmark + ' '
        }
        if (city) {
            fullAddress = fullAddress + city + ' '
        }
        if (state) {
            fullAddress = fullAddress + state + ' '
        }
        if (pinCode) {
            fullAddress = fullAddress + pinCode + ' '
        }
        if (countryCode) {
            fullAddress = fullAddress + countryCode
        }
        return fullAddress
    }
}
