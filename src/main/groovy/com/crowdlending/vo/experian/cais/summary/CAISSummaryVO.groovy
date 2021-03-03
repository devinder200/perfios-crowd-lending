package com.crowdlending.vo.experian.cais.summary

import com.fasterxml.jackson.databind.JsonNode

class CAISSummaryVO {
    TotalOutStandingBalanceVO totalOutStandingBalance
    CreditAccountVO creditAccountVO

    CAISSummaryVO(JsonNode jsonNode){
        JsonNode Total_Outstanding_Balance = jsonNode.get("Total_Outstanding_Balance")
        this.totalOutStandingBalance = new TotalOutStandingBalanceVO(Total_Outstanding_Balance)
        JsonNode Credit_Account = jsonNode.get("Credit_Account")
        this.creditAccountVO = new CreditAccountVO(Credit_Account)
    }

}
