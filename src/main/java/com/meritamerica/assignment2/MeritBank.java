package com.meritamerica.assignment2;


public class MeritBank {
    private static int numOfAccountHolder = 0;
    private static long nextAccountNumber = 1;
    private static AccountHolder[] accountHolderArray = new AccountHolder[0];
    private static CDOffering[] cdOffering = new CDOffering[5];
    private static double totalValue = 0;


    static void addAccountHolder(AccountHolder accountHolder) {
        AccountHolder[] tempAccHolder = new AccountHolder[accountHolderArray.length+1];
        for(int i = 0; i < accountHolderArray.length; i++) {
            tempAccHolder[i] = accountHolderArray[i];
        }
        tempAccHolder[numOfAccountHolder] = accountHolder;
        accountHolderArray = tempAccHolder;
        numOfAccountHolder++;
    }

    static AccountHolder[] getAccountHolders() {
        return accountHolderArray;
    }


    static CDOffering[] getCDOfferings() {
        return cdOffering;
    }

  t offering
    static CDOffering getBestCDOffering(double depositAmount) {
        CDOffering temp = cdOffering[0];
        for (int x = 1; x < cdOffering.length; x++) {
            if (futureValue(depositAmount, cdOffering[x-1].getInterestRate(), cdOffering[x-1].getTerm())
                    < futureValue(depositAmount, cdOffering[x].getInterestRate(), cdOffering[x].getTerm())) {
                temp = cdOffering[x];
            }
        }
        return temp;
    }


    static CDOffering getSecondBestCDOffering(double depositAmount) {
        CDOffering temp = cdOffering[0];
        CDOffering temp2 = cdOffering[0];
        for (int x = 1; x < cdOffering.length; x++) {
            if (futureValue(depositAmount, cdOffering[x-1].getInterestRate(), cdOffering[x-1].getTerm())
                    < futureValue(depositAmount, cdOffering[x].getInterestRate(), cdOffering[x].getTerm())) {
                temp2 = temp;
                temp = cdOffering[x];
            }
        }
        return temp2;
    }

    //clears the offering array
    static void clearCDOfferings() {
        cdOffering = null;
    }

    //setter for the offering array
    static void setCDOfferings(CDOffering[] offerings) {
        cdOffering = offerings;
    }


    static long getNextAccountNumber() {
        return nextAccountNumber++;
    }


    static double totalBalances() {
        for(AccountHolder x : accountHolderArray) {
            totalValue += x.getCombinedBalance();
        }
        return totalValue;
    }

   
    static double futureValue(double presentValue, double interestRate, int term) {
        return (presentValue * (Math.pow((1 + interestRate), term)));
    }



}
