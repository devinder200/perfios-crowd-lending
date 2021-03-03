package com.crowdlending.vo.experian.caps.capsApplicationDetails

import com.crowdlending.util.ExperianVOUtil
import com.fasterxml.jackson.databind.JsonNode

class CAPSOtherDetailsVO {
    String income
    String maritalStatus
    String employmentStatus
    String timeWithEmployer
    String numberOfMajorCreditCardHeld

    CAPSOtherDetailsVO(JsonNode jsonNode){
        this.income = jsonNode.get("Income").toString().replace("\"", "")
        this.maritalStatus = jsonNode.get("Marital_Status").toString().replace("\"", "")
        this.employmentStatus = ExperianVOUtil.fetchEmploymentStatus(jsonNode.get("Employment_Status").toString().replace("\"", ""))
        this.timeWithEmployer = jsonNode.get("Time_with_Employer").toString().replace("\"", "")
        this.numberOfMajorCreditCardHeld = jsonNode.get("Number_of_Major_Credit_Card_Held").toString().replace("\"", "")
    }
}
