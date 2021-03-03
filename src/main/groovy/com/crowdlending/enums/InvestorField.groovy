package com.crowdlending.enums

enum InvestorField {

    TITLE(Boolean.FALSE, 'title', Enums.FieldDataType.DROPDOWN.toString(), CommonPropertyType.TITLE.toString()),
    FIRST_NAME(Boolean.FALSE, 'firstName', Enums.FieldDataType.TEXT.toString()),
    MIDDLE_NAME(Boolean.FALSE, 'middleName', Enums.FieldDataType.TEXT.toString()),
    LAST_NAME(Boolean.FALSE, 'lastName', Enums.FieldDataType.TEXT.toString()),
    SECOND_LAST_NAME(Boolean.FALSE, 'secondLastName', Enums.FieldDataType.TEXT.toString()),
    GENDER(Boolean.FALSE, 'gender', Enums.FieldDataType.DROPDOWN.toString(), CommonPropertyType.GENDER.toString()),
    MARITAL_STATUS(Boolean.FALSE, 'maritalStatus', Enums.FieldDataType.DROPDOWN.toString(), CommonPropertyType.MARITAL_STATUS.toString()),
    CONTACT_NO(Boolean.FALSE, 'contact', Enums.FieldDataType.PHONE_NO.toString()),
    ALTERNATIVE_NO(Boolean.FALSE, 'alternativeNumber', Enums.FieldDataType.PHONE_NO.toString()),
    LANDLINE_NO(Boolean.FALSE, 'landLineNumber', Enums.FieldDataType.PHONE_NO.toString()),
    DATE_OF_BIRTH(Boolean.FALSE, 'dateOfBirth', Enums.FieldDataType.DATE.toString()),
    PLACE_OF_BIRTH(Boolean.FALSE, 'placeOfBirthCity', Enums.FieldDataType.DROPDOWN.toString(), CommonPropertyType.CITY.toString()),
    REFERRAL_SOURCE(Boolean.FALSE, 'referralSource', Enums.FieldDataType.DROPDOWN.toString(), CommonPropertyType.REFERRAL_SOURCE.toString()),
    CATEGORY(Boolean.FALSE, 'investorCategory', Enums.FieldDataType.DROPDOWN.toString()),
    AADHAAR_NO(Boolean.FALSE, 'aadhaarNumber', Enums.FieldDataType.NUMBER.toString()),
    IDENTITY_NUMBER_ONE(Boolean.FALSE, 'identityNumberOne', Enums.FieldDataType.ALPHA_NUMERIC.toString()),
    IDENTITY_NUMBER_TWO(Boolean.FALSE, 'identityNumberTwo', Enums.FieldDataType.ALPHA_NUMERIC.toString()),
    REFERRAL_CODE(Boolean.FALSE, 'referralCode', Enums.FieldDataType.TEXT.toString()),
    CAPTCHA(Boolean.FALSE, 'recaptchaResponse', Enums.FieldDataType.TEXT.toString()),
    PERSONAL_SIGNUP_ALLOWED(Boolean.FALSE, 'personalSignupAllowed', Enums.FieldDataType.TEXT.toString()),
    AMOUNT_TO_INVEST(Boolean.FALSE, 'amountToInvest', Enums.FieldDataType.AMOUNT.toString()),
    INVESTMENT_PURPOSE(Boolean.FALSE, 'investmentPurpose', Enums.FieldDataType.TEXT.toString()),
    REQUIRED_INTEREST_RATE(Boolean.FALSE, 'interestRate', Enums.FieldDataType.DROPDOWN.toString(), CommonPropertyType.INTEREST_RATE.toString()),
    PAN_CARD(Boolean.FALSE, 'pan', Enums.FieldDataType.ALPHA_NUMERIC.toString()),
    EMPLOYEMENT_CATEGORY(Boolean.FALSE, 'employmentCategory', Enums.FieldDataType.DROPDOWN.toString(), CommonPropertyType.EMPLOYMENT_CATEGORY.toString()),
    GROSS_INCOME(Boolean.FALSE, 'grossIncome', Enums.FieldDataType.AMOUNT.toString()),
    INTEREST_INCOME(Boolean.FALSE, 'interestIncome', Enums.FieldDataType.AMOUNT.toString()),
    PERSONAL_ADDRESS(Boolean.FALSE, 'personalAddress', Enums.FieldDataType.ADDRESS.toString()),
    RESIDENCE_TYPE(Boolean.FALSE, 'residenceType', Enums.FieldDataType.DROPDOWN.toString(), CommonPropertyType.RESIDENCE_TYPE.toString()),
    EDUCATION_TYPE(Boolean.FALSE, 'educationType', Enums.FieldDataType.DROPDOWN.toString(), CommonPropertyType.EDUCATION_TYPE.toString()),
    EMPLOYER_TYPE(Boolean.FALSE, 'employerType', Enums.FieldDataType.DROPDOWN.toString(), CommonPropertyType.EMPLOYER_TYPE.toString()),
    RESIDENT_OWNERSHIP_TYPE(Boolean.FALSE, 'residentOwnershipType', Enums.FieldDataType.DROPDOWN.toString(), CommonPropertyType.RESIDENT_OWNERSHIP_TYPE.toString()),
    DURATION_FOR_INVEST_AMOUNT(Boolean.FALSE, 'durationForInvest', Enums.FieldDataType.DROPDOWN.toString()),
    HOME_EXPENSES(Boolean.FALSE, 'homeExpenses', Enums.FieldDataType.AMOUNT.toString()),
    TRANSPORTATION_EXPENSES(Boolean.FALSE, 'transportationExpenses', Enums.FieldDataType.AMOUNT.toString()),
    UTILITY_EXPENSES(Boolean.FALSE, 'utilitiesExpenses', Enums.FieldDataType.AMOUNT.toString()),
    ENTERTAINMENT_EXPENSES(Boolean.FALSE, 'entertainmentExpenses', Enums.FieldDataType.AMOUNT.toString()),
    CREDIT_CARD_EXPENSES(Boolean.FALSE, 'creditCardExpenses', Enums.FieldDataType.AMOUNT.toString()),
    HOUSE_LOAN_EXPENSES(Boolean.FALSE, 'houseLoanExpenses', Enums.FieldDataType.AMOUNT.toString()),
    INSURANCE_EXPENSES(Boolean.FALSE, 'insuranceExpenses', Enums.FieldDataType.AMOUNT.toString()),
    OTHER_EXPENSES(Boolean.FALSE, 'otherExpenses', Enums.FieldDataType.AMOUNT.toString()),
    COMPANY_NAME(Boolean.FALSE, 'companyName', Enums.FieldDataType.ALPHA_NUMERIC.toString()),
    COMPANY_SIGNUP_ALLOWED(Boolean.FALSE, 'companySignupAllowed', Enums.FieldDataType.TEXT.toString()),
    COMPANY_REGISTRATION_NUMBER(Boolean.FALSE, 'companyRegistrationCode', Enums.FieldDataType.ALPHA_NUMERIC.toString()),
    COMPANY_TURNOVER(Boolean.FALSE, 'companyTurnover', Enums.FieldDataType.AMOUNT.toString()),
    COMPANY_BALANCE(Boolean.FALSE, 'companyBalance', Enums.FieldDataType.AMOUNT.toString()),
    DATE_OF_ARTICLES(Boolean.FALSE, 'dateOfArticle', Enums.FieldDataType.DATE.toString()),
    COMPANY_ADDRESS(Boolean.FALSE, 'companyAddress', Enums.FieldDataType.ADDRESS.toString()),
    INDUSTRY_SERVING(Boolean.FALSE, 'companyIndustry', Enums.FieldDataType.DROPDOWN.toString(), CommonPropertyType.COMPANY_INDUSTRY.toString()),
    COMPANY_CATEGORY(Boolean.FALSE, 'companyCategory', Enums.FieldDataType.DROPDOWN.toString(), CommonPropertyType.INVESTOR_COMPANY_CATEGORY.toString()),
    COMPANY_DESCRIPTION(Boolean.FALSE, 'companyDescription', Enums.FieldDataType.TEXT.toString()),
    EMPLOYEES_COUNT(Boolean.FALSE, 'employeesCount', Enums.FieldDataType.NUMBER.toString()),
    POSITION_IN_COMPANY(Boolean.FALSE, 'positionInCompany', Enums.FieldDataType.TEXT.toString()),
    FAX_NO(Boolean.FALSE, 'faxNumber', Enums.FieldDataType.PHONE_NO.toString()),
    RELIGION_TYPE(Boolean.FALSE, 'religion', Enums.FieldDataType.DROPDOWN.toString(), CommonPropertyType.RELIGION_TYPE.toString()),
    CITIZENSHIP(Boolean.FALSE, 'citizenship', Enums.FieldDataType.DROPDOWN.toString(), CommonPropertyType.CITIZENSHIP.toString()),
    VIRTUAL_ACCOUNT_NUMBER(Boolean.FALSE, 'virtualAccountNumber', Enums.FieldDataType.ALPHA_NUMERIC.toString()),
    ALTERNATIVE_USERNAME(Boolean.FALSE, 'alternativeUsername', Enums.FieldDataType.TEXT.toString()),
    VIRTUAL_ACCOUNT_BANK(Boolean.FALSE, 'virtualAccountBank', Enums.FieldDataType.ALPHA_NUMERIC.toString()),
    VIRTUAL_ACCOUNT_NAME(Boolean.FALSE, 'virtualAccountName', Enums.FieldDataType.TEXT.toString()),
    CASTE_CATEGORY(Boolean.FALSE, 'casteCategory', Enums.FieldDataType.DROPDOWN.toString(), CommonPropertyType.CASTE_CATEGORY.toString()),
    IDENTITY_NUMBER_THREE(Boolean.FALSE, 'identityNumberThree', Enums.FieldDataType.ALPHA_NUMERIC.toString()),
    IDENTITY_NUMBER_FOUR(Boolean.FALSE, 'identityNumberFour', Enums.FieldDataType.ALPHA_NUMERIC.toString()),
    IDENTITY_NUMBER_FIVE(Boolean.FALSE, 'identityNumberFour', Enums.FieldDataType.ALPHA_NUMERIC.toString()),
    IDENTITY_NUMBER_SIX(Boolean.FALSE, 'identityNumberFour', Enums.FieldDataType.ALPHA_NUMERIC.toString()),
    PERSON_WITH_DISABILITY(Boolean.FALSE, 'isPersonWithDisability', Enums.FieldDataType.DROPDOWN.toString()),
    PASSWORD(Boolean.TRUE, 'password', Enums.FieldDataType.TEXT.toString()),
    EMAIL_ADDRESS(Boolean.TRUE, 'userName', Enums.FieldDataType.TEXT.toString()),
    FIRST_SCHOOL_NAME(Boolean.FALSE, 'firstSchoolName', Enums.FieldDataType.TEXT.toString()),
    COMPANY_BUSINESS_TYPE(Boolean.FALSE, 'businessType', Enums.FieldDataType.TEXT.toString()),
    COMPANY_IDENTITY_NUMBER_ONE(Boolean.FALSE, 'companyIdentityNumberOne', Enums.FieldDataType.ALPHA_NUMERIC.toString()),
    COMPANY_IDENTITY_NUMBER_TWO(Boolean.FALSE, 'companyIdentityNumberTwo', Enums.FieldDataType.ALPHA_NUMERIC.toString()),
    COMPANY_IDENTITY_NUMBER_THREE(Boolean.FALSE, 'companyIdentityNumberThree', Enums.FieldDataType.ALPHA_NUMERIC.toString()),
    COMPANY_IDENTITY_NUMBER_FOUR(Boolean.FALSE, 'companyIdentityNumberFour', Enums.FieldDataType.ALPHA_NUMERIC.toString()),
    COMPANY_IDENTITY_NUMBER_FIVE(Boolean.FALSE, 'companyIdentityNumberFive', Enums.FieldDataType.ALPHA_NUMERIC.toString()),
    COMPANY_IDENTITY_NUMBER_SIX(Boolean.FALSE, 'companyIdentityNumberSix', Enums.FieldDataType.ALPHA_NUMERIC.toString()),
    COMPANY_BUSINESS_VINTAGE(Boolean.FALSE, 'businessVintage', Enums.FieldDataType.NUMBER.toString()),

