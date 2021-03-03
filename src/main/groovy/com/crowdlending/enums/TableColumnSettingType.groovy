package com.crowdlending.enums

import org.springframework.context.MessageSourceResolvable

enum TableColumnSettingType implements MessageSourceResolvable {
//    Tenant Section
    TENANT_DASHBOARD_RECENT_INVESTORS,
    TENANT_DASHBOARD_RECENT_BORROWERS,
    TENANT_DASHBOARD_RECENT_LOAN_APPLICATIONS,
    TENANT_MENU_BORROWER_LIST,
    TENANT_MENU_INVESTOR_LIST,
    TENANT_MENU_LOAN_APPLICATION_LIST,
    TENANT_BORROWER_PROFILE_PREVIOUS_LOANS,
    TENANT_LOAN_BIDS,
    TENANT_INVESTOR_INVESTMENTS,
    TENANT_LOAN_INVESTMENTS,
    TENANT_DASHBOARD_TRANSACTIONS,
    TENANT_SYSTEM_STATS,
    TENANT_COMMON_TRANSACTIONS,
    TENANT_INVESTOR_BIDS,
    TENANT_FEE_STRUCTURE,
    TENANT_MENU_DSA_LIST,
    TENANT_MENU_CA_LIST,

    //    Borrower
    BORROWER_DASHBOARD_ANALYTIC_BOXES,
    BORROWER_DASHBOARD_LOAN_REPAYMENT_SCHEDULE,
    BORROWER_DASHBOARD_ALL_BIDS,
    BORROWER_MENU_TRANSACTIONS_PENDING,
    BORROWER_MENU_TRANSACTIONS_COMPLETED,
    BORROWER_DASHBOARD_INVESTMENTS,
    BORROWER_LOAN_DETAILS_BIDS,
    BORROWER_DASHBOARD_LOAN_APPLICATION,
    BORROWER_DASHBOARD_LOAN_APPLICATION_LIST,
    BORROWER_DASHBOARD_ALL_LOANS,

    //    Investor
    INVESTOR_DASHBOARD_ANALYTIC_BOXES,
    INVESTOR_DASHBOARD_RECENT_BIDS,
    INVESTOR_DASHBOARD_RECENT_INVESTMENTS,
    INVESTOR_DASHBOARD_RECENT_LOAN_OFFERS,
    INVESTOR_MENU_LOAN_OFFERS,
    INVESTOR_MENU_ALL_BIDS,
    INVESTOR_MENU_RECEIVABLES,
    INVESTOR_MENU_TRANSACTIONS_PENDING,
    INVESTOR_MENU_TRANSACTIONS_COMPLETED,
    INVESTOR_MENU_INVESTMENTS,
    INVESTOR_INVESTMENT_CRITERIA,
    INVESTOR_INVESTMENT_CRITERIA_FOR_ADMIN,
    INVESTOR_LOAN_REPAYMENT,
    INVESTOR_LOAN_BIDS,
    INVESTOR_SECTION_BORROWER_DETAIL,
    INVESTOR_LOAN_APPLICATION_VIEW_FILTER,
    INVESTOR_MENU_INVESTMENT_FOR_SALE_IN_SECONDARY_MARKET,
    INVESTOR_MENU_MY_INVESTMENT_IN_SALE,
    INVESTOR_INVESTMENT_LOAN_DETAILS_VIEW,
    INVESTOR_LOAN_REPAYMENT_SCHEDULE,
    INVESTOR_LOAN_DETAIL_VIEW_ANALYTIC_BOXES,
    INVESTOR_DASHBOARD_DATA_BOXES,

    //    DSA
    DSA_DASHBOARD_ANALYTIC_BOXES,
    DSA_DASHBOARD_STATS_BLOCKS,
    DSA_DASHBOARD_RECENT_LOAN_APPLICATIONS,
    DSA_LOAN_REPAYMENT_SCHEDULE,
    DSA_LOAN_BIDS,
    DSA_LOAN_INVESTMENTS,
    DSA_MENU_TRANSACTIONS_PENDING,
    DSA_MENU_TRANSACTIONS_COMPLETED,
    DSA_LOAN_SEARCH_FILTER,
    DSA_EXISTING_BORROWER_LIST,
    DSA_BORROWER_SEARCH_FILTER,
    DSA_BORROWER_LOAN_FILTER,


