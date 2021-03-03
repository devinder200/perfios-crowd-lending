package com.crowdlending.enums

enum PermissionModule {

        ADMIN_LOAN_APPLICATION_MODULE_PERMISSION,
        ADMIN_INVESTOR_MODULE_PERMISSION,
        ADMIN_BORROWER_MODULE_PERMISSION,
        ADMIN_DSA_MODULE_PERMISSION,
        ADMIN_FIA_MODULE_PERMISSION,
        ADMIN_REPORT_MODULE_PERMISSION

        public static PermissionModule isValid(String value) {
                return ((value in values()*.toString()) ? (valueOf(value)) : null)

        }
}