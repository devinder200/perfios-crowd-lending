package com.crowdlending.vo.iban


class VIbanVO implements Serializable {
    private static final long serialVersionUID = 2L

    Long tenantId
    String viban
    boolean assigned
    String assignedTo
    String uuid
}
