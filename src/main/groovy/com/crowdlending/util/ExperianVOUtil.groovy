package com.crowdlending.util

import com.crowdlending.constants.ExperianConstants

class ExperianVOUtil {

    static String timeSeperatorForExperian(String time) {
        char[] timeArray = time.toCharArray()
        String convertedTime = ""
        for (int i = 1; i <= timeArray.size(); i++) {
            convertedTime = convertedTime + timeArray[i - 1]
            if (i == 2 || i == 4) {
                convertedTime = convertedTime + '-'
            }
        }
        return convertedTime
    }

    static String dateConverterForExperian(String date) {
        if (date) {
            char[] dateArray = date.toCharArray()
            String year = '', month = '', day = ''

            for (int i = 1; i <= dateArray.size(); i++) {

                if (i < 5) {
                    year = year + dateArray[i - 1]
                }
                if (i > 4 && i < 7) {
                    month = month + dateArray[i - 1]
                }
                if (i > 6) {
                    day = day + dateArray[i - 1]
                }
            }
            return day + '-' + month + '-' + year
        } else {
            return ''
        }
    }

    static String fetchAccountHolderType(String code) {
        if (code?.equalsIgnoreCase('1') || code?.equalsIgnoreCase('otherwise')) {
            return ExperianConstants.ACCOUNT_HOLDER_TYPE_INDIVIDUAL
        }
        if (code?.equalsIgnoreCase('2')) {
            return ExperianConstants.ACCOUNT_HOLDER_TYPE_JOINT
        }
        if (code?.equalsIgnoreCase('3')) {
            return ExperianConstants.ACCOUNT_HOLDER_TYPE_AUTHORIZED_USER
        }
        if (code?.equalsIgnoreCase('7')) {
            return ExperianConstants.ACCOUNT_HOLDER_TYPE_GURANTOR
        }
        return ''
    }