    //    ADMIN_DASHBOARD
    ADMIN_DASHBOARD_ANALYTICS_BOXES,
    ADMIN_DASHBOARD_NEW_LOANS,
    ADMIN_DASHBOARD_APPROVED_LOANS,
    ADMIN_DASHBOARD_DISBURSED_LOANS,
    ADMIN_DASHBOARD_COMPLETED_LOANS,
    ADMIN_DASHBOARD_READY_FOR_AUCTION,
    ADMIN_DASHBOARD_UNDER_AUCTION,
    ADMIN_DASHBOARD_FUNDED_LOANS,
    ADMIN_TRANSACTIONS_AWAITING_APPROVAL,
    ADMIN_TRANSACTION_QUEUE,
    ADMIN_REPORT_REPAYMENTS,
    ADMIN_DASHBOARD_PORTFOLIO_SUMMARY,
    ADMIN_QUESTION_ANSWER_REPORT,

    // Investor - Configurable Column
    INVESTOR_SECTION_LOAN_DETAILS_VIEW,
    BORROWER_SECTION_LOAN_DETAILS_VIEW,
    DSA_SECTION_LOAN_DETAILS_VIEW,
    ADMIN_SECTION_LOAN_DETAILS_VIEW,
    ADMIN_AGENT_LOGIN_ACTIVITY,
    ADMIN_LOAN_APPLICATION_VIEW_FILTER,
    ADMIN_BORROWER_SEARCH_FILTER,
    ADMIN_INVESTOR_SEARCH_FILTER,
    ADMIN_LOAN_INTERACTION_REPORT,
    ADMIN_LOAN_INTERACTION_REPORT_FILTER,
    ADMIN_INVESTOR_ACTIVITY_REPORT,
    ADMIN_INVESTOR_ACTIVITY_REPORT_FILTER,
    ADMIN_LOAN_APPLICATION_SEARCH_REPORT,
    ADMIN_LOAN_APPLICATION_SEARCH_REPORT_FILTER,
    ADMIN_DSA_LOAN_APPLICATION_LIST,
    ADMIN_LOAN_REPAYMENT_SCHEDULE,
    INVESTOR_INVESTMENT_SEARCH_FILTER,
    INVESTOR_INVESTMENT_ANALYTIC_BOXES,
    ADMIN_EMAIL_NOTIFICATIONS,
    ADMIN_SMS_NOTIFICATIONS,
    ADMIN_INVESTMENT,
    ADMIN_DASHBOARD_DELAYED_LOANS,
    ADMIN_DASHBOARD_AWAITING_APPROVAL_LOANS,
    ADMIN_DASHBOARD_UPCOMING_REPAYMENTS,
    ADMIN_DASHBOARD_OVERDUE_REPAYMENTS,
    ADMIN_DASHBOARD_RECENT_PAID_REPAYMENTS,
    ADMIN_DASHBOARD_RECENT_BIDS,
    ADMIN_DASHBOARD_RECENT_INVESTMENT,
    ADMIN_NACH_MIS_DETAILS,
    INVESTOR_SECTION_NEW_LOAN_OFFER_VIEW,
    ADMIN_DSA_LOAN_SEARCH_FILTER,
    ADMIN_MONTHLY_WISE_REPORT,
    ADMIN_MONTHLY_WISE_REPORT_FILTER,
    ADMIN_COLLECTION_PRESENTATION_REPORT,
    ADMIN_SEARCH_COLLECTION_PRESENTATION_REPORT,
    REPORT_LOAN_FEE,
    ADMIN_DELINQUENCY_MIS_REPORT,
    ADMIN_DELINQUENCY_MIS_REPORT_FILTER,
    ADMIN_SANCTION_MIS_REPORT,
    ADMIN_SANCTION_MIS_REPORT_FILTER,
    ADMIN_NACH_PRESENTATION_REPORT,
    ADMIN_SEARCH_NACH_PRESENTATION_REPORT,
    ADMIN_LOAN_DISBURSEMENT_REPORT,
    ADMIN_LOAN_DISBURSEMENT_SEARCH_REPORT_FILTER,
    ADMIN_LOAN_COLLECTION_REPORT,
    ADMIN_LOAN_FEE_STRUCTURE_UPDATE,
    ADMIN_LOAN_APPLICATION_TRANSACTION_REPORT,
    ADMIN_BORROWER_SECTION_LOAN_DETAILS_VIEW,
    ADMIN_BORROWER_TRANSACTION_DETAIL,
    ADMIN_TRANSACTION_SEARCH_FILTER,
    ADMIN_BORROWER_SECTION_SOA_FILTER,
    INVESTMENT_REPAYMENTS_VIEW,
    ADMIN_REST_CONVERSATION_SEARCH_FILTER,
    ADMIN_GROSS_STATISTICS_REPORT,
    ADMIN_GROSS_STATISTICS_METRIC_TYPES,
    CONSOLIDATED_FLDG_REPORT,
    MIS_DISBURSED_LOANS_REPORT,
    MIS_REPAID_LOANS_REPORT,
    FLDG_SEARCH_FILTERS,
    MIS_DISBURSED_LOANS_SEARCH_FILTERS,
    MIS_REPAID_LOANS_SEARCH_FILTERS,
    ADMIN_COMPANY_REPRESENTATIVE_TABLE,
    BORROWER_COMPANY_REPRESENTATIVE_TABLE,
    DSA_DASHBOARD_ACTIVE_LOANS,
    DSA_SEARCH_FILTERS,
    ADMIN_SECTION_FIA_ASSIGNED_LOAN_APPLICATION_LIST,
    FIA_DASHBOARD_LOAN_APPLICATION_LIST,

