package com.crowdlending.enums

class Enums {

    String toString() {
        return ''
    }

    public enum Titles {
        MR, MRS, MS
    }

    public enum UserType {
        BORROWER, INVESTOR, DSA, ADMIN, FIA, COLLECTION_AGENCY

        public static List<UserType> allContractCamReportUserTypes() {
            [ADMIN, DSA, FIA, INVESTOR]
        }

        public static List<UserType> customLinkGenerateFor() {
            [BORROWER, DSA, FIA, INVESTOR]
        }
    }

    public enum BankAccountType {
        SAVINGS, CURRENT, LOAN, CREDIT_CARD
    }

    public enum RiskModelType {
        RANGE, ELEMENTS, DATE, PRESENT, SAME_VALUE, BUREAU_SCORE
    }

    public enum SortType {
        ASCENDING, DESCENDING
    }

    public enum ContactDetailType {
        PHONE, EMAIL, FAX, WEBSITE

        public static List<ContactDetailType> allContactDetailsTypes() {
            [PHONE, EMAIL, FAX, WEBSITE]
        }

        public static List<ContactDetailType> allPhoneTypes() {
            [PHONE, FAX]
        }
    }

    public enum JobType {
        SALARIED, BUSINESS, SELFEMPLOYEDPROFESSIONAL, SELF_EMPLOYED_PROFESSIONAL
    }

    public enum AssetType {
        CAR, HOUSE, STOCK
    }

    public enum CurrencySymbol {
        DOLLAR('$'),
        SINGAPORE_DOLLAR('S$'),
        EURO('€'),
        RUPPEE('₹'),
        FILIPINO_PISO('₱'),
        MYR('RM'),
        INDONESIAN_RUPIAH('IDR'),
        FCFA('FCFA'),
        XOF('XOF'),
        POUND('£'),
        INDIAN_RUPEE('Rs'),
        BULGERIAN_LEV('лв'),
        BOLIVIANO('$b'),
        BRAZILIAN_REAL('R$'),
        BITCOIN('Ƀ'),
        PULA('P'),
        SWISS_FRANC('CHF'),
        YUAN_RENMINBI('¥'),
        COSTA_RICAN_COLON('₡'),
        CUBAN_PESO('₱'),
        CZECH_KORUNA('Kč'),
        RUPIAH('Rp'),
        RIAL('﷼'),
        KOREAN_WON('₩'),
        KIP('₭'),
        DENAR('ден'),
        BALBOA('B/.'),
        SOL('S/.'),
        PHILIPPINE_PESO('₱'),
        ROUBLE('₽'),
        TURKISH_LIRA('₺'),
        DONG('₫'),
        ZAR('R'),
        MUR('₨'),
        LKR('₨'),
        UAE_DIRHAM('د.إ'),
        RIAL_SAR('SAR')

        final private String symbol

        public CurrencySymbol(String symbol) {
            this.symbol = symbol
        }

        public getSymbol() {
            return this.symbol
        }
    }

    public enum LayoutTheme {
        DEFAULT(' '),
        WHITE_GREEN('theme-white'),
        WHITE_BLUE('theme-whbl'),
        BLUE_GRADIENT('theme-blue-gradient'),
        GREEN_SEA('theme-turquoise'),
        PURPLE('theme-amethyst'),
        BLUE('theme-blue'),
        RED('theme-red')

        final private String symbol

        public LayoutTheme(String symbol) {
            this.symbol = symbol
        }

        public getSymbol() {
            return this.symbol
        }
    }

    public enum BuyerProfileStatus {
        BASIC(1), PERSONAL(1), BANK(1), EXPIRED(1),
        COMPLETED(4),
        APPROVED(5), REJECTED(5), BLACKLIST(5), COLLATERAL(5),
        INACTIVE(6)

        final private int stateLevel

        public BuyerProfileStatus(int stateLevel) {
            this.stateLevel = stateLevel
        }

        public getStateLevel() {
            return this.stateLevel
        }
    }

    public enum BorrowerProfileStatus {
        BASIC(1), PERSONAL(1), BANK(1), EXPIRED(1),
        COMPLETED(4),
        APPROVED(5), REJECTED(5), BLACKLIST(5), COLLATERAL(5),
        INACTIVE(6)

        final private int stateLevel

        public BorrowerProfileStatus(int stateLevel) {
            this.stateLevel = stateLevel
        }

        public getStateLevel() {
            return this.stateLevel
        }

        public static List<BorrowerProfileStatus> beforeApproval() {
            [BASIC, COMPLETED, COLLATERAL, REJECTED]
        }

        public static List<BorrowerProfileStatus> rejectedOrExipred() {
            [REJECTED, EXPIRED]
        }

        public static List<BorrowerProfileStatus> approvalPendingStates() {
            [BASIC, PERSONAL, BANK, COMPLETED, COLLATERAL]
        }

        public static List<BorrowerProfileStatus> statusForDocumentUpload() {
            [BASIC, PERSONAL, BANK, COMPLETED, APPROVED]
        }
    }

    public enum DsaStatus {
        APPROVED, AWAITING_APPROVAL, REJECTED, EXPIRED, DISABLED, BLACKLIST

        public static List<DsaStatus> beforeApproval() {
            [AWAITING_APPROVAL, REJECTED, DISABLED, BLACKLIST]
        }
    }

    public enum FiaStatus {
        APPROVED, AWAITING_APPROVAL, REJECTED, EXPIRED, DISABLED, BLACKLIST

        public static List<FiaStatus> beforeApproval() {
            [AWAITING_APPROVAL, REJECTED, DISABLED, BLACKLIST]
        }
    }

    public enum IgaStatus {
        APPROVED, AWAITING_APPROVAL, REJECTED, EXPIRED, DISABLED, BLACKLIST

        public static List<IgaStatus> igaStatusList() {
            return [APPROVED, AWAITING_APPROVAL, REJECTED, DISABLED, BLACKLIST, EXPIRED]
        }

        public static List<IgaStatus> beforeApproval() {
            [AWAITING_APPROVAL, REJECTED, DISABLED, BLACKLIST]
        }
    }

    public enum AdminStatus {
        APPROVED, AWAITING_APPROVAL, REJECTED, DISABLED, BLACKLIST
    }

    public enum ApiDocs {
        LOGIN("login_api", "login.json"),
        BORROWER("borrower_api", "borrower.json"),
        LENDER("investor_api", "investor.json"),
        LOAN("loan_api", "loanApplication.json"),
        CONFIGURATION("config_api", "configuration.json"),
        COMMON("common_api", "common.json"),
        DSA("dsa_api", "dsa.json"),
        ADMIN("admin_api", "admin.json"),
        REPRESENTATIVE("representative_api", "companyrepresentative.json"),
        CA("ca_api", "collectionagency.json"),
        INTERNAL_API("internal_api", "internal.json"),
        SIGNZY("signzy_api", "signzy.json"),
        PERFIOS_API("perfios_api", "reportanalysis.json"),
        MOCK_API("mock_api", "mockApi.json"),
        NOTIFICATION_API("notification_api", "notification.json")

        final private String name
        final private String jsonFile

        ApiDocs(String json, String jsonFileName) {
            name = json
            jsonFile = jsonFileName
        }

        public getName() {
            return this.name
        }

        public getJsonFile() {
            return this.jsonFile
        }
    }

    public enum InvestorProfileStatus {
        BASIC(1), PERSONAL(1), BANK(1), EXPIRED(1), CONTRACT_AWAITING(1),
        CONTRACT_ACCEPTED(1),
        COMPLETED(2),
        APPROVED(3), REJECTED(3), BLACKLIST(3),
        INACTIVE(5),
        COMPANY(1)

        final private int stateLevel

        public getStateLevel() {
            return this.stateLevel
        }

        public InvestorProfileStatus(int stateLevel) {
            this.stateLevel = stateLevel
        }

        public static List<InvestorProfileStatus> incompleteInvestorProfileStatuses() {
            [BASIC, PERSONAL, BANK, COMPLETED, REJECTED, COMPANY]
        }

        public static List<InvestorProfileStatus> beforeApproval() {
            [BASIC, PERSONAL, COMPLETED, REJECTED, COMPANY]
        }

        public static List<InvestorProfileStatus> eligibleStatusListToViewContract() {
            [CONTRACT_AWAITING, CONTRACT_ACCEPTED]
        }
    }

