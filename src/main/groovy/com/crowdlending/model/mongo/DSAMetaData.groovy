package com.crowdlending.model.mongo

import com.crowdlending.enums.Enums
import com.crowdlending.vo.CompanyVO
import com.crowdlending.vo.dsa.DirectSellingAssociateProfileVO
import org.springframework.data.mongodb.core.mapping.Document
import java.time.LocalDateTime

@Document(collection = "dsaMetaData")
class DSAMetaData implements Serializable {

    private static final long serialVersionUID = 2L
    String fullName
    Long dsaId
    String userName
    String name
    Long tenantId
    LocalDateTime dateCreated
    LocalDateTime lastUpdated
    String firstName
    String middleName
    String lastName
    String uuid
    String referralCode
    Enums.DsaStatus dsaStatus
    String parentDsaName
    String parentDsaEmailId
    String parentDsaUuid
    Long parentDsaId
    LocalDateTime dateOfAcceptPolicy
    BigDecimal availableCash = 0.00
    String virtualAccountNumber
    String termsAcceptedFromIP
    Long terms_Accepted_By_Agent_Id
    Boolean isAdminDSA = false
    String branchName
    String identifierNumberOne
    String identifierNumberTwo
    String idPerTenant
    String dsaCategory
    CompanyVO companyVO
    String dsaEmail
    Integer loanApplicationSize
    DirectSellingAssociateProfileVO dsaProfileVO
    Long numberOfLoanApplication

}
