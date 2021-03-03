package com.crowdlending.vo.experian

import com.crowdlending.util.ExperianVOUtil


class HeaderVO {
    String reportTime
    String systemCode
    String reportDate
    String messageText

    HeaderVO(String reportTime, String systemCode, String reportDate, String messageText) {
        this.reportTime = ExperianVOUtil.timeSeperatorForExperian(reportTime.replace("\"", ""))
        this.systemCode = systemCode.replace("\"", "")
        this.reportDate = ExperianVOUtil.dateConverterForExperian(reportDate.replace("\"", ""))
        this.messageText = messageText.replace("\"", "")
    }
}