    static String fetchAccountType(String code) {
        if (code?.equalsIgnoreCase('1')) {
            return ExperianConstants.ACCOUNT_TYPE_AUTO_LOAN
        }
        if (code?.equalsIgnoreCase('2')) {
            return ExperianConstants.ACCOUNT_TYPE_HOUSING_LOAN
        }
        if (code?.equalsIgnoreCase('3')) {
            return ExperianConstants.ACCOUNT_TYPE_PROPERTY_LOAN
        }
        if (code?.equalsIgnoreCase('4')) {
            return ExperianConstants.ACCOUNT_TYPE_LOAN_AGAINST_SHARES_SECURITIES
        }
        if (code?.equalsIgnoreCase('5')) {
            return ExperianConstants.ACCOUNT_TYPE_PERSONAL_LOAN
        }
        if (code?.equalsIgnoreCase('6')) {
            return ExperianConstants.ACCOUNT_TYPE_CONSUMER_LOAN
        }
        if (code?.equalsIgnoreCase('7')) {
            return ExperianConstants.ACCOUNT_TYPE_GOLD_LOAN
        }
        if (code?.equalsIgnoreCase('8')) {
            return ExperianConstants.ACCOUNT_TYPE_EDUCATIONAL_LOAN
        }
        if (code?.equalsIgnoreCase('9')) {
            return ExperianConstants.ACCOUNT_TYPE_LOAN_TO_PROFESSIONAL
        }
        if (code?.equalsIgnoreCase('10')) {
            return ExperianConstants.ACCOUNT_TYPE_CREDIT_CARD
        }
        if (code?.equalsIgnoreCase('11')) {
            return ExperianConstants.ACCOUNT_TYPE_LEASING
        }
        if (code?.equalsIgnoreCase('12')) {
            return ExperianConstants.ACCOUNT_TYPE_OVERDRAFT
        }
        if (code?.equalsIgnoreCase('13')) {
            return ExperianConstants.ACCOUNT_TYPE_TWO_WHEELER_LOAN
        }
        if (code?.equalsIgnoreCase('14')) {
            return ExperianConstants.ACCOUNT_TYPE_NON_FUNDED_CREDIT_FACILITY
        }
        if (code?.equalsIgnoreCase('15')) {
            return ExperianConstants.ACCOUNT_TYPE_LOAN_AGAINST_BANK_DEPOSITS
        }
        if (code?.equalsIgnoreCase('16')) {
            return ExperianConstants.ACCOUNT_TYPE_FLEET_CARD
        }
        if (code?.equalsIgnoreCase('17')) {
            return ExperianConstants.ACCOUNT_TYPE_COMMERCIAL_VEHICLE_LOAN
        }
        if (code?.equalsIgnoreCase('18')) {
            return ExperianConstants.ACCOUNT_TYPE_TELCO_WIRELESS
        }
        if (code?.equalsIgnoreCase('19')) {
            return ExperianConstants.ACCOUNT_TYPE_TELCO_BROADBAND
        }
        if (code?.equalsIgnoreCase('20')) {
            return ExperianConstants.ACCOUNT_TYPE_TELCO_LANDLINE
        }
        if (code?.equalsIgnoreCase('31')) {
            return ExperianConstants.ACCOUNT_TYPE_SECURED_CREDIT_CARD
        }
        if (code?.equalsIgnoreCase('32')) {
            return ExperianConstants.ACCOUNT_TYPE_USED_CAR_LOAN
        }
        if (code?.equalsIgnoreCase('33')) {
            return ExperianConstants.ACCOUNT_TYPE_CONSTRUCTION_EQUIPMENT_LOAN
        }
        if (code?.equalsIgnoreCase('34')) {
            return ExperianConstants.ACCOUNT_TYPE_TRACTOR_LOAN
        }
        if (code?.equalsIgnoreCase('35')) {
            return ExperianConstants.ACCOUNT_TYPE_CORPORATE_CREDIT_CARD
        }
        if (code?.equalsIgnoreCase('36')) {
            return ExperianConstants.ACCOUNT_TYPE_KISAN_CREDIT_CARD
        }
        if (code?.equalsIgnoreCase('37')) {
            return ExperianConstants.ACCOUNT_TYPE_LOAN_ON_CREDIT_CARD
        }
        if (code?.equalsIgnoreCase('38')) {
            return ExperianConstants.ACCOUNT_TYPE_PRIME_MINISTER_JAAN_DHAN_YOJANA_OVERDRAFT
        }
        if (code?.equalsIgnoreCase('39')) {
            return ExperianConstants.ACCOUNT_TYPE_MUDRA_LOANS_SHISHU_KISHOR_TARUN
        }
        if (code?.equalsIgnoreCase('43')) {
            return ExperianConstants.ACCOUNT_TYPE_MICROFINANCE_OTHERS
        }
        if (code?.equalsIgnoreCase('51')) {
            return ExperianConstants.ACCOUNT_TYPE_BUSINESS_LOAN_GENERAL
        }
        if (code?.equalsIgnoreCase('52')) {
            return ExperianConstants.ACCOUNT_TYPE_BUSINESS_LOAN_PRIORITY_SECTOR_SMALL_BUSINESS
        }
        if (code?.equalsIgnoreCase('53')) {
            return ExperianConstants.ACCOUNT_TYPE_BUSINESS_LOAN_PRIORITY_SECTOR_AGRICULTURE
        }
        if (code?.equalsIgnoreCase('54')) {
            return ExperianConstants.ACCOUNT_TYPE_BUSINESS_LOAN_PRIORITY_SECTOR_OTHERS
        }
        if (code?.equalsIgnoreCase('55')) {
            return ExperianConstants.ACCOUNT_TYPE_BUSINESS_NON_FUNDED_CREDIT_FACILITY_GENERAL
        }
        if (code?.equalsIgnoreCase('56')) {
            return ExperianConstants.ACCOUNT_TYPE_BUSINESS_NON_FUNDED_CREDIT_FACILITY_PRIORITY_SECTOR_SMALL_BUSINESS
        }
        if (code?.equalsIgnoreCase('57')) {
            return ExperianConstants.ACCOUNT_TYPE_BUSINESS_NON_FUNDED_CREDIT_FACILITY_PRIORITY_SECTOR_AGRICULTURE
        }
        if (code?.equalsIgnoreCase('58')) {
            return ExperianConstants.ACCOUNT_TYPE_BUSINESS_NON_FUNDED_CREDIT_FACILITY_PRIORITY_SECTOR_OTHERS
        }
        if (code?.equalsIgnoreCase('59')) {
            return ExperianConstants.ACCOUNT_TYPE_BUSINESS_LOANS_AGAINST_BANK_DEPOSITS
        }
        if (code?.equalsIgnoreCase('60')) {
            return ExperianConstants.ACCOUNT_TYPE_STAFF_LOAN
        }
        if (code?.equalsIgnoreCase('61')) {
            return ExperianConstants.ACCOUNT_TYPE_BUSINESS_LOAN_UNSECURED
        }
        if (code?.equalsIgnoreCase('0')) {
            return ExperianConstants.ACCOUNT_TYPE_OTHERS
        }
        return ''
    }