    public enum LoanApplicationStatus {
        INITIALIZED(1),
        DETAILS_UPDATED_BY_ADMIN(2),
        COLLATERAL_ASKED_BY_ADMIN(2),
        AWAITING_APPROVAL(3),
        AWAITING_APPROVAL_L1(3),
        AWAITING_APPROVAL_L2(3),
        AWAITING_APPROVAL_L3(3),
        AWAITING_APPROVAL_L4(3),
        AWAITING_APPROVAL_L5(3),
        AWAITING_APPROVAL_L6(3),
        AWAITING_APPROVAL_L7(3),
        AWAITING_APPROVAL_L8(3),
        AWAITING_APPROVAL_L9(3),
        AWAITING_APPROVAL_L10(3),
        AWAITING_APPROVAL_L11(3),
        AWAITING_APPROVAL_L12(3),
        AWAITING_APPROVAL_L13(3),
        AWAITING_APPROVAL_L14(3),
        AWAITING_APPROVAL_L15(3),
        AWAITING_APPROVAL_L16(3),
        AWAITING_APPROVAL_L17(3),
        AWAITING_APPROVAL_L18(3),
        AWAITING_APPROVAL_L19(3),
        AWAITING_APPROVAL_L20(3),
        AWAITING_APPROVAL_L21(3),
        AWAITING_APPROVAL_L22(3),
        AWAITING_APPROVAL_L23(3),
        AWAITING_APPROVAL_L24(3),
        AWAITING_APPROVAL_L25(3),
        AWAITING_APPROVAL_L26(3),
        AWAITING_APPROVAL_L27(3),
        AWAITING_APPROVAL_L28(3),
        AWAITING_APPROVAL_L29(3),
        AWAITING_APPROVAL_L30(3),
        COLLATERAL_SUBMITTED_BY_BORROWER(3),
        UPDATED_DETAILS_DENIED_BY_BORROWER(3),
        UPDATED_DETAILS_APPROVED_BY_BORROWER(3),
        CLOSED(4),
        REJECTED(4),
        WITHDRAW(4),
        COLLATERAL_REJECTED_BY_ADMIN(4),
        COLLATERAL_DENIED_BY_BORROWER(4),
        AUCTION(5),
        AUCTION_UNSUCCESSFUL(5),
        FUNDED(6),
        COMPLETED(7),
        DISBURSED(7),
        AWAITING_DISBURSEMENT(7),
        AWAITING_DISBURSEMENT_L1(7),
        AWAITING_DISBURSEMENT_L2(7),
        AWAITING_DISBURSEMENT_L3(7),
        AWAITING_DISBURSEMENT_L4(7),
        AWAITING_DISBURSEMENT_L5(7),
        POST_DISBURSEMENT_L1(7),
        POST_DISBURSEMENT_L2(7),
        POST_DISBURSEMENT_L3(7),
        POST_DISBURSEMENT_L4(7),
        POST_DISBURSEMENT_L5(7),
        DOCUMENT_AWAITING(9),
        LIMIT_APPROVED(23),
        DOCUMENTATION_COMPLETE(23),
        BIDDING(200),
        APPROVED(200),
        OVERDUE_L1(200),
        OVERDUE_L2(200),
        OVERDUE_L3(200),
        OVERDUE_L4(200),
        OVERDUE_L5(200),
        IN_REPAYMENT(200),
        MARKED_DELETE(200),
        RESTRUCTURED_L1(200),
        RESTRUCTURED_L2(200),
        RESTRUCTURED_L3(200),
        RESTRUCTURED_L4(200),
        RESTRUCTURED_L5(200),
        AUCTION_FAILED(200),
        CONTRACT_ACCEPTED(200),
        CONTRACT_AWAITING(200),
        CONTRACT_REJECTED(200),
        SANCTION_LETTER_ACCEPTED(202),
        SANCTION_LETTER_REJECTED(202),
        SANCTION_LETTER_AWAITING(202),
        FULLY_SETTLED(203),
        PRIVATE_AUCTION(203),

        final private int stateLevel

        public LoanApplicationStatus(int stateLevel) {
            this.stateLevel = stateLevel
        }

        public getStateLevel() {
            return this.stateLevel
        }

        public static List<LoanApplicationStatus> loanApplicationStatusGatewayToInternalInvoiceProduct() {
            [LIMIT_APPROVED]
        }

        public static List<LoanApplicationStatus> inactiveStatuses() {
            [COMPLETED, REJECTED, CLOSED, WITHDRAW]
        }

        public static List<LoanApplicationStatus> beforeAuctionStates() {
            [DOCUMENT_AWAITING, AWAITING_APPROVAL, AWAITING_APPROVAL_L1, AWAITING_APPROVAL_L2, AWAITING_APPROVAL_L3,
             INITIALIZED, COLLATERAL_ASKED_BY_ADMIN, COLLATERAL_SUBMITTED_BY_BORROWER, COLLATERAL_REJECTED_BY_ADMIN,
             MARKED_DELETE, DOCUMENTATION_COMPLETE, REJECTED, AWAITING_APPROVAL_L4, AWAITING_APPROVAL_L5,
             AWAITING_APPROVAL_L6, AWAITING_APPROVAL_L7, AWAITING_APPROVAL_L8, AWAITING_APPROVAL_L9, AWAITING_APPROVAL_L10,
             AWAITING_APPROVAL_L11, AWAITING_APPROVAL_L12, AWAITING_APPROVAL_L13, AWAITING_APPROVAL_L14, AWAITING_APPROVAL_L15,
             AWAITING_APPROVAL_L16, AWAITING_APPROVAL_L17, AWAITING_APPROVAL_L18, AWAITING_APPROVAL_L19, AWAITING_APPROVAL_L20,
             AWAITING_APPROVAL_L21, AWAITING_APPROVAL_L22, AWAITING_APPROVAL_L23, AWAITING_APPROVAL_L24, AWAITING_APPROVAL_L25,
             AWAITING_APPROVAL_L26, AWAITING_APPROVAL_L27, AWAITING_APPROVAL_L28, AWAITING_APPROVAL_L29, AWAITING_APPROVAL_L30]
        }

        public static List<LoanApplicationStatus> approvedAndAfterwards() {
            [APPROVED, AUCTION, FUNDED]
        }

        public static List<LoanApplicationStatus> fundedAndAfterWards() {
            [FUNDED, DISBURSED, CONTRACT_ACCEPTED, CONTRACT_AWAITING, IN_REPAYMENT, COMPLETED, CONTRACT_REJECTED,
             AWAITING_DISBURSEMENT, AWAITING_DISBURSEMENT_L1, AWAITING_DISBURSEMENT_L2, AWAITING_DISBURSEMENT_L3,
             AWAITING_DISBURSEMENT_L4, AWAITING_DISBURSEMENT_L5, SANCTION_LETTER_ACCEPTED, SANCTION_LETTER_REJECTED,
             SANCTION_LETTER_AWAITING, OVERDUE_L1, OVERDUE_L2, OVERDUE_L3, OVERDUE_L4, OVERDUE_L5, RESTRUCTURED_L1,
             RESTRUCTURED_L2, RESTRUCTURED_L3, RESTRUCTURED_L4, RESTRUCTURED_L5, FULLY_SETTLED]
        }

        public static List<LoanApplicationStatus> disbursedAndAfterWards() {
            [DISBURSED, CONTRACT_ACCEPTED, CONTRACT_AWAITING, IN_REPAYMENT, COMPLETED, CONTRACT_REJECTED, SANCTION_LETTER_ACCEPTED,
             SANCTION_LETTER_REJECTED, SANCTION_LETTER_AWAITING, OVERDUE_L1, OVERDUE_L2, OVERDUE_L3, OVERDUE_L4, OVERDUE_L5,
             RESTRUCTURED_L1, RESTRUCTURED_L2, RESTRUCTURED_L3, RESTRUCTURED_L4, RESTRUCTURED_L5]
        }

        public static List<LoanApplicationStatus> afterDisbursedStatusList() {
            [DISBURSED, POST_DISBURSEMENT_L1, POST_DISBURSEMENT_L2, POST_DISBURSEMENT_L3, POST_DISBURSEMENT_L4, POST_DISBURSEMENT_L5,
             IN_REPAYMENT, COMPLETED, OVERDUE_L1, OVERDUE_L2, OVERDUE_L3, OVERDUE_L4, OVERDUE_L5, RESTRUCTURED_L1, RESTRUCTURED_L2,
             RESTRUCTURED_L3, RESTRUCTURED_L4, RESTRUCTURED_L5, FULLY_SETTLED]
        }

        public static List<LoanApplicationStatus> fundedAndAfterWardsButNotCompleted() {
            [FUNDED, CONTRACT_ACCEPTED, CONTRACT_AWAITING, IN_REPAYMENT, DISBURSED, CONTRACT_REJECTED, AWAITING_DISBURSEMENT,
             AWAITING_DISBURSEMENT_L1, AWAITING_DISBURSEMENT_L2, AWAITING_DISBURSEMENT_L3, AWAITING_DISBURSEMENT_L4,
             AWAITING_DISBURSEMENT_L5, SANCTION_LETTER_ACCEPTED, SANCTION_LETTER_REJECTED, SANCTION_LETTER_AWAITING,
             OVERDUE_L1, OVERDUE_L2, OVERDUE_L3, OVERDUE_L4, OVERDUE_L5, RESTRUCTURED_L1, RESTRUCTURED_L2, RESTRUCTURED_L3,
             RESTRUCTURED_L4, RESTRUCTURED_L5]
        }

        public static List<LoanApplicationStatus> disbursedAndAfterWardsButNotCompleted() {
            [FUNDED, DISBURSED, CONTRACT_ACCEPTED, CONTRACT_AWAITING, IN_REPAYMENT, CONTRACT_REJECTED, SANCTION_LETTER_ACCEPTED,
             SANCTION_LETTER_REJECTED, SANCTION_LETTER_AWAITING, OVERDUE_L1, OVERDUE_L2, OVERDUE_L3, OVERDUE_L4, OVERDUE_L5,
             RESTRUCTURED_L1, RESTRUCTURED_L2, RESTRUCTURED_L3, RESTRUCTURED_L4, RESTRUCTURED_L5]
        }

        public static List<LoanApplicationStatus> disbursedAndAfterWardsButNotCompletedWithoutSanctionLetter() {
            [FUNDED, DISBURSED, CONTRACT_ACCEPTED, CONTRACT_AWAITING, IN_REPAYMENT, CONTRACT_REJECTED, OVERDUE_L1, OVERDUE_L2,
             OVERDUE_L3, OVERDUE_L4, OVERDUE_L5, RESTRUCTURED_L1, RESTRUCTURED_L2, RESTRUCTURED_L3, RESTRUCTURED_L4, RESTRUCTURED_L5]
        }

