package com.crowdlending.vo.experian.cais.accountDetails

import com.crowdlending.util.ExperianVOUtil
import com.fasterxml.jackson.databind.JsonNode

class CAISHolderIDDetailsVO {
    String panIssueDate
    String incomeTAXPAN
    String panExpirationDate

    String rationCardIssueDate
    String rationCardNumber
    String rationCardExpirationDate

    String voterIDIssueDate
    String voterIDNumber
    String voterIDExpirationDate

    String driverLicenseIssueDate
    String driverLicenseNumber
    String driverLicenseExpirationDate

    String eMailId

    String passportIssueDate
    String passportNumber
    String passportExpirationDate

    String universalIDIssueDate
    String universalIDNumber
    String universalIDExpirationDate

    CAISHolderIDDetailsVO(JsonNode jsonNode){
        this.panIssueDate= ExperianVOUtil.dateConverterForExperian(jsonNode.get("PAN_Issue_Date").toString().replace("\"", ""))
        this.incomeTAXPAN = jsonNode.get("Income_TAX_PAN").toString().replace("\"", "")
        this.panExpirationDate = ExperianVOUtil.dateConverterForExperian(jsonNode.get("PAN_Expiration_Date").toString().replace("\"", ""))
        this.rationCardIssueDate = ExperianVOUtil.dateConverterForExperian(jsonNode.get("Ration_Card_Issue_Date").toString().replace("\"", ""))
        this.rationCardNumber = jsonNode.get("Ration_Card_Number").toString().replace("\"", "")
        this.rationCardExpirationDate = ExperianVOUtil.dateConverterForExperian(jsonNode.get("Ration_Card_Expiration_Date").toString().replace("\"", ""))
        this.voterIDIssueDate = ExperianVOUtil.dateConverterForExperian(jsonNode.get("Voter_ID_Issue_Date").toString().replace("\"", ""))
        this.voterIDNumber = jsonNode.get("Voter_ID_Number").toString().replace("\"", "")
        this.voterIDExpirationDate = ExperianVOUtil.dateConverterForExperian(jsonNode.get("Voter_ID_Expiration_Date").toString().replace("\"", ""))
        this.driverLicenseIssueDate = ExperianVOUtil.dateConverterForExperian(jsonNode.get("Driver_License_Issue_Date").toString().replace("\"", ""))
        this.driverLicenseNumber = jsonNode.get("Driver_License_Number").toString().replace("\"", "")
        this.driverLicenseExpirationDate = ExperianVOUtil.dateConverterForExperian(jsonNode.get("Driver_License_Expiration_Date").toString().replace("\"", ""))
        this.eMailId = jsonNode.get("EMailId").toString().replace("\"", "")
        this.passportIssueDate = ExperianVOUtil.dateConverterForExperian(jsonNode.get("Passport_Issue_Date").toString().replace("\"", ""))
        this.passportNumber = jsonNode.get("Passport_Number").toString().replace("\"", "")
        this.passportExpirationDate = ExperianVOUtil.dateConverterForExperian(jsonNode.get("Passport_Expiration_Date").toString().replace("\"", ""))
        this.universalIDIssueDate = ExperianVOUtil.dateConverterForExperian(jsonNode.get("Universal_ID_Issue_Date").toString().replace("\"", ""))
        this.universalIDNumber = jsonNode.get("Universal_ID_Number").toString().replace("\"", "")
        this.universalIDExpirationDate = ExperianVOUtil.dateConverterForExperian(jsonNode.get("Universal_ID_Expiration_Date").toString().replace("\"", ""))
    }
}