    static String fetchAccountStatus(String code) {
        if (code?.equalsIgnoreCase('00')) {
            return ExperianConstants.ACCOUNT_STATUS_NO_SUIT_FILED
        }
        if (code?.equalsIgnoreCase('93') || code?.equalsIgnoreCase('53')) {
            return ExperianConstants.ACCOUNT_STATUS_SUIT_FILED
        }
        if (code?.equalsIgnoreCase('89')) {
            return ExperianConstants.ACCOUNT_STATUS_WILFUL_DEFAULT
        }
        if (code?.equalsIgnoreCase('97')) {
            return ExperianConstants.ACCOUNT_STATUS_WRITTEN_OFF
        }
        if (code?.equalsIgnoreCase('30')) {
            return ExperianConstants.ACCOUNT_STATUS_RESTRUCTURED
        }
        if (code?.equalsIgnoreCase('31')) {
            return ExperianConstants.ACCOUNT_STATUS_RESTRUCTURED_LOAN_GOV_MANDATE
        }
        if (code?.equalsIgnoreCase('32') || code?.equalsIgnoreCase('44')) {
            return ExperianConstants.ACCOUNT_STATUS_SETTLED
        }
        if (code?.equalsIgnoreCase('33') || code?.equalsIgnoreCase('45')) {
            return ExperianConstants.ACCOUNT_STATUS_POST_WO_SETTLED
        }
        if (code?.equalsIgnoreCase('34') || code?.equalsIgnoreCase('46')) {
            return ExperianConstants.ACCOUNT_STATUS_ACCOUNT_SOLD
        }
        if (code?.equalsIgnoreCase('35') || code?.equalsIgnoreCase('47')) {
            return ExperianConstants.ACCOUNT_STATUS_WRITTEN_OFF_ACCOUNT_SOLD
        }
        if (code?.equalsIgnoreCase('36') || code?.equalsIgnoreCase('48')) {
            return ExperianConstants.ACCOUNT_STATUS_ACCOUNT_PURCHASED
        }
        if (code?.equalsIgnoreCase('37') || code?.equalsIgnoreCase('49')) {
            return ExperianConstants.ACCOUNT_STATUS_ACCOUNT_PURCHASED_AND_WRITTEN_OFF
        }
        if (code?.equalsIgnoreCase('38') || code?.equalsIgnoreCase('50')) {
            return ExperianConstants.ACCOUNT_STATUS_ACCOUNT_PURCHASED_AND_SETTLED
        }
        if (code?.equalsIgnoreCase('39') || code?.equalsIgnoreCase('51')) {
            return ExperianConstants.ACCOUNT_STATUS_ACCOUNT_PURCHASED_AND_RESTRUCTURED
        }
        if (code?.equalsIgnoreCase('40') || code?.equalsIgnoreCase('52')) {
            return ExperianConstants.ACCOUNT_STATUS_STATUS_CLEARED
        }
        if (code?.equalsIgnoreCase('41')) {
            return ExperianConstants.ACCOUNT_STATUS_RESTRUCTURED_LOAN
        }
        if (code?.equalsIgnoreCase('42')) {
            return ExperianConstants.ACCOUNT_STATUS_RESTRUCTURED_LOAN_GOV_MANDATE
        }
        if (code?.equalsIgnoreCase('43')) {
            return ExperianConstants.ACCOUNT_STATUS_WRITTEN_OFF
        }
        if (code?.equalsIgnoreCase('54')) {
            return ExperianConstants.ACCOUNT_STATUS_SUIT_FILED_AND_WRITTEN_OFF
        }
        if (code?.equalsIgnoreCase('55')) {
            return ExperianConstants.ACCOUNT_STATUS_SUIT_FILED_AND_SETTLED
        }
        if (code?.equalsIgnoreCase('56')) {
            return ExperianConstants.ACCOUNT_STATUS_SUIT_FILED_AND_POST_WO_SETTLED
        }
        if (code?.equalsIgnoreCase('57')) {
            return ExperianConstants.ACCOUNT_STATUS_SUIT_FILED_AND_ACCOUNT_SOLD
        }
        if (code?.equalsIgnoreCase('58')) {
            return ExperianConstants.ACCOUNT_STATUS_SUIT_FILED_AND_WRITTEN_OFF_AND_ACCOUNT_SOLD
        }
        if (code?.equalsIgnoreCase('59')) {
            return ExperianConstants.ACCOUNT_STATUS_SUIT_FILED_AND_ACCOUNT_PURCHASED
        }
        if (code?.equalsIgnoreCase('60')) {
            return ExperianConstants.ACCOUNT_STATUS_FILED_AND_ACCOUNT_PURCHASED_AND_WRITTEN_OFF
        }
        if (code?.equalsIgnoreCase('61')) {
            return ExperianConstants.ACCOUNT_STATUS_FILED_AND_ACCOUNT_PURCHASED_AND_SETTLED
        }
        if (code?.equalsIgnoreCase('62')) {
            return ExperianConstants.ACCOUNT_STATUS_FILED_AND_ACCOUNT_PURCHASED_AND_RESTRUCTURED
        }
        if (code?.equalsIgnoreCase('63')) {
            return ExperianConstants.ACCOUNT_STATUS_FILED_AND_STATUS_CLEARED
        }
        if (code?.equalsIgnoreCase('64')) {
            return ExperianConstants.ACCOUNT_STATUS_WILFUL_DEFAULT_AND_RESTRUCTURED_LOAN
        }
        if (code?.equalsIgnoreCase('65')) {
            return ExperianConstants.ACCOUNT_STATUS_WILFUL_DEFAULT_AND_RESTRUCTURED_LOAN_AND_GOV_MANDATE
        }
        if (code?.equalsIgnoreCase('66')) {
            return ExperianConstants.ACCOUNT_STATUS_WILFUL_DEFAULT_SETTLED
        }
        if (code?.equalsIgnoreCase('67')) {
            return ExperianConstants.ACCOUNT_STATUS_WILFUL_DEFAULT_AND_POST_WO_SETTLED
        }
        if (code?.equalsIgnoreCase('68')) {
            return ExperianConstants.ACCOUNT_STATUS_WILFUL_DEFAULT_AND_ACCOUNT_SOLD
        }
        if (code?.equalsIgnoreCase('69')) {
            return ExperianConstants.ACCOUNT_STATUS_WILFUL_DEFAULT_AND_WRITTEN_OFF_AND_ACCOUNT_SOLD
        }
        if (code?.equalsIgnoreCase('70')) {
            return ExperianConstants.ACCOUNT_STATUS_WILFUL_DEFAULT_AND_ACCOUNT_PURCHASED
        }
        if (code?.equalsIgnoreCase('72')) {
            return ExperianConstants.ACCOUNT_STATUS_WILFUL_DEFAULT_AND_ACCOUNT_PURCHASED_WRITTEN_OFF
        }
        if (code?.equalsIgnoreCase('73')) {
            return ExperianConstants.ACCOUNT_STATUS_WILFUL_DEFAULT_AND_ACCOUNT_PURCHASED_AND_SETTLED
        }
        if (code?.equalsIgnoreCase('74')) {
            return ExperianConstants.ACCOUNT_STATUS_WILFUL_DEFAULT_AND_ACCOUNT_PURCHASED_AND_RESTRUCTURED
        }
        if (code?.equalsIgnoreCase('75')) {
            return ExperianConstants.ACCOUNT_STATUS_WILFUL_DEFAULT_AND_STATUS_CLEARED
        }
        if (code?.equalsIgnoreCase('76')) {
            return ExperianConstants.ACCOUNT_STATUS_SUIT_FILED_WILFUL_DEFAULT_AND_RESTRUCTURED
        }
        if (code?.equalsIgnoreCase('77')) {
            return ExperianConstants.ACCOUNT_STATUS_SUIT_FILED_WILFUL_DEFAULT_AND_GOV_MANDATE
        }
        if (code?.equalsIgnoreCase('79')) {
            return ExperianConstants.ACCOUNT_STATUS_SUIT_FILED_WILFUL_DEFAULT_AND_SETTLED
        }
        if (code?.equalsIgnoreCase('81')) {
            return ExperianConstants.ACCOUNT_STATUS_SUIT_FILED_WILFUL_DEFAULT_AND_POST_WO_SETTLED
        }
        if (code?.equalsIgnoreCase('85')) {
            return ExperianConstants.ACCOUNT_STATUS_SUIT_FILED_WILFUL_DEFAULT_AND_ACCOUNT_SOLD
        }
        if (code?.equalsIgnoreCase('86')) {
            return ExperianConstants.ACCOUNT_STATUS_SUIT_FILED_WILFUL_DEFAULT_AND_WRITTEN_OFF_ACCOUNT_SOLD
        }
        if (code?.equalsIgnoreCase('87')) {
            return ExperianConstants.ACCOUNT_STATUS_SUIT_FILED_WILFUL_DEFAULT_AND_ACCOUNT_PURCHASED
        }
        if (code?.equalsIgnoreCase('88')) {
            return ExperianConstants.ACCOUNT_STATUS_SUIT_FILED_WILFUL_DEFAULT_AND_ACCOUNT_PURCHASED_AND_WRITTEN_OFF
        }
        if (code?.equalsIgnoreCase('94')) {
            return ExperianConstants.ACCOUNT_STATUS_SUIT_FILED_WILFUL_DEFAULT_AND_ACCOUNT_PURCHASED_AND_SETTLED
        }
        if (code?.equalsIgnoreCase('90')) {
            return ExperianConstants.ACCOUNT_STATUS_SUIT_FILED_WILFUL_DEFAULT_AND_ACCOUNT_PURCHASED_AND_RESTRUCTURED
        }
        if (code?.equalsIgnoreCase('91')) {
            return ExperianConstants.ACCOUNT_STATUS_SUIT_FILED_WILFUL_DEFAULT_AND_STATUS_CLEARED
        }
        if (code?.equalsIgnoreCase('12') || code?.equalsIgnoreCase('13') || code?.equalsIgnoreCase('14') || code?.equalsIgnoreCase('15') || code?.equalsIgnoreCase('16') || code?.equalsIgnoreCase('17')) {
            return ExperianConstants.ACCOUNT_STATUS_CLOSED
        }
        if (code?.equalsIgnoreCase('11') || code?.equalsIgnoreCase('71') || code?.equalsIgnoreCase('78') || code?.equalsIgnoreCase('80') || code?.equalsIgnoreCase('82') || code?.equalsIgnoreCase('83') || code?.equalsIgnoreCase('84') ||
                code?.equalsIgnoreCase('21') || code?.equalsIgnoreCase('22') || code?.equalsIgnoreCase('23') || code?.equalsIgnoreCase('24') || code?.equalsIgnoreCase('25') || code?.equalsIgnoreCase('DEFAULTVALUE')) {
            return ExperianConstants.ACCOUNT_STATUS_ACTIVE
        }
        return ''
    }