        public static List<LoanApplicationStatus> beforeApproval() {
            [INITIALIZED, COLLATERAL_ASKED_BY_ADMIN, COLLATERAL_SUBMITTED_BY_BORROWER, COLLATERAL_DENIED_BY_BORROWER,
             COLLATERAL_REJECTED_BY_ADMIN, DETAILS_UPDATED_BY_ADMIN, UPDATED_DETAILS_APPROVED_BY_BORROWER,
             UPDATED_DETAILS_DENIED_BY_BORROWER, REJECTED, AWAITING_APPROVAL, AWAITING_APPROVAL_L1, AWAITING_APPROVAL_L2,
             AWAITING_APPROVAL_L3, DOCUMENT_AWAITING, MARKED_DELETE, DOCUMENTATION_COMPLETE, AWAITING_APPROVAL_L4,
             AWAITING_APPROVAL_L5, AWAITING_APPROVAL_L6, AWAITING_APPROVAL_L7, AWAITING_APPROVAL_L8, AWAITING_APPROVAL_L9,
             AWAITING_APPROVAL_L10, AWAITING_APPROVAL_L11, AWAITING_APPROVAL_L12, AWAITING_APPROVAL_L13, AWAITING_APPROVAL_L14,
             AWAITING_APPROVAL_L15, AWAITING_APPROVAL_L16, AWAITING_APPROVAL_L17, AWAITING_APPROVAL_L18, AWAITING_APPROVAL_L19,
             AWAITING_APPROVAL_L20, AWAITING_APPROVAL_L21, AWAITING_APPROVAL_L22, AWAITING_APPROVAL_L23, AWAITING_APPROVAL_L24,
             AWAITING_APPROVAL_L25, AWAITING_APPROVAL_L26, AWAITING_APPROVAL_L27, AWAITING_APPROVAL_L28, AWAITING_APPROVAL_L29,
             AWAITING_APPROVAL_L30, PRIVATE_AUCTION]
        }

        public static List<LoanApplicationStatus> afterApproval() {
            [APPROVED, AUCTION, FUNDED, AWAITING_DISBURSEMENT, AWAITING_DISBURSEMENT_L1, AWAITING_DISBURSEMENT_L2,
             AWAITING_DISBURSEMENT_L3, AWAITING_DISBURSEMENT_L4, AWAITING_DISBURSEMENT_L5, DISBURSED, CONTRACT_ACCEPTED,
             CONTRACT_AWAITING, CONTRACT_REJECTED, IN_REPAYMENT, AUCTION_FAILED, COMPLETED, SANCTION_LETTER_ACCEPTED,
             SANCTION_LETTER_REJECTED, SANCTION_LETTER_AWAITING, OVERDUE_L1, OVERDUE_L2, OVERDUE_L3, OVERDUE_L4, OVERDUE_L5,
             RESTRUCTURED_L1, RESTRUCTURED_L2, RESTRUCTURED_L3, RESTRUCTURED_L4, RESTRUCTURED_L5, PRIVATE_AUCTION, LIMIT_APPROVED, FULLY_SETTLED]
        }

        public static List<LoanApplicationStatus> documentUploadNotAllowedInStatuses() {
            inactiveStatuses() + afterApproval()
        }

        public static List<LoanApplicationStatus> statusListForPopDetails() {
            [DISBURSED, IN_REPAYMENT, FUNDED]
        }

        public static List<LoanApplicationStatus> statusForSelectBox() {
            [INITIALIZED, COLLATERAL_ASKED_BY_ADMIN, COLLATERAL_SUBMITTED_BY_BORROWER, COLLATERAL_REJECTED_BY_ADMIN,
             DOCUMENT_AWAITING, CONTRACT_ACCEPTED, CONTRACT_AWAITING, CONTRACT_REJECTED, AUCTION, FUNDED, AWAITING_DISBURSEMENT,
             AWAITING_DISBURSEMENT_L1, AWAITING_DISBURSEMENT_L2, AWAITING_DISBURSEMENT_L3, AWAITING_DISBURSEMENT_L4,
             AWAITING_DISBURSEMENT_L5, DISBURSED, COMPLETED, APPROVED, REJECTED, DOCUMENTATION_COMPLETE, SANCTION_LETTER_ACCEPTED,
             SANCTION_LETTER_REJECTED, SANCTION_LETTER_AWAITING, AWAITING_APPROVAL, AWAITING_APPROVAL_L1, AWAITING_APPROVAL_L2,
             AWAITING_APPROVAL_L3, AWAITING_APPROVAL_L4, AWAITING_APPROVAL_L5, AWAITING_APPROVAL_L6, AWAITING_APPROVAL_L7,
             AWAITING_APPROVAL_L8, AWAITING_APPROVAL_L9, AWAITING_APPROVAL_L10, AWAITING_APPROVAL_L11, AWAITING_APPROVAL_L12,
             AWAITING_APPROVAL_L13, AWAITING_APPROVAL_L14, AWAITING_APPROVAL_L15, AWAITING_APPROVAL_L16, AWAITING_APPROVAL_L17,
             AWAITING_APPROVAL_L18, AWAITING_APPROVAL_L19, AWAITING_APPROVAL_L20, AWAITING_APPROVAL_L21, AWAITING_APPROVAL_L22,
             AWAITING_APPROVAL_L23, AWAITING_APPROVAL_L24, AWAITING_APPROVAL_L25, AWAITING_APPROVAL_L26, AWAITING_APPROVAL_L27,
             AWAITING_APPROVAL_L28, AWAITING_APPROVAL_L29, AWAITING_APPROVAL_L30, PRIVATE_AUCTION]
        }

        public static List<LoanApplicationStatus> validLoanApplicationStatus() {
            [INITIALIZED, COLLATERAL_ASKED_BY_ADMIN, COLLATERAL_SUBMITTED_BY_BORROWER, COLLATERAL_DENIED_BY_BORROWER,
             COLLATERAL_REJECTED_BY_ADMIN, DETAILS_UPDATED_BY_ADMIN, UPDATED_DETAILS_APPROVED_BY_BORROWER, UPDATED_DETAILS_DENIED_BY_BORROWER,
             REJECTED, CLOSED, WITHDRAW, APPROVED, DOCUMENT_AWAITING, AWAITING_APPROVAL, AWAITING_APPROVAL_L1, AWAITING_APPROVAL_L2,
             AWAITING_APPROVAL_L3, AUCTION, FUNDED, AWAITING_DISBURSEMENT, AWAITING_DISBURSEMENT_L1, AWAITING_DISBURSEMENT_L2,
             AWAITING_DISBURSEMENT_L3, AWAITING_DISBURSEMENT_L4, AWAITING_DISBURSEMENT_L5, DISBURSED, CONTRACT_ACCEPTED,
             CONTRACT_AWAITING, CONTRACT_REJECTED, IN_REPAYMENT, AUCTION_FAILED, MARKED_DELETE, COMPLETED, DOCUMENTATION_COMPLETE,
             AWAITING_APPROVAL_L4, AWAITING_APPROVAL_L5, AWAITING_APPROVAL_L6, AWAITING_APPROVAL_L7, AWAITING_APPROVAL_L8,
             AWAITING_APPROVAL_L9, AWAITING_APPROVAL_L10, SANCTION_LETTER_ACCEPTED, SANCTION_LETTER_REJECTED, SANCTION_LETTER_AWAITING,
             AWAITING_APPROVAL_L11, AWAITING_APPROVAL_L12, AWAITING_APPROVAL_L13, AWAITING_APPROVAL_L14, AWAITING_APPROVAL_L15,
             AWAITING_APPROVAL_L16, AWAITING_APPROVAL_L17, AWAITING_APPROVAL_L18, AWAITING_APPROVAL_L19, AWAITING_APPROVAL_L20,
             AWAITING_APPROVAL_L21, AWAITING_APPROVAL_L22, AWAITING_APPROVAL_L23, AWAITING_APPROVAL_L24, AWAITING_APPROVAL_L25,
             AWAITING_APPROVAL_L26, AWAITING_APPROVAL_L27, AWAITING_APPROVAL_L28, AWAITING_APPROVAL_L29, AWAITING_APPROVAL_L30,
             OVERDUE_L1, OVERDUE_L2, OVERDUE_L3, OVERDUE_L4, OVERDUE_L5, RESTRUCTURED_L1, RESTRUCTURED_L2, RESTRUCTURED_L3,
             RESTRUCTURED_L4, RESTRUCTURED_L5, PRIVATE_AUCTION]
        }


        public static List<LoanApplicationStatus> statusesToAllowEditByBorrower() {
            [INITIALIZED, COLLATERAL_ASKED_BY_ADMIN, COLLATERAL_SUBMITTED_BY_BORROWER, COLLATERAL_DENIED_BY_BORROWER,
             COLLATERAL_REJECTED_BY_ADMIN, AWAITING_APPROVAL, DOCUMENT_AWAITING, AWAITING_APPROVAL_L1, AWAITING_APPROVAL_L2,
             AWAITING_APPROVAL_L3, DOCUMENTATION_COMPLETE, AWAITING_APPROVAL_L4, AWAITING_APPROVAL_L5, AWAITING_APPROVAL_L6,
             AWAITING_APPROVAL_L7, AWAITING_APPROVAL_L8, AWAITING_APPROVAL_L9, AWAITING_APPROVAL_L10, AWAITING_APPROVAL_L11,
             AWAITING_APPROVAL_L12, AWAITING_APPROVAL_L13, AWAITING_APPROVAL_L14, AWAITING_APPROVAL_L15, AWAITING_APPROVAL_L16,
             AWAITING_APPROVAL_L17, AWAITING_APPROVAL_L18, AWAITING_APPROVAL_L19, AWAITING_APPROVAL_L20, AWAITING_APPROVAL_L21,
             AWAITING_APPROVAL_L22, AWAITING_APPROVAL_L23, AWAITING_APPROVAL_L24, AWAITING_APPROVAL_L25, AWAITING_APPROVAL_L26,
             AWAITING_APPROVAL_L27, AWAITING_APPROVAL_L28, AWAITING_APPROVAL_L29, AWAITING_APPROVAL_L30]
        }