    //CA
    ADMIN_SECTION_CA_ASSIGNED_LOAN_APPLICATION_LIST,
    CA_DASHBOARD_LOAN_APPLICATION_LIST,
    CA_DASHBOARD_UPCOMING_REPAYMENTS_LIST,
    CA_LOAN_REPAYMENT_SCHEDULE,
    COLLECTION_AGENCY_DASHBOARD,
    COLLECTION_AGENCY_DASHBOARD_TRANSACTIONS,

    ADMIN_NACH_REGISTRATION_REPORT,
    ADMIN_CIBIL_REPORT,
    BANK_NACH_PRESENTATION_UPLOAD,     //TODO delete BANK_NACH_PRESENTATION_UPLOAD after first deployment on production
    NACH_BANK_1_UPLOAD,
    NACH_BANK_2_UPLOAD,
    NACH_BANK_3_UPLOAD,
    NACH_BANK_4_UPLOAD,
    NACH_REGISTRATION_MIS_1_UPLOAD,
    NACH_REGISTRATION_MIS_2_UPLOAD,
    NACH_REGISTRATION_MIS_3_UPLOAD,
    NACH_REGISTRATION_MIS_4_UPLOAD,
    NACH_REGISTRATION_MIS_5_UPLOAD,
    INVESTOR_INVESTMENT_CRITERIA_LIST,
    INVESTOR_INVESTMENT_CRITERIA_LIST_ADMIN,
    INVESTOR_LOAN_APPLICATION_DETAILS_FOR_FIRST_BLOCK,
    LOAN_SOA_REPORT,
    LOAN_SOA_TRANSACTION_REPORT,
    ADMIN_EXPERIAN_REPORT,
    ADMIN_CRIF_REPORT,
    ADMIN_EQUIFAX_REPORT,
    INVESTOR_COMPLETED_LOAN_APPLICATIONS,
    INVESTOR_DISBURSED_LOAN_APPLICATIONS,
    INVESTOR_DASHBOARD_COMPLETED_LOAN_APPLICATIONS,
    INVESTOR_DASHBOARD_DISBURSED_LOAN_APPLICATIONS,
    BORROWER_TRANSACTION_SEARCH_FILTER,
    INVESTOR_TRANSACTION_SEARCH_FILTER,
    INVESTOR_UPCOMING_REPAYMENTS,
    FIA_DASHBOARD_OLD_LOAN_APPLICATION_LIST,
    ADMIN_INSIGHT_PERFIOS_INTEGRATION,
    ADMIN_API_SERVICES_PERFIOS_INTEGRATION,
    ADMIN_OCR_VERIFICATIONS_PERFIOS_INTEGRATION,
    TRANSACTION_RECONCILIATION_SEARCH_FILTER,
    ADMIN_DAILY_TRANSACTION_REPORT,
    ADMIN_DASHBOARD_LOAN_ACTIVITY_TABLE,
    INVESTOR_LOANS_PUBLISHING_SOON,
    INVOICE_BILLING_TABLE,
    RBI_REPORT,
    MONTHLY_CLOSING_REPORT,
    ADMIN_DASHBOARD_DEFAULTED_LOANS,
    ADMIN_DASHBOARD_CHARGED_OFF_LOANS,
    ADMIN_DASHBOARD_LOAN_DETAILS_STATUS_WISE,
    ADMIN_DASHBOARD_LOAN_DETAILS_PRODUCT_WISE,
    ADMIN_SEARCH_NACH_REGISTRATION_REPORT,
    ADMIN_MONTHLY_COLLECTION_REPORT_FILTER,
    ADMIN_REPORT_REPAYMENT_FILTER,
    ADMIN_LOAN_APPLICATION_PARTIAL_REPAYMENT_REPORT,
    ADMIN_LOAN_APPLICATION_PARTIAL_REPAYMENT_REPORT_FLTER,
    LOAN_REPAYMENT_SCHEDULE_FOR_NOTIFICATION_AND_CONTRACT,
    ADMIN_LOAN_COLLECTION_REPORT_FILTER,
    //######### ACCOUNTING REPORTS #########
    ADMIN_ACCOUNTING_MIS_REPORT_EMI_WISE,
    ADMIN_ACCOUNTING_MIS_REPORT_EMI_WISE_FILTER,
    ADMIN_ACCOUNTING_MIS_REPORT_LOAN_WISE,
    ADMIN_ACCOUNTING_MIS_REPORT_LOAN_WISE_FILTER

