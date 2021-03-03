package com.crowdlending.vo.experian.cais.accountDetails

import com.crowdlending.util.ExperianVOUtil
import com.fasterxml.jackson.databind.JsonNode

class CAISHolderPhoneDetailsVO {
    String telephoneExtension
    String telephoneNumber
    String mobileTelephoneNumber
    String faxNumber
    String telephoneType
    String eMailId

    CAISHolderPhoneDetailsVO(JsonNode jsonNode){
        this.telephoneExtension = jsonNode.get("Telephone_Extension").toString().replace("\"", "")
        this.telephoneNumber = jsonNode.get("Telephone_Number").toString().replace("\"", "")
        this.mobileTelephoneNumber = jsonNode.get("Mobile_Telephone_Number").toString().replace("\"", "")
        this.faxNumber = jsonNode.get("FaxNumber").toString().replace("\"", "")
        this.telephoneType = ExperianVOUtil.fetchPhoneType(jsonNode.get("Telephone_Type").toString().replace("\"", ""))
        this.eMailId = jsonNode.get("EMailId").toString().replace("\"", "")
    }
}