    static String fetchGender(String code) {
        if (code.equalsIgnoreCase('1')) {
            return ExperianConstants.MALE
        }
        if (code.equalsIgnoreCase('2')) {
            return ExperianConstants.FEMALE
        }
        if (code.equalsIgnoreCase('3')) {
            return ExperianConstants.TRANSGENDER
        }
        return ''
    }

    static String fetchState(String code) {
        if (code.equalsIgnoreCase('01')) {
            return ExperianConstants.JAMMU_KASHMIR
        }
        if (code.equalsIgnoreCase('02')) {
            return ExperianConstants.HIMACHAL_PRADESH
        }
        if (code.equalsIgnoreCase('03')) {
            return ExperianConstants.PUNJAB
        }
        if (code.equalsIgnoreCase('04')) {
            return ExperianConstants.CHANDIGARH
        }
        if (code.equalsIgnoreCase('05')) {
            return ExperianConstants.UTTRANCHAL
        }
        if (code.equalsIgnoreCase('06')) {
            return ExperianConstants.HARAYANA
        }
        if (code.equalsIgnoreCase('07')) {
            return ExperianConstants.DELHI
        }
        if (code.equalsIgnoreCase('08')) {
            return ExperianConstants.RAJASTHAN
        }
        if (code.equalsIgnoreCase('09')) {
            return ExperianConstants.UTTAR_PRADESH
        }
        if (code.equalsIgnoreCase('10')) {
            return ExperianConstants.BIHAR
        }
        if (code.equalsIgnoreCase('11')) {
            return ExperianConstants.SIKKIM
        }
        if (code.equalsIgnoreCase('12')) {
            return ExperianConstants.ARUNACHAL_PRADESH
        }
        if (code.equalsIgnoreCase('13')) {
            return ExperianConstants.NAGALAND
        }
        if (code.equalsIgnoreCase('14')) {
            return ExperianConstants.MANIPUR
        }
        if (code.equalsIgnoreCase('15')) {
            return ExperianConstants.MIZORAM
        }
        if (code.equalsIgnoreCase('16')) {
            return ExperianConstants.TRIPURA
        }
        if (code.equalsIgnoreCase('17')) {
            return ExperianConstants.MEGHALAYA
        }
        if (code.equalsIgnoreCase('18')) {
            return ExperianConstants.ASSAM
        }
        if (code.equalsIgnoreCase('19')) {
            return ExperianConstants.WEST_BENGAL
        }
        if (code.equalsIgnoreCase('20')) {
            return ExperianConstants.JHARKHAND
        }
        if (code.equalsIgnoreCase('21')) {
            return ExperianConstants.ORRISA
        }
        if (code.equalsIgnoreCase('22')) {
            return ExperianConstants.CHHATTISGARH
        }
        if (code.equalsIgnoreCase('23')) {
            return ExperianConstants.MADHYA_PRADESH
        }
        if (code.equalsIgnoreCase('24')) {
            return ExperianConstants.GUJRAT
        }
        if (code.equalsIgnoreCase('25')) {
            return ExperianConstants.DAMAN_DIU
        }
        if (code.equalsIgnoreCase('26')) {
            return ExperianConstants.DADARA_NAGAR_HAVELI
        }
        if (code.equalsIgnoreCase('27')) {
            return ExperianConstants.MAHARASHTRA
        }
        if (code.equalsIgnoreCase('28')) {
            return ExperianConstants.ANDHRAPRADESH
        }
        if (code.equalsIgnoreCase('29')) {
            return ExperianConstants.KARNATAKA
        }
        if (code.equalsIgnoreCase('30')) {
            return ExperianConstants.GOA
        }
        if (code.equalsIgnoreCase('31')) {
            return ExperianConstants.LAKSHADWEEP
        }
        if (code.equalsIgnoreCase('32')) {
            return ExperianConstants.KERALA
        }
        if (code.equalsIgnoreCase('33')) {
            return ExperianConstants.TAMIL_NADU
        }
        if (code.equalsIgnoreCase('34')) {
            return ExperianConstants.PONDICHERRY
        }
        if (code.equalsIgnoreCase('35')) {
            return ExperianConstants.ANDAMAN_NICOBAR_ISLANDS
        }
        if (code.equalsIgnoreCase('36')) {
            return ExperianConstants.TELANGANA
        }
        return ''
    }

