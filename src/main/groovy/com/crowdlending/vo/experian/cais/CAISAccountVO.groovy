package com.crowdlending.vo.experian.cais

import com.crowdlending.util.ExperianVOUtil
import com.crowdlending.vo.experian.cais.accountDetails.CAISAccountDetailsVO
import com.crowdlending.vo.experian.cais.summary.CAISSummaryVO
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.node.ArrayNode

class CAISAccountVO {
    CAISSummaryVO caisSummaryVO
    List<CAISAccountDetailsVO> caisAccountDetailsVOList
    Long totalSWSettledAmt

    CAISAccountVO(JsonNode jsonNode) {
        JsonNode CAIS_Summary = jsonNode.get("CAIS_Summary")
        this.caisSummaryVO = new CAISSummaryVO(CAIS_Summary)
        ArrayNode arrayNode = (ArrayNode) jsonNode.get("CAIS_Account_DETAILS")
        if (arrayNode.isArray()) {
            Iterator<JsonNode> elements = arrayNode.elements()
            List<CAISAccountDetailsVO> result = new ArrayList<>()
            while (elements.hasNext()) {
                JsonNode element = elements.next()
                CAISAccountDetailsVO caisAccountDetailsVO = new CAISAccountDetailsVO(element)
                if ((caisAccountDetailsVO?.accountStatusCode in ExperianVOUtil.accountStatusList()) && (caisAccountDetailsVO?.currentBalance)) {
                    totalSWSettledAmt = (totalSWSettledAmt?:0) + (Long.valueOf(caisAccountDetailsVO?.currentBalance?:'0'))
                }
                result.add(caisAccountDetailsVO)
            }
            this.caisAccountDetailsVOList = result
        }
    }
}