    COMPANY_IDENTITY_NUMBER_ONE_ISSUE_DATE(Boolean.FALSE, 'companyIdentityNumberOneIssueDate', Enums.FieldDataType.DATE.toString()),
    COMPANY_IDENTITY_NUMBER_TWO_ISSUE_DATE(Boolean.FALSE, 'companyIdentityNumberTwoIssueDate', Enums.FieldDataType.DATE.toString()),
    COMPANY_IDENTITY_NUMBER_THREE_ISSUE_DATE(Boolean.FALSE, 'companyIdentityNumberThreeIssueDate', Enums.FieldDataType.DATE.toString()),
    COMPANY_IDENTITY_NUMBER_FOUR_ISSUE_DATE(Boolean.FALSE, 'companyIdentityNumberFourIssueDate', Enums.FieldDataType.DATE.toString()),
    COMPANY_IDENTITY_NUMBER_FIVE_ISSUE_DATE(Boolean.FALSE, 'companyIdentityNumberFiveIssueDate', Enums.FieldDataType.DATE.toString()),
    COMPANY_IDENTITY_NUMBER_SIX_ISSUE_DATE(Boolean.FALSE, 'companyIdentityNumberSixIssueDate', Enums.FieldDataType.DATE.toString()),
    IDENTITY_NUMBER_ONE_ISSUE_DATE(Boolean.FALSE, 'identityNumberOneIssueDate', Enums.FieldDataType.DATE.toString()),
    IDENTITY_NUMBER_TWO_ISSUE_DATE(Boolean.FALSE, 'identityNumberTwoIssueDate', Enums.FieldDataType.DATE.toString()),
    IDENTITY_NUMBER_THREE_ISSUE_DATE(Boolean.FALSE, 'identityNumberThreeIssueDate', Enums.FieldDataType.DATE.toString()),
    IDENTITY_NUMBER_FOUR_ISSUE_DATE(Boolean.FALSE, 'identityNumberFourIssueDate', Enums.FieldDataType.DATE.toString()),
    IDENTITY_NUMBER_FIVE_ISSUE_DATE(Boolean.FALSE, 'identityNumberFiveIssueDate', Enums.FieldDataType.DATE.toString()),
    IDENTITY_NUMBER_SIX_ISSUE_DATE(Boolean.FALSE, 'identityNumberSixIssueDate', Enums.FieldDataType.DATE.toString()),
    IDENTITY_NUMBER_FOUR_TYPE(Boolean.FALSE, 'identityNumberFourType', Enums.FieldDataType.DROPDOWN.toString()),
    CONFIRM_EMAIL_ADDRESS(Boolean.FALSE, 'confirmUserName', Enums.FieldDataType.TEXT.toString()),
    SKIP_EMPLOYMENT_DETAILS_PAGE(Boolean.FALSE, 'skipEmploymentDetailsPage', Enums.FieldDataType.TEXT.toString()),
    EMPLOYMENT_DETAILS_SIGN_UP_ALLOWED(Boolean.FALSE, 'employmentDetailsSignUpAllowed', Enums.FieldDataType.TEXT.toString()),
    EMPLOYMENT_TYPE(Boolean.FALSE, 'employmentType', Enums.FieldDataType.TEXT.toString()),
    ORGANIZATION_TYPE(Boolean.FALSE, 'organizationType', Enums.FieldDataType.TEXT.toString()),
    ORGANIZATION_NAME(Boolean.FALSE, 'organizationName', Enums.FieldDataType.TEXT.toString()),
    INVESTOR_EMPLOYMENT_DETAILS_TEXT_VARIABLE_1(Boolean.FALSE, 'investorEmploymentDetailsTextVariable1', Enums.FieldDataType.TEXT.toString(), CommonPropertyType.INVESTOR_EMPLOYMENT_DETAILS_VARIABLE1.name()),
    INVESTOR_EMPLOYMENT_DETAILS_TEXT_VARIABLE_2(Boolean.FALSE, 'investorEmploymentDetailsTextVariable2', Enums.FieldDataType.TEXT.toString(), CommonPropertyType.INVESTOR_EMPLOYMENT_DETAILS_VARIABLE2.name()),
    INVESTOR_EMPLOYMENT_DETAILS_TEXT_VARIABLE_3(Boolean.FALSE, 'investorEmploymentDetailsTextVariable3', Enums.FieldDataType.TEXT.toString(), CommonPropertyType.INVESTOR_EMPLOYMENT_DETAILS_VARIABLE3.name()),
    INVESTOR_EMPLOYMENT_DETAILS_TEXT_VARIABLE_4(Boolean.FALSE, 'investorEmploymentDetailsTextVariable4', Enums.FieldDataType.TEXT.toString(), CommonPropertyType.INVESTOR_EMPLOYMENT_DETAILS_VARIABLE4.name()),
    INVESTOR_EMPLOYMENT_DETAILS_TEXT_VARIABLE_5(Boolean.FALSE, 'investorEmploymentDetailsTextVariable5', Enums.FieldDataType.TEXT.toString(), CommonPropertyType.INVESTOR_EMPLOYMENT_DETAILS_VARIABLE5.name()),
    INVESTOR_EMPLOYMENT_DETAILS_TEXT_VARIABLE_6(Boolean.FALSE, 'investorEmploymentDetailsTextVariable6', Enums.FieldDataType.TEXT.toString(), CommonPropertyType.INVESTOR_EMPLOYMENT_DETAILS_VARIABLE6.name()),
    INVESTOR_EMPLOYMENT_DETAILS_TEXT_VARIABLE_7(Boolean.FALSE, 'investorEmploymentDetailsTextVariable7', Enums.FieldDataType.TEXT.toString(), CommonPropertyType.INVESTOR_EMPLOYMENT_DETAILS_VARIABLE7.name()),
    INVESTOR_EMPLOYMENT_DETAILS_TEXT_VARIABLE_8(Boolean.FALSE, 'investorEmploymentDetailsTextVariable8', Enums.FieldDataType.TEXT.toString(), CommonPropertyType.INVESTOR_EMPLOYMENT_DETAILS_VARIABLE8.name()),
    INVESTOR_EMPLOYMENT_DETAILS_TEXT_VARIABLE_9(Boolean.FALSE, 'investorEmploymentDetailsTextVariable9', Enums.FieldDataType.TEXT.toString(), CommonPropertyType.INVESTOR_EMPLOYMENT_DETAILS_VARIABLE9.name()),
    INVESTOR_EMPLOYMENT_DETAILS_TEXT_VARIABLE_10(Boolean.FALSE, 'investorEmploymentDetailsTextVariable10', Enums.FieldDataType.TEXT.toString(), CommonPropertyType.INVESTOR_EMPLOYMENT_DETAILS_VARIABLE10.name()),
    INVESTOR_DETAIL_TEXT_VARIABLE_1(Boolean.FALSE, 'investorProfileTextVariable1', Enums.FieldDataType.TEXT.toString(), CommonPropertyType.INVESTOR_PROFILE_VARIABLE1.name()),
    INVESTOR_DETAIL_TEXT_VARIABLE_2(Boolean.FALSE, 'investorProfileTextVariable2', Enums.FieldDataType.TEXT.toString(), CommonPropertyType.INVESTOR_PROFILE_VARIABLE2.name()),
    INVESTOR_DETAIL_TEXT_VARIABLE_3(Boolean.FALSE, 'investorProfileTextVariable3', Enums.FieldDataType.TEXT.toString(), CommonPropertyType.INVESTOR_PROFILE_VARIABLE3.name()),
    INVESTOR_DETAIL_TEXT_VARIABLE_4(Boolean.FALSE, 'investorProfileTextVariable4', Enums.FieldDataType.TEXT.toString(), CommonPropertyType.INVESTOR_PROFILE_VARIABLE4.name()),
    INVESTOR_DETAIL_TEXT_VARIABLE_5(Boolean.FALSE, 'investorProfileTextVariable5', Enums.FieldDataType.TEXT.toString(), CommonPropertyType.INVESTOR_PROFILE_VARIABLE5.name()),
    INVESTOR_DETAIL_TEXT_VARIABLE_6(Boolean.FALSE, 'investorProfileTextVariable6', Enums.FieldDataType.TEXT.toString(), CommonPropertyType.INVESTOR_PROFILE_VARIABLE6.name()),
    INVESTOR_DETAIL_TEXT_VARIABLE_7(Boolean.FALSE, 'investorProfileTextVariable7', Enums.FieldDataType.TEXT.toString(), CommonPropertyType.INVESTOR_PROFILE_VARIABLE7.name()),
    INVESTOR_DETAIL_TEXT_VARIABLE_8(Boolean.FALSE, 'investorProfileTextVariable8', Enums.FieldDataType.TEXT.toString(), CommonPropertyType.INVESTOR_PROFILE_VARIABLE8.name()),
    INVESTOR_DETAIL_TEXT_VARIABLE_9(Boolean.FALSE, 'investorProfileTextVariable9', Enums.FieldDataType.TEXT.toString(), CommonPropertyType.INVESTOR_PROFILE_VARIABLE9.name()),
    INVESTOR_DETAIL_TEXT_VARIABLE_10(Boolean.FALSE, 'investorProfileTextVariable10', Enums.FieldDataType.TEXT.toString(), CommonPropertyType.INVESTOR_PROFILE_VARIABLE10.name()),
    INVESTOR_DETAIL_DATE_VARIABLE_1(Boolean.FALSE, 'investorProfileDateVariable1', Enums.FieldDataType.DATE.toString()),
    INVESTOR_DETAIL_DATE_VARIABLE_2(Boolean.FALSE, 'investorProfileDateVariable2', Enums.FieldDataType.DATE.toString()),
    INVESTOR_DETAIL_DATE_VARIABLE_3(Boolean.FALSE, 'investorProfileDateVariable3', Enums.FieldDataType.DATE.toString()),
    INVESTOR_DETAIL_DATE_VARIABLE_4(Boolean.FALSE, 'investorProfileDateVariable4', Enums.FieldDataType.DATE.toString()),
    INVESTOR_PROFILE_TEXT_VARIABLE_1(Boolean.FALSE, 'investorProfileTextVariable1', Enums.FieldDataType.TEXT.toString(), CommonPropertyType.INVESTOR_PROFILE_VARIABLE1.name()),
    INVESTOR_PROFILE_TEXT_VARIABLE_2(Boolean.FALSE, 'investorProfileTextVariable2', Enums.FieldDataType.TEXT.toString(), CommonPropertyType.INVESTOR_PROFILE_VARIABLE2.name()),
    INVESTOR_PROFILE_TEXT_VARIABLE_3(Boolean.FALSE, 'investorProfileTextVariable3', Enums.FieldDataType.TEXT.toString(), CommonPropertyType.INVESTOR_PROFILE_VARIABLE3.name()),
    INVESTOR_PROFILE_TEXT_VARIABLE_4(Boolean.FALSE, 'investorProfileTextVariable4', Enums.FieldDataType.TEXT.toString(), CommonPropertyType.INVESTOR_PROFILE_VARIABLE4.name()),
    INVESTOR_PROFILE_TEXT_VARIABLE_5(Boolean.FALSE, 'investorProfileTextVariable5', Enums.FieldDataType.TEXT.toString(), CommonPropertyType.INVESTOR_PROFILE_VARIABLE5.name()),
    INVESTOR_PROFILE_TEXT_VARIABLE_6(Boolean.FALSE, 'investorProfileTextVariable6', Enums.FieldDataType.TEXT.toString(), CommonPropertyType.INVESTOR_PROFILE_VARIABLE6.name()),
    INVESTOR_PROFILE_TEXT_VARIABLE_7(Boolean.FALSE, 'investorProfileTextVariable7', Enums.FieldDataType.TEXT.toString(), CommonPropertyType.INVESTOR_PROFILE_VARIABLE7.name()),
    INVESTOR_PROFILE_TEXT_VARIABLE_8(Boolean.FALSE, 'investorProfileTextVariable8', Enums.FieldDataType.TEXT.toString(), CommonPropertyType.INVESTOR_PROFILE_VARIABLE8.name()),
    INVESTOR_PROFILE_TEXT_VARIABLE_9(Boolean.FALSE, 'investorProfileTextVariable9', Enums.FieldDataType.TEXT.toString(), CommonPropertyType.INVESTOR_PROFILE_VARIABLE9.name()),
    INVESTOR_PROFILE_TEXT_VARIABLE_10(Boolean.FALSE, 'investorProfileTextVariable10', Enums.FieldDataType.TEXT.toString(), CommonPropertyType.INVESTOR_PROFILE_VARIABLE10.name()),
    INVESTOR_PROFILE_DATE_VARIABLE_1(Boolean.FALSE, 'investorProfileDateVariable1', Enums.FieldDataType.DATE.toString()),
    INVESTOR_PROFILE_DATE_VARIABLE_2(Boolean.FALSE, 'investorProfileDateVariable2', Enums.FieldDataType.DATE.toString()),
    INVESTOR_PROFILE_DATE_VARIABLE_3(Boolean.FALSE, 'investorProfileDateVariable3', Enums.FieldDataType.DATE.toString()),
    INVESTOR_PROFILE_DATE_VARIABLE_4(Boolean.FALSE, 'investorProfileDateVariable4', Enums.FieldDataType.DATE.toString()),
    INVESTOR_COMPANY_TEXT_VARIABLE_1(Boolean.FALSE, 'investorCompanyTextVariable1', Enums.FieldDataType.TEXT.toString(), CommonPropertyType.INVESTOR_COMPANY_VARIABLE1.name()),
    INVESTOR_COMPANY_TEXT_VARIABLE_2(Boolean.FALSE, 'investorCompanyTextVariable2', Enums.FieldDataType.TEXT.toString(), CommonPropertyType.INVESTOR_COMPANY_VARIABLE2.name()),
    INVESTOR_COMPANY_TEXT_VARIABLE_3(Boolean.FALSE, 'investorCompanyTextVariable3', Enums.FieldDataType.TEXT.toString(), CommonPropertyType.INVESTOR_COMPANY_VARIABLE3.name()),
    INVESTOR_COMPANY_TEXT_VARIABLE_4(Boolean.FALSE, 'investorCompanyTextVariable4', Enums.FieldDataType.TEXT.toString(), CommonPropertyType.INVESTOR_COMPANY_VARIABLE4.name()),
    INVESTOR_COMPANY_TEXT_VARIABLE_5(Boolean.FALSE, 'investorCompanyTextVariable5', Enums.FieldDataType.TEXT.toString(), CommonPropertyType.INVESTOR_COMPANY_VARIABLE5.name()),
    INVESTOR_COMPANY_TEXT_VARIABLE_6(Boolean.FALSE, 'investorCompanyTextVariable6', Enums.FieldDataType.TEXT.toString(), CommonPropertyType.INVESTOR_COMPANY_VARIABLE6.name()),
    INVESTOR_COMPANY_TEXT_VARIABLE_7(Boolean.FALSE, 'investorCompanyTextVariable7', Enums.FieldDataType.TEXT.toString(), CommonPropertyType.INVESTOR_COMPANY_VARIABLE7.name()),
    INVESTOR_COMPANY_TEXT_VARIABLE_8(Boolean.FALSE, 'investorCompanyTextVariable8', Enums.FieldDataType.TEXT.toString(), CommonPropertyType.INVESTOR_COMPANY_VARIABLE8.name()),
    INVESTOR_COMPANY_TEXT_VARIABLE_9(Boolean.FALSE, 'investorCompanyTextVariable9', Enums.FieldDataType.TEXT.toString(), CommonPropertyType.INVESTOR_COMPANY_VARIABLE9.name()),
    INVESTOR_COMPANY_TEXT_VARIABLE_10(Boolean.FALSE, 'investorCompanyTextVariable10', Enums.FieldDataType.TEXT.toString(), CommonPropertyType.INVESTOR_COMPANY_VARIABLE10.name()),
    INVESTOR_COMPANY_DATE_VARIABLE_1(Boolean.FALSE, 'investorCompanyDateVariable1', Enums.FieldDataType.DATE.toString()),
    INVESTOR_COMPANY_DATE_VARIABLE_2(Boolean.FALSE, 'investorCompanyDateVariable2', Enums.FieldDataType.DATE.toString()),
    INVESTOR_COMPANY_DATE_VARIABLE_3(Boolean.FALSE, 'investorCompanyDateVariable3', Enums.FieldDataType.DATE.toString()),
    INVESTOR_COMPANY_DATE_VARIABLE_4(Boolean.FALSE, 'investorCompanyDateVariable4', Enums.FieldDataType.DATE.toString()),

