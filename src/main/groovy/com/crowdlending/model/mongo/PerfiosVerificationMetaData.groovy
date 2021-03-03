package com.crowdlending.model.mongo


import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "perfiosVerificationMetaData")
class PerfiosVerificationMetaData {
    Long tenantId
    Date dateCreated
    Date lastUpdated
    String uuid = UUID.randomUUID()
    String name
    String input
    String infoType
    String verificationType
    String path
    String password
    String originalImagePath
    String loanApplicationUUID
    String perfiosTransactionId
    String perfiosResponse
    String clientTransactionId
    String perfiosCategoryName
    String documentStatus
    String verificationStatus
    String apiResponse
    String editedResponse
    String userType
    String userUUID
    String perfiosIntigrationUUID
    String input1
    String input2
    String input3
    Long cost
}
