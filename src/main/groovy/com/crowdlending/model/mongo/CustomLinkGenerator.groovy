package com.crowdlending.model.mongo

import com.crowdlending.enums.Enums
import org.springframework.data.mongodb.core.mapping.Document
import java.time.LocalDateTime

@Document(collection = "customLinkGenerator")
class CustomLinkGenerator {

    Long tenantId
    String uuid = generateUUID()
    String link
    String email
    String ipAddress
    String phoneNumber
    String referralCode
    String loanPurposeUuid
    String linkGeneratedByAgentUuid
    String linkGeneratedByAgentUsername
    String phoneNumberCountryCode
    String loanIdentityNumberOne
    Enums.UserType userType
    Enums.LoanProductType loanProductType
    Enums.CustomLinkGeneratorType linkType
    LocalDateTime expiryDate
    LocalDateTime dateCreated = LocalDateTime.now()

    CustomLinkGenerator() {
    }

    CustomLinkGenerator(Map params, Long tenantId, Integer hour) {
        this.userType = params.userType as Enums.UserType
        this.email = params?.email
        if (params?.phoneNumber) {
            this.phoneNumberCountryCode = params.phoneNumberCountryCode
            this.phoneNumber = params.phoneNumber
        }
        this.tenantId = tenantId
        this.ipAddress = params.ipAddress
        this.referralCode = params.referralCode
        this.loanPurposeUuid = params.loanPurposeUuid
        this.linkGeneratedByAgentUuid = params.linkGeneratedByAgentUuid
        this.linkGeneratedByAgentUsername= params.linkGeneratedByAgentUsername
        this.loanProductType=params.loanProductType as Enums.LoanProductType
        this.expiryDate = LocalDateTime.now().plusHours(hour as long)
        this.linkType = params.linkType as Enums.CustomLinkGeneratorType
        this.loanIdentityNumberOne=params.loanIdentityNumberOne
    }

    String fetchCompletePhoneNumber() {
        return phoneNumber ? (phoneNumberCountryCode ?: '') + (phoneNumber ?: '') : ''
    }

    private String generateUUID() {
        String link = ""
        for (Integer i = 1; i <= 3; i++) {
            link += UUID.randomUUID()
        }
        return link
    }
}
