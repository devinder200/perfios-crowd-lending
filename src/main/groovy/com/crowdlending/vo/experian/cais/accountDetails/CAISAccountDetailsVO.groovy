package com.crowdlending.vo.experian.cais.accountDetails

import com.crowdlending.util.ExperianVOUtil
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.node.ArrayNode

class CAISAccountDetailsVO {
    String accountHoldertypeCode
    String litigationStatusDate
    String openDate
    String accountType
    String income
    String subscriberComments
    String currencyCode
    CAISHolderDetailsVO cAISHolderDetailsVO
    String paymentHistoryProfile
    String portfolioType
    String dateOfAddition
    String paymentRating
    String valueOfCollateral
    String occupationCode
    String subscriberName
    String creditLimitAmount
    String suitFiledWilfulDefault
    String writtenOffSettledStatus
    String writtenOffAmtTotal
    String promotionalRateFlag
    List<CAISAccountHistoryVO> caisAccountHistoryVOList
    CAISHolderAddressDetailsVO caisHolderAddressDetailsVO
    String dateReported
    String suitFiledWillfulDefaultWrittenOffStatus
    CAISHolderPhoneDetailsVO caisHolderPhoneDetailsVO
    String valueOfCreditsLastMonth
    String dateClosed
    String currentBalance
    String scheduledMonthlyPaymentAmount
    String amountPastDue
    String rateOfInterest
    String dateOfFirstDelinquency
    String termsFrequency
    CAISHolderIDDetailsVO caisHolderIDDetailsVO
    String accountNumber
    String dateOfLastPayment
    String specialComment
    String defaultStatusDate
    String incomeIndicator
    String highestCreditOrOriginalLoanAmount
    String settlementAmount
    String originalChargeOffAmount
    String typeOfCollateral
    String writeOffStatusDate
    String writtenOffAmtPrincipal
    String incomeFrequencyIndicator
    String consumerComments
    String repaymentTenure
    String termsDuration
    String identificationNumber
    String accountStatus
    String accountStatusCode
    PaymentHistoryVO paymentHistoryVO

