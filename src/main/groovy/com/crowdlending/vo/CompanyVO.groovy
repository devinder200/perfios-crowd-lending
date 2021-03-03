package com.crowdlending.vo

import java.time.LocalDateTime

class CompanyVO {

    String uuid
    Long tenantId
    LocalDateTime dateCreated
    LocalDateTime lastUpdated
    String name
    String website
    String description
    String designation
    String businessName
    String businessType
    String targetMarkets
    String noOfEmployees
    String companyWebsite
    String companyAddress
    String businessVintage
    String companyIndustry
    String companyCategory
    String prodDescription
    String registrationCode
    String positionInCompany
    String landLineNumber
    String faxNumber
    String faxNumberCountryCode
    String phoneNumber
    String phoneNumberCountryCode
    String contactPersonName
    String contactPersonPhoneNumber
    String contactPersonEmailAddress
    String contactPersonAlternateNumber
    String lpgId
    String dlNumber
    String gstNumber
    String vehicleRC
    String udyogAdharNumber
    String relationLitigationCheck
    String caseIdentificationNumber
    String courtComplexLitigationCheck
    String consumerId                   //karza : Electricity
    String serviceProvider              //karza : Electricity
    String itrvAcknowledgementNumber    //karza : ITR-V authentication
    String buyerIdentityNumberOne //Buyer buyer
    String investorIdentityNumberOne //Investor investor
    String loanApplicationIdentityNumberOne //LoanApplication loanApplication
    String directSellingAssociateIdentityNumberOne //DirectSellingAssociate directSellingAssociate
    String companyIdentityNumberOne     //for GSTIN
    String companyIdentityNumberTwo
    String companyIdentityNumberThree
    String companyIdentityNumberFour
    String companyIdentityNumberFive
    String companyIdentityNumberSix
    LocalDateTime companyIdentityNumberOneIssueDate
    LocalDateTime companyIdentityNumberTwoIssueDate
    LocalDateTime companyIdentityNumberThreeIssueDate
    LocalDateTime companyIdentityNumberFourIssueDate
    LocalDateTime companyIdentityNumberFiveIssueDate
    LocalDateTime companyIdentityNumberSixIssueDate
    LocalDateTime companyIdentityNumberOneExpiryDate
    LocalDateTime companyIdentityNumberTwoExpiryDate
    LocalDateTime companyIdentityNumberThreeExpiryDate
    LocalDateTime companyIdentityNumberFourExpiryDate
    LocalDateTime companyIdentityNumberFiveExpiryDate
    LocalDateTime companyIdentityNumberSixExpiryDate
    LocalDateTime companyRegistrationExpiryDate
    LocalDateTime operatingDate
    LocalDateTime dateOfArticle
    Double shareholdingPercentage
    BigDecimal statedBalance
    BigDecimal statedTurnover
    AddressVO addressVO
    AddressVO addressVO1
    AddressVO addressVO2
    AddressVO addressVO3
    ExtraPropertyVO extraPropertyVO

    CompanyVO() {}
}