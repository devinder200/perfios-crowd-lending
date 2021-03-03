package com.crowdlending.vo.dsa

import com.crowdlending.vo.AddressVO
import com.crowdlending.vo.ExtraPropertyVO

import java.time.LocalDateTime

class DirectSellingAssociateProfileVO {

    LocalDateTime dateCreated
    LocalDateTime lastUpdated
    Long tenantId
    String uuid
    String title
    String firstName
    String middleName
    String secondLastName
    String lastName
    String religion
    String gender
    String placeOfBirthState
    String placeOfBirthCity
    String identityNumberOne
    String identityNumberTwo
    String identityNumberThree
    String identityNumberFour
    String identityNumberFive
    String identityNumberSix
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

    String dateOfBirth
    AddressVO addressVO
    AddressVO addressVOOne

    ExtraPropertyVO extraPropertyVO

}