        public static List<LoanApplicationStatus> eligibleStatusForWithdrawLoanApplication() {
            List<LoanApplicationStatus> allLoanApplicationStatus = values()
            List<LoanApplicationStatus> notEligibleStatusList = [DISBURSED, IN_REPAYMENT, CLOSED, REJECTED, WITHDRAW]
            allLoanApplicationStatus.removeAll(notEligibleStatusList)
            allLoanApplicationStatus
        }

        public static List<LoanApplicationStatus> afterCancelled() {
            [REJECTED, CLOSED, WITHDRAW]
        }

        public static List<LoanApplicationStatus> notEligibleForLMS() {
            [AUCTION, AUCTION_FAILED, BIDDING, AUCTION_UNSUCCESSFUL]
        }

        public static List<LoanApplicationStatus> statusListThatDsaCanChages() {
            [AWAITING_APPROVAL_L1]
        }

        public static List<LoanApplicationStatus> afterApprovedStatusList() {
            [AUCTION, FUNDED, AWAITING_DISBURSEMENT, AWAITING_DISBURSEMENT_L1, AWAITING_DISBURSEMENT_L2, AWAITING_DISBURSEMENT_L3,
             AWAITING_DISBURSEMENT_L4, AWAITING_DISBURSEMENT_L5, DISBURSED, IN_REPAYMENT, OVERDUE_L1, OVERDUE_L2, OVERDUE_L3,
             OVERDUE_L4, OVERDUE_L5, RESTRUCTURED_L1, RESTRUCTURED_L2, RESTRUCTURED_L3, RESTRUCTURED_L4, RESTRUCTURED_L5, CLOSED]
        }

        public static List<LoanApplicationStatus> statusNotAllowedToShowAfterApproved() {
            [REJECTED, MARKED_DELETE]
        }

        public static List<LoanApplicationStatus> allActiveBidsStatusList() {
            [AUCTION, FUNDED, AWAITING_DISBURSEMENT, AWAITING_DISBURSEMENT_L1, AWAITING_DISBURSEMENT_L2, AWAITING_DISBURSEMENT_L3,
             AWAITING_DISBURSEMENT_L4, AWAITING_DISBURSEMENT_L5, DISBURSED, CONTRACT_ACCEPTED, CONTRACT_AWAITING, CONTRACT_REJECTED,
             IN_REPAYMENT, OVERDUE_L1, OVERDUE_L2, OVERDUE_L3, OVERDUE_L4, OVERDUE_L5, RESTRUCTURED_L1, RESTRUCTURED_L2,
             RESTRUCTURED_L3, RESTRUCTURED_L4, RESTRUCTURED_L5, AUCTION_FAILED]
        }

        public static List<LoanApplicationStatus> validDocumentDownloadStatusList() {
            [AUCTION, DISBURSED, IN_REPAYMENT]
        }

        public static List<LoanApplicationStatus> eligibleToWithdrawLoanApplicationList() {
            [WITHDRAW]
        }

        public static List<LoanApplicationStatus> nachMandateNotDownloadableLoanApplicationStatus() {
            [REJECTED, WITHDRAW, CLOSED, COMPLETED]
        }

        public static List<LoanApplicationStatus> eligibleLoanStatusForTag() {
            List<LoanApplicationStatus> allLoanApplicationStatus = values()
            List<LoanApplicationStatus> notEligibleLoanStatuses = [CLOSED, REJECTED, WITHDRAW, COMPLETED, FULLY_SETTLED]
            allLoanApplicationStatus.removeAll(notEligibleLoanStatuses)
            return allLoanApplicationStatus
        }
    }

    public enum DocumentType {
        BANK_STATEMENT, SALARY_SLIP, ID_PROOF, ADDRESS_PROOF, COLLATERAL, CIBIL_REPORT, LOAN_PHOTO, PAN_VERIFICATION_REPORT,
        FORMATTED_CIBIL_REPORT, STATEMENT_UPLOAD, ONLINE_FETCH, REPORT_ANALYSIS, SCANNED_BANK_STATEMENTS, LINK_SENT, DISBURSEMENT
    }

    public enum SocialAccountType {
        FACEBOOK, LINKEDIN, TWITTER, GOOGLEPLUS
    }

    public enum BidStatus {
        INITIALIZED(1), COMPETING(2), PARTIALLY_COMPETING(3), NON_COMPETING(4), ACCEPTED(5), REJECTED(6), WITHDRAWN(7)
        final private Integer order

        BidStatus(Integer order) {
            this.order = order
        }

        public getOrder() {
            return this.order
        }

        public static List<BidStatus> allActiveBidStatus() {
            [COMPETING, PARTIALLY_COMPETING, ACCEPTED]
        }

        public static List<BidStatus> bidStatusesForInvestorDashboardAnalytics() {
            [COMPETING, PARTIALLY_COMPETING, ACCEPTED, NON_COMPETING]
        }
    }

    public enum TransactionType {
        INVESTMENT_SUCCESSFUL(''),
        INVESTMENT_RECEIVED(''),
        RESERVED_FOR_INVESTMENT(''),
        REFUND_RESERVED_FOR_INVESTMENT(''),
        REJECTED_RESERVED_FOR_INVESTMENT(''),
        INVESTMENT_PARTIALLY_SUCCESSFUL(''),
        INVESTMENT_PARTIALLY_REFUNDED(''),
        DEPOSIT(''),
        DEPOSIT_BY_ADMIN(''),
        WITHDRAW(''),
        WITHDRAW_BY_ADMIN(''),
        WITHDRAW_REJECTED_BY_ADMIN(''),
        CREDIT_SCORE_FEE(''),
        DEBT_REPAYMENT(''),
        PARTIAL_DEBT_REPAYMENT(''),
        INVOICE_REPAYMENT(''),
        SERVICE_FEE(''),
        PENALTIES(''),
        SIGNUP_FEE(''),
        LOAN_CANCELLATION_FEES(''),
        DEBT_REPAYMENT_SERVICE_FEES_TO_ADMIN(''),
        INVESTMENT_BOUGHT_IN_SECONDARY_MARKET(''),
        INVESTMENT_SOLD_IN_SECONDARY_MARKET(''),
        NON_ADMIN_RAISED_TRANSFER_REQUEST_PENDING(''),
        NON_ADMIN_RAISED_TRANSFER_REQUEST_APPROVED(''),
        ADMIN_RAISED_TRANSFER_REQUEST_PENDING(''),
        ADMIN_RAISED_TRANSFER_REQUEST_APPROVED(''),
        TRANSFER_REQUEST_DECLINED(''),
        CHECK_BOUNCING_CHARGE(''),
        // use only for multiple disbursement case and when amount disbursed to borrower
        DISBURSED_SUCCESSFUL(''),
        DSA_COMMISSION(''),
        INVESTOR_COMMISSION(''),
        TAX_ON_PLATFORM_FEE(''),                                //Used for Tax On Admin Fees
        ADMIN_CHARGE_ON_INVESTOR_WALLET_WITHDRAW(''),  //Used For Admin Charge on investor wallet withdraw
        TAX_ONE(''),
        CHEQUE_BOUNCING_CHARGE(''),
        INVESTOR_BID_PROCESSING_FEE(''),
        REFUND_INVESTOR_BID_PROCESSING_FEE(''),
        LOAN_APPLICATION_REGISTRATION_FEE(''),
        WALLET_BALANCE_WITHDRAW_FEE(''),
        DEBT_REPAYMENT_SERVICE_FEES_TAX_TO_ADMIN('')


        final private String paymentType

        public TransactionType(String paymentType) {
            this.paymentType = paymentType
        }

        public getPaymentType() {
            return this.paymentType
        }

        public static List<TransactionType> repaymentTransactionStatuses() {
            [DEBT_REPAYMENT, PARTIAL_DEBT_REPAYMENT, DEBT_REPAYMENT_SERVICE_FEES_TO_ADMIN, SERVICE_FEE,
             CHEQUE_BOUNCING_CHARGE, CHECK_BOUNCING_CHARGE, PENALTIES]
        }

        public static List<TransactionType> depositTransactionStatus() {
            [DEPOSIT, DEPOSIT_BY_ADMIN]
        }

        public static List<TransactionType> withdrawTransactionStatus() {
            [WITHDRAW, WITHDRAW_BY_ADMIN, WITHDRAW_REJECTED_BY_ADMIN]
        }
    }

    public enum TransactionStatus {
        INITIALIZED,
        AWAITING_APPROVAL,
        APPROVED,
        APPROVED_START,
        APPROVED_COMPLETED,
        AUTO_APPROVED,
        REJECTED,
        INVALID

        static List<TransactionStatus> approvedStatuses() {
            return [APPROVED, AUTO_APPROVED]
        }
    }

