package com.crowdlending.model.mongo

import java.time.LocalDateTime

class PerfiosApiResponseMetaData {

    String clientTransactionId
    String errorCode
    String message
    String perfiosTransactionId
    String status
    String tenantId
    String categoryType
    LocalDateTime dateCreated
    LocalDateTime lastUpdated
    String transactionStatus
    Boolean isCallBackReceived = false
    String loanId
    String documentUploadType
    String perfiosIntegrationUuid
}
