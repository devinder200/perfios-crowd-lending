package com.crowdlending.vo.experian.currentApplication.details

import com.crowdlending.util.ExperianVOUtil
import com.fasterxml.jackson.databind.JsonNode

class CurrentApplicantAddressDetailsVO {
    String countryCode
    String roadNoNameAreaLocality
    String state
    String landmark
    String bldgNoSocietyName
    String flatNoPlotNoHouseNo
    String city
    String pinCode

    CurrentApplicantAddressDetailsVO(JsonNode jsonNode){
        this.countryCode = jsonNode.get("Country_Code").toString().replace("\"", "")
        this.roadNoNameAreaLocality = jsonNode.get("RoadNoNameAreaLocality").toString().replace("\"", "")
        this.state = ExperianVOUtil.fetchState(jsonNode.get("State").toString())
        this.landmark = jsonNode.get("Landmark").toString().replace("\"", "")
        this.bldgNoSocietyName = jsonNode.get("BldgNoSocietyName").toString().replace("\"", "")
        this.flatNoPlotNoHouseNo = jsonNode.get("FlatNoPlotNoHouseNo").toString().replace("\"", "")
        this.city = jsonNode.get("City").toString().replace("\"", "")
        this.pinCode = jsonNode.get("PINCode").toString()
    }

}