    NATIONALITY_APPROVAL(Boolean.FALSE, 'nationalityApproval', Enums.FieldDataType.TEXT.toString()),
    DECLARATION_APPROVAL(Boolean.FALSE, 'declarationApproval', Enums.FieldDataType.TEXT.toString()),
    NOTIFICATION_APPROVAL(Boolean.FALSE, 'notificationApproval', Enums.FieldDataType.TEXT.toString()),
    PROFILE_AUTHORIZATION_APPROVAL(Boolean.FALSE, 'profileAuthorizationApproval', Enums.FieldDataType.TEXT.toString()),
    SEEKING_APPROVAL(Boolean.FALSE, 'seekingApproval', Enums.FieldDataType.TEXT.toString()),
    SELF_CONFIRMATION(Boolean.FALSE, 'selfConfirmation', Enums.FieldDataType.TEXT.toString()),
    INVESTOR_EMPLOYMENT_HISTORY_DATE_VARIABLE_1(Boolean.FALSE, 'investorEmploymentDetailsDateVariable1', Enums.FieldDataType.DATE.toString()),
    INVESTOR_EMPLOYMENT_HISTORY_DATE_VARIABLE_2(Boolean.FALSE, 'investorEmploymentDetailsDateVariable2', Enums.FieldDataType.DATE.toString()),
    INVESTOR_EMPLOYMENT_HISTORY_DATE_VARIABLE_3(Boolean.FALSE, 'investorEmploymentDetailsDateVariable3', Enums.FieldDataType.DATE.toString()),
    INVESTOR_EMPLOYMENT_HISTORY_DATE_VARIABLE_4(Boolean.FALSE, 'investorEmploymentDetailsDateVariable4', Enums.FieldDataType.DATE.toString()),

