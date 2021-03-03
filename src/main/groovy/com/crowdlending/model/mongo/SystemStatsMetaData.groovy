package com.crowdlending.model.mongo

import org.springframework.data.mongodb.core.mapping.Document

import java.time.LocalDateTime

@Document(collection = "systemStatsMetaData")
class SystemStatsMetaData {

    LocalDateTime dateCreated
    LocalDateTime fromDate
    LocalDateTime toDate
    Long tenantId

    Long newBorrowersSignup = 0
    Long newInvestorsSignup = 0
    Long newDSAsSignup = 0
    Long newLoanApplicationsReceived = 0
    Long newLoanApplicationsFunded = 0
    Long newLoanApplicationsApproved = 0
    Long newLoanApplicationsLaunchedInAuction = 0

    Long totalNoOfBorrowerers = 0
    Long totalNoOfInvestors = 0
    Long totalNoOfDSAs = 0

    Long newBorrowersSignupBasic = 0
    Long newBorrowersSignupCompleted = 0
    Long newBorrowersSignupApproved = 0
    Long newBorrowersSignupRejected = 0

    Long newInvestorsSignupBasic = 0
    Long newInvestorsSignupPersonal = 0
    Long newInvestorsSignupCompleted = 0
    Long newInvestorsSignupApproved = 0
    Long newInvestorsSignupRejected = 0

    Long newDSAsSignupAwaitingApproval = 0
    Long newDSAsSignupApproved = 0
    Long newDSAsSignupRejected = 0
    Long newDSAsSignupExpired = 0

    Long totalNoOfBorrowerersBasic = 0
    Long totalNoOfBorrowerersCompleted = 0
    Long totalNoOfBorrowerersApproved = 0
    Long totalNoOfBorrowerersRejected = 0

    Long totalNoOfInvestorsBasic = 0
    Long totalNoOfInvestorsPersonal = 0
    Long totalNoOfInvestorsCompleted = 0
    Long totalNoOfInvestorsApproved = 0
    Long totalNoOfInvestorsRejected = 0

    Long totalNoOfDSAsAwaitingApproval = 0
    Long totalNoOfDSAsApproved = 0
    Long totalNoOfDSAsRejected = 0
    Long totalNoOfDSAsExpired = 0

    Long totalNoOfLoanApplicationsReceived = 0
    Long totalNoOfLoanApplicationsFunded = 0
    Long totalNoOfLoanApplicationsApproved = 0
    Long totalNoOfLoanApplicationsLaunchedInAuction = 0
    Long newLoanApplicationsDisbursed = 0
    BigDecimal totalAmountDisbursed = 0.0
    BigDecimal totalAmountFunded = 0.0
    Long numberOfRepaymentsPaid = 0
    BigDecimal amountOfRepaymentsPaid = 0.0
    Long numberOfInvestments = 0
    BigDecimal amountOfInvestments = 0.0
    Long numberOfBidsPlaced = 0
    BigDecimal amountOfBidsPlaced = 0.0
    Long totalNumberOfDeposit = 0
    BigDecimal totalAmountDeposit = 0.0
    Long totalNumberOfWithdraw = 0
    BigDecimal totalAmountWithdraw = 0.0
    Long numberOfRepaymentsOverdue = 0
    BigDecimal amountOfRepaymentsOverdue = 0.0
    String month

    Boolean forWeek = null
    Boolean forMonth = null
    Boolean forDaily = null

    Long systemStatsId

    SystemStatsMetaData() {

    }
}
