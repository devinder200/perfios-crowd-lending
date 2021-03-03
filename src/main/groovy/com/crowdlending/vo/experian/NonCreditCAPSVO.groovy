package com.crowdlending.vo.experian

import com.crowdlending.vo.experian.caps.capsApplicationDetails.CAPSApplicationDetailsVO
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.node.ArrayNode

class NonCreditCAPSVO {
    NonCreditCAPSSummaryVO nonCreditCAPSSummaryVO
    List<CAPSApplicationDetailsVO> capsApplicationDetailsVOS
    Integer nonCreditEnqSize

    NonCreditCAPSVO(JsonNode jsonNode) {
        this.nonCreditCAPSSummaryVO = new NonCreditCAPSSummaryVO(jsonNode.get("NonCreditCAPS_Summary"))
        ArrayNode arrayNode = (ArrayNode) jsonNode.get("CAPS_Application_Details")
        if (arrayNode?.isArray()) {
            Iterator<JsonNode> elements = arrayNode.elements()
            List<CAPSApplicationDetailsVO> result = new ArrayList<>()
            while (elements.hasNext()) {
                JsonNode element = elements.next()
                result.add(new CAPSApplicationDetailsVO(element))
            }
            this.capsApplicationDetailsVOS = result
        }
        this.nonCreditEnqSize = capsApplicationDetailsVOS?.size()
    }
}