    KARZA_LPG_ID(Boolean.FALSE, 'karzaLpgId', Enums.FieldDataType.TEXT.toString()),
    KARZA_ELECTRICITY_BILL(Boolean.FALSE, 'karzaElectricityBill', Enums.FieldDataType.TEXT.toString()),
    KARZA_ITRV_ACKNOWLEDGEMENT_NUMBER(Boolean.FALSE, 'karzaItrvAcknowledgementNumber', Enums.FieldDataType.TEXT.toString()),
    KARZA_COURT_COMPLEX(Boolean.FALSE, 'karzaCourtComplex', Enums.FieldDataType.TEXT.toString()),
    KARZA_UDYOG_ADHAR_NUMBER(Boolean.FALSE, 'karzaUdyogAdharNumber', Enums.FieldDataType.TEXT.toString()),
    KARZA_CASE_IDENTIFICATION_NUMBER(Boolean.FALSE, 'karzaCaseIdentificationNumber', Enums.FieldDataType.TEXT.toString()),
    KARZA_GST_NUMBER(Boolean.FALSE, 'karzaGstNumber', Enums.FieldDataType.TEXT.toString()),

    final private Boolean isShowOnly
    final private String onBoarding
    final private String type
    final private String commonPropertyName

    InvestorField(Boolean aBoolean, String onBoarding, String type, String commonPropertyName = null) {
        this.isShowOnly = aBoolean
        this.onBoarding = onBoarding
        this.type = type
        this.commonPropertyName = commonPropertyName
    }

