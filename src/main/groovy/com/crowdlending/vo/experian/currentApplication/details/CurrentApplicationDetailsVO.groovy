package com.crowdlending.vo.experian.currentApplication.details

import com.fasterxml.jackson.databind.JsonNode

class CurrentApplicationDetailsVO {
    CurrentOtherDetailsVO currentOtherDetailsVO
    CurrentApplicantAdditionalAddressDetailsVO currentApplicantAdditionalAddressDetailsVO
    String enquiryReason
    String amountFinanced
    CurrentApplicantAddressDetailsVO currentApplicantAddressDetailsVO
    String durationOfAgreement
    String financePurpose
    CurrentApplicantDetailsVO currentApplicantDetailsVO

    CurrentApplicationDetailsVO(JsonNode jsonNode){
        this.currentOtherDetailsVO = new CurrentOtherDetailsVO(jsonNode.get("Current_Other_Details"))
        this.currentApplicantAdditionalAddressDetailsVO = new CurrentApplicantAdditionalAddressDetailsVO(jsonNode.get("Current_Applicant_Additional_AddressDetails"))
        this.enquiryReason = jsonNode.get("Enquiry_Reason").toString().replace("\"", "")
        this.amountFinanced = jsonNode.get("Amount_Financed").toString().replace("\"", "")
        this.currentApplicantAddressDetailsVO = new CurrentApplicantAddressDetailsVO(jsonNode.get("Current_Applicant_Address_Details"))
        this.durationOfAgreement = jsonNode.get("Duration_Of_Agreement").toString().replace("\"", "")
        this.financePurpose = jsonNode.get("Finance_Purpose").toString().replace("\"", "")
        this.currentApplicantDetailsVO = new CurrentApplicantDetailsVO(jsonNode.get("Current_Applicant_Details"))
    }
}
