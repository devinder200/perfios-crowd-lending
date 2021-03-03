package com.crowdlending.model.mongo

import java.time.LocalDateTime

class PerfiosRateCardMetaData {

    String name
    String supportingDocumentUuid
    String loanApplicationUuid
    String commonPropertyUuid
    Long tenantId
    Integer totalCost
    Integer transactionCount
    List<TransactionList> transactionList


}

class TransactionList {
    LocalDateTime dateCreated
    Integer totalCost
    String perfiosTransactionId
}
