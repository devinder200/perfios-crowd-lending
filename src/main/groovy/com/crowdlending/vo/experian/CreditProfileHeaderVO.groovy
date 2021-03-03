package com.crowdlending.vo.experian

import com.crowdlending.util.ExperianVOUtil
import com.fasterxml.jackson.databind.JsonNode

class CreditProfileHeaderVO {
    String reportTime
    String version
    String subscriber
    String enquiryUsername
    String reportNumber
    String reportDate
    String subscriberName

    CreditProfileHeaderVO(JsonNode jsonNode){
        this.reportTime = ExperianVOUtil.timeSeperatorForExperian(jsonNode.get("ReportTime").toString())
        this.version = jsonNode.get("Version").toString().replace("\"", "")
        this.subscriber = jsonNode.get("Subscriber").toString().replace("\"", "")
        this.enquiryUsername = jsonNode.get("Enquiry_Username").toString().replace("\"", "")
        this.reportNumber=jsonNode.get("ReportNumber").toString().replace("\"", "")
        this.reportDate = ExperianVOUtil.dateConverterForExperian(jsonNode.get("ReportDate").toString())
        this.subscriberName = jsonNode.get("Subscriber_Name").toString().replace("\"", "")
    }

}
