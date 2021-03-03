package com.crowdlending.enums

enum AdminFiaPermissionType {
    ADMIN_FIA_DETAIL_TAB,


    public static AdminFiaPermissionType isValid(String value) {
        return ((value in values()*.toString()) ? (valueOf(value)) : null)

    }
    public static List<AdminFiaPermissionType> validPermissions() {
        return this.values()
    }

}