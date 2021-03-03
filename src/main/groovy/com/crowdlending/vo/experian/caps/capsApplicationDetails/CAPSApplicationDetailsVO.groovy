package com.crowdlending.vo.experian.caps.capsApplicationDetails

import com.crowdlending.util.ExperianVOUtil
import com.fasterxml.jackson.databind.JsonNode

class CAPSApplicationDetailsVO {
    String subscriberCode
    String subscriberName
    String dateOfRequest
    String product
    String reportTime
    String reportNumber
    String enquiryReason
    String financePurpose
    String amountFinanced
    String durationOfAgreement
    CAPSApplicantDetailsVO capsApplicantDetailsVO
    CAPSOtherDetailsVO capsOtherDetailsVO
    CAPSApplicantAddressDetails capsApplicantAddressDetails

    CAPSApplicationDetailsVO(JsonNode jsonNode){
        this.subscriberCode = jsonNode.get("Subscriber_code").toString().replace("\"", "")
        this.subscriberName = jsonNode.get("Subscriber_Name").toString().replace("\"", "")
        this.dateOfRequest = ExperianVOUtil.dateConverterForExperian(jsonNode.get("Date_of_Request").toString().replace("\"", ""))
        this.product = jsonNode.get("Product").toString().replace("\"", "")
        this.reportTime = jsonNode.get("ReportTime").toString().replace("\"", "")
        this.reportNumber = jsonNode.get("ReportNumber").toString().replace("\"", "")
        this.enquiryReason = ExperianVOUtil.fetchSearchType(jsonNode.get("Enquiry_Reason").toString().replace("\"", ""))
        this.financePurpose = jsonNode.get("Finance_Purpose").toString().replace("\"", "")
        this.amountFinanced = jsonNode.get("Amount_Financed").toString().replace("\"", "")
        this.durationOfAgreement = jsonNode.get("Duration_Of_Agreement").toString().replace("\"", "")
        this.capsApplicantDetailsVO = new CAPSApplicantDetailsVO(jsonNode.get("CAPS_Applicant_Details"))
        this.capsOtherDetailsVO = new CAPSOtherDetailsVO(jsonNode.get("CAPS_Other_Details"))
        this.capsApplicantAddressDetails = new CAPSApplicantAddressDetails(jsonNode.get("CAPS_Applicant_Address_Details"))
    }
}