    public getOnBoarding() {
        return this.onBoarding
    }

    public getCommonPropertyName() {
        return this.commonPropertyName
    }

    public getType() {
        return this.type
    }


    Object[] getArguments() {
        [] as Object[]
    }

    String[] getCodes() {
        ["${getClass().name}.${name()}"] as String[]
    }

    String getDefaultMessage() {
        name()
    }

    String getEnumValue() {
        return "com.crowdlending.enums.InvestorField.${this}"
    }

    public static List<InvestorField> forBasic() {
        return [FIRST_NAME,
                MIDDLE_NAME,
                LAST_NAME,
                SECOND_LAST_NAME,
                ALTERNATIVE_USERNAME,
                GENDER,
                MARITAL_STATUS,
                CONTACT_NO,
                ALTERNATIVE_NO,
                LANDLINE_NO,
                DATE_OF_BIRTH,
                PLACE_OF_BIRTH,
                REFERRAL_SOURCE,
                CATEGORY,
                /*AADHAAR_NO,*/
                IDENTITY_NUMBER_ONE,
                IDENTITY_NUMBER_TWO,
                REFERRAL_CODE,
                CAPTCHA,
                RELIGION_TYPE,
                CITIZENSHIP,
                VIRTUAL_ACCOUNT_NUMBER,
                VIRTUAL_ACCOUNT_BANK,
                VIRTUAL_ACCOUNT_NAME,
                CASTE_CATEGORY,
                IDENTITY_NUMBER_THREE,
                IDENTITY_NUMBER_FOUR,
                IDENTITY_NUMBER_FOUR_TYPE,
                IDENTITY_NUMBER_FIVE,
                IDENTITY_NUMBER_SIX,
                PERSON_WITH_DISABILITY,
                EMAIL_ADDRESS,
                PASSWORD,
                TITLE,
                FIRST_SCHOOL_NAME,
                IDENTITY_NUMBER_ONE_ISSUE_DATE,
                IDENTITY_NUMBER_TWO_ISSUE_DATE,
                IDENTITY_NUMBER_THREE_ISSUE_DATE,
                IDENTITY_NUMBER_FOUR_ISSUE_DATE,
                IDENTITY_NUMBER_FIVE_ISSUE_DATE,
                IDENTITY_NUMBER_SIX_ISSUE_DATE,
                CONFIRM_EMAIL_ADDRESS,
                INVESTOR_DETAIL_TEXT_VARIABLE_1,
                INVESTOR_DETAIL_TEXT_VARIABLE_2,
                INVESTOR_DETAIL_TEXT_VARIABLE_3,
                INVESTOR_DETAIL_TEXT_VARIABLE_4,
                INVESTOR_DETAIL_TEXT_VARIABLE_5,
                INVESTOR_DETAIL_TEXT_VARIABLE_6,
                INVESTOR_DETAIL_TEXT_VARIABLE_7,
                INVESTOR_DETAIL_TEXT_VARIABLE_8,
                INVESTOR_DETAIL_TEXT_VARIABLE_9,
                INVESTOR_DETAIL_TEXT_VARIABLE_10,
                INVESTOR_DETAIL_DATE_VARIABLE_1,
                INVESTOR_DETAIL_DATE_VARIABLE_2,
                INVESTOR_DETAIL_DATE_VARIABLE_3,
                INVESTOR_DETAIL_DATE_VARIABLE_4
        ]

    }