    public enum TransactionQueueStatus {
        SUCCESS, ERROR, TIME_OUT, CAPTURE, FAILURE, PENDING, INITIALISED
    }

    public enum LoanRepaymentStatus {
        MARKEDPAID('btn btn-warning', 'label label-warning'),
        PAID('btn btn-primary', 'label label-success'),
        PENDING('btn btn-primary', 'label label-primary'),
        OVERDUE('btn btn-danger', 'label label-danger'),
        INVALID('btn btn-danger', 'label label-danger')

        final private String css
        final private String cssLabel

        public LoanRepaymentStatus(String css, String cssLabel) {
            this.css = css
            this.cssLabel = cssLabel
        }

        public getCss() {
            return this.css
        }

        public getCssLabel() {
            return this.cssLabel
        }

        public static List<LoanRepaymentStatus> showAllRepaymentStatus() {
            [MARKEDPAID, PAID, PENDING, OVERDUE]
        }

        public static List<LoanRepaymentStatus> validUnpaidStatusList() {
            [MARKEDPAID, PENDING, OVERDUE]
        }

        public static List<LoanRepaymentStatus> validStatusList() {
            [MARKEDPAID, PAID, PENDING, OVERDUE]
        }

        public static List<LoanRepaymentStatus> repaymentPaidAndOverdueStatusList() {
            [PAID, OVERDUE]
        }

        public static List<LoanRepaymentStatus> validUnpaidStatusListExceptOverdue() {
            [MARKEDPAID, PENDING]
        }

        public static List<LoanRepaymentStatus> repaymentPendingAndOverdueStatusList() {
            [PENDING, OVERDUE]
        }
    }

    public enum LoanRepaymentType {
        GENERAL, FULL_SETTLEMENT, EARLY_REPAYMENT
    }

    public enum LoanRepaymentEmiType {
        DISBURSED_EMI, MONTHLY_EMI, GAP_DAY_INTEREST_EMI
    }

    public enum SocialProfileType {
        GOOGLEPLUS, FACEBOOK, TWITTER, LINKEDIN
    }

    public enum LoanProductRepaymentType {
        EVEN_REPAYMENTS, FLAT_REPAYMENT, INTEREST_ONLY, FLAT_RATE, FORTNIGHTLY_EVEN_REPAYMENTS,
        DAILY_INTEREST, WEEKLY_INTEREST, HALF_YEARLY, QUATERLY, FLAT_REPAYMENT_DAY,
        INTEREST_ONLY_DAYS, ADVANCE_EMI, NO_REPAYMENT, DAILY_REPAYMENTS, HOLIDAY_FIXED_PRINCIPAL, DAILY_BULLET_REPAYMENT, DISCOUNT_REPAYMENT, ANNUITY_DUE_REPAYMENT

        static List<LoanProductRepaymentType> allowsRepaymentChange() {
            [EVEN_REPAYMENTS, INTEREST_ONLY, FLAT_RATE, FORTNIGHTLY_EVEN_REPAYMENTS, HALF_YEARLY,
             QUATERLY, WEEKLY_INTEREST]
        }

        static List<LoanProductRepaymentType> dailyRepaymentTypeList() {
            return [DAILY_INTEREST, INTEREST_ONLY_DAYS, FLAT_REPAYMENT_DAY, DAILY_REPAYMENTS, DAILY_BULLET_REPAYMENT]
        }

        static List<LoanProductRepaymentType> weeklyRepaymentTypeList() {
            return [WEEKLY_INTEREST]
        }

        static List<LoanProductRepaymentType> monthlyRepaymentTypeList() {
            return [EVEN_REPAYMENTS, FLAT_REPAYMENT, FLAT_RATE, FORTNIGHTLY_EVEN_REPAYMENTS, HALF_YEARLY, QUATERLY,
                    ADVANCE_EMI, NO_REPAYMENT, HOLIDAY_FIXED_PRINCIPAL, DISCOUNT_REPAYMENT, ANNUITY_DUE_REPAYMENT]
        }

        static String fetchFrequencyOfLoanRepaymentType(LoanProductRepaymentType repaymentType) {
            String freq = null
            switch (repaymentType) {
                case monthlyRepaymentTypeList():
                    freq = "repayment.type.frequency.monthly"
                    break
                case dailyRepaymentTypeList():
                    freq = "repayment.type.frequency.daily"
                    break
                case weeklyRepaymentTypeList():
                    freq = "repayment.type.frequency.weekly"
                    break
                case HALF_YEARLY:
                    freq = "repayment.type.frequency.half.yearly"
                    break
                case QUATERLY:
                    freq = "repayment.type.frequency.quarterly"
                    break
            }
            return freq
        }
    }

    public enum TenantType {
        MARKETPLACE_LENDING, P2P_LENDING, INDIVIDUAL_LENDING
    }

    public enum LoanCity {
        NEW_DELHI, NOIDA, FARIDABAD, GHAZIABAD, BANGALORE
    }

    public enum DocumentCategoryFor {
        LENDER, BORROWER, BUSINESS_PARTNER, FIELD_INVESTIGATION_ASSOCIATE
    }

    public enum CustomFieldGroupFor {
        LENDER, BORROWER, BUSINESS_PARTNER
    }

    public enum CustomFieldGroupType {
        GENERAL_QUESTIONS, CREDIT_QUESTIONS
    }

    public enum CustomFieldType {
        TEXT, NUMBER, SELECT_BOX, DATE, PHONE_NUMBER, AUTO_COMPLETE, TEXT_AREA
    }

    public enum RiskType {
        LOW, MEDIUM, HIGH
    }

    public enum NotificationQueueStatus {
        AWAITING('btn btn-primary'),
        PROCESSED('btn btn-primary'),
        FAILED('btn btn-danger'),
        WITHDRAWN('btn btn-inverse')

        final private String css

        public NotificationQueueStatus(String css) {
            this.css = css
        }

        public getCss() {
            return this.css
        }
    }

    public enum NotificationChannel {
        SMS,
        EMAIL,
        BOTH
    }

    public enum EmailSubject {
        BORROWER_REGISTRATION_TO_BORROWER(" "),
        INVESTOR_REGISTRATION_TO_BORROWER(" "),
        INVESTOR_REGISTRATION_TO_TENANT(" "),
        BORROWER_REGISTRATION_TO_TENANT(" "),

        final private String subject

        public EmailSubject(String subject) {
            this.subject = subject
        }

        public getSubject() {
            return this.subject
        }
    }

    public enum QuestionAskedBy {
        ADMIN,
        INVESTOR
    }

    public enum QuestionStatus {
        APPROVED,
        REJECTED,
        AWAITING_APPROVAL
    }

    public enum Deparment {
        MARKETTING, ACCOUNTS
    }

    public enum Designation {
        MANAGER, SUPERVISOR
    }

    public enum Gender {
        MALE("2"),
        FEMALE("1"),
        UNSPECIFIED("3")

        final private String value

        public Gender(String value) {
            this.value = value
        }

        public getValue() {
            return this.value
        }
    }

    public enum MaritalStatus {
        SINGLE,
        MARRIED,
        DIVORCED,
        SEPERATED,
        WIDOWED

        public static List<Gender> activeList() {
            [SINGLE, MARRIED, DIVORCED, SEPERATED, WIDOWED]
        }
    }

    public enum LoanBidStepType {
        CURRENCY, PERCENTAGE
    }

    public enum InteractionType {
        INTERESTED,
        NOT_INTERESTED,
        WORKING,
        CASE_LOGGED,
        CREDIT_APPROVED,
        DISBURSED,
        FORCED_INTERESTED,
        FORCED_NOT_INTERESTED

        public static List<InteractionType> customList() {
            List<InteractionType> customInteractionList = []
            for (InteractionType interactionType : InteractionType.values()) {
                if (!interactionType.equals(InteractionType.FORCED_INTERESTED) && !interactionType.equals(InteractionType.INTERESTED) && !interactionType.equals(InteractionType.FORCED_NOT_INTERESTED) && !interactionType.equals(InteractionType.NOT_INTERESTED))
                    customInteractionList.add(interactionType)
            }
            customInteractionList
        }
    }

    public enum InvestorType {
        INDIVIDUAL, COMPANY
    }

    public enum FeeType {
        PERCENTAGE,
        AMOUNT
    }

    public enum AmountType {
        PERCENTAGE,
        FIXED
    }

    public enum CheckListType {
        BORROWER_APPROVAL,
        INVESTOR_APPROVAL,
        DSA_APPROVAL,
        LOAN_APPLICATION_APPROVAL
    }

    public enum Status {
        ACTIVE, INACTIVE
    }

    public enum FinancialCredibilityAnswerType {
        TEXT,
        NUMBER,
        SELECT,
        BOOLEAN,
        DATE
    }

    public enum Event {
        CLOSE_AND_CLONE_LOAN_APPLICATION,
    }

    public enum ReferenceResponseType {
        YES,
        NO,
        NO_RESPONSE
    }

    public enum BorrowerType {
        INDIVIDUAL, COMPANY
    }

    public enum LoanApplicationBorrowerType {
        INDIVIDUAL, COMPANY
    }

    public enum Frequency {
        DAILY, IN_TWO_DAYS, IN_THREE_DAYS, IN_FOUR_DAYS, IN_FIVE_DAYS, IN_ONE_WEEK, NEVER
    }

    public enum FieldDataType {
        DATE, BOOLEAN, PHONE_NO, TEXT, NUMBER, DROPDOWN, AUTO_SUGGEST, ALPHA_NUMERIC, AMOUNT, ADDRESS, HIDDEN, READ_ONLY, TEXT_AREA, DATE_TIME
    }

