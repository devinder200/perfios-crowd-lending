package com.crowdlending.vo

import java.time.LocalDateTime

class BankDetailVO {

    String uuid
    Long tenantId
    LocalDateTime dateCreated
    LocalDateTime lastUpdated
    String ifsc
    String mirc
    String status
    String comments
    String bankName
    String swiftCode
    String branchName
    String branchCity
    String bankAddress
    String branchPinCode
    String accountNumber
    String accountStatus
    String repaymentType
    String bankAccountType
    String natureOfFacility
    String accountHolderName
    Boolean isAdminBankAccount
    LocalDateTime dateOfOpeningAccount
    LocalDateTime mandateSendToBank
//    NACH
    Boolean isNachDetail
    String nachUMRN
    String nachStatus
    String nachUtilityCode
    String nachSponsorBankCode
//    UMRN
    String umrnNumber
    LocalDateTime umrnValidTillDate
//    Domain
//    User user
//    Company company

    BankDetailVO() {}

}
