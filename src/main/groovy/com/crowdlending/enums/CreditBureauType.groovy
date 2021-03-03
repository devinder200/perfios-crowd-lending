package com.crowdlending.enums


enum CreditBureauType {

    CIBIL_SCORE("Used for score type 02"),
    CIBIL_SCORE_01("Used for score type 01"),
    FRIENDLY_SCORE,
    CREDIT_VIDHYA_SCORE,
    RISK_MODEL_SCORE,
    GST_FILING_STATUS,
    GST_PROFILE,
    GST_TRANSACTION,

    KARZA_KYC_PAN,
    KARZA_KYC_PASSPORT,
    KARZA_KYC_COMPANY_SEARCH,
    KARZA_KYC_COMPANY_GSTIN,
    KARZA_KYC_EMAIL,
    KARZA_KYC_IFSC,
    KARZA_KYC_BANK_ACCOUNT,
    KARZA_KYC_NAME_SIMILARITY,
    KARZA_KYC_TELEPHONE,
    KARZA_KYC_VOTER_ID,
    KARZA_KYC_GST_DETAILED_AUTHENTICATION,
    KARZA_KYC_GSTIN_DETAILED_AUTHENTICATION,
    KARZA_KYC_LPG_CONNECTION_AUTHENTICATION,
    KARZA_KYC_GST_FILLING_STATUS,
    KARZA_KYC_ITR_V_AUTHENTICATION,
    KARZA_KYC_UDYOG_ADHAR_NUMBER_AUTHENTICATION,
    KARZA_KYC_COURT_CASE_DETAILS,
    KARZA_KYC_GST_TRANSACTION_API,
    KARZA_KYC_LITIGATION_CHECK,
    KARZA_KYC_LICENSE,
    CONTRACT_ACCEPTED,
    CRIF_SERVICE,
    EXPERIAN_REPORT,
    KARZA_KYC_VEHICLE_RC,
    KARZA_KYC_ELECTRICITY_BILL,
    KARZA_KYC_COMMON_KYC_REPORT,
    AUSPOST_SECURE_PAY_PAYMENT,
    RIYAD_BANK_WITHDRAW_NOTIFICATION,
    RIYAD_BANK_DEPOSIT_NOTIFICATION,
    KARZA_KYC_MOBILE_AUTH,
    KARZA_KYC_PNG_AUTHENTICATION,
    KARZA_KYC_MOBILE_OTP_VERIFICATION,
    KARZA_KYC_KARZA_AADHAR_XML_DOCUMENT,
    KARZA_KYC_OFFICE_ITR_V_AUTHENTICATION,
    KARZA_KYC_OFFICE_ELECTRICITY_BILL,
    KARZA_KYC_SUIT_FILED_WILFUL_DEFAULTER,
    KARZA_KYC_CERSAI_MORTGAGE

    String description

    CreditBureauType() {}

    CreditBureauType(String description) {
        this.description = description
    }
}