    public enum FieldAccessModifier {
        EDITABLE, WRITE_ONCE, READ_ONLY
    }

    public enum PenaltyType {
        DAILY, WEEKLY, MONTHLY, LATE_PAYMENT, MONTHLY_PENALTY_FIXED, FIXED_PENALTY_UNSUCCESSFUL_MONTH, THRESHOLD_PENALTY
    }

    public enum BackgroundJobType {
        AUTO_BANK_STATEMENT_ANALYSIS_JOB(""),
        AUTO_BID_JOB(""),
        CLOSE_NON_PERFORMING_LOAN_APPLICATION_JOB(""),
        EXPIRY_NOTIFICATION_MAIL_JOB(""),
        INVESTOR_LOAN_INTERACTION_ESCALATION_NOTIFICATIONJOB(""),
        LOAN_AND_REPAYMENTS_STATUS_UPDATE_JOB(""),
        LOAN_STATUS_NOTIFICATION_JOB(""),
        MARK_PAID_REPAYMENT_FROM_EXCEL_JOB(""),
        PENALTY_CALCULATE_JOB(""),
        REPAYMENT_PAY_JOB(""),
        REPAYMENT_REMINDER_NOTIFICATION_JOB(""),
        SAVE_DATA_FROM_EXCEL_JOB(""),
        SYSTEM_STATS_JOB(""),
        UPDATE_LOAN_APPLICATION_STATUS_JOB(""),
        LOAN_APPLICATION_STATUS_CHANGE_FROM_DOCUMENT_JOB(""),
        TRANSACTION_STATUS_CHANGE_FROM_DOCUMENT_JOB(""),
        CREATE_PDC_MANAGEMENT_FROM_DOCUMENT_JOB(""),
        BORROWER_WITHDRAW_TRANSACTION_FROM_DOCUMENT_JOB(""),
        BORROWER_DEPOSIT_TRANSACTION_FROM_DOCUMENT_JOB(""),
        FUND_TRANSFER_TRANSACTION_FROM_DOCUMENT_JOB(""),
        IN_ACTIVE_STATUS_JOB(""),
        LOAN_AUCTION_EXPIRY_ALERT_FOR_LENDER_JOB(""),
        LOAN_AUCTION_STATUS_ALERT_FOR_LENDER_JOB(""),
        NACH_QUEUE_PROCESS_JOB(""),
        AUDIT_LOG_JOB(""),
        MIGRATE_LOAN_APPLICATION_JOB("migrateLoanApplication"),
        MIGRATE_LOAN_REPAYMENT_JOB("migrateLoanRepayment"),
        MIGRATE_INVESTMENT_JOB("migrateInvestment"),
        MIGRATE_BORROWER_JOB("migrateBorrower"),
        MIGRATE_INVESTOR_JOB("migrateInvestor"),
        MIGRATE_DSA_JOB("migrateDSA"),
        MIGRATE_TRANSACTION_JOB("migrateTransaction"),
        SYSTEM_STATS_META_DATA_JOB("migrateSystemStats"),
        SEND_TRANSACTION_REPORT_TO_ADMIN_JOB(""),
        SEND_TRANSACTION_RECONCILE_REPORT_TO_ADMIN_JOB(""),
        REPAYMENT_PAY_USING_DIGIO_ENACH_JOB(""),
        UPDATE_INVESTOR_OUTSTANDING_INVESTMENT_AMOUNT(""),
        REPAYMENT_PAY_USING_RAZORPAY_ENACH_JOB(""),
        ENCRYPT_ALL_EXISTING_DOCS_JOB(""),
        ENTITY_AUTO_STATUS_UPDATE_JOB(""),
        LOAN_PARTIAL_REPAYMENT_JOB("migrateLoanPartialRepayment")

        private String jobActionName

        String getJobActionName() {
            return jobActionName
        }

        BackgroundJobType(String jobActionName) {
            this.jobActionName = jobActionName
        }

        public static List<BackgroundJobType> jobList() {
            [AUTO_BANK_STATEMENT_ANALYSIS_JOB,
             AUTO_BID_JOB,
             CLOSE_NON_PERFORMING_LOAN_APPLICATION_JOB,
             EXPIRY_NOTIFICATION_MAIL_JOB,
             INVESTOR_LOAN_INTERACTION_ESCALATION_NOTIFICATIONJOB,
             LOAN_AND_REPAYMENTS_STATUS_UPDATE_JOB,
             LOAN_STATUS_NOTIFICATION_JOB,
             MARK_PAID_REPAYMENT_FROM_EXCEL_JOB,
             PENALTY_CALCULATE_JOB,
             REPAYMENT_PAY_JOB,
             REPAYMENT_REMINDER_NOTIFICATION_JOB,
             SAVE_DATA_FROM_EXCEL_JOB,
             SYSTEM_STATS_JOB,
             UPDATE_LOAN_APPLICATION_STATUS_JOB
            ]
        }

        public static List<BackgroundJobType> jobsForMongoUpdation() {
            [
                    MIGRATE_LOAN_APPLICATION_JOB,
                    MIGRATE_LOAN_REPAYMENT_JOB,
                    MIGRATE_INVESTMENT_JOB,
                    MIGRATE_BORROWER_JOB,
                    MIGRATE_INVESTOR_JOB,
                    MIGRATE_DSA_JOB,
                    SYSTEM_STATS_META_DATA_JOB,
                    LOAN_PARTIAL_REPAYMENT_JOB
            ]
        }

        public static List<BackgroundJobType> jobsForJobExecutionSettings() {
            return [AUDIT_LOG_JOB,
                    AUTO_BID_JOB,
                    CLOSE_NON_PERFORMING_LOAN_APPLICATION_JOB,
                    INVESTOR_LOAN_INTERACTION_ESCALATION_NOTIFICATIONJOB,
                    LOAN_AUCTION_EXPIRY_ALERT_FOR_LENDER_JOB,
                    LOAN_AUCTION_STATUS_ALERT_FOR_LENDER_JOB,
                    LOAN_STATUS_NOTIFICATION_JOB,
                    NACH_QUEUE_PROCESS_JOB,
                    PENALTY_CALCULATE_JOB,
                    REPAYMENT_PAY_JOB,
                    REPAYMENT_REMINDER_NOTIFICATION_JOB,
                    SYSTEM_STATS_JOB,
                    UPDATE_LOAN_APPLICATION_STATUS_JOB,
                    SEND_TRANSACTION_REPORT_TO_ADMIN_JOB,
                    SEND_TRANSACTION_RECONCILE_REPORT_TO_ADMIN_JOB,
                    REPAYMENT_PAY_USING_DIGIO_ENACH_JOB,
                    UPDATE_INVESTOR_OUTSTANDING_INVESTMENT_AMOUNT,
                    REPAYMENT_PAY_USING_RAZORPAY_ENACH_JOB,
                    ENCRYPT_ALL_EXISTING_DOCS_JOB
            ]
        }
    }

    public enum OccasionType {
        GENERAL(0), SUNDAY(1), MONDAY(2), TUESDAY(3), WEDNESDAY(4), THURDAY(5), FRIDAY(6), SATURDAY(7)

        final private int value

        OccasionType(Integer value) {
            this.value = value
        }

        public getValue() {
            return this.value
        }

        public static List<OccasionType> allWeekDays() {
            ([SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURDAY, FRIDAY, SATURDAY] - [GENERAL])
        }
    }

    public enum ApiStatus {
        INITIALIZED, PROCESSING, COMPLETED, ERROR
    }

    public enum TimeFrequency {
        YEARLY,
        QUARTERLY,
        MONTHLY,
        WEEKLY,
        DAILY,
        LAST_MONTH
    }

    public enum AssignmentType {
        ASSIGNEE,
        FOLLOWER
    }

    public enum AssignmentStatus {
        ACTIVE,
        IN_ACTIVE
    }

    public enum ImageFormat {
        JPEG('image/jpeg', 'jpg'),
        JPG('image/jpeg', 'jpg'),
        PNG('image/png', 'png'),
        GIF('image/gif', 'gif')

        final private String mimeType
        final private String extension

        public ImageFormat(String mime, String ext) {
            this.mimeType = mime
            this.extension = ext
        }

        public getMimeType() {
            return this.mimeType
        }

        public getExtension() {
            return this.extension
        }
    }

    public enum TypeOfImageToShowInvestor {
        BORROWER_IMAGE,
        LOAN_PROPERTY_IMAGE
    }

    public enum TypeOfAddress {
        ADDRESS,
        ADDRESS_ONE,
        ADDRESS_TWO,
        ADDRESS_THREE,
        SIGNUP_ADDRESS_ONE,
        SIGNUP_ADDRESS_TWO,
        SIGNUP_PERSONAL_ADDRESS,
        COMPANY_ADDRESS,
        COMPANY_ADDRESS_ONE,
        COMPANY_ADDRESS_TWO,
        COMPANY_ADDRESS_THREE,
        COMPANY_ADDRESS_FOUR,
        OFFICE_ADDRESS
    }

    public enum TypeOfAddressForBureauReports {
        ADDRESS,
        ADDRESS_ONE,
        ADDRESS_TWO,
        SIGNUP_ADDRESS_ONE,
        SIGNUP_ADDRESS_TWO,
        SIGNUP_PERSONAL_ADDRESS,
        COMPANY_ADDRESS,
        COMPANY_ADDRESS_ONE,
        COMPANY_ADDRESS_TWO,
        COMPANY_ADDRESS_THREE,
        COMPANY_ADDRESS_FOUR,
    }

