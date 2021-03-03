package com.crowdlending.vo.experian

import com.fasterxml.jackson.databind.JsonNode

class NonCreditCAPSSummaryVO {
    String nonCreditCAPSLast7Days
    String nonCreditCAPSLast30Days
    String nonCreditCAPSLast90Days
    String nonCreditCAPSLast180Days

    NonCreditCAPSSummaryVO(JsonNode jsonNode){
        this.nonCreditCAPSLast7Days = jsonNode.get("NonCreditCAPSLast7Days").toString().replace("\"", "")
        this.nonCreditCAPSLast30Days = jsonNode.get("NonCreditCAPSLast30Days").toString().replace("\"", "")
        this.nonCreditCAPSLast90Days = jsonNode.get("NonCreditCAPSLast90Days").toString().replace("\"", "")
        this.nonCreditCAPSLast180Days = jsonNode.get("NonCreditCAPSLast180Days").toString().replace("\"", "")
    }
}
