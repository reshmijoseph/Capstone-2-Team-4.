package com.techelevator.tenmo.model;

import java.math.BigDecimal;

public class Transfers {
    private Long transferID;
    private Long transferTypeID;
    private Long transferStatusID;
    private Long accountFrom;
    private Long accountTo;
    private BigDecimal amount;

    private String userTo;
    private String userFrom;
    public String getUserTo() {
        return userTo;
    }

    public void setUserTo(String userTo) {
        this.userTo = userTo;
    }
    public String getUserFrom() {
        return userFrom;
    }

    public void setUserFrom(String userFrom) {
        this.userFrom = userFrom;
    }

    public Long getTransferID() {
        return transferID;
    }
    public void setTransferID(long transferID) {
        this.transferID = transferID;
    }

    public Long getTransferTypeID() {
        return transferTypeID;
    }

    public void setTransferTypeID(long transferTypeID) {
        this.transferTypeID = transferTypeID;
    }

    public Long getTransferStatusID() {
        return transferStatusID;
    }

    public void setTransferStatusID(long transferStatusID){
        this.transferStatusID = transferStatusID;
    }

    public Long getAccountFrom() {
        return accountFrom;
    }

    public void setAccountFrom(long accountFrom) {
        this.accountFrom = accountFrom;
    }

    public Long getAccountTo() {
        return accountTo;
    }

    public void setAccountTo(long accountTo) {
        this.accountTo = accountTo;
    }

    public BigDecimal getAmount() {
        return amount;
    }
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}
