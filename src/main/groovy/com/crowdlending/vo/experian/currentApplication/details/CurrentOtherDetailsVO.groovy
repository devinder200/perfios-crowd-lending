package com.crowdlending.vo.experian.currentApplication.details

import com.fasterxml.jackson.databind.JsonNode

class CurrentOtherDetailsVO {
    String timeWithEmployer
    String employmentStatus
    String numberOfMajorCreditCardHeld
    String maritalStatus
    String income

    CurrentOtherDetailsVO(JsonNode jsonNode){
        this.timeWithEmployer = jsonNode.get("Time_with_Employer").toString().replace("\"", "")
        this.employmentStatus = jsonNode.get("Employment_Status").toString().replace("\"", "")
        this.numberOfMajorCreditCardHeld = jsonNode.get("Number_of_Major_Credit_Card_Held").toString().replace("\"", "")
        this.maritalStatus = jsonNode.get("Marital_Status").toString().replace("\"", "")
        this.income = jsonNode.get("Income").toString().replace("\"", "")
    }
}