    @Override
    String toString() {
        return super.toString()
    }

    Object[] getArguments() {
        [] as Object[]
    }

    String[] getCodes() {
        ["${getClass().name}.${name()}"] as String[]
    }

    String getDefaultMessage() {
        name()
    }

    String getEnumValue() {
        return "com.crowdlending.enums.TableColumnSettingType.${this}"
    }

    public static List tenantColumnList() {
        return [
                TENANT_DASHBOARD_RECENT_INVESTORS,
                TENANT_DASHBOARD_RECENT_BORROWERS,
                TENANT_DASHBOARD_RECENT_LOAN_APPLICATIONS,
                TENANT_MENU_BORROWER_LIST,
                TENANT_MENU_INVESTOR_LIST,
                TENANT_MENU_LOAN_APPLICATION_LIST,
                TENANT_BORROWER_PROFILE_PREVIOUS_LOANS,
                TENANT_LOAN_BIDS,
                TENANT_INVESTOR_INVESTMENTS,
                TENANT_LOAN_INVESTMENTS,
                TENANT_COMMON_TRANSACTIONS,
                TENANT_INVESTOR_BIDS,
                TENANT_DASHBOARD_TRANSACTIONS,
                TENANT_SYSTEM_STATS,
                TENANT_FEE_STRUCTURE,
                ADMIN_INVESTMENT
        ]
    }

