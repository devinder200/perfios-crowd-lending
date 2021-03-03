package com.crowdlending.model.mongo

import org.springframework.data.mongodb.core.mapping.Document

import java.time.LocalDateTime

@Document(collection = "perfiosAnalysisMetaData")
class PerfiosAnalysisMetaData {
    String tenantId
    String apiResponse
    String editedResponse
    String perfiosTransactionId
    String clientTransactionId
    String supportingDocumentUuid
    String loanApplicationUuid
    Boolean forBankStatements = false
    Boolean forGst = false
    Boolean forItr = false
    Boolean forForm26AS = false
    Boolean forItr_V = false
    Boolean forPassport = false
    Boolean forAadhar = false
    Boolean forVoterId = false
    Boolean forPan = false
    Boolean forDrivingLicense = false
    Boolean forFinancialStatements = false
    Boolean forCrossAnalysisReport = false
    LocalDateTime dateCreated
    String crossAnalysisReportUuid
    String ocrVerifiedReport

}
