package com.crowdlending.vo.experian.cais.summary

import com.fasterxml.jackson.databind.JsonNode

class TotalOutStandingBalanceVO {
    String outstandingBalanceUnSecured
    String outstandingBalanceUnSecuredPercentage
    String outstandingBalanceSecured
    String outstandingBalanceSecuredPercentage
    String outstandingBalanceAll

    TotalOutStandingBalanceVO(JsonNode jsonNode){
        this.outstandingBalanceUnSecured = jsonNode.get("Outstanding_Balance_UnSecured").toString().replace("\"", "")
        this.outstandingBalanceUnSecuredPercentage = jsonNode.get("Outstanding_Balance_UnSecured_Percentage").toString().replace("\"", "")
        this.outstandingBalanceSecured = jsonNode.get("Outstanding_Balance_Secured").toString().replace("\"", "")
        this.outstandingBalanceSecuredPercentage = jsonNode.get("Outstanding_Balance_Secured_Percentage").toString().replace("\"", "")
        this.outstandingBalanceAll = jsonNode.get("Outstanding_Balance_All").toString().replace("\"", "")
    }
}
