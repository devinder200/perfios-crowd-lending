package com.crowdlending.model.mongo

import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "pinCodeMetaData")
class PinCodeMetaData {

    Long tenantId
    String pinCode
    String state
    String district
    String city
    String country

}
