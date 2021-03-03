package com.crowdlending.vo.experian.cais.accountDetails

import com.crowdlending.util.ExperianVOUtil
import com.fasterxml.jackson.databind.JsonNode

class CAISHolderDetailsVO {
    String incomeTAXPAN
    String surnameNonNormalized
    String alias
    String genderCode
    String dateOfBirth
    String firstNameNonNormalized
    String voterIDNumber
    String middleName1NonNormalized
    String middleName2NonNormalized
    String middleName3NonNormalized
    String passportNumber

    CAISHolderDetailsVO(JsonNode jsonNode) {
        this.incomeTAXPAN = jsonNode.get("Income_TAX_PAN").toString().replace("\"", "")
        this.surnameNonNormalized = jsonNode.get("Surname_Non_Normalized").toString().replace("\"", "")
        this.alias = jsonNode.get("Alias").toString().replace("\"", "")
        this.genderCode = ExperianVOUtil.fetchGender(jsonNode.get("Gender_Code").toString().replace("\"", ""))
        this.dateOfBirth = ExperianVOUtil.dateConverterForExperian(jsonNode.get("Date_of_birth").toString().replace("\"", ""))
        this.firstNameNonNormalized = jsonNode.get("First_Name_Non_Normalized").toString().replace("\"", "")
        this.voterIDNumber = jsonNode.get("Voter_ID_Number").toString().replace("\"", "")
        this.middleName1NonNormalized = jsonNode.get("Middle_Name_1_Non_Normalized").toString().replace("\"", "")
        this.middleName2NonNormalized = jsonNode.get("Middle_Name_2_Non_Normalized").toString().replace("\"", "")
        this.middleName3NonNormalized = jsonNode.get("Middle_Name_3_Non_Normalized").toString().replace("\"", "")
        this.passportNumber = jsonNode.get("Passport_Number").toString().replace("\"", "")
    }

    String getFullName() {
        String fullName = ''
        if (firstNameNonNormalized) {
            fullName = firstNameNonNormalized + ' '
        }
        if (middleName1NonNormalized) {
            fullName = fullName + middleName1NonNormalized + ' '
        }
        if (middleName2NonNormalized) {
            fullName = fullName + middleName2NonNormalized + ' '
        }
        if (middleName3NonNormalized) {
            fullName = fullName + middleName3NonNormalized + ' '
        }
        if (surnameNonNormalized) {
            fullName = fullName + surnameNonNormalized
        }
        return fullName
    }
}
