package com.crowdlending.util

import com.crowdlending.model.mongo.LoanRepaymentMetaData

class InstanceUtil {

    static LoanRepaymentMetaData createLoanRepaymentMetaDataVOInstance() {
        try {
            Class cls = Class.forName("com.crowdlending.model.mongo.LoanRepaymentMetaData")
            return (LoanRepaymentMetaData) cls.newInstance()
        } catch (Exception ex) {
            ex.printStackTrace()
            return null
        }
    }

    static <T> T createInstance(String name, T type) {
        try {
            Class cls = Class.forName(name)
            return (T) cls.newInstance()
        } catch (Exception ex) {
            ex.printStackTrace()
            return null
        }
    }

    static def createInstance(String name) {
        try {
            Class cls = Class.forName(name)
            return cls.newInstance()
        } catch (Exception ex) {
            ex.printStackTrace()
            return null
        }
    }
}