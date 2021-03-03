package com.crowdlending.enums


enum DomainName {

    BORROWER_PROFILE('borrowerProfile'),
    BORROWER_DETAIL('borrowerDetail'),
    BORROWER_EMPLOYMENT_HISTORY('borrowerEmploymentHistory'),
    INVESTOR_EMPLOYMENT_DETAILS('investorEmploymentDetails'),
    DSA_PROFILE('dsaProfile'),
    FIA_PROFILE('fiaProfile'),
    IGA_PROFILE('igaProfile'),
    INVESTOR_DETAIL('investorProfile'),                     //Using to differentiate list of variables for details & profile
    INVESTOR_PROFILE('investorProfile'),
    BORROWER_COMPANY('borrowerCompany'),
    INVESTOR_COMPANY('investorCompany'),
    DSA_COMPANY('dsaCompany'),
    CO_APPLICANT('coApplicant'),
    CO_APPLICANT_EMPLOYMENT('coApplicantEmployment'),
    COMPANY_REPRESENTATIVE('director'),
    LOAN_APPLICATION('loanApplication'),
    FAMILY_MEMBER('familyMember'),
    INSURANCE('insurance'),
    BORROWER_REFERENCE('borrowerReference'),
    OTHER_LOAN('otherLoan'),
    VEHICLE_OWNED('vehicleOwned'),
    LOAN_REPAYMENT('loanRepayment'),
    INVESTMENT('investment'),
    SYSTEM_STATS('systemStats'),
    BID('bid'),
    TRANSACTION('transaction'),
    TRANSACTION_DETAIL('transactionDetail')
    public String fieldPrefix

    public DomainName(String fieldPrefix) { this.fieldPrefix = fieldPrefix }

    public static fetchDomainNameListBorrower() {
        return [
                BORROWER_PROFILE,
                LOAN_APPLICATION,
                BORROWER_DETAIL,
                BORROWER_EMPLOYMENT_HISTORY,
                BORROWER_COMPANY,
                CO_APPLICANT,
                CO_APPLICANT_EMPLOYMENT,
                OTHER_LOAN,
                VEHICLE_OWNED
        ]
    }

    public static fetchDomainNameListInvestor() {
        return [
                //INVESTOR_DETAIL,
                INVESTOR_PROFILE,
                INVESTOR_COMPANY,
                INVESTOR_EMPLOYMENT_DETAILS
        ]
    }

    public static fetchDomainNameListDsa() {
        return [
                DSA_PROFILE,
                DSA_COMPANY
        ]
    }
}