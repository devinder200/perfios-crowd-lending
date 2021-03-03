package com.crowdlending.model.mongo

import org.springframework.data.mongodb.core.mapping.Document
import java.time.LocalDateTime

@Document(collection = "transactionMetaData")
class TransactionMetaData implements Serializable {

    private static final long serialVersionUID = 2L

    Long tenantId
    //LoanInfo
    String loanUuid
    String loanIdentityNumberOne
    String loanRepaymentUuid
    //LoanRepaymentInfo
    //PayerInfo
    String payerUuid
    String payerName
    String payerType
    String payerEmail
    String payerIdentityNumberOne
    //ReceiverInfo
    String receiverUuid
    String receiverName
    String receiverType
    String receiverEmail
    String receiverIdentityNumberOne
    //TransactionInfo
    Long transactionId
    String transactionUuid
    String transactionIdentifierNumberOne
    LocalDateTime dateCreated
    LocalDateTime executionDate
    BigDecimal amount
    String bankName
    String bankReferenceNo
    String documentName
    String reasonForCharges
    String transactionType
    String transactionStatus
    BigDecimal payerAvailableCashAfterTransaction

    TransactionMetaData() {}
}
