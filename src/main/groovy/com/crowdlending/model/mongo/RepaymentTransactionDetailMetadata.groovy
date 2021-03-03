package com.crowdlending.model.mongo

import org.springframework.data.mongodb.core.mapping.Document


@Document(collection = "repaymentTransactionDetailMetadata")
class  RepaymentTransactionDetailMetadata {

    Long tenantId
    String borrowerIdentifierNumberOne
    String dsaIdentifierNumberOne
    String loanIdentityNumberOne
    String loanUuid
    String loanIdentityNumberTwo
    Long repaymentId
    String repaymentUuid
    BigDecimal paidPrincipal
    BigDecimal paidInterest
    BigDecimal paidPenalties
    BigDecimal paidFees
    BigDecimal paidRegistrationFee
    BigDecimal outstandingPrincipal
    BigDecimal totalPaidAmount
    Date executionDate

}