    CAISAccountDetailsVO(JsonNode jsonNode) {
        this.accountHoldertypeCode = ExperianVOUtil.fetchAccountHolderType(jsonNode.get("AccountHoldertypeCode").toString().replace("\"", ""))
        this.litigationStatusDate = ExperianVOUtil.dateConverterForExperian(jsonNode.get("LitigationStatusDate").toString().replace("\"", ""))
        this.openDate = ExperianVOUtil.dateConverterForExperian(jsonNode.get("Open_Date").toString().replace("\"", ""))
        this.accountType = ExperianVOUtil.fetchAccountType(jsonNode.get("Account_Type").toString().replace("\"", ""))
        this.income = jsonNode.get("Income").toString().replace("\"", "")
        this.subscriberComments = jsonNode.get("Subscriber_comments").toString().replace("\"", "")
        this.currencyCode = jsonNode.get("CurrencyCode").toString().replace("\"", "")
        this.cAISHolderDetailsVO = new CAISHolderDetailsVO(jsonNode.get("CAIS_Holder_Details"))
        this.paymentHistoryProfile = jsonNode.get("Payment_History_Profile").toString().replace("\"", "")
        this.portfolioType = jsonNode.get("Portfolio_Type").toString().replace("\"", "")
        this.dateOfAddition = ExperianVOUtil.dateConverterForExperian(jsonNode.get("DateOfAddition").toString().replace("\"", ""))
        this.paymentRating = jsonNode.get("Payment_Rating").toString().replace("\"", "")
        this.valueOfCollateral = jsonNode.get("Value_of_Collateral").toString().replace("\"", "")
        this.occupationCode = jsonNode.get("Occupation_Code").toString().replace("\"", "")
        this.subscriberName = jsonNode.get("Subscriber_Name").toString().replace("\"", "")
        this.creditLimitAmount = jsonNode.get("Credit_Limit_Amount").toString().replace("\"", "")
        this.suitFiledWilfulDefault = jsonNode.get("SuitFiled_WilfulDefault").toString().replace("\"", "")
        this.writtenOffSettledStatus = jsonNode.get("Written_off_Settled_Status").toString().replace("\"", "")
        this.writtenOffAmtTotal = jsonNode.get("Written_Off_Amt_Total").toString().replace("\"", "")
        this.promotionalRateFlag = jsonNode.get("Promotional_Rate_Flag").toString().replace("\"", "")
        //Account History code
        String historyString = jsonNode.get("CAIS_Account_History").toString()
        List<CAISAccountHistoryVO> accountHistoryList = new ArrayList<CAISAccountHistoryVO>()
        if (historyString.charAt(0) == ('[' as char)) {
            ArrayNode arrayNode = (ArrayNode) jsonNode.get("CAIS_Account_History")
            if (arrayNode.isArray()) {
                Iterator<JsonNode> elements = arrayNode.elements()
                while (elements.hasNext()) {
                    JsonNode element = elements.next()
                    accountHistoryList.add(new CAISAccountHistoryVO(element))
                }
            }
        } else {
            accountHistoryList.add(new CAISAccountHistoryVO(jsonNode.get("CAIS_Account_History")))
        }
        this.caisAccountHistoryVOList = accountHistoryList
        this.caisHolderAddressDetailsVO = new CAISHolderAddressDetailsVO(jsonNode.get("CAIS_Holder_Address_Details"))
        this.dateReported = ExperianVOUtil.dateConverterForExperian(jsonNode.get("Date_Reported").toString().replace("\"", ""))
        this.suitFiledWillfulDefaultWrittenOffStatus = jsonNode.get("SuitFiledWillfulDefaultWrittenOffStatus").toString().replace("\"", "")
        this.caisHolderPhoneDetailsVO = new CAISHolderPhoneDetailsVO(jsonNode.get("CAIS_Holder_Phone_Details"))
        this.valueOfCreditsLastMonth = jsonNode.get("Value_of_Credits_Last_Month").toString().replace("\"", "")
        this.dateClosed = ExperianVOUtil.dateConverterForExperian(jsonNode.get("Date_Closed").toString().replace("\"", ""))
        this.currentBalance = jsonNode.get("Current_Balance").toString().replace("\"", "")
        this.scheduledMonthlyPaymentAmount = jsonNode.get("Scheduled_Monthly_Payment_Amount").toString().replace("\"", "")
        this.amountPastDue = jsonNode.get("Amount_Past_Due").toString().replace("\"", "")
        this.rateOfInterest = jsonNode.get("Rate_of_Interest").toString().replace("\"", "")
        this.dateOfFirstDelinquency = ExperianVOUtil.dateConverterForExperian(jsonNode.get("Date_of_First_Delinquency").toString().replace("\"", ""))
        this.termsFrequency = jsonNode.get("Terms_Frequency").toString().replace("\"", "")
        this.caisHolderIDDetailsVO = new CAISHolderIDDetailsVO(jsonNode.get("CAIS_Holder_ID_Details"))
        this.accountNumber = jsonNode.get("Account_Number").toString().replace("\"", "")
        this.dateOfLastPayment = ExperianVOUtil.dateConverterForExperian(jsonNode.get("Date_of_Last_Payment").toString().replace("\"", ""))
        this.specialComment = jsonNode.get("Special_Comment").toString().replace("\"", "")
        this.defaultStatusDate = ExperianVOUtil.dateConverterForExperian(jsonNode.get("DefaultStatusDate").toString().replace("\"", ""))
        this.incomeIndicator = jsonNode.get("Income_Indicator").toString().replace("\"", "")
        this.highestCreditOrOriginalLoanAmount = jsonNode.get("Highest_Credit_or_Original_Loan_Amount").toString().replace("\"", "")
        this.settlementAmount = jsonNode.get("Settlement_Amount").toString().replace("\"", "")
        this.originalChargeOffAmount = jsonNode.get("Original_Charge_Off_Amount").toString().replace("\"", "")
        this.typeOfCollateral = jsonNode.get("Type_of_Collateral").toString().replace("\"", "")
        this.writeOffStatusDate = ExperianVOUtil.dateConverterForExperian(jsonNode.get("WriteOffStatusDate").toString().replace("\"", ""))
        this.writtenOffAmtPrincipal = jsonNode.get("Written_Off_Amt_Principal").toString().replace("\"", "")
        this.incomeFrequencyIndicator = jsonNode.get("Income_Frequency_Indicator").toString().replace("\"", "")
        this.consumerComments = jsonNode.get("Consumer_comments").toString().replace("\"", "")
        this.repaymentTenure = jsonNode.get("Repayment_Tenure").toString().replace("\"", "")
        this.termsDuration = jsonNode.get("Terms_Duration").toString().replace("\"", "")
        this.identificationNumber = jsonNode.get("Identification_Number").toString().replace("\"", "")
        this.accountStatus = ExperianVOUtil.fetchAccountStatus(jsonNode.get("Account_Status").toString().replace("\"", ""))
        this.accountStatusCode = jsonNode.get("Account_Status").toString().replace("\"", "")
        this.paymentHistoryVO = new PaymentHistoryVO(this.caisAccountHistoryVOList)
    }
}
