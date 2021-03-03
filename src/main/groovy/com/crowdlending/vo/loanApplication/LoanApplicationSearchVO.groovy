package com.crowdlending.vo.loanApplication

import com.crowdlending.enums.Enums

class LoanApplicationSearchVO implements Serializable{
    private static final long serialVersionUID = 2L

    BigDecimal toAmount
    BigDecimal fromAmount
    String loanId
    String borrowerName
    String borrowerEmail
    String fromDate
    String toDate
    String status
    String tag
    String city
    String type
    String borrowerId
    String borrowerPhoneNo
    String loanProduct
    Integer max = 25
    Integer offset = 0
    Long tenantId
    String borrowerIdentityNumberOne
    String borrowerIdentityNumberOneIssueDate

    String loanListingFromDate
    String loanListingToDate
    String loanInteractionFromDate
    String loanInteractionToDate
    String investorName
    String interactionStatus

    String dsaName
    BigDecimal interestRate
    String loanTenure
    String minimumFundedPercentage
    String maximumFundedPercentage
    String loanAuctionEndDate
    String riskType
    String dsaBranchName

    Date disbursedDate
    String umrnNumber
    String borrowerEmi
    String bankIfsc
    String borrowerVirtualAccountNumber
    String repaymentType
    String presentedAmount
    String penaltyInterest
    String bounceCharges
    String dailyPenaltyInterest
    String firstEMIDate
    String endDate
    String borrowerBankName
    String nachUserNumber
    String instrumentType
    String loanStartDate
    String uniqueReferenceID

    List<String> loanPurposeList
    List<String> cityList
    String tenantSelection
    List<String> filterLoanStatusList = []
    Boolean isEmpty = Boolean.TRUE


    List<Long> loanRiskTypeIds = []
    List<Long> loanCityIds = []
    List<Long> tagIdList = []
    List<Long> loanProductIds = []
    List<Long> employmentCategoryIds = []
    List<Long> residentTypeIds = []
    List<Long> educationTypeIds = []
    List<Long> residentOwnershipTypeIds = []
    List<String> gender = []
    List<Long> companyCategoryIds = []
    List<Long> loanDsaIds = []
    List<Long> loanApplicationIds = []

    List<Enums.LoanApplicationStatus> loanApplicationStatusList = []


    BigDecimal loanMinRateOfInterest
    BigDecimal loanMaxRateOfInterest
    Integer loanMinDurationMonths
    Integer loanMaxDurationMonths
    Integer loanMinDurationInDays
    Integer loanMaxDurationInDays
    Integer loanMinDurationInWeeks
    Integer loanMaxDurationInWeeks
    Enums.UserType userType = Enums.UserType.ADMIN
    String investmentCriteriaUuid
    String disbursalFromDate
    String disbursalToDate
    List<String> loanUuidList = []
    String loanApplicationIdentityNumberTwo
    String borrowerGender
    String residenceType
    String lang
    String dsaCity
    String dsaState
    String dsaCategory
    String dsaId
    String typeOfAddress
    String paymentDueDate
    String borrowerEmploymentCategory
    List<String> dsaBranchNameList = []


    LoanApplicationSearchVO(){}

    public List addElementInList(List list, def element, Boolean isElementInList = false) {
        if (element) {
            if (list) {
                list = isElementInList ? list.intersect(element) : (element in list) ? list.intersect([element]) : []
            } else {
                element ? list.add(element) : ''
            }
        }
        return list
    }
   



}
