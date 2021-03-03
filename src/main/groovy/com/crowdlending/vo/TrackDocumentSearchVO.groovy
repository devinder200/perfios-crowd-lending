package com.crowdlending.VO

class TrackDocumentSearchVO implements Serializable  {

    private static final long serialVersionUID = 2L;

    Long tenantId
    String username
    String identityNo
    String type
    String supportingDocumentUuid
    String documentCategoryUuid
    String ipAddress
    String documentName
    private Long max = 50
    private Long offset = 0

}