    public static List adminColumnList() {
        return [
                ADMIN_DASHBOARD_NEW_LOANS,
                ADMIN_DASHBOARD_APPROVED_LOANS,
                ADMIN_DASHBOARD_DISBURSED_LOANS,
                ADMIN_DASHBOARD_COMPLETED_LOANS,
                ADMIN_DASHBOARD_READY_FOR_AUCTION,
                ADMIN_DASHBOARD_UNDER_AUCTION,
                ADMIN_DASHBOARD_FUNDED_LOANS,
                ADMIN_TRANSACTIONS_AWAITING_APPROVAL,
                ADMIN_TRANSACTION_QUEUE,
                ADMIN_REPORT_REPAYMENTS,
                ADMIN_SECTION_LOAN_DETAILS_VIEW,
                ADMIN_AGENT_LOGIN_ACTIVITY,
                ADMIN_LOAN_APPLICATION_VIEW_FILTER,
                ADMIN_BORROWER_SEARCH_FILTER,
                ADMIN_INVESTOR_SEARCH_FILTER,
                ADMIN_LOAN_INTERACTION_REPORT,
                ADMIN_LOAN_INTERACTION_REPORT_FILTER,
                ADMIN_INVESTOR_ACTIVITY_REPORT,
                ADMIN_INVESTOR_ACTIVITY_REPORT_FILTER,
                ADMIN_LOAN_APPLICATION_SEARCH_REPORT,
                ADMIN_LOAN_APPLICATION_SEARCH_REPORT_FILTER,
                ADMIN_DSA_LOAN_APPLICATION_LIST,
                ADMIN_DASHBOARD_ANALYTICS_BOXES,
                ADMIN_LOAN_REPAYMENT_SCHEDULE,
                ADMIN_DASHBOARD_DELAYED_LOANS,
                ADMIN_DASHBOARD_AWAITING_APPROVAL_LOANS,
                ADMIN_DASHBOARD_UPCOMING_REPAYMENTS,
                ADMIN_DASHBOARD_OVERDUE_REPAYMENTS,
                ADMIN_DASHBOARD_RECENT_PAID_REPAYMENTS,
                ADMIN_DASHBOARD_RECENT_BIDS,
                ADMIN_DASHBOARD_RECENT_INVESTMENT,
                ADMIN_DSA_LOAN_SEARCH_FILTER,
                ADMIN_COLLECTION_PRESENTATION_REPORT,
                ADMIN_SEARCH_COLLECTION_PRESENTATION_REPORT,
                ADMIN_DELINQUENCY_MIS_REPORT,
                ADMIN_DELINQUENCY_MIS_REPORT_FILTER,
                ADMIN_SANCTION_MIS_REPORT,
                ADMIN_SANCTION_MIS_REPORT_FILTER,
                ADMIN_NACH_PRESENTATION_REPORT,
                ADMIN_SEARCH_NACH_PRESENTATION_REPORT,
                ADMIN_LOAN_DISBURSEMENT_REPORT,
                ADMIN_LOAN_DISBURSEMENT_SEARCH_REPORT_FILTER,
                ADMIN_LOAN_COLLECTION_REPORT,
                ADMIN_LOAN_FEE_STRUCTURE_UPDATE,
                ADMIN_LOAN_APPLICATION_TRANSACTION_REPORT,
                ADMIN_BORROWER_SECTION_LOAN_DETAILS_VIEW,
                ADMIN_BORROWER_TRANSACTION_DETAIL,
                ADMIN_TRANSACTION_SEARCH_FILTER,
                ADMIN_BORROWER_SECTION_SOA_FILTER,
                ADMIN_REST_CONVERSATION_SEARCH_FILTER,
                ADMIN_GROSS_STATISTICS_REPORT,
                ADMIN_GROSS_STATISTICS_METRIC_TYPES,
                CONSOLIDATED_FLDG_REPORT,
                MIS_DISBURSED_LOANS_REPORT,
                MIS_REPAID_LOANS_REPORT,
                FLDG_SEARCH_FILTERS,
                MIS_DISBURSED_LOANS_SEARCH_FILTERS,
                MIS_REPAID_LOANS_SEARCH_FILTERS,
                ADMIN_COMPANY_REPRESENTATIVE_TABLE,
                BORROWER_COMPANY_REPRESENTATIVE_TABLE,
                ADMIN_SECTION_FIA_ASSIGNED_LOAN_APPLICATION_LIST,
                ADMIN_SECTION_CA_ASSIGNED_LOAN_APPLICATION_LIST,
                ADMIN_NACH_REGISTRATION_REPORT,
                ADMIN_CIBIL_REPORT,
                INVESTOR_INVESTMENT_CRITERIA_LIST_ADMIN,
                NACH_BANK_1_UPLOAD,
                NACH_BANK_2_UPLOAD,
                NACH_BANK_3_UPLOAD,
                NACH_BANK_4_UPLOAD,
                NACH_REGISTRATION_MIS_1_UPLOAD,
                NACH_REGISTRATION_MIS_2_UPLOAD,
                NACH_REGISTRATION_MIS_3_UPLOAD,
                NACH_REGISTRATION_MIS_4_UPLOAD,
                NACH_REGISTRATION_MIS_5_UPLOAD,
                LOAN_SOA_REPORT,
                LOAN_SOA_TRANSACTION_REPORT,
                ADMIN_EXPERIAN_REPORT,
                ADMIN_CRIF_REPORT,
                ADMIN_EQUIFAX_REPORT,
                INVESTOR_COMPLETED_LOAN_APPLICATIONS,
                INVESTOR_DISBURSED_LOAN_APPLICATIONS,
                INVESTOR_DASHBOARD_COMPLETED_LOAN_APPLICATIONS,
                INVESTOR_DASHBOARD_DISBURSED_LOAN_APPLICATIONS,
                ADMIN_INSIGHT_PERFIOS_INTEGRATION,
                ADMIN_API_SERVICES_PERFIOS_INTEGRATION,
                ADMIN_OCR_VERIFICATIONS_PERFIOS_INTEGRATION,
                TRANSACTION_RECONCILIATION_SEARCH_FILTER,
                ADMIN_DAILY_TRANSACTION_REPORT,
                ADMIN_DASHBOARD_LOAN_ACTIVITY_TABLE,
                INVESTOR_LOANS_PUBLISHING_SOON,
                INVOICE_BILLING_TABLE,
                RBI_REPORT,
                ADMIN_MONTHLY_WISE_REPORT,
                MONTHLY_CLOSING_REPORT,
                ADMIN_DASHBOARD_DEFAULTED_LOANS,
                ADMIN_DASHBOARD_CHARGED_OFF_LOANS,
                ADMIN_DASHBOARD_LOAN_DETAILS_STATUS_WISE,
                ADMIN_DASHBOARD_LOAN_DETAILS_PRODUCT_WISE,
                ADMIN_SEARCH_NACH_REGISTRATION_REPORT,
                ADMIN_MONTHLY_WISE_REPORT_FILTER,
                ADMIN_REPORT_REPAYMENT_FILTER,
                ADMIN_DASHBOARD_PORTFOLIO_SUMMARY,
                ADMIN_LOAN_APPLICATION_PARTIAL_REPAYMENT_REPORT,
                ADMIN_LOAN_APPLICATION_PARTIAL_REPAYMENT_REPORT_FLTER,
                LOAN_REPAYMENT_SCHEDULE_FOR_NOTIFICATION_AND_CONTRACT,
                ADMIN_LOAN_COLLECTION_REPORT_FILTER,
                ADMIN_QUESTION_ANSWER_REPORT,
                ADMIN_ACCOUNTING_MIS_REPORT_EMI_WISE,
                ADMIN_ACCOUNTING_MIS_REPORT_EMI_WISE_FILTER,
                ADMIN_ACCOUNTING_MIS_REPORT_LOAN_WISE,
                ADMIN_ACCOUNTING_MIS_REPORT_LOAN_WISE_FILTER
        ]
    }

