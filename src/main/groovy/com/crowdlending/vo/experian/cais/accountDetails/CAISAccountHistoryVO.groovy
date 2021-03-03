package com.crowdlending.vo.experian.cais.accountDetails

import com.fasterxml.jackson.databind.JsonNode

class CAISAccountHistoryVO {
    String daysPastDue
    String month
    String assetClassification
    String year

    CAISAccountHistoryVO(JsonNode jsonNode) {
        this.daysPastDue = jsonNode.get("Days_Past_Due").toString().replace("\"", "")
        this.month = jsonNode.get("Month").toString().replace("\"", "")
        this.assetClassification = jsonNode.get("Asset_Classification").toString().replace("\"", "")
        this.year = jsonNode.get("Year").toString().replace("\"", "")
    }
}
