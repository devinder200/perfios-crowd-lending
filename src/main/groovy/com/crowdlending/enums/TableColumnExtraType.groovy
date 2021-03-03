package com.crowdlending.enums


import org.springframework.context.MessageSourceResolvable


enum TableColumnExtraType implements MessageSourceResolvable, TableColumnTypeBase {
    BORROWER_APPLICATION_TEXT_VARIABLE_1,
    TRANSACTION_EXECUTION_TIME,
    TRANSACTION_PAYER_MOBILE_NO,
    TRANSACTION_APPROVAL_DATE,
    BORROWER_DEPOSIT_PAST_24_HOURS,
    INVESTOR_DEPOSIT_PAST_24_HOURS,
    BORROWER_WITHDRAW_PAST_24_HOURS,
    INVESTOR_WITHDRAW_PAST_24_HOURS,

    /*Invoice Billing*/

    NUMBER_OF_PRODUCTS,
    NUMBER_OF_BORROWERS,
    NUMBER_OF_NEW_BORROWERS,
    NUMBER_OF_LOAN_APPLICATIONS,
    NUMBER_OF_LOAN_APPLICATIONS_CREATED,
    NUMBER_OF_LOAN_APPLICATIONS_UPDATED,
    NUMBER_OF_ADMIN_USERS,
    NUMBER_OF_NEW_ADMIN_USERS,
    NUMBER_OF_INVESTORS,
    NUMBER_OF_NEW_INVESTORS,
    NUMBER_OF_DSA_USERS,
    NUMBER_OF_NEW_DSA_USERS,
    NUMBER_OF_COLLECTION_AGENTS,
    NUMBER_OF_NEW_COLLECTION_AGENTS,
    NUMBER_OF_FIA,
    NUMBER_OF_NEW_FIA_REGISTERED,
    LOAN_ACTIVITY_DATE,
    LOAN_PROPERTY,
    OLD_VALUE,
    NEW_VALUE,
    DESCRIPTION,
    TAT,
    LOAN_MORATORIUM_APPLIED_DATE,
    LOAN_MORATORIUM_APPLIED_MONTHS,
    DAILY_PENALTY_PAYMENT,
    WEEKLY_PENALTY_PAYMENT,
    MONTHLY_PENALTY_PAYMENT,
    LATE_PENALTY_PAYMENT,
    MONTHLY_PENALTY_FIXED_PAYMENT,
    FIXED_PENALTY_UNSUCCESSFUL_MONTH_PAYMENT,
    THRESHOLD_PENALTY_PAYMENT,
    TOTAL_SERVICE_FEE_PAID,
    TOTAL_EMI_RECIEVED,
    LOAN_APPLICATION,
    TOTAL_PRINCIPAL,
    PAID_PRINCIPAL,
    PAID_PENALTY,
    TOTAL_SERVICE_FEES,
    PAID_INTEREST,
    TOTAL_LOAN_COUNT,
    TOTAL_LOAN_AMOUNT,
    ADMIN_DASHBOARD_ANALYTICS_DEFAULTED_LOANS,
    ADMIN_DASHBOARD_ANALYTICS_CHARGED_OFF_LOANS,
    ADMIN_DASHBOARD_ANALYTICS_LOAN_DETAILS_STATUS_WISE,
    ADMIN_DASHBOARD_ANALYTICS_LOAN_DETAILS_PRODUCT_WISE,
    COMPLETED_DATE,
    REPAYMENT_EMI,
    BORROWER_BANK_NAME_1,
    BORROWER_BANK_IFSC_1,
    BORROWER_BANK_MIRC_1,
    BORROWER_BANK_ADDRESS_1,
    BORROWER_BANK_SWIFT_CODE_1,
    BORROWER_BANK_BRANCH_NAME_1,
    BORROWER_BANK_BRANCH_CITY_1,
    BORROWER_BANK_ACCOUNT_TYPE_1,
    BORROWER_BANK_BRANCH_PINCODE_1,
    BORROWER_BANK_ACCOUNT_NUMBER_1,
    BORROWER_BANK_NATURE_OF_FACILITY_1,
    BORROWER_BANK_ACCOUNT_HOLDER_NAME_1,
    BORROWER_BANK_DATE_OF_OPENING_ACCOUNT_1,
    DISCOUNT_AMOUNT_AFTER_SUBVENTION,
    LOAN_REPAYMENT_FROM_DATE,
    LOAN_REPAYMENT_TO_DATE,
    LOAN_REPAYMENT_FROM_AMOUNT,
    LOAN_REPAYMENT_TO_AMOUNT,
    LOAN_REPAYMENT_FLAG,
    PARTNER_FEE,
    TOTAL_RISK_SCORE, // TODO: to show in Loan Application Details(Admin,Investor)
    BORROWER_CONTACT_EMAIL,
    BORROWER_CONTACT_FAX,
    BORROWER_CONTACT_PHONE,
    BORROWER_CONTACT_WEBSITE,
    ADDRESS_THREE_LINE_1,
    ADDRESS_THREE_LINE_2,
    ADDRESS_THREE_LINE_3,
    ADDRESS_THREE_CITY,
    ADDRESS_THREE_STATE,
    ADDRESS_THREE_ZIP_CODE,
    ADDRESS_THREE_COUNTRY,
    ADDRESS_THREE_DISTRICT,
    ADDRESS_THREE_SUB_DISTRICT,
    TOTAL_GAP_DAY_INTEREST_AMOUNT,
    PAYMENT_MODE,
    LOAN_APPLICATION_TEXT_VARIABLE_11,
    LOAN_APPLICATION_TEXT_VARIABLE_12,
    LOAN_APPLICATION_TEXT_VARIABLE_13,
    LOAN_APPLICATION_TEXT_VARIABLE_14,
    LOAN_APPLICATION_TEXT_VARIABLE_15,
    LOAN_APPLICATION_NUMBER_VARIABLE_1,
    LOAN_APPLICATION_NUMBER_VARIABLE_2,
    LOAN_APPLICATION_NUMBER_VARIABLE_3,
    LOAN_APPLICATION_NUMBER_VARIABLE_4,
    LOAN_APPLICATION_NUMBER_VARIABLE_5,
    LOAN_APPLICATION_NUMBER_VARIABLE_6,
    CIBIL_SCORE,
    AVERAGE_RISK_SCORE,
    FIRST_REPAYMENT_AMOUNT,
    LOAN_APPLICATION_TEXT_VARIABLE_16,
    LOAN_APPLICATION_TEXT_VARIABLE_17,
    LOAN_APPLICATION_TEXT_VARIABLE_18,
    LOAN_APPLICATION_TEXT_VARIABLE_19,
    LOAN_APPLICATION_TEXT_VARIABLE_20,
    // ####### FOR ACCOUNTING REPORTS ########
    RECEIVABLE_PENALTY,
    EMI_NUMBER,
    EMI_DUE_DATE,
    EMI_DUE_AMOUNT,
    EMI_AMOUNT_PRINCIPAL,
    EMI_AMOUNT_INTEREST,
    EMI_PAYMENT_DATE,
    EMI_PAYMENT_RECIEVED,
    PAYMENT_RECIEVED_TOWARDS_PENALTY,
    PAYMENT_RECIEVED_TOWARDS_PENALTY_INTEREST,
    PAYMENT_RECIEVED_TOWARDS_INTEREST,
    PAYMENT_RECIEVED_TOWARDS_PRINCIPAL,
    DELAY_IN_EMI_PAYMENT,
    PAYMENT_RECIEVED_AGAINST_SERVICE_FEE,
    GROSS_PROCESSING_FEES,  // TODO:Total of all service fee including tax
    PROCESSING_FEES,       // TODO:Sum of service fee excluding tax
    PROCESSING_FEES_TAX,   // TODO:Sum of taxes corresponding to service fee
    EMI_DUE_PRINCIPAL,
    EMI_DUE_INTEREST,
    EMI_DUE_COUNT,
    // #######################################
    LOAN_REPAYMENT_LAST_PENALTY_CALCULATE_DATE,
    LOAN_REPAYMENT_PENALTY_DISCOUNT_APPLIED_DATE,
    LOAN_REPAYMENT_LAST_LATE_PAYMENT_FEE_APPLIED_DATE,
    LOAN_REPAYMENT_LAST_WEEKLY_PENALTY_CALCULATE_DATE,
    LOAN_REPAYMENT_CHEQUE_BOUNCING_CHARGE_DISCOUNT_DATE,
    LOAN_REPAYMENT_LAST_APPLIED_CHEQUE_BOUNCING_CHARGE_DATE,
    LOAN_REPAYMENT_LAST_SMS_REMINDER_SENT_DATE,
    LOAN_REPAYMENT_LAST_EMAIL_REMINDER_SENT_DATE,
    LOAN_REPAYMENT_LAST_ACCESSED_BY_REPAYMENT_PAY_JOB

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
        return "com.crowdlending.enums.TableColumnExtraType.${this}"
    }

    public static TableColumnTypeBase contains(String value) {
        TableColumnExtraType result = null
        if (value in values()*.toString()) {
            result = valueOf(value)
        }
        return result
    }

    static List<TableColumnType> forBorrowerTransactionSearchFilter() {
        [
                TableColumnType.TRANSACTION_FROM_AMOUNT,
                TableColumnType.TRANSACTION_TO_AMOUNT,
                TableColumnType.TRANSACTION_STATUS,
                TableColumnType.TRANSACTION_FROM_DATE,
                TableColumnType.TRANSACTION_TO_DATE,
                TableColumnType.TRANSACTION_TYPE
        ]
    }

    static List<TableColumnType> forInvestorSectionLoanDetailAnalyticBox() {
        [
                TableColumnType.LOAN_AMOUNT,
                TableColumnType.LOAN_INTEREST,
                TableColumnType.LOAN_TENURE,
                TableColumnType.LOAN_PRODUCT
        ]
    }

    static List<TableColumnType> bootstrapDailyTransactionReportForAdmin() {
        return [
                TableColumnType.SERIAL_NO,
                TableColumnType.TRANSACTION_AMOUNT,
                TableColumnType.TRANSACTION_STATUS,
                TableColumnType.TRANSACTION_PAYER_EMAIL,
                TableColumnType.TRANSACTION_PAYER_ID,
                TRANSACTION_PAYER_MOBILE_NO,
                TRANSACTION_EXECUTION_TIME,
                BORROWER_DEPOSIT_PAST_24_HOURS,
                INVESTOR_DEPOSIT_PAST_24_HOURS,
                BORROWER_WITHDRAW_PAST_24_HOURS,
                INVESTOR_WITHDRAW_PAST_24_HOURS
        ]
    }

    static List<TableColumnExtraType> past24HoursDailyTransactionReportColumns() {
        return past24HoursDailyDepositTransactionReportColumns() + past24HoursDailyWithdrawTransactionReportColumns()

    }

    static List<TableColumnExtraType> dailyTransactionReportForAdmin() {
        return [
                TableColumnType.SERIAL_NO,
                TableColumnType.TRANSACTION_AMOUNT,
                TableColumnType.TRANSACTION_STATUS,
                TableColumnType.TRANSACTION_PAYER_EMAIL,
                TableColumnType.TRANSACTION_PAYER_ID,
                TRANSACTION_PAYER_MOBILE_NO,
                TRANSACTION_APPROVAL_DATE,
                TRANSACTION_EXECUTION_TIME,
                BORROWER_DEPOSIT_PAST_24_HOURS,
                INVESTOR_DEPOSIT_PAST_24_HOURS,
                BORROWER_WITHDRAW_PAST_24_HOURS,
                INVESTOR_WITHDRAW_PAST_24_HOURS
        ]
    }

    static List<TableColumnExtraType> past24HoursDailyDepositTransactionReportColumns() {
        return [
                BORROWER_DEPOSIT_PAST_24_HOURS,
                INVESTOR_DEPOSIT_PAST_24_HOURS
        ]
    }

    static List<TableColumnExtraType> past24HoursDailyWithdrawTransactionReportColumns() {
        return [
                BORROWER_WITHDRAW_PAST_24_HOURS,
                INVESTOR_WITHDRAW_PAST_24_HOURS
        ]
    }

    static List forInvoiceBilling(){
        [
                NUMBER_OF_PRODUCTS,
                NUMBER_OF_BORROWERS,
                NUMBER_OF_NEW_BORROWERS,
                NUMBER_OF_LOAN_APPLICATIONS,
                NUMBER_OF_LOAN_APPLICATIONS_CREATED,
                NUMBER_OF_LOAN_APPLICATIONS_UPDATED,
                NUMBER_OF_ADMIN_USERS,
                NUMBER_OF_NEW_ADMIN_USERS,
                NUMBER_OF_INVESTORS,
                NUMBER_OF_NEW_INVESTORS,
                NUMBER_OF_DSA_USERS,
                NUMBER_OF_NEW_DSA_USERS,
                NUMBER_OF_COLLECTION_AGENTS,
                NUMBER_OF_NEW_COLLECTION_AGENTS,
                NUMBER_OF_FIA,
                NUMBER_OF_NEW_FIA_REGISTERED
        ]
    }

    static List loanActivityColumnsListForAdmin() {
        [
                LOAN_ACTIVITY_DATE,
                TableColumnType.AGENT_IP_ADDRESS,
                TableColumnType.AGENT_EMAIL_ID,
                LOAN_PROPERTY,
                OLD_VALUE,
                NEW_VALUE,
                DESCRIPTION,
                TAT
        ]

    }

    static List<TableColumnExtraType> repaymentScheduleColumns(){
        return [
                DAILY_PENALTY_PAYMENT,
                WEEKLY_PENALTY_PAYMENT,
                MONTHLY_PENALTY_PAYMENT,
                LATE_PENALTY_PAYMENT,
                MONTHLY_PENALTY_FIXED_PAYMENT,
                FIXED_PENALTY_UNSUCCESSFUL_MONTH_PAYMENT,
                THRESHOLD_PENALTY_PAYMENT
        ]
    }

    static List monthlyCollectionReport() {
        [
                TableColumnType.LOAN_ID,
                TableColumnType.BORROWER_NAME,
                TableColumnType.LOAN_PRODUCT,
                TableColumnType.LOAN_REPAYMENT_TYPE,
                TableColumnType.LOAN_REPAYMENT_EMI_MONTH,
                TableColumnType.LOAN_REPAYMENT_AMOUNT,
                TableColumnType.LOAN_REPAYMENT_EMI_DUE,
                TableColumnType.REPAYMENT_PAYMENT_DATE,
                TableColumnType.LOAN_REPAYMENT_STATUS,
                TableColumnType.LOAN_REJECT_REASONS,
                TableColumnType.BORROWER_PHONE_NO,
                TableColumnType.BORROWER_EMAIL,
                TableColumnType.DSA_ID,
                TableColumnType.BORROWER_ID,
                TableColumnType.LOAN_IDENTITY_NUMBER_TWO,
                TOTAL_SERVICE_FEES,
                TOTAL_SERVICE_FEE_PAID,
                TOTAL_EMI_RECIEVED
        ]
    }

    static List monthlyClosingReport() {
        [
                TableColumnType.LOAN_TOTAL_INTEREST_AMOUNT,
                TableColumnType.TOTAL_PENALTY,
                TableColumnType.DSA_ID,
                TableColumnType.BORROWER_ID,
                TableColumnType.LOAN_IDENTITY_NUMBER_TWO,
                TOTAL_SERVICE_FEES,
                TOTAL_SERVICE_FEE_PAID,
                TOTAL_EMI_RECIEVED,
                LOAN_APPLICATION,
                TOTAL_PRINCIPAL,
                PAID_PRINCIPAL,
                PAID_INTEREST,
                PAID_PENALTY
        ]
    }

    static List nachRegistrationReportFilter(){
        [
                TableColumnType.LOAN_ID,
                TableColumnType.LOAN_PRODUCT

        ]
    }

    static List adminMonthlyWiseReportFilter(){
        [
                TableColumnType.LOAN_REPAYMENT_EMI_MONTH,
                TableColumnType.LOAN_REPAYMENT_EMI_YEAR,
                TableColumnType.LOAN_PRODUCT,
                TableColumnType.LOAN_REPAYMENT_STATUS,
                TableColumnType.DSA_ID,
                TableColumnType.BORROWER_NAME,
                TableColumnType.BORROWER_ID,
                TableColumnType.LOAN_IDENTITY_NUMBER_TWO,
                TableColumnType.LOAN_ID
        ]
    }

    static List forAdminLoanRepaymentReportFilter() {
        [
                TableColumnType.LOAN_ID,
                LOAN_REPAYMENT_FROM_DATE,
                LOAN_REPAYMENT_TO_DATE,
                LOAN_REPAYMENT_FROM_AMOUNT,
                LOAN_REPAYMENT_TO_AMOUNT,
                TableColumnType.LOAN_REPAYMENT_STATUS,
                LOAN_REPAYMENT_FLAG,
                TableColumnType.LOAN_IDENTITY_NUMBER_TWO


        ]
    }


    static List loanApplicationPartialRepaymentsReportFilter() {
        [
                TableColumnType.TRANSACTION_FROM_AMOUNT,
                TableColumnType.TRANSACTION_TO_AMOUNT,
                TableColumnType.TRANSACTION_FROM_DATE,
                TableColumnType.TRANSACTION_TO_DATE,
                TableColumnType.DSA_ID,
                TableColumnType.LOAN_ID,
                TableColumnType.LOAN_IDENTITY_NUMBER_TWO,
                TableColumnType.BORROWER_ID
        ]
    }

    static List forAdminDashboardPortfolio() {
        return [
                ADMIN_DASHBOARD_ANALYTICS_DEFAULTED_LOANS,
                ADMIN_DASHBOARD_ANALYTICS_CHARGED_OFF_LOANS,
                ADMIN_DASHBOARD_ANALYTICS_LOAN_DETAILS_STATUS_WISE,
                ADMIN_DASHBOARD_ANALYTICS_LOAN_DETAILS_PRODUCT_WISE
        ]
    }

    static List loanApplicationPartialRepaymentsReport() {
        [
                TableColumnType.LOAN_ID,
                TableColumnType.LOAN_IDENTITY_NUMBER_TWO,
                TableColumnType.DSA_ID,
                TableColumnType.BORROWER_ID,
                TableColumnType.RECEIVABLE_PRINCIPAL,
                TableColumnType.RECEIVABLE_INTEREST,
                TableColumnType.RECEIVABLE_AMOUNT,
                RECEIVABLE_PENALTY,
                TableColumnType.REPAYMENT_DATE,
                TableColumnType.LOAN_PRINCIPAL_OUTSTANDING,
                PARTNER_FEE
        ]
    }

    static List adminLoanCollectionReportFilter() {
        [
                TableColumnType.LOAN_ID,
                TableColumnType.DSA_ID,
                TableColumnType.BORROWER_ID,
                TableColumnType.LOAN_IDENTITY_NUMBER_TWO,
                TableColumnType.LOAN_PRODUCT,
                TableColumnType.LOAN_TAGS
        ]
    }
    // TODO: below methods using for EMI & LOAN WISE Accounting MIS Reports
    static List adminAccountingMISReportsCommonColumns(){
        [
                TableColumnType.LOAN_ID,
                TableColumnType.SERIAL_NO,
                TableColumnType.BORROWER_NAME,
                TableColumnType.BORROWER_EMAIL,
                TableColumnType.DISBURSED_DATE,
                TableColumnType.PRINCIPAL_AMOUNT,
                TableColumnType.GAP_DAY_INTEREST,
                TableColumnType.LOAN_TENURE,
                TableColumnType.LOAN_AMOUNT_PAID_OUT,
                TableColumnType.LOAN_INTEREST,
                TableColumnType.LOAN_TOTAL_INTEREST_AMOUNT,
                TableColumnType.FIXED_PENALTY_FOR_UNSUCCESSFUL_MONTHLY_PAYMENT_FEE,
                TableColumnType.RESERVED_FUND_FEE,
                TableColumnType.RESERVED_FUND_FEE_TAX,
                TableColumnType.COMPONENT_FROM_LOAN_REPAYMENT_PRINCIPLE,
                TableColumnType.COMPONENT_FROM_LOAN_REPAYMENT_INTEREST,
                TableColumnType.LEGAL_FEE,
                TableColumnType.LEGAL_FEE_TAX,
                TableColumnType.WEEKLY_REPAYMENT_PENALTY,
                TableColumnType.LIFE_INSURANCE_FEE,
                TableColumnType.LIFE_INSURANCE_FEE_TAX,
                TableColumnType.SERVICE_FEE_PERCENTAGE,
                TableColumnType.CREDIT_SCORING_FEE,
                TableColumnType.CREDIT_SCORING_FEE_TAX,
                TableColumnType.MONTHLY_PENALTY_PERCENTAGE,
                TableColumnType.CHEQUE_BOUNCING_CHARGE,
                TableColumnType.LEFT_CHEQUE_BOUNCING_CHARGE,
                TableColumnType.CHEQUE_BOUNCING_CHARGE_DISCOUNT,
                TableColumnType.ASSET_FEE,
                TableColumnType.ASSET_FEES_TAX,
                TableColumnType.ADDITIONAL_FEE_ONE,
                TableColumnType.ADDITIONAL_FEE_TAX_ONE,
                TableColumnType.ADDITIONAL_FEE_TWO,
                TableColumnType.ADDITIONAL_FEE_TAX_TWO,
                TableColumnType.ADDITIONAL_FEE_THREE,
                TableColumnType.ADDITIONAL_FEE_TAX_THREE,
                TableColumnType.ADDITIONAL_FEE_FOUR,
                TableColumnType.ADDITIONAL_FEE_TAX_FOUR,
                TableColumnType.FULL_SETTLEMENT_PENALTY,
                TableColumnType.FULL_SETTLEMENT_DISCOUNT,
                TableColumnType.EARLY_REPAYMENT_PENALTY,
                TableColumnType.EARLY_REPAYMENT_TAX,
                TableColumnType.EARLY_REPAYMENT_DISCOUNT,
                TableColumnType.MONTHLY_PENALTY_FIXED,
                TableColumnType.COMPONENT_FROM_REPAYMENT_PRINCIPAL_TAX,
                TableColumnType.COMPONENT_FROM_REPAYMENT_INTEREST_TAX,
                EMI_DUE_AMOUNT,
                EMI_PAYMENT_RECIEVED,
                PAYMENT_RECIEVED_TOWARDS_PENALTY,
                PAYMENT_RECIEVED_TOWARDS_INTEREST,
                PAYMENT_RECIEVED_TOWARDS_PRINCIPAL,
                DELAY_IN_EMI_PAYMENT,
                PAYMENT_RECIEVED_AGAINST_SERVICE_FEE,
                GROSS_PROCESSING_FEES,
                PROCESSING_FEES,
                PROCESSING_FEES_TAX
        ]
    }

    static List adminAccountingMISReportEMIWise() {
        List listOfColumns = adminAccountingMISReportsCommonColumns()
        listOfColumns.add(TableColumnExtraType.EMI_NUMBER)
        listOfColumns.add(TableColumnExtraType.EMI_DUE_DATE)
        listOfColumns.add(TableColumnExtraType.EMI_PAYMENT_DATE)
        listOfColumns.add(TableColumnExtraType.EMI_AMOUNT_PRINCIPAL)
        listOfColumns.add(TableColumnExtraType.EMI_AMOUNT_INTEREST)
        return  listOfColumns
    }

    static List adminAccountingMISReportEMIWiseFilter() {
       [
               TableColumnType.LOAN_ID,
               TableColumnType.EMAIL_ADDRESS,
               TableColumnType.DISBURSAL_FROM_DATE,
               TableColumnType.DISBURSAL_TO_DATE
       ]
    }

    static List adminAccountingMISReportLoanWise() {
        List listOfColumns = adminAccountingMISReportsCommonColumns()
        listOfColumns.add(TableColumnExtraType.EMI_DUE_PRINCIPAL)
        listOfColumns.add(TableColumnExtraType.EMI_DUE_INTEREST)
        listOfColumns.add(TableColumnExtraType.EMI_DUE_COUNT)
        return listOfColumns
    }

    static List adminAccountingMISReportLoanWiseFilter() {
        [
                TableColumnType.LOAN_ID,
                TableColumnType.EMAIL_ADDRESS,
                TableColumnType.DISBURSAL_FROM_DATE,
                TableColumnType.DISBURSAL_TO_DATE
        ]
    }
    // ########################################################
}