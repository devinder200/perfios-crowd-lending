package com.crowdlending.vo.experian.cais.summary

import com.fasterxml.jackson.databind.JsonNode


class CreditAccountVO {
    String creditAccountActive
    String creditAccountClosed
    String creditAccountDefault
    String creditAccountTotal
    String cadSuitFiledCurrentBalance

    CreditAccountVO(JsonNode jsonNode) {
        this.creditAccountActive = jsonNode.get("CreditAccountActive").toString().replace("\"", "")
        this.creditAccountClosed = jsonNode.get("CreditAccountClosed").toString().replace("\"", "")
        this.creditAccountDefault = jsonNode.get("CreditAccountDefault").toString().replace("\"", "")
        this.creditAccountTotal = jsonNode.get("CreditAccountTotal").toString().replace("\"", "")
        this.cadSuitFiledCurrentBalance = jsonNode.get("CADSuitFiledCurrentBalance").toString().replace("\"", "")
    }
}
