package com.crowdlending.vo.experian.cais.accountDetails

class PaymentHistoryVO {
    String year
    String month01
    String month02
    String month03
    String month04
    String month05
    String month06
    String month07
    String month08
    String month09
    String month10
    String month11
    String month12
    String day01
    String day02
    String day03
    String day04
    String day05
    String day06
    String day07
    String day08
    String day09
    String day10
    String day11
    String day12
    String assetClassification01
    String assetClassification02
    String assetClassification03
    String assetClassification04
    String assetClassification05
    String assetClassification06
    String assetClassification07
    String assetClassification08
    String assetClassification09
    String assetClassification10
    String assetClassification11
    String assetClassification12

    PaymentHistoryVO(List<CAISAccountHistoryVO> accountHistoryList) {
        for (CAISAccountHistoryVO caisAccountHistoryVO : accountHistoryList) {
            this.year = caisAccountHistoryVO.year
            if (caisAccountHistoryVO?.month?.equalsIgnoreCase('01') || caisAccountHistoryVO?.month?.equalsIgnoreCase('1')) {
                this.month01 = caisAccountHistoryVO?.month
                if (!caisAccountHistoryVO?.daysPastDue?.equalsIgnoreCase('0')) {
                    this.day01 = caisAccountHistoryVO.daysPastDue
                }
                this.assetClassification01 = caisAccountHistoryVO.assetClassification
            }
            if (caisAccountHistoryVO?.month?.equalsIgnoreCase('02') || caisAccountHistoryVO?.month?.equalsIgnoreCase('2')) {
                this.month02 = caisAccountHistoryVO?.month
                if (!caisAccountHistoryVO?.daysPastDue?.equalsIgnoreCase('0')) {
                    this.day02 = caisAccountHistoryVO.daysPastDue
                }
                this.assetClassification02 = caisAccountHistoryVO.assetClassification
            }
            if (caisAccountHistoryVO?.month?.equalsIgnoreCase('03') || caisAccountHistoryVO?.month?.equalsIgnoreCase('3')) {
                this.month03 = caisAccountHistoryVO?.month
                if (!caisAccountHistoryVO?.daysPastDue?.equalsIgnoreCase('0')) {
                    this.day03 = caisAccountHistoryVO.daysPastDue
                }
                this.assetClassification03 = caisAccountHistoryVO.assetClassification
            }
            if (caisAccountHistoryVO?.month?.equalsIgnoreCase('04') || caisAccountHistoryVO?.month?.equalsIgnoreCase('4')) {
                this.month04 = caisAccountHistoryVO?.month
                if (!caisAccountHistoryVO?.daysPastDue?.equalsIgnoreCase('0')) {
                    this.day04 = caisAccountHistoryVO.daysPastDue
                }
                this.assetClassification04 = caisAccountHistoryVO.assetClassification
            }
            if (caisAccountHistoryVO?.month?.equalsIgnoreCase('05') || caisAccountHistoryVO?.month?.equalsIgnoreCase('5')) {
                this.month05 = caisAccountHistoryVO?.month
                if (!caisAccountHistoryVO?.daysPastDue?.equalsIgnoreCase('0')) {
                    this.day05 = caisAccountHistoryVO.daysPastDue
                }
                this.assetClassification05 = caisAccountHistoryVO.assetClassification
            }
            if (caisAccountHistoryVO?.month?.equalsIgnoreCase('06') || caisAccountHistoryVO?.month?.equalsIgnoreCase('6')) {
                this.month06 = caisAccountHistoryVO?.month
                if (!caisAccountHistoryVO?.daysPastDue?.equalsIgnoreCase('0')) {
                    this.day06 = caisAccountHistoryVO.daysPastDue
                }
                this.assetClassification06 = caisAccountHistoryVO.assetClassification
            }
            if (caisAccountHistoryVO?.month?.equalsIgnoreCase('07') || caisAccountHistoryVO?.month?.equalsIgnoreCase('7')) {
                this.month07 = caisAccountHistoryVO?.month
                if (!caisAccountHistoryVO?.daysPastDue?.equalsIgnoreCase('0')) {
                    this.day07 = caisAccountHistoryVO.daysPastDue
                }
                this.assetClassification07 = caisAccountHistoryVO.assetClassification
            }
            if (caisAccountHistoryVO?.month?.equalsIgnoreCase('08') || caisAccountHistoryVO?.month?.equalsIgnoreCase('8')) {
                this.month08 = caisAccountHistoryVO?.month
                if (!caisAccountHistoryVO?.daysPastDue?.equalsIgnoreCase('0')) {
                    this.day08 = caisAccountHistoryVO.daysPastDue
                }
                this.assetClassification08 = caisAccountHistoryVO.assetClassification
            }
            if (caisAccountHistoryVO?.month?.equalsIgnoreCase('09') || caisAccountHistoryVO?.month?.equalsIgnoreCase('9')) {
                this.month09 = caisAccountHistoryVO?.month
                if (!caisAccountHistoryVO?.daysPastDue?.equalsIgnoreCase('0')) {
                    this.day09 = caisAccountHistoryVO.daysPastDue
                }
                this.assetClassification09 = caisAccountHistoryVO.assetClassification
            }
            if (caisAccountHistoryVO?.month?.equalsIgnoreCase('10')) {
                this.month10 = caisAccountHistoryVO?.month
                if (!caisAccountHistoryVO?.daysPastDue?.equalsIgnoreCase('0')) {
                    this.day10 = caisAccountHistoryVO.daysPastDue
                }
                this.assetClassification10 = caisAccountHistoryVO.assetClassification
            }
            if (caisAccountHistoryVO?.month?.equalsIgnoreCase('11')) {
                this.month11 = caisAccountHistoryVO?.month
                if (!caisAccountHistoryVO?.daysPastDue?.equalsIgnoreCase('0')) {
                    this.day11 = caisAccountHistoryVO.daysPastDue
                }
                this.assetClassification11 = caisAccountHistoryVO.assetClassification
            }
            if (caisAccountHistoryVO?.month?.equalsIgnoreCase('12')) {
                this.month12 = caisAccountHistoryVO?.month
                if (!caisAccountHistoryVO?.daysPastDue?.equalsIgnoreCase('0')) {
                    this.day12 = caisAccountHistoryVO.daysPastDue
                }
                this.assetClassification12 = caisAccountHistoryVO.assetClassification
            }
        }
    }


}