    public static List<InvestorField> forIndiviual() {
        return [
                PERSONAL_SIGNUP_ALLOWED,
                AMOUNT_TO_INVEST,
                INVESTMENT_PURPOSE,
                REQUIRED_INTEREST_RATE,
                /*PAN_CARD,*/
                EMPLOYEMENT_CATEGORY,
                GROSS_INCOME,
                INTEREST_INCOME,
                PERSONAL_ADDRESS,
                RESIDENCE_TYPE,
                EDUCATION_TYPE,
                EMPLOYER_TYPE,
                RESIDENT_OWNERSHIP_TYPE,
                DURATION_FOR_INVEST_AMOUNT,
                HOME_EXPENSES,
                TRANSPORTATION_EXPENSES,
                UTILITY_EXPENSES,
                ENTERTAINMENT_EXPENSES,
                CREDIT_CARD_EXPENSES,
                HOUSE_LOAN_EXPENSES,
                INSURANCE_EXPENSES,
                OTHER_EXPENSES,
                INVESTOR_PROFILE_TEXT_VARIABLE_1,
                INVESTOR_PROFILE_TEXT_VARIABLE_2,
                INVESTOR_PROFILE_TEXT_VARIABLE_3,
                INVESTOR_PROFILE_TEXT_VARIABLE_4,
                INVESTOR_PROFILE_TEXT_VARIABLE_5,
                INVESTOR_PROFILE_TEXT_VARIABLE_6,
                INVESTOR_PROFILE_TEXT_VARIABLE_7,
                INVESTOR_PROFILE_TEXT_VARIABLE_8,
                INVESTOR_PROFILE_TEXT_VARIABLE_9,
                INVESTOR_PROFILE_TEXT_VARIABLE_10,
                INVESTOR_PROFILE_DATE_VARIABLE_1,
                INVESTOR_PROFILE_DATE_VARIABLE_2,
                INVESTOR_PROFILE_DATE_VARIABLE_3,
                INVESTOR_PROFILE_DATE_VARIABLE_4
        ]
    }

