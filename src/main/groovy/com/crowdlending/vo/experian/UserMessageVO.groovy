package com.crowdlending.vo.experian

import com.fasterxml.jackson.databind.JsonNode

class UserMessageVO {
    String userMessageText

    UserMessageVO(JsonNode jsonNode){
        this.userMessageText = jsonNode.get("UserMessageText").toString().replace("\"", "")
    }
}
