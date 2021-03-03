package com.crowdlending.vo.experian.caps

import com.fasterxml.jackson.databind.JsonNode

class CAPSSummaryVO {
    String capsLast7Days
    String capsLast30Days
    String capsLast90Days
    String capsLast180Days

    CAPSSummaryVO(JsonNode jsonNode){
        this.capsLast7Days = jsonNode.get("CAPSLast7Days").toString().replace("\"", "")
        this.capsLast30Days = jsonNode.get("CAPSLast30Days").toString().replace("\"", "")
        this.capsLast90Days = jsonNode.get("CAPSLast90Days").toString().replace("\"", "")
        this.capsLast180Days = jsonNode.get("CAPSLast180Days").toString().replace("\"", "")
    }
}