    public enum AdminReports {
        INVESTMENTS,
        SYSTEM_STATUS_REPORT,
        APPLICATION_INTERACTION_REPORT,
        LENDER_ACTIVITY_REPORT,
        LOAN_APPLICATION_REPORT,
        TOTAL_BOOK_SIZE,
        DISBURSEMENT_MIS,
        COLLECTION_PRESENTATION_REPORT,
        LOAN_FEE_REPORT,
        DELINQUENCY_MIS_REPORT,
        SANCTION_MIS_REPORT,
        NACH_PRESENTATION_REPORT,
        DISBURSEMENT_ENTRY_REPORT,
        COLLECTION_ENTRY_REPORT,
        FLDG_REPORT,
        GROSS_STATISTICS_REPORT,
        CONSOLIDATED_FLDG_REPORT,
        MIS_DISBURED_LOANS,
        MIS_REPAID_LOANS,
        DAILY_LOAN_DISBURSED_AND_PAID_REPAYMENT_REPORT,
        CIBIL_REPORT,
        NACH_REGISTRATION_REPORT,
        MONTH_WISE_COLLECTION_REPORT,
        EXPERIAN_REPORT,
        ADMIN_CRIF_REPORT,
        ADMIN_EQUIFAX_REPORT,
        UPCOMING_REPAYMENT_REPORT,
        MONTH_END_CLOSING_REPORT,
        ADMIN_RBI_REPORT,
        AUDIT_LOG_REPORT,
        QUESTION_ANSWER_REPORT,
        LOAN_APPLICATION_PARTIAL_REPAYMENT_REPORT,
        ADMIN_ACCOUNTING_MIS_REPORT_EMI_WISE,
        ADMIN_ACCOUNTING_MIS_REPORT_LOAN_WISE
    }

    public enum AdditionalCharges {
        CHEQUE_BOUNCING_CHARGE
    }

    public enum Verticle {
        LOAN_IDENTIFIER_ASSIGNMENT_VERTICLE,
        INVESTOR_IDENTIFIER_ASSIGNMENT_VERTICLE,
        BORROWER_IDENTIFIER_ASSIGNMENT_VERTICLE,
        BID_IDENTIFIER_ASSIGNMENT_VERTICLE,
        INVESTMENT_IDENTIFIER_ASSIGNMENT_VERTICLE,
        TRANSACTION_IDENTIFIER_ASSIGNMENT_VERTICLE,
        DSA_IDENTIFIER_ASSIGNMENT_VERTICLE,
        AUDIT_TRAIL_TENANT_ID_ASSIGNMENT_VERTICLE,
        SEND_EMAIL_VERTICLE,
        SEND_SMS_VERTICLE
    }

    enum InvestorLoanRepaymentStatus {
        PENDING,
        MARKEDPAID,
        PAID,
        OVERDUE,
        INVALID

        public static List<InvestorLoanRepaymentStatus> validUnpaidStatusList() {
            [MARKEDPAID, PENDING, OVERDUE]
        }
    }

    enum RepaymentPaidAmountDedcutionMethod {
        PENALTY_INTEREST_PRINCIPAL(["penalty", "interest", "principal"]),
        PENALTY_PRINCIPAL_INTEREST(["penalty", "principal", "interest"]),
        INTEREST_PRINCIPAL_PENALTY(["interest", "principal", "penalty"]),
        INTEREST_PENALTY_PRINCIPAL(["interest", "penalty", "principal"]),
        PRINCIPAL_INTEREST_PENALTY(["principal", "interest", "penalty"]),
        PRINCIPAL_PENALTY_INTEREST(["principal", "penalty", "interest"]),
        CHEQUE_BOUNCING_CHARGE_PENALTY_INTEREST_PRINCIPAL(["chequeBouncingCharge", "penalty", "interest", "principal"]),
        PRINCIPAL_INTEREST(["principal", "interest"]),
        PENALTY_INTEREST_PRINCIPAL_SERVICE_FEE(["penalty", "interest", "principal","serviceFee"]),
        PENALTY_PRINCIPAL_INTEREST_SERVICE_FEE(["penalty", "principal", "interest","serviceFee"]),
        INTEREST_PRINCIPAL_PENALTY_SERVICE_FEE(["interest", "principal", "penalty","serviceFee"]),
        INTEREST_PENALTY_PRINCIPAL_SERVICE_FEE(["interest", "penalty", "principal","serviceFee"]),
        PRINCIPAL_INTEREST_PENALTY_SERVICE_FEE(["principal", "interest", "penalty","serviceFee"]),
        PRINCIPAL_PENALTY_INTEREST_SERVICE_FEE(["principal", "penalty", "interest","serviceFee"]),
        CHEQUE_BOUNCING_CHARGE_PENALTY_INTEREST_PRINCIPAL_SERVICE_FEE(["chequeBouncingCharge", "penalty", "interest", "principal","serviceFee"]),
        PRINCIPAL_INTEREST_SERVICE_FEE(["principal", "interest","serviceFee"])
    public static List<RepaymentPaidAmountDedcutionMethod> validDeductionMethods(){
        [PENALTY_INTEREST_PRINCIPAL_SERVICE_FEE,PENALTY_PRINCIPAL_INTEREST_SERVICE_FEE,INTEREST_PRINCIPAL_PENALTY_SERVICE_FEE,
         INTEREST_PENALTY_PRINCIPAL_SERVICE_FEE,PRINCIPAL_INTEREST_PENALTY_SERVICE_FEE,PRINCIPAL_PENALTY_INTEREST_SERVICE_FEE,
         CHEQUE_BOUNCING_CHARGE_PENALTY_INTEREST_PRINCIPAL_SERVICE_FEE,PRINCIPAL_INTEREST_SERVICE_FEE]
    }
        public List<String> propertyNames = []

        public RepaymentPaidAmountDedcutionMethod(List<String> propertyNames) {
            this.propertyNames = propertyNames
        }
    }


    enum UploadedFileStatus {
        INITILIZAED, FAILED, PROCEED, PROCESSED
    }

    enum CloudStorageService {
        AWS_S3,
        AZURE_STORAGE,
        FILE_SYSTEM,
        BLU_VOLT_S3
    }

    enum LoanProductType {
        INDIVIDUAL, COMPANY, BOTH
    }

    enum HazelCastDataStructureType {
        LIST, SET, MAP
    }

    enum RequestType {
        GET,
        POST
    }

    enum HazelCastQueueType {
        LOAN_ASSIGNMENT, IDENTIFIER_ASSIGNMENT, SYSTEM_STATS, ADMIN_RAISE_FUND_TRANSFER, SUPER_ADMIN, SMS,
        BORROWER_WITHDRAW_AMOUNT_TRANSACTION, CHANGE_LOAN_APPLICATION_STATUS, CHANGE_TRANSACTION_STATUS,
        CIBIL_REPORT_GENERATE, CONSUME_YODLEE, DEPOSIT_AMOUNT_TRANSACTION, DOCUMENT_UPLOAD, LOAN_STATUS_MAIL,
        LOAN_UPLOAD, MAIL, PDC_MANAGEMENT_UPLOAD, REPAYMENT_EXCEL_UPLOAD, REPAYMENT_MAIL, AUCTION_LOAN_ASSIGN_TO_MATCHING_INVESTOR,
        UPDATE_INVESTMENT_CRITERIA_MATCHING_LOANS_INVESTOR, BANK_REGISTRATION_MIS_UPLOAD, BANK_TRANSACTION_FILE_UPLOAD,
        PENALTIES_AND_CHEQUE_BOUNCE_FILE_UPLOAD, UPDATE_LOAN_APPLICATION_GRACE_PERIOD_UPLOAD, LOAN_IDENTITY_NUMBERS_UPLOAD, LOAN_REFERENCE_DETAILS_UPLOAD,
        SAVE_AUDIT_LOGS_IN_MONGO_DB, SAVE_REST_API_LOGS_IN_MONGO_DB, EXECUTE_AUDIT_TRAIL_WEBHOOK, UPDATE_CHEQUE_BOUNCING_CHARGE_AND_PENALTIES, LOAN_COAPPLICANT_DETAILS_UPLOAD,
        LOAN_REPAYMENT_BULK_UPLOAD, BORROWER_UPLOAD, VIBAN_UPLOAD_FILE, PINCODE_UPLOAD_FILE, RISK_TYPE_UPLOAD
    }

    enum DocumentCategoryType {
        BANK_STATEMENTS, ITR_V, FORM_26_AS, ITR_3, ITR_4, ITR_5, ITR_6, SALARY, ITR, GST_STATEMENT_UPLOAD, GST_ONLINE, IT_ONLINE, NET_BANKING,
        IT_ONLINE_ITR, IT_ONLINE_ITR_V, IT_ONLINE_FORM_26_AS, OCR, IDENTITY, PROFESSION, RESIDENCE, OTHERS, FINANCIAL_STATEMENTS, PASSPORT, VOTER_ID,
        PAN, AADHAR_CARD, DRIVING_LICENSE, CROSS_ANALYSIS, KARZA_AADHAR_XML_DOCUMENT, SELFIE, VIDEO_KYC, CREDIT_BUREAU_STATEMENTS

        public static List<DocumentCategoryType> getITRTypes() {
            return [ITR, ITR_V, FORM_26_AS, ITR_3, ITR_4, ITR_5, ITR_6]
        }

        public static List<DocumentCategoryType> getSalarySlipDocumentTypes() {
            return [SALARY]
        }