    public static List<InvestorField> forCompany() {
        return [

                COMPANY_SIGNUP_ALLOWED,
                COMPANY_NAME,
                COMPANY_REGISTRATION_NUMBER,
                COMPANY_TURNOVER,
                COMPANY_BALANCE,
                DATE_OF_ARTICLES,
                COMPANY_ADDRESS,
                INDUSTRY_SERVING,
                COMPANY_DESCRIPTION,
                EMPLOYEES_COUNT,
                POSITION_IN_COMPANY,
                FAX_NO,
                COMPANY_BUSINESS_TYPE,
                COMPANY_IDENTITY_NUMBER_ONE,
                COMPANY_IDENTITY_NUMBER_TWO,
                COMPANY_IDENTITY_NUMBER_THREE,
                COMPANY_IDENTITY_NUMBER_FOUR,
                COMPANY_IDENTITY_NUMBER_FIVE,
                COMPANY_IDENTITY_NUMBER_SIX,
                COMPANY_BUSINESS_VINTAGE,
                COMPANY_IDENTITY_NUMBER_ONE_ISSUE_DATE,
                COMPANY_IDENTITY_NUMBER_TWO_ISSUE_DATE,
                COMPANY_IDENTITY_NUMBER_THREE_ISSUE_DATE,
                COMPANY_IDENTITY_NUMBER_FOUR_ISSUE_DATE,
                COMPANY_IDENTITY_NUMBER_FIVE_ISSUE_DATE,
                COMPANY_IDENTITY_NUMBER_SIX_ISSUE_DATE,
                INVESTOR_COMPANY_TEXT_VARIABLE_1,
                INVESTOR_COMPANY_TEXT_VARIABLE_2,
                INVESTOR_COMPANY_TEXT_VARIABLE_3,
                INVESTOR_COMPANY_TEXT_VARIABLE_4,
                INVESTOR_COMPANY_TEXT_VARIABLE_5,
                INVESTOR_COMPANY_TEXT_VARIABLE_6,
                INVESTOR_COMPANY_TEXT_VARIABLE_7,
                INVESTOR_COMPANY_TEXT_VARIABLE_8,
                INVESTOR_COMPANY_TEXT_VARIABLE_9,
                INVESTOR_COMPANY_TEXT_VARIABLE_10,
                INVESTOR_COMPANY_DATE_VARIABLE_1,
                INVESTOR_COMPANY_DATE_VARIABLE_2,
                INVESTOR_COMPANY_DATE_VARIABLE_3,
                INVESTOR_COMPANY_DATE_VARIABLE_4,
                COMPANY_CATEGORY
        ]
    }

    public static List<InvestorField> forEmployment() {
        return [
                SKIP_EMPLOYMENT_DETAILS_PAGE,
                EMPLOYMENT_DETAILS_SIGN_UP_ALLOWED,
                EMPLOYMENT_TYPE,
                ORGANIZATION_TYPE,
                ORGANIZATION_NAME,
                INVESTOR_EMPLOYMENT_DETAILS_TEXT_VARIABLE_1,
                INVESTOR_EMPLOYMENT_DETAILS_TEXT_VARIABLE_2,
                INVESTOR_EMPLOYMENT_DETAILS_TEXT_VARIABLE_3,
                INVESTOR_EMPLOYMENT_DETAILS_TEXT_VARIABLE_4,
                INVESTOR_EMPLOYMENT_DETAILS_TEXT_VARIABLE_5,
                INVESTOR_EMPLOYMENT_DETAILS_TEXT_VARIABLE_6,
                INVESTOR_EMPLOYMENT_DETAILS_TEXT_VARIABLE_7,
                INVESTOR_EMPLOYMENT_DETAILS_TEXT_VARIABLE_8,
                INVESTOR_EMPLOYMENT_DETAILS_TEXT_VARIABLE_9,
                INVESTOR_EMPLOYMENT_DETAILS_TEXT_VARIABLE_10,
                INVESTOR_EMPLOYMENT_HISTORY_DATE_VARIABLE_1,
                INVESTOR_EMPLOYMENT_HISTORY_DATE_VARIABLE_2,
                INVESTOR_EMPLOYMENT_HISTORY_DATE_VARIABLE_3,
                INVESTOR_EMPLOYMENT_HISTORY_DATE_VARIABLE_4
        ]
    }

    public static List<InvestorField> isNotOptional() {
        return [
                PASSWORD,
                COMPANY_NAME
        ]
    }

    static List<InvestorField> textVariableList(DomainName domainName) {
        switch (domainName) {
            case DomainName.INVESTOR_PROFILE:
                return [
                        INVESTOR_PROFILE_TEXT_VARIABLE_1,
                        INVESTOR_PROFILE_TEXT_VARIABLE_2,
                        INVESTOR_PROFILE_TEXT_VARIABLE_3,
                        INVESTOR_PROFILE_TEXT_VARIABLE_4,
                        INVESTOR_PROFILE_TEXT_VARIABLE_5,
                        INVESTOR_PROFILE_TEXT_VARIABLE_6,
                        INVESTOR_PROFILE_TEXT_VARIABLE_7,
                        INVESTOR_PROFILE_TEXT_VARIABLE_8,
                        INVESTOR_PROFILE_TEXT_VARIABLE_9,
                        INVESTOR_PROFILE_TEXT_VARIABLE_10
                ]
                break
            case DomainName.INVESTOR_COMPANY:
                return [
                        INVESTOR_COMPANY_TEXT_VARIABLE_1,
                        INVESTOR_COMPANY_TEXT_VARIABLE_2,
                        INVESTOR_COMPANY_TEXT_VARIABLE_3,
                        INVESTOR_COMPANY_TEXT_VARIABLE_4,
                        INVESTOR_COMPANY_TEXT_VARIABLE_5,
                        INVESTOR_COMPANY_TEXT_VARIABLE_6,
                        INVESTOR_COMPANY_TEXT_VARIABLE_7,
                        INVESTOR_COMPANY_TEXT_VARIABLE_8,
                        INVESTOR_COMPANY_TEXT_VARIABLE_9,
                        INVESTOR_COMPANY_TEXT_VARIABLE_10
                ]
                break
            case DomainName.INVESTOR_EMPLOYMENT_DETAILS:
                return [
                        INVESTOR_EMPLOYMENT_DETAILS_TEXT_VARIABLE_1,
                        INVESTOR_EMPLOYMENT_DETAILS_TEXT_VARIABLE_2,
                        INVESTOR_EMPLOYMENT_DETAILS_TEXT_VARIABLE_3,
                        INVESTOR_EMPLOYMENT_DETAILS_TEXT_VARIABLE_4,
                        INVESTOR_EMPLOYMENT_DETAILS_TEXT_VARIABLE_5,
                        INVESTOR_EMPLOYMENT_DETAILS_TEXT_VARIABLE_6,
                        INVESTOR_EMPLOYMENT_DETAILS_TEXT_VARIABLE_7,
                        INVESTOR_EMPLOYMENT_DETAILS_TEXT_VARIABLE_8,
                        INVESTOR_EMPLOYMENT_DETAILS_TEXT_VARIABLE_9,
                        INVESTOR_EMPLOYMENT_DETAILS_TEXT_VARIABLE_10
                ]
                break
            case DomainName.INVESTOR_DETAIL:
                return [
                        INVESTOR_DETAIL_TEXT_VARIABLE_1,
                        INVESTOR_DETAIL_TEXT_VARIABLE_2,
                        INVESTOR_DETAIL_TEXT_VARIABLE_3,
                        INVESTOR_DETAIL_TEXT_VARIABLE_4,
                        INVESTOR_DETAIL_TEXT_VARIABLE_5,
                        INVESTOR_DETAIL_TEXT_VARIABLE_6,
                        INVESTOR_DETAIL_TEXT_VARIABLE_7,
                        INVESTOR_DETAIL_TEXT_VARIABLE_8,
                        INVESTOR_DETAIL_TEXT_VARIABLE_9,
                        INVESTOR_DETAIL_TEXT_VARIABLE_10
                ]
                break
        }
    }

