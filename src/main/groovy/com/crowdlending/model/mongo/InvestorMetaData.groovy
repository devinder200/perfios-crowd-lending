package com.crowdlending.model.mongo

import com.crowdlending.enums.Enums
import com.crowdlending.vo.BankDetailVO
import com.crowdlending.vo.CompanyVO
import com.crowdlending.vo.investor.InvestorProfileVO
import com.crowdlending.vo.UserVO
import java.time.LocalDateTime

class InvestorMetaData {

    //Investor
    Long tenantId
    Long investorId
    String investorUuid
    LocalDateTime dateCreated
    LocalDateTime lastUpdated
    String investorCategory
    String identifierPrefix
    String identifierNumberOne
    String identifierNumberTwo
    String virtualAccountName
    String virtualAccountBank
    String virtualAccountNumber
    String fullName
    String profilePicPath
    String profilePicContentType
    Boolean isProfileImagePresent
    Float minLoanDuration
    Float maxLoanDuration
    Float minRateOfInterest
    Float maxRateOfInterest
    BigDecimal availableCash
    Float minInvestmentAmount
    Float maxInvestmentAmount
    Enums.InvestorProfileStatus investorProfileStatus
    //User
    UserVO userVO
    //Company
    CompanyVO companyVO
    //BankDetail
    BankDetailVO bankDetailVO
    //InvestorProfile
    InvestorProfileVO investorProfileVO
    //Derived Properties
    BigDecimal totalAmountInvested

    InvestorMetaData() {}

    InvestorMetaData removeUnnecessaryFieldsForApi() {
        this.userVO = null
        this.dateCreated = null
        this.investorProfileVO.referralSource = null
        return this
    }

}