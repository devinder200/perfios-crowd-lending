package com.crowdlending.enums

enum LocalizationType {

    LOCALIZATION('resetLocalization'),
    PERMISSION('resetAdminPermission'),
    BUSINESS_PARTNER_PERMISSION('resetDSAPermission'),
    TENANT_SETTING_VARIABLE('resetTenantSettingVariable'),
    BORROWER_ONBOARDING('resetBorrowerOnboarding'),
    INVESTOR_ONBOARDING('resetInvestorOnboarding'),
    TABLE_COLUMN_SETTINGS('resetTableColumnSettings'),
    ADMIN_SECTION_CRITERIA('resetAdminSectionCriteria'),
    STATE_CITY_LIST('resetStateCityList'),
    COMMON_ONBOARDING_BANK('resetBankCommonOnboarding'),
    COMMON_ONBOARDING_ADDRESS('resetAddressCommonOnboarding'),
    COMMON_PROPERTY('resetCommonProperty'),
    ACTIVE_ENUMS('resetActiveEnums'),
    ADMIN_LOAN_PERMISSION('resetAdminLoanPermission')

    String actionName

    LocalizationType(String actionName) {
        this.actionName = actionName
    }

}