    static List<InvestorField> dateVariableList(DomainName domainName) {
        switch (domainName) {
            case DomainName.INVESTOR_PROFILE:
                return [
                        INVESTOR_PROFILE_DATE_VARIABLE_1,
                        INVESTOR_PROFILE_DATE_VARIABLE_2,
                        INVESTOR_PROFILE_DATE_VARIABLE_3,
                        INVESTOR_PROFILE_DATE_VARIABLE_4
                ]
                break
            case DomainName.INVESTOR_COMPANY:
                return [
                        INVESTOR_COMPANY_DATE_VARIABLE_1,
                        INVESTOR_COMPANY_DATE_VARIABLE_2,
                        INVESTOR_COMPANY_DATE_VARIABLE_3,
                        INVESTOR_COMPANY_DATE_VARIABLE_4
                ]
                break
            case DomainName.INVESTOR_DETAIL:
                return [
                        INVESTOR_DETAIL_DATE_VARIABLE_1,
                        INVESTOR_DETAIL_DATE_VARIABLE_2,
                        INVESTOR_DETAIL_DATE_VARIABLE_3,
                        INVESTOR_DETAIL_DATE_VARIABLE_4
                ]
                break case DomainName.INVESTOR_EMPLOYMENT_DETAILS:
                return [
                        INVESTOR_EMPLOYMENT_HISTORY_DATE_VARIABLE_1,
                        INVESTOR_EMPLOYMENT_HISTORY_DATE_VARIABLE_2,
                        INVESTOR_EMPLOYMENT_HISTORY_DATE_VARIABLE_3,
                        INVESTOR_EMPLOYMENT_HISTORY_DATE_VARIABLE_4
                ]
                break
        }
    }

    public static List<InvestorField> forApproval() {
        return [
                NATIONALITY_APPROVAL,
                DECLARATION_APPROVAL,
                NOTIFICATION_APPROVAL,
                PROFILE_AUTHORIZATION_APPROVAL,
                SEEKING_APPROVAL,
                SELF_CONFIRMATION
        ]
    }

    String toEmailSmsVar() {
        return ('###' + this.name() + '###')
    }

    static List<InvestorField> allInvestorDateTypeFields() {
        return [
                DATE_OF_BIRTH,
                DATE_OF_ARTICLES,
                COMPANY_IDENTITY_NUMBER_ONE_ISSUE_DATE,
                COMPANY_IDENTITY_NUMBER_TWO_ISSUE_DATE,
                COMPANY_IDENTITY_NUMBER_THREE_ISSUE_DATE,
                COMPANY_IDENTITY_NUMBER_FOUR_ISSUE_DATE,
                COMPANY_IDENTITY_NUMBER_FIVE_ISSUE_DATE,
                COMPANY_IDENTITY_NUMBER_SIX_ISSUE_DATE,
                IDENTITY_NUMBER_ONE_ISSUE_DATE,
                IDENTITY_NUMBER_TWO_ISSUE_DATE,
                IDENTITY_NUMBER_THREE_ISSUE_DATE,
                IDENTITY_NUMBER_FOUR_ISSUE_DATE,
                IDENTITY_NUMBER_FIVE_ISSUE_DATE,
                IDENTITY_NUMBER_SIX_ISSUE_DATE,
                INVESTOR_DETAIL_DATE_VARIABLE_1,
                INVESTOR_DETAIL_DATE_VARIABLE_2,
                INVESTOR_DETAIL_DATE_VARIABLE_3,
                INVESTOR_DETAIL_DATE_VARIABLE_4,
                INVESTOR_PROFILE_DATE_VARIABLE_1,
                INVESTOR_PROFILE_DATE_VARIABLE_2,
                INVESTOR_PROFILE_DATE_VARIABLE_3,
                INVESTOR_PROFILE_DATE_VARIABLE_4,
                INVESTOR_COMPANY_DATE_VARIABLE_1,
                INVESTOR_COMPANY_DATE_VARIABLE_2,
                INVESTOR_COMPANY_DATE_VARIABLE_3,
                INVESTOR_COMPANY_DATE_VARIABLE_4,
                INVESTOR_EMPLOYMENT_HISTORY_DATE_VARIABLE_1,
                INVESTOR_EMPLOYMENT_HISTORY_DATE_VARIABLE_2,
                INVESTOR_EMPLOYMENT_HISTORY_DATE_VARIABLE_3,
                INVESTOR_EMPLOYMENT_HISTORY_DATE_VARIABLE_4
        ]
    }

    static List<InvestorField> investorIdentityNumberFieldList() {
        return [
                IDENTITY_NUMBER_ONE,
                IDENTITY_NUMBER_TWO,
                IDENTITY_NUMBER_THREE,
                IDENTITY_NUMBER_FOUR,
                IDENTITY_NUMBER_FIVE,
                IDENTITY_NUMBER_SIX,
                COMPANY_IDENTITY_NUMBER_ONE,
                COMPANY_IDENTITY_NUMBER_TWO,
                COMPANY_IDENTITY_NUMBER_THREE,
                COMPANY_IDENTITY_NUMBER_FOUR,
                COMPANY_IDENTITY_NUMBER_FIVE,
                COMPANY_IDENTITY_NUMBER_SIX,
        ]
    }

    public static List<InvestorField> karzaFields() {
        return [
                KARZA_LPG_ID,
                KARZA_ELECTRICITY_BILL,
                KARZA_ITRV_ACKNOWLEDGEMENT_NUMBER,
                KARZA_COURT_COMPLEX,
                KARZA_UDYOG_ADHAR_NUMBER,
                KARZA_CASE_IDENTIFICATION_NUMBER,
                KARZA_GST_NUMBER
        ]
    }

}