package com.crowdlending.vo.hazelcast

import com.crowdlending.enums.Enums

class HazelCastVO implements Serializable{
    private static final long serialVersionUID = 2L
    //TODO: Make way to support other types of key as well like Integer, Long etc
    String key
    def value
    Map keyValueMap
    def listOrSetData
    String dataStructureName
    Enums.HazelCastDataStructureType dataStructureType = Enums.HazelCastDataStructureType.MAP
    String pattern
    Long tenantId
}
