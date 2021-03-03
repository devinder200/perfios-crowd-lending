package com.crowdlending.vo.experian

import com.fasterxml.jackson.databind.JsonNode

class MatchResultVO {
    String exactMatch
    MatchResultVO(JsonNode jsonNode){
        this.exactMatch = jsonNode.get("Exact_match").toString().replace("\"", "")
    }
}
