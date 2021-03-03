package com.crowdlending.enums

enum AdminInvestorPermissionType {
    ADMIN_INVESTOR_DETAIL_TAB,
    ADMIN_INVESTOR_LOGIN_ACTIVITY_TAB,
    ADMIN_INVESTOR_TRANSACTIONS_TAB,
    ADMIN_INVESTOR_AUDIT_LOGS_TAB,
    ADMIN_INVESTOR_BASIC_DETAIL,
    ADMIN_INVESTOR_CREDIT_ANSWER_TAB,
    ADMIN_INVESTOR_CREDIT_FOUNDS_TAB,
    ADMIN_INVESTOR_CREDIT_INVESTMENTS_TAB



    public static AdminInvestorPermissionType isValid(String value) {
        return ((value in values()*.toString()) ? (valueOf(value)) : null)

    }
    public static List<AdminInvestorPermissionType> validPermissions() {
        return this.values()
    }

}