        public static List<DocumentCategoryType> getStatementDocumentTypes() {
            return [BANK_STATEMENTS]
        }

        public static List<DocumentCategoryType> forZipFilesDownload() {
            return [ITR, IT_ONLINE, FORM_26_AS, ITR_V, IT_ONLINE_ITR, IT_ONLINE_ITR_V, IT_ONLINE_FORM_26_AS, OCR, IDENTITY, PROFESSION, RESIDENCE,
                    PASSPORT, VOTER_ID, PAN, AADHAR_CARD, DRIVING_LICENSE, GST_ONLINE]
        }
    }

    public enum NotificationOneType {
        DEFAULT, EMPLOYER_AGREEMENT
    }

    public enum ResponseType {
        SUCCESS, ERROR
    }

    public enum LoanPurposeDocumentFor {
        MAIN_APPLICANT, CO_APPLICANT, COMPANY_REPRESENTATIVE, REFERENCE
    }

    public enum EmailClient {
        POSTMARK, AMAZON_SES, SPARK_POST, SEND_GRID, EMAIL_GUPSHUP
    }

    public enum CibilReportCodeConvertType {
        GENDER,
        STATE,
        OWNERSHIP_INDICATOR,
        SUIT_FILED,
        WRITTEN_OFF_SETTLED_STATUS,
        ASSET_CLASSIFICATION,
        TYPE_OF_COLLATERAL,
        PAYMENT_FREQUENCY,
        OCCUPATION_CODE,
        NET_GROSS_INCOME_INDICATOR,
        MONTHLY_ANNUAL_INCOME_INDICATOR
    }

    public enum NachMaxAmountType {
        PERCENTAGE_OF_EMI('%age of EMI'),
        PERCENTAGE_OF_LOAN_AMOUNT('%age of Loan Amount')

        final String displayText

        NachMaxAmountType(String displayText) {
            this.displayText = displayText
        }
    }

    public enum NachStatus {
        UNDER_PROCESS('btn btn-primary', 'label label-primary'),
        PROCESSED('btn btn-primary', 'label label-success'),
        FAILED('btn btn-danger', 'label label-danger'),

        final private String css
        final private String cssLabel

        public NachStatus(String css, String cssLabel) {
            this.css = css
            this.cssLabel = cssLabel
        }

        public getCss() {
            return this.css
        }

        public getCssLabel() {
            return this.cssLabel
        }
    }

    public enum NachBankTransactionStatus {
        BILL_PAYMENT_SUCCESSFUL("BILL PAYMENT SUCCESSFUL"),
        SUCCESSFUL("SUCCESSFUL"),
        ACTIVE("ACTIVE"),
        CLEAR("CLEAR")
        final String displayText

        NachBankTransactionStatus(String displayText) {
            this.displayText = displayText
        }
    }

    public enum NachBankRegistrationResponseStatus {
        ACTIVE("ACTIVE"),
        UNDER_PROCESS("UNDER PROCESS"),
        REJECTED("REJECTED")
        final String displayText

        NachBankRegistrationResponseStatus(String displayText) {
            this.displayText = displayText
        }
    }

    public enum MonthlyPenaltyTimeFrequency {
        MONTHLY,
        DAILY
    }

    public enum CIBIL_SCORE_TYPE {
        CIBIL_TRANSUNION_SCORE_V2("04"),
        CREDIT_VISION_SCORE("08")

        final private String value

        CIBIL_SCORE_TYPE(String value) {
            this.value = value
        }
    }

    public enum ApplicationName {
        MAIN_APPLICATION,
        INVESTOR_COMMISSION,
        DSA_COMMISSION,
        NOTIFICATION_SETTING,
        GATEWAY,
        REGISTRY,
        ONBOARDING,
        CRIF
    }

    public enum ActivityStatus {
        ACCEPTED, REJECTED, UPLOADED, INITIATED
    }

    public enum GapDayInterestEmiPaidDay {
        ON_DISBURSEMENT_DATE, ON_ZERO_EMI_DATE, ON_FIRST_EMI_DATE
    }

    public enum TenantMigration {
        IMPORT, EXPORT
    }

    enum AddCreditAnalysisReportFor {
        MAIN_APPLICANT, CO_APPLICANT

        public static List<AddCreditAnalysisReportFor> allApplicant() {
            return [MAIN_APPLICANT, CO_APPLICANT]
        }
    }

    enum FileContentType {
        PDF(['application/pdf']), XLS(['application/vnd.ms-excel']),
        XLSX(['application/vnd.openxmlformats-officedocument.spreadsheetml.sheet']), PNG(['image/png']), JPEG(['image/jpeg', 'image/x-citrix-jpeg']), GIF(['image/gif']),
        ICO(['image/x-icon']), IEF(['image/ief']), JPM(['video/jpm']), JPG(['image/jpeg', 'image/x-citrix-jpeg']), PJPEG(['image/pjpeg']), MDI(['image/vnd.ms-modi']),
        TXT(['text/plain']), ODF(['application/vnd.oasis.opendocument.formula']), MP4(['video/mp4', 'application/mp4']), MP4A(['audio/mp4']), XML(['application/xml', 'application/rss+xml']),
        JSON(['application/json']), DOC(['application/msword']), DOCM(['application/vnd.ms-word.document.macroenabled.12']), YAML(['text/yaml'])

        List<String> fileContent

        FileContentType(List<String> fileContent) {
            this.fileContent = fileContent
        }

        static List<String> fetchFileContent(List<String> allowedFormat) {
            List<String> fileContent
            if (allowedFormat) {
                fileContent = []
                for (String fileFormat : allowedFormat) {
                    fileContent.addAll((fileFormat as FileContentType).fileContent)
                }
            }
            return fileContent
        }
    }

    public enum CollectionAgencyType {
        INDIVIDUAL, COMPANY
    }

    public enum CollectionAgencyStatus {
        APPROVED, AWAITING_APPROVAL, REJECTED, EXPIRED, DISABLED, BLACKLIST

        public static List<CollectionAgencyStatus> beforeApproval() {
            [AWAITING_APPROVAL, REJECTED, DISABLED, BLACKLIST]
        }
    }

    enum PaymentGatewayType {
        AUSPOST_SECURE_PAY_PAYMENT,
        RAZORPAY_LOAN_DISBURSEMENT,
        RAZORPAY_PAYMENT_LINK_EMI_PAYMENT,
        DIGIO_ENACH_EMI_PAYMENT,
        RAZORPAY_ENACH_EMI_PAYMENT,
        PAYU_LOAN_DISBURSEMENT
    }

    enum LoanApplicationFlags {
        DEFAULTED, DELAYED, CHARGED_OFF
    }
    //Related To Perfios Integration
    public enum IntegrationType {
        INSIGHTS, API_SERVICES, OCR, VERIFICATION_SERVICES, CROSS_ANALYSIS
    }

    public enum VerificationType {
        GST, ENTITY, PROFESSION
,IDENTITY,RESIDENCE
        public static List<VerificationType> verificationTypeList() {
            [GST, ENTITY, PROFESSION,IDENTITY,RESIDENCE]
        }
    }
    public enum ReportFlavour {
        SME, RETAIL
    }

    public enum GstProcessingType {
        API, STATEMENT_UPLOAD
    }

    public enum CrossAnalysisReportPurpose {
        CAM_REPORT, UL_REPORT, RTR_REPORT
    }

    enum MobileAppUserType {
        COLLECTION_AGENCY, BORROWER
    }

    public enum TypeOfMessage {
        PROMOTIONAL('1'),
        TRANSACTION('4'),
        SEND_OTP('106')

        final private String code

        TypeOfMessage(String code) {
            this.code = code
        }

        public getCode() {
            return this.code
        }

        public static List<TypeOfMessage> getList() {
            return [PROMOTIONAL, TRANSACTION, SEND_OTP]
        }

        public static String getMessageCode(String messageType) {
            String code = "4"
            List<TypeOfMessage> typeOfMessageList = getList()
            if (messageType) {
                for (TypeOfMessage typeOfMessage : typeOfMessageList) {
                    if (typeOfMessage.toString().equals(messageType)) {
                        code = typeOfMessage.code
                    }
                }
            }

            return code
        }
    }

    public enum IdentityUserType {
        INDIVIDUAL, COMPANY
    }

    public enum CustomLinkGeneratorType {
        SIGN_UP, SIGN_UP_DOCUMENT

        public static List<CustomLinkGeneratorType> linkType() {
            [SIGN_UP, SIGN_UP_DOCUMENT]
        }
    }

    public enum DataImport {
        DSA, ADMIN, BORROWER, LOAN_APPLICATION, SUPPORTING_DOCUMENT, CREDIT_ANSWERS,NOTIFICATION_QUEUE,AUDIT_LOG,CONTRACT
    }
    public enum LoanRepaymentComponents{
        SERVICE_FEE,PENALTY,PRINCIPAL,INTEREST
    }

    public enum ContractPdfPassword {
        DATE_OF_BIRTH,
        FIRST_NAME

        public static List<ContractPdfPassword> allContractPdfPasswords(){
            [DATE_OF_BIRTH, FIRST_NAME]
        }
    }

    public enum PerfiosApiVersion{
        V1,V2
    }

    enum ForeClosurePaymentType{
        REPAYMENT_ON_REMAINING_PENDING_AND_OVERDUE_EMI,
        REPAYMENT_ON_REMAINING_PENDING_EMI
    }

    public enum BankVerificationProvider{
        MANUAL,
        PAYU
    }

    public enum FinancialProductType{
        LOAN
    }
}