package com.crowdlending.enums

enum ExtraPropertyVariableName {
    TEXT_VARIABLE_1('textVariable1'),
    TEXT_VARIABLE_2('textVariable2'),
    TEXT_VARIABLE_3('textVariable3'),
    TEXT_VARIABLE_4('textVariable4'),
    TEXT_VARIABLE_5('textVariable5'),
    TEXT_VARIABLE_6('textVariable6'),
    TEXT_VARIABLE_7('textVariable7'),
    TEXT_VARIABLE_8('textVariable8'),
    TEXT_VARIABLE_9('textVariable9'),
    TEXT_VARIABLE_10('textVariable10'),

    DATE_VARIABLE_1('dateVariable1'),
    DATE_VARIABLE_2('dateVariable2'),
    DATE_VARIABLE_3('dateVariable3'),
    DATE_VARIABLE_4('dateVariable4'),

    NUMBER_VARIABLE_1('numberVariable1'),
    NUMBER_VARIABLE_2('numberVariable2'),
    NUMBER_VARIABLE_3('numberVariable3'),
    NUMBER_VARIABLE_4('numberVariable4'),
    NUMBER_VARIABLE_5('numberVariable5')

    private String variableName

    public String getVariableName(){
        return this. variableName
    }

    ExtraPropertyVariableName(String variableName){
        this.variableName = variableName
    }

}