    static String fetchMaritalStatus(String code) {
        if (code.equalsIgnoreCase('1')) {
            return ExperianConstants.SINGLE
        }
        if (code.equalsIgnoreCase('2')) {
            return ExperianConstants.MARRIED
        }
        if (code.equalsIgnoreCase('3')) {
            return ExperianConstants.WIDOW
        }
        if (code.equalsIgnoreCase('4')) {
            return ExperianConstants.DIVORCED
        }
        return null
    }

    static String fetchEmploymentStatus(String code) {
        if (code.equalsIgnoreCase('S')) {
            return ExperianConstants.SALARIED
        }
        if (code.equalsIgnoreCase('N')) {
            return ExperianConstants.NON_SALARIED
        }
        if (code.equalsIgnoreCase('E')) {
            return ExperianConstants.SELF
        }
        if (code.equalsIgnoreCase('P')) {
            return ExperianConstants.PROFESSIONAL
        }
        if (code.equalsIgnoreCase('U')) {
            return ExperianConstants.UNEMPLOYED
        }
    }

    static String fetchPhoneType(String phoneType) {
        if (phoneType?.equalsIgnoreCase('02')) {
            return ExperianConstants.HOME

        }
        if (phoneType?.equalsIgnoreCase('03')) {
            return ExperianConstants.OFFICE

        }
        if (phoneType?.equalsIgnoreCase('00')) {
            return ExperianConstants.UNKNOWN
        }
        return ExperianConstants.MOBILE
    }

