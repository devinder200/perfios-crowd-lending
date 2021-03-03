package com.crowdlending.vo.experian.caps.capsApplicationDetails

import com.crowdlending.util.ExperianVOUtil
import com.fasterxml.jackson.databind.JsonNode

class CAPSApplicantDetailsVO {
    String firstName
    String lastName
    String middleName1
    String middleName2
    String middleName3
    String genderCode
    String incomeTaxPan
    String panIssueDate
    String panExpirationDate
    String passportNumber
    String passportIssueDate
    String passportExpirationDate
    String votersIdentityCard
    String voterIDIssueDate
    String voterIDExpirationDate
    String driverLicenseNumber
    String driverLicenseIssueDate
    String driverLicenseExpirationDate
    String rationCardNumber
    String rationCardIssueDate
    String rationCardExpirationDate
    String universalIDNumber
    String universalIDIssueDate
    String universalIDExpirationDate
    String dateOfBirthApplicant
    String telephoneNumberApplicant1st
    String telephoneType
    String telephoneExtension
    String mobilePhoneNumber
    String eMailId

    CAPSApplicantDetailsVO(JsonNode jsonNode){
        this.firstName = jsonNode.get("First_Name").toString().replace("\"", "")
        this.lastName = jsonNode.get("Last_Name").toString().replace("\"", "")
        this.middleName1 = jsonNode.get("Middle_Name1").toString().replace("\"", "")
        this.middleName2 = jsonNode.get("Middle_Name2").toString().replace("\"", "")
        this.middleName3 = jsonNode.get("Middle_Name3").toString().replace("\"", "")
        this.genderCode = ExperianVOUtil.fetchGender(jsonNode.get("Gender_Code").toString().replace("\"", ""))
        this.incomeTaxPan = jsonNode.get("IncomeTaxPan").toString().replace("\"", "")
        this.panIssueDate = ExperianVOUtil.dateConverterForExperian(jsonNode.get("PAN_Issue_Date").toString().replace("\"", ""))
        this.panExpirationDate = ExperianVOUtil.dateConverterForExperian(jsonNode.get("PAN_Expiration_Date").toString().replace("\"", ""))
        this.passportNumber = jsonNode.get("Passport_number").toString().replace("\"", "")
        this.passportIssueDate = ExperianVOUtil.dateConverterForExperian(jsonNode.get("Passport_Issue_Date").toString().replace("\"", ""))
        this.passportExpirationDate = ExperianVOUtil.dateConverterForExperian(jsonNode.get("Passport_Expiration_Date").toString().replace("\"", ""))
        this.votersIdentityCard = jsonNode.get("Voter_s_Identity_Card").toString().replace("\"", "")
        this.voterIDIssueDate = ExperianVOUtil.dateConverterForExperian(jsonNode.get("Voter_ID_Issue_Date").toString().replace("\"", ""))
        this.voterIDExpirationDate = ExperianVOUtil.dateConverterForExperian(jsonNode.get("Voter_ID_Expiration_Date").toString().replace("\"", ""))
        this.driverLicenseNumber = jsonNode.get("Driver_License_Number").toString().replace("\"", "")
        this.driverLicenseIssueDate = ExperianVOUtil.dateConverterForExperian(jsonNode.get("Driver_License_Issue_Date").toString().replace("\"", ""))
        this.driverLicenseExpirationDate = ExperianVOUtil.dateConverterForExperian(jsonNode.get("Driver_License_Expiration_Date").toString().replace("\"", ""))
        this.rationCardNumber = jsonNode.get("Ration_Card_Number").toString().replace("\"", "")
        this.rationCardIssueDate = ExperianVOUtil.dateConverterForExperian(jsonNode.get("Ration_Card_Issue_Date").toString().replace("\"", ""))
        this.rationCardExpirationDate = ExperianVOUtil.dateConverterForExperian(jsonNode.get("Ration_Card_Expiration_Date").toString().replace("\"", ""))
        this.universalIDNumber = jsonNode.get("Universal_ID_Number").toString().replace("\"", "")
        this.universalIDIssueDate = ExperianVOUtil.dateConverterForExperian(jsonNode.get("Universal_ID_Issue_Date").toString().replace("\"", ""))
        this.universalIDExpirationDate = ExperianVOUtil.dateConverterForExperian(jsonNode.get("Universal_ID_Expiration_Date").toString().replace("\"", ""))
        this.dateOfBirthApplicant = ExperianVOUtil.dateConverterForExperian(jsonNode.get("Date_Of_Birth_Applicant").toString().replace("\"", ""))
        this.telephoneNumberApplicant1st = jsonNode.get("Telephone_Number_Applicant_1st").toString().replace("\"", "")
        this.telephoneType = jsonNode.get("Telephone_Type").toString().replace("\"", "")
        this.telephoneExtension = jsonNode.get("Telephone_Extension").toString().replace("\"", "")
        this.mobilePhoneNumber = jsonNode.get("MobilePhoneNumber").toString().replace("\"", "")
        this.eMailId = jsonNode.get("EMailId").toString().replace("\"", "")
    }

    String getFullName() {
        String fullName = ''
        if (firstName) {
            fullName = firstName + ' '
        }
        if (middleName1) {
            fullName = fullName + middleName1 + ' '
        }
        if (middleName2) {
            fullName = fullName + middleName2 + ' '
        }
        if (middleName3) {
            fullName = fullName + middleName3 + ' '
        }
        if (lastName) {
            fullName = fullName + lastName
        }
        return fullName
    }

}
