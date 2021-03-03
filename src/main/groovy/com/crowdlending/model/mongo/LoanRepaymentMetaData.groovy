package com.crowdlending.model.mongo

import com.crowdlending.enums.Enums
import org.springframework.data.mongodb.core.mapping.Document

import java.time.LocalDateTime

@Document(collection = "loanRepaymentMetaData")
class LoanRepaymentMetaData {

    Long tenantId
    Long repaymentId
    String repaymentUuid
    LocalDateTime repaymentDate
    LocalDateTime repaymentPaidDate
    LocalDateTime documentDateCreated
    LocalDateTime documentLastUpdated
    LocalDateTime lastPenaltyCalculateDate       //For penalty which is cal daily
    LocalDateTime penaltyDiscountAppliedDate       //Will always hold last penalty discount applied date
    LocalDateTime lastLatePaymentFeeAppliedDate       //For one time fix penalty to be applied
    LocalDateTime lastWeeklyPenaltyCalculateDate       //For penalty which is cal weekly
    LocalDateTime chequeBouncingChargeDiscountDate     //Will always hold last chequeBouncingChargeDiscount applied date
    LocalDateTime lastAppliedChequeBouncingChargeDate
    BigDecimal amount
    BigDecimal interest
    BigDecimal penalties
    BigDecimal principal
    BigDecimal loanBalance
    BigDecimal serviceFees
    BigDecimal payableAmount
    BigDecimal taxAmountOnInterest
    BigDecimal principalOutstanding
    BigDecimal chequeBouncingCharges
    BigDecimal leftPenalty
    BigDecimal leftInterest
    BigDecimal leftPrincipal
    BigDecimal leftChequeBouncingCharge
    BigDecimal discount //penaltyDiscount
    BigDecimal chequeBouncingChargeDiscount
    Long daysDelayed
    Long paymentNumber
    Integer noOfChequeBounced
    Enums.LoanRepaymentStatus repaymentStatus
    String repaymentDescription
    String loanApplicationId
    String loanApplicationUuid
    String loanApplicationUniqueReferenceID
    Enums.LoanApplicationStatus loanApplicationStatus
    Boolean isLoanBeyondAuctionStage
    String borrowerEmailAddress
    String borrowerFirstname
    String borrowerMiddlename
    String borrowerLastname
    String borrowerFullname
    Boolean isFldg
    String receiptNumber
    BigDecimal tds
    BigDecimal tax1
    String tdsCertificate
    String leftServiceFee
    BigDecimal investorAdminFees
    String borrowerCompletePhoneNumber
    String loanTenureInMonths
    String loanInterestRate
    String coApplicatantNames
    Boolean isDefaulted
    Boolean isDelayed
    Boolean isChargedOff
    String loanApplicationTextVariable1
    String loanApplicationTextVariable2
    String loanApplicationTextVariable3
    String loanApplicationTextVariable4
    String loanApplicationTextVariable5
    String loanApplicationTextVariable6
    String loanApplicationTextVariable7
    String loanApplicationTextVariable8
    String loanApplicationTextVariable9
    String loanApplicationTextVariable10
    String dsaName
    BigDecimal totalPurchaseAmount
    BigDecimal purchaseAmount
    BigDecimal discountPercentage
    BigDecimal interestChargedToBorrower
    String loanIdentityNumberTwo
    String dsaBranchName
    String loanProduct
    BigDecimal legalFee
    BigDecimal assetFee
    BigDecimal lifeInsuranceFee
    BigDecimal additionalFeeOne
    BigDecimal additionalFeeTwo
    BigDecimal additionalFeeThree
    BigDecimal additionalFeeFour
    String paymentMode
    String borrowerContactFax
    String borrowerContactEmail
    String borrowerContactPhone
    String borrowerContactWebsite
    //TODO: ADD MORE FIELDS FOR MIS REPORTS
    String borrowerUuid
    BigDecimal emiNumber
    BigDecimal gapDayInterest
    BigDecimal amountPaidOut
    BigDecimal totalInterestAmount
    BigDecimal emiDueAmount
    BigDecimal emiPaymentRecieved
    BigDecimal processingFees
    BigDecimal processingFeesTax
    BigDecimal grossProcessingFees
    BigDecimal reservedFundFee
    BigDecimal reservedFundFeeTax
    BigDecimal legalFeeTax
    BigDecimal weeklyPenaltyPayment
    BigDecimal lifeInsuranceFeeTax
    BigDecimal serviceFeePercentage
    BigDecimal creditScoringFee
    BigDecimal creditScoringFeeTax
    BigDecimal monthlyPenaltyPercentage
    BigDecimal assetFeeTax
    BigDecimal additionalFeeTaxOne
    BigDecimal additionalFeeTaxTwo
    BigDecimal additionalFeeTaxThree
    BigDecimal additionalFeeTaxFour
    BigDecimal fullSettlementPenalty
    BigDecimal fullSettlementDiscount
    BigDecimal earlyRepaymentPenalty
    BigDecimal earlyRepaymentDiscount
    BigDecimal earlyRepaymentTax
    BigDecimal recievableAmount
    String loanTenureInWeeks
    String loanTenureInDays
    BigDecimal monthlyPenaltyFixedPayment
    BigDecimal paymentRecievedTowardsPenalty
    BigDecimal paymentRecievedTowardsPrincipal
    BigDecimal paymentRecievedTowardsInterest
    BigDecimal paymentRecievedAgainstServiceFee
    BigDecimal componentFromLoanRepaymentPrincipal
    BigDecimal componentFromLoanRepaymentInterest
    BigDecimal fixedPenaltyFixedUnsucessfullMonthPayment
    LocalDateTime disbursedDate

    LoanRepaymentMetaData() {}

    Boolean isDeleteFromMysql() {
        return this.repaymentId && this.repaymentUuid
    }
}