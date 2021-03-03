package com.crowdlending.vo.transaction

class TransactionSearchVO implements Serializable {

    private static final long serialVersionUID = 2L

    String id
    String payerName
    String payerEmail
    String receiverName
    String receiverEmail
    BigDecimal fromAmount
    BigDecimal toAmount
    String status
    String fromDate
    String toDate
    Long max = 20
    Long offset = 0
    String tenantSelection
    String loanId
    Long tenantId
    String type

}
