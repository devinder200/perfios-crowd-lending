package com.crowdlending.vo.experian.caps

import com.crowdlending.vo.experian.caps.capsApplicationDetails.CAPSApplicationDetailsVO
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.node.ArrayNode

class CAPSVO {
    CAPSSummaryVO capsSummaryVO
    List<CAPSApplicationDetailsVO> capsApplicationDetailsVOS
    Integer creditEnqSize

    CAPSVO(JsonNode jsonNode){
        this.capsSummaryVO = new CAPSSummaryVO(jsonNode.get("CAPS_Summary"))
        ArrayNode arrayNode = (ArrayNode)jsonNode.get("CAPS_Application_Details")
        if(arrayNode?.isArray()){
            Iterator<JsonNode> elements = arrayNode.elements()
            List<CAPSApplicationDetailsVO> result = new ArrayList<>()
            while (elements.hasNext()) {
                JsonNode element = elements.next()
                result.add(new CAPSApplicationDetailsVO(element))
            }
            this.capsApplicationDetailsVOS = result
        }
        this.creditEnqSize = capsApplicationDetailsVOS?.size()
    }
}
