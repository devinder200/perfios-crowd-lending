package com.crowdlending.vo.repayment

import com.crowdlending.enums.Enums

class RepaymentSearchVO implements Serializable{
    private static final long serialVersionUID = 2L

    String toDate
    String fromDate
    String status
    String loanId
    String loanUuid
    String tenantSelection
    Long tenantId
    Long max = 20
    Long offset = 0
    BigDecimal fromAmount
    BigDecimal toAmount
    List<String> repaymentStatusList
    List<Enums.LoanApplicationStatus> applicationStatusList
    Boolean isBorrower
    Boolean isInvestor
    Boolean isDSA
    Boolean isAdmin
    String loanApplicationFlag
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
    String loanIdentityNumberTwo
    String loanProduct
    String emailAddress
}
