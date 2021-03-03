package com.crowdlending.vo

import com.fasterxml.jackson.annotation.JsonIgnoreProperties

@JsonIgnoreProperties(ignoreUnknown = true)
class PerfiosBankStatementAnalysisDataVO {
    List<Top5FundsReceived> top5FundsReceived;
    SummaryInfo summaryInfo;
    CustomerInfo customerInfo;
    List<MonthlyDetails> monthlyDetails;
    List<Top5FundsTransferred> top5FundsTransferred;
    List<AccountXns> accountXns;
    List<AdditionalMonthlyDetails> AdditionalMonthlyDetails
    List<Statementdetails> statementdetails
    List<EstimatedSalaryXns> estimatedSalaryXns
    List<EstimatedSalaryXns> eODBalances
}

public class AccountXns {
    String accountNo;
    String accountType;
    String ifscCode;
    String micrCode;
    List<Xns> xns;

}

public class Xns {
    String date;
    String amount;
    String balance;
    String narration;
    String chqNo;
    String category;
}

public class Top5FundsTransferred {
    String amount;
    String month;
    String category;
}

public class Top5FundsReceived {
    String amount;
    String month;
    String category;
}

public class MonthlyDetails {
    String balMin;
    String debits;
    String inwBounces;
    String totalCredit;
    String balAvg;
    String monthName;
    String chqIssues;
    String cashWithdrawals;
    String totalChqIssue;
    String balMax;
    String cashDeposits;
    String chqDeposits;
    String outwBounces;
    String credits;
    String totalCashWithdrawal;
    String totalDebit;
    String totalChqDeposit;
    String startDate;
    String totalCashDeposit;
    Integer inwBounceNonTechnical
    BigDecimal totalEstimatedSalary
}

public class SummaryInfo {
    Average average;
    Total total;
    String accNo;
    String instName;
    String accType;
    Integer fullMonthCount
    String inwSameChqBounces
}

public class Average {
    String balMin;
    String debits;
    String inwBounces;
    String totalCredit;
    BigDecimal balAvg;
    String chqIssues;
    String cashWithdrawals;
    String totalChqIssue;
    String balMax;
    String cashDeposits;
    String chqDeposits;
    String outwBounces;
    String credits;
    String totalCashWithdrawal;
    String totalDebit;
    String totalChqDeposit;
    String totalCashDeposit;
    BigDecimal totalSalary
    Integer inwBounceNonTechnical

}

public class Total {
    String balMin;
    String debits;
    String inwBounces;
    BigDecimal totalCredit;
    String balAvg;
    String chqIssues;
    String cashWithdrawals;
    String totalChqIssue;
    String balMax;
    String cashDeposits;
    String chqDeposits;
    String outwBounces;
    String credits;
    String totalCashWithdrawal;
    BigDecimal totalDebit;
    String totalChqDeposit;
    String monthlyDetails;
    String totalCashDeposit
    Integer inwBounceNonTechnical
}

public class CustomerInfo {
    String instId;
    String bank;
    String address;
    String name;
    String mobile;
    String landline;
    String customerTransactionId;
    String pan;
    String email;
    String perfiosTransactionId;

}

public class AdditionalMonthlyDetails {
    String monthName
    BigDecimal totalAdditionalIncome
    BigDecimal additionalIncomePercent
    String channelVSnonChannel
    BigDecimal FOIR
    BigDecimal ExpenseToIncomeRatio
    BigDecimal eodToEmiRatio
    String bigDebitAfterSalary
}

public class Statementdetails {
    CustomerInfo customerInfo
    String statementStatus
    String fileName
}

public class EstimatedSalaryXns {
    String date
    String chqNo
    String narration
    BigDecimal amount
    String category
    BigDecimal balance
    String mode
    String month
    String employerNameMatch
    String identificationMode
}

public class EODBalances {
    String date
    BigDecimal balance
}