    public static List borrowerColumnList() {
        return [
                BORROWER_DASHBOARD_LOAN_REPAYMENT_SCHEDULE,
                BORROWER_DASHBOARD_ALL_BIDS,
                BORROWER_MENU_TRANSACTIONS_PENDING,
                BORROWER_MENU_TRANSACTIONS_COMPLETED,
                BORROWER_DASHBOARD_ANALYTIC_BOXES,
                BORROWER_DASHBOARD_INVESTMENTS,
                BORROWER_LOAN_DETAILS_BIDS,
                BORROWER_SECTION_LOAN_DETAILS_VIEW,
                BORROWER_DASHBOARD_LOAN_APPLICATION_LIST,
                BORROWER_DASHBOARD_ALL_LOANS,
                BORROWER_TRANSACTION_SEARCH_FILTER
        ]
    }

    public static List investorColumnList() {
        return [
                INVESTOR_DASHBOARD_RECENT_BIDS,
                INVESTOR_DASHBOARD_RECENT_INVESTMENTS,
                INVESTOR_DASHBOARD_RECENT_LOAN_OFFERS,
                INVESTOR_MENU_LOAN_OFFERS,
                INVESTOR_MENU_ALL_BIDS,
                INVESTOR_MENU_RECEIVABLES,
                INVESTOR_MENU_TRANSACTIONS_PENDING,
                INVESTOR_MENU_TRANSACTIONS_COMPLETED,
                INVESTOR_MENU_INVESTMENTS,
                INVESTOR_DASHBOARD_ANALYTIC_BOXES,
                INVESTOR_INVESTMENT_CRITERIA,
                INVESTOR_INVESTMENT_CRITERIA_FOR_ADMIN,
                INVESTOR_LOAN_REPAYMENT,
                INVESTOR_LOAN_BIDS,
                INVESTOR_SECTION_LOAN_DETAILS_VIEW,
                INVESTOR_SECTION_BORROWER_DETAIL,
                INVESTOR_LOAN_APPLICATION_VIEW_FILTER,
                INVESTOR_INVESTMENT_SEARCH_FILTER,
                INVESTOR_INVESTMENT_ANALYTIC_BOXES,
                INVESTOR_SECTION_NEW_LOAN_OFFER_VIEW,
                INVESTOR_MENU_INVESTMENT_FOR_SALE_IN_SECONDARY_MARKET,
                INVESTOR_MENU_MY_INVESTMENT_IN_SALE,
                INVESTMENT_REPAYMENTS_VIEW,
                INVESTOR_INVESTMENT_CRITERIA_LIST,
                INVESTOR_LOAN_APPLICATION_DETAILS_FOR_FIRST_BLOCK,
                INVESTOR_INVESTMENT_LOAN_DETAILS_VIEW,
                INVESTOR_LOAN_REPAYMENT_SCHEDULE,
                INVESTOR_TRANSACTION_SEARCH_FILTER,
                INVESTOR_LOAN_DETAIL_VIEW_ANALYTIC_BOXES,
                INVESTOR_UPCOMING_REPAYMENTS,
                INVESTOR_DASHBOARD_DATA_BOXES
        ]
    }

