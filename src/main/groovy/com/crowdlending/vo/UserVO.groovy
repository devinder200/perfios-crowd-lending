package com.crowdlending.vo

class UserVO {

    String uuid
    Long tenantId
    String username
    String referredBy
    String referralCode
    String landLineNumber
    String phoneNumber
    String phoneNumberCountryCode
    //AlternativeDetails
    String alternativeUsername
    String alternativeNumber
    String alternativeNumberCountryCode
    Boolean enabled
    Boolean sendSMS
    Boolean sendEmail
    Boolean accountLocked
    Boolean accountExpired
    Boolean isPhoneVerified
    Boolean isEmailVerified
    Boolean hasDownloadedMobileApp

    UserVO() {}
}