    static String fetchSearchType(String code){
        if(code.equalsIgnoreCase('1')){
            return ExperianConstants.AGRI
        }
        if(code.equalsIgnoreCase('2')){
            return ExperianConstants.AUTO
        }
        if(code.equalsIgnoreCase('3')){
            return ExperianConstants.BUSINESS
        }
        if(code.equalsIgnoreCase('4')){
            return ExperianConstants.COMMERCIAL
        }
        if(code.equalsIgnoreCase('5')){
            return ExperianConstants.CONSTRUCTION
        }
        if(code.equalsIgnoreCase('6')){
            return ExperianConstants.CONSUMER
        }
        return null
    }








    static List accountStatusList() {
        List statusList = new ArrayList<String>()
        statusList.add('00')
        statusList.add('30')
        statusList.add('31')
        statusList.add('32')
        statusList.add('33')
        statusList.add('34')
        statusList.add('35')
        statusList.add('36')
        statusList.add('37')
        statusList.add('38')
        statusList.add('39')
        statusList.add('40')
        statusList.add('41')
        statusList.add('42')
        statusList.add('43')
        statusList.add('44')
        statusList.add('45')
        statusList.add('46')
        statusList.add('47')
        statusList.add('48')
        statusList.add('49')
        statusList.add('50')
        statusList.add('51')
        statusList.add('52')
        statusList.add('53')
        statusList.add('54')
        statusList.add('55')
        statusList.add('56')
        statusList.add('57')
        statusList.add('58')
        statusList.add('59')
        statusList.add('60')
        statusList.add('61')
        statusList.add('62')
        statusList.add('63')
        statusList.add('64')
        statusList.add('65')
        statusList.add('66')
        statusList.add('67')
        statusList.add('68')
        statusList.add('69')
        statusList.add('70')
        statusList.add('72')
        statusList.add('73')
        statusList.add('74')
        statusList.add('75')
        statusList.add('76')
        statusList.add('77')
        statusList.add('79')
        statusList.add('81')
        statusList.add('85')
        statusList.add('86')
        statusList.add('87')
        statusList.add('88')
        statusList.add('90')
        statusList.add('91')
        statusList.add('93')
        statusList.add('97')
        return statusList
    }
}