    public static List dsaColumnList() {
        return [
                DSA_DASHBOARD_RECENT_LOAN_APPLICATIONS,
                DSA_LOAN_REPAYMENT_SCHEDULE,
                DSA_LOAN_BIDS,
                DSA_LOAN_INVESTMENTS,
                DSA_MENU_TRANSACTIONS_PENDING,
                DSA_MENU_TRANSACTIONS_COMPLETED,
                DSA_SECTION_LOAN_DETAILS_VIEW,
                DSA_LOAN_SEARCH_FILTER,
                DSA_DASHBOARD_ANALYTIC_BOXES,
                DSA_DASHBOARD_STATS_BLOCKS,
                DSA_EXISTING_BORROWER_LIST,
                DSA_DASHBOARD_ACTIVE_LOANS,
                DSA_SEARCH_FILTERS,
                TENANT_MENU_DSA_LIST,
                DSA_BORROWER_SEARCH_FILTER,
                DSA_BORROWER_LOAN_FILTER,
        ]
    }

    public static List fiaColumnList() {
        return [
                FIA_DASHBOARD_LOAN_APPLICATION_LIST,
                FIA_DASHBOARD_OLD_LOAN_APPLICATION_LIST
        ]
    }

    public static List caColumnList() {
        return [
                CA_DASHBOARD_LOAN_APPLICATION_LIST,
                CA_DASHBOARD_UPCOMING_REPAYMENTS_LIST,
                CA_LOAN_REPAYMENT_SCHEDULE,
                TENANT_MENU_CA_LIST,
                COLLECTION_AGENCY_DASHBOARD,
                COLLECTION_AGENCY_DASHBOARD_TRANSACTIONS
        ]
    }

    public static List nachExcelSettingTypeList() {
        return [
                NACH_BANK_1_UPLOAD,
                NACH_BANK_2_UPLOAD,
                NACH_BANK_3_UPLOAD,
                NACH_BANK_4_UPLOAD,
                NACH_REGISTRATION_MIS_1_UPLOAD,
                NACH_REGISTRATION_MIS_2_UPLOAD,
                NACH_REGISTRATION_MIS_3_UPLOAD,
                NACH_REGISTRATION_MIS_4_UPLOAD,
                NACH_REGISTRATION_MIS_5_UPLOAD,
        ]
    }

    public static List nachRegistrationMisTypeList() {
        return [
                NACH_REGISTRATION_MIS_1_UPLOAD,
                NACH_REGISTRATION_MIS_2_UPLOAD,
                NACH_REGISTRATION_MIS_3_UPLOAD,
                NACH_REGISTRATION_MIS_4_UPLOAD,
                NACH_REGISTRATION_MIS_5_UPLOAD,
        ]
    }

    public static List nachTransactionTypeList() {
        return [
                NACH_BANK_1_UPLOAD,
                NACH_BANK_2_UPLOAD,
                NACH_BANK_3_UPLOAD,
                NACH_BANK_4_UPLOAD,
        ]
    }
}
