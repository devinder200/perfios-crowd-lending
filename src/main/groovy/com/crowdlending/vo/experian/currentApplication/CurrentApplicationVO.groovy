package com.crowdlending.vo.experian.currentApplication

import com.crowdlending.vo.experian.currentApplication.details.CurrentApplicationDetailsVO
import com.fasterxml.jackson.databind.JsonNode

class CurrentApplicationVO {
    CurrentApplicationDetailsVO currentApplicationDetailsVO

    CurrentApplicationVO(JsonNode jsonNode){
        this.currentApplicationDetailsVO= new CurrentApplicationDetailsVO(jsonNode.get("Current_Application_Details"))
    }
}
