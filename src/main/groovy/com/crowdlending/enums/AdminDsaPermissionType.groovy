package com.crowdlending.enums

enum AdminDsaPermissionType {
    ADMIN_DSA_DETAIL_TAB


    public static AdminDsaPermissionType isValid(String value) {
        return ((value in values()*.toString()) ? (valueOf(value)) : null)

    }
    public static List<AdminDsaPermissionType> validPermissions() {
        return this.values()
    }

}