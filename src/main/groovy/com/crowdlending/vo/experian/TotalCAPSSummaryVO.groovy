package com.crowdlending.vo.experian

class TotalCAPSSummaryVO {
    String totalCAPSLast7Days
    String totalCAPSLast30Days
    String totalCAPSLast90Days
    String totalCAPSLast180Days

    TotalCAPSSummaryVO(String totalCAPSLast7Days, String totalCAPSLast30Days, String totalCAPSLast90Days, String totalCAPSLast180Days) {
        this.totalCAPSLast7Days = totalCAPSLast7Days.replace("\"", "")
        this.totalCAPSLast30Days = totalCAPSLast30Days.replace("\"", "")
        this.totalCAPSLast90Days = totalCAPSLast90Days.replace("\"", "")
        this.totalCAPSLast180Days = totalCAPSLast180Days.replace("\"", "")
    }
}
