package com.crowdlending.vo.investor

import com.crowdlending.enums.Enums
import com.crowdlending.vo.AddressVO
import com.crowdlending.vo.ExtraPropertyVO

import java.time.LocalDateTime

class InvestorProfileVO {

    String uuid
    Long tenantId
    LocalDateTime dateCreated
    LocalDateTime lastUpdated
    String title
    String firstName
    String middleName
    String secondLastName
    String lastName
    String displayName
    String gender
    String jobType
    String description
    String citizenship
    String employerType
    String religionType
    String maritalStatus
    String qualification
    String residenceType
    String casteCategory
    String referralSource
    String firstSchoolName
    String placeOfBirthCity
    String placeOfBirthState
    String investmentPurpose
    String employmentCategory
    String residentOwnershipType
    String lpgId
    String dl_no
    String gstNumber
    String udyogAdharNumber
    String consumerId                   //karza : Electricity
    String serviceProvider              //karza : Electricity
    String itrvAcknowledgementNumber    //karza : ITR-V authentication
    String relationLitigationCheck
    String caseIdentificationNumber
    String courtComplexLitigationCheck
    String identityNumberOne
    String identityNumberTwo
    String identityNumberThree  //voterId
    String identityNumberFour   //passport number
    String identityNumberFive
    String identityNumberSix
    String identityNumberFourType //passport type
    LocalDateTime identityNumberOneIssueDate
    LocalDateTime identityNumberTwoIssueDate
    LocalDateTime identityNumberThreeIssueDate
    LocalDateTime identityNumberFourIssueDate
    LocalDateTime identityNumberFiveIssueDate
    LocalDateTime identityNumberSixIssueDate
    LocalDateTime identityNumberOneExpiryDate
    LocalDateTime identityNumberTwoExpiryDate
    LocalDateTime identityNumberThreeExpiryDate
    LocalDateTime identityNumberFourExpiryDate
    LocalDateTime identityNumberFiveExpiryDate
    LocalDateTime identityNumberSixExpiryDate
    LocalDateTime dateOfBirth
    Enums.InvestorType type
    Boolean selfConfirmation
    Boolean isPersonWithDisability
    Boolean seekingApproval
    Boolean nationalityApproval
    Boolean declarationApproval
    Boolean notificationApproval
    Boolean profileAuthorizationApproval
    Integer durationForInvest
    Double interestRate
    BigDecimal grossIncome
    BigDecimal interestIncome
    BigDecimal amountToInvest
    BigDecimal homeExpenses
    BigDecimal otherExpenses
    BigDecimal utilitiesExpenses
    BigDecimal houseLoanExpenses
    BigDecimal insuranceExpenses
    BigDecimal creditCardExpenses
    BigDecimal entertainmentExpenses
    BigDecimal transportationExpenses
    AddressVO addressVO
    ExtraPropertyVO extraPropertyVO
//    City placeOfBirth

    InvestorProfileVO() {}

}