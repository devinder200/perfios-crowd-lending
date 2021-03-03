package com.crowdlending.model.mongo

import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "employerMetaData")
class EmployerMetaData {

    Long tenantId
    String name
    String employerCategory
}
