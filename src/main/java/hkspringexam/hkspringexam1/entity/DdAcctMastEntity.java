package hkspringexam.hkspringexam1.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;

@Entity(name = "dd_acct_mast")
@IdClass(hkspringexam.hkspringexam1.entity.DdAcctMastEntityPK.class)
public class DdAcctMastEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @javax.persistence.Column(name = "legal_entity")
    private String legalEntity;

    public String getLegalEntity() {
        return legalEntity;
    }

    public void setLegalEntity(String legalEntity) {
        this.legalEntity = legalEntity;
    }

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @javax.persistence.Column(name = "dd_ac_id")
    private BigDecimal ddAcId;

    public BigDecimal getDdAcId() {
        return ddAcId;
    }

    public void setDdAcId(BigDecimal ddAcId) {
        this.ddAcId = ddAcId;
    }

    @Basic
    @Column(name = "opn_br_no")
    private String opnBrNo;

    public String getOpnBrNo() {
        return opnBrNo;
    }

    public void setOpnBrNo(String opnBrNo) {
        this.opnBrNo = opnBrNo;
    }

    @Basic
    @Column(name = "prdt_no")
    private String prdtNo;

    public String getPrdtNo() {
        return prdtNo;
    }

    public void setPrdtNo(String prdtNo) {
        this.prdtNo = prdtNo;
    }

    @Basic
    @Column(name = "cur_code")
    private String curCode;

    public String getCurCode() {
        return curCode;
    }

    public void setCurCode(String curCode) {
        this.curCode = curCode;
    }

    @Basic
    @Column(name = "ac_name")
    private String acName;

    public String getAcName() {
        return acName;
    }

    public void setAcName(String acName) {
        this.acName = acName;
    }

    @Basic
    @Column(name = "bal_dc_flag")
    private String balDcFlag;

    public String getBalDcFlag() {
        return balDcFlag;
    }

    public void setBalDcFlag(String balDcFlag) {
        this.balDcFlag = balDcFlag;
    }

    @Basic
    @Column(name = "bal_dc_direct")
    private String balDcDirect;

    public String getBalDcDirect() {
        return balDcDirect;
    }

    public void setBalDcDirect(String balDcDirect) {
        this.balDcDirect = balDcDirect;
    }

    @Basic
    @Column(name = "curr_bal")
    private BigDecimal currBal;

    public BigDecimal getCurrBal() {
        return currBal;
    }

    public void setCurrBal(BigDecimal currBal) {
        this.currBal = currBal;
    }

    @Basic
    @Column(name = "bal_limit")
    private BigDecimal balLimit;

    public BigDecimal getBalLimit() {
        return balLimit;
    }

    public void setBalLimit(BigDecimal balLimit) {
        this.balLimit = balLimit;
    }

    @Basic
    @Column(name = "hold_bal")
    private BigDecimal holdBal;

    public BigDecimal getHoldBal() {
        return holdBal;
    }

    public void setHoldBal(BigDecimal holdBal) {
        this.holdBal = holdBal;
    }

    @Basic
    @Column(name = "sweep_hold_bal")
    private BigDecimal sweepHoldBal;

    public BigDecimal getSweepHoldBal() {
        return sweepHoldBal;
    }

    public void setSweepHoldBal(BigDecimal sweepHoldBal) {
        this.sweepHoldBal = sweepHoldBal;
    }

    @Basic
    @Column(name = "overdraw_bal")
    private BigDecimal overdrawBal;

    public BigDecimal getOverdrawBal() {
        return overdrawBal;
    }

    public void setOverdrawBal(BigDecimal overdrawBal) {
        this.overdrawBal = overdrawBal;
    }

    @Basic
    @Column(name = "cls_cap_amt")
    private BigDecimal clsCapAmt;

    public BigDecimal getClsCapAmt() {
        return clsCapAmt;
    }

    public void setClsCapAmt(BigDecimal clsCapAmt) {
        this.clsCapAmt = clsCapAmt;
    }

    @Basic
    @Column(name = "od_cls_cap_amt")
    private BigDecimal odClsCapAmt;

    public BigDecimal getOdClsCapAmt() {
        return odClsCapAmt;
    }

    public void setOdClsCapAmt(BigDecimal odClsCapAmt) {
        this.odClsCapAmt = odClsCapAmt;
    }

    @Basic
    @Column(name = "opn_date")
    private BigDecimal opnDate;

    public BigDecimal getOpnDate() {
        return opnDate;
    }

    public void setOpnDate(BigDecimal opnDate) {
        this.opnDate = opnDate;
    }

    @Basic
    @Column(name = "ac_level")
    private String acLevel;

    public String getAcLevel() {
        return acLevel;
    }

    public void setAcLevel(String acLevel) {
        this.acLevel = acLevel;
    }

    @Basic
    @Column(name = "ac_nature_flag")
    private String acNatureFlag;

    public String getAcNatureFlag() {
        return acNatureFlag;
    }

    public void setAcNatureFlag(String acNatureFlag) {
        this.acNatureFlag = acNatureFlag;
    }

    @Basic
    @Column(name = "ac_sts")
    private String acSts;

    public String getAcSts() {
        return acSts;
    }

    public void setAcSts(String acSts) {
        this.acSts = acSts;
    }

    @Basic
    @Column(name = "dormant_sts")
    private String dormantSts;

    public String getDormantSts() {
        return dormantSts;
    }

    public void setDormantSts(String dormantSts) {
        this.dormantSts = dormantSts;
    }

    @Basic
    @Column(name = "hold_sts")
    private String holdSts;

    public String getHoldSts() {
        return holdSts;
    }

    public void setHoldSts(String holdSts) {
        this.holdSts = holdSts;
    }

    @Basic
    @Column(name = "draw_flag")
    private String drawFlag;

    public String getDrawFlag() {
        return drawFlag;
    }

    public void setDrawFlag(String drawFlag) {
        this.drawFlag = drawFlag;
    }

    @Basic
    @Column(name = "draw_part_flag")
    private String drawPartFlag;

    public String getDrawPartFlag() {
        return drawPartFlag;
    }

    public void setDrawPartFlag(String drawPartFlag) {
        this.drawPartFlag = drawPartFlag;
    }

    @Basic
    @Column(name = "draw_max_times")
    private BigDecimal drawMaxTimes;

    public BigDecimal getDrawMaxTimes() {
        return drawMaxTimes;
    }

    public void setDrawMaxTimes(BigDecimal drawMaxTimes) {
        this.drawMaxTimes = drawMaxTimes;
    }

    @Basic
    @Column(name = "draw_times")
    private BigDecimal drawTimes;

    public BigDecimal getDrawTimes() {
        return drawTimes;
    }

    public void setDrawTimes(BigDecimal drawTimes) {
        this.drawTimes = drawTimes;
    }

    @Basic
    @Column(name = "draw_fund_flag")
    private String drawFundFlag;

    public String getDrawFundFlag() {
        return drawFundFlag;
    }

    public void setDrawFundFlag(String drawFundFlag) {
        this.drawFundFlag = drawFundFlag;
    }

    @Basic
    @Column(name = "universal_draw_flag")
    private String universalDrawFlag;

    public String getUniversalDrawFlag() {
        return universalDrawFlag;
    }

    public void setUniversalDrawFlag(String universalDrawFlag) {
        this.universalDrawFlag = universalDrawFlag;
    }

    @Basic
    @Column(name = "universal_draw_area")
    private String universalDrawArea;

    public String getUniversalDrawArea() {
        return universalDrawArea;
    }

    public void setUniversalDrawArea(String universalDrawArea) {
        this.universalDrawArea = universalDrawArea;
    }

    @Basic
    @Column(name = "universal_depo_flag")
    private String universalDepoFlag;

    public String getUniversalDepoFlag() {
        return universalDepoFlag;
    }

    public void setUniversalDepoFlag(String universalDepoFlag) {
        this.universalDepoFlag = universalDepoFlag;
    }

    @Basic
    @Column(name = "universal_depo_area")
    private String universalDepoArea;

    public String getUniversalDepoArea() {
        return universalDepoArea;
    }

    public void setUniversalDepoArea(String universalDepoArea) {
        this.universalDepoArea = universalDepoArea;
    }

    @Basic
    @Column(name = "universal_cls_flag")
    private String universalClsFlag;

    public String getUniversalClsFlag() {
        return universalClsFlag;
    }

    public void setUniversalClsFlag(String universalClsFlag) {
        this.universalClsFlag = universalClsFlag;
    }

    @Basic
    @Column(name = "universal_cls_area")
    private String universalClsArea;

    public String getUniversalClsArea() {
        return universalClsArea;
    }

    public void setUniversalClsArea(String universalClsArea) {
        this.universalClsArea = universalClsArea;
    }

    @Basic
    @Column(name = "tax_flag")
    private String taxFlag;

    public String getTaxFlag() {
        return taxFlag;
    }

    public void setTaxFlag(String taxFlag) {
        this.taxFlag = taxFlag;
    }

    @Basic
    @Column(name = "sweep_in_flag")
    private String sweepInFlag;

    public String getSweepInFlag() {
        return sweepInFlag;
    }

    public void setSweepInFlag(String sweepInFlag) {
        this.sweepInFlag = sweepInFlag;
    }

    @Basic
    @Column(name = "sweep_out_flag")
    private String sweepOutFlag;

    public String getSweepOutFlag() {
        return sweepOutFlag;
    }

    public void setSweepOutFlag(String sweepOutFlag) {
        this.sweepOutFlag = sweepOutFlag;
    }

    @Basic
    @Column(name = "odtt_flag")
    private String odttFlag;

    public String getOdttFlag() {
        return odttFlag;
    }

    public void setOdttFlag(String odttFlag) {
        this.odttFlag = odttFlag;
    }

    @Basic
    @Column(name = "dormant_flag")
    private String dormantFlag;

    public String getDormantFlag() {
        return dormantFlag;
    }

    public void setDormantFlag(String dormantFlag) {
        this.dormantFlag = dormantFlag;
    }

    @Basic
    @Column(name = "sttl_flag")
    private String sttlFlag;

    public String getSttlFlag() {
        return sttlFlag;
    }

    public void setSttlFlag(String sttlFlag) {
        this.sttlFlag = sttlFlag;
    }

    @Basic
    @Column(name = "book_flag")
    private String bookFlag;

    public String getBookFlag() {
        return bookFlag;
    }

    public void setBookFlag(String bookFlag) {
        this.bookFlag = bookFlag;
    }

    @Basic
    @Column(name = "fund_type")
    private String fundType;

    public String getFundType() {
        return fundType;
    }

    public void setFundType(String fundType) {
        this.fundType = fundType;
    }

    @Basic
    @Column(name = "overdraw_flag")
    private String overdrawFlag;

    public String getOverdrawFlag() {
        return overdrawFlag;
    }

    public void setOverdrawFlag(String overdrawFlag) {
        this.overdrawFlag = overdrawFlag;
    }

    @Basic
    @Column(name = "overdraw_lmt")
    private BigDecimal overdrawLmt;

    public BigDecimal getOverdrawLmt() {
        return overdrawLmt;
    }

    public void setOverdrawLmt(BigDecimal overdrawLmt) {
        this.overdrawLmt = overdrawLmt;
    }

    @Basic
    @Column(name = "ac_attr_flag")
    private String acAttrFlag;

    public String getAcAttrFlag() {
        return acAttrFlag;
    }

    public void setAcAttrFlag(String acAttrFlag) {
        this.acAttrFlag = acAttrFlag;
    }

    @Basic
    @Column(name = "chrg_pkg_no")
    private String chrgPkgNo;

    public String getChrgPkgNo() {
        return chrgPkgNo;
    }

    public void setChrgPkgNo(String chrgPkgNo) {
        this.chrgPkgNo = chrgPkgNo;
    }

    @Basic
    @Column(name = "ac_cnt")
    private BigDecimal acCnt;

    public BigDecimal getAcCnt() {
        return acCnt;
    }

    public void setAcCnt(BigDecimal acCnt) {
        this.acCnt = acCnt;
    }

    @Basic
    @Column(name = "cust_id")
    private BigDecimal custId;

    public BigDecimal getCustId() {
        return custId;
    }

    public void setCustId(BigDecimal custId) {
        this.custId = custId;
    }

    @Basic
    @Column(name = "upd_cnt")
    private BigDecimal updCnt;

    public BigDecimal getUpdCnt() {
        return updCnt;
    }

    public void setUpdCnt(BigDecimal updCnt) {
        this.updCnt = updCnt;
    }

    @Basic
    @Column(name = "upd_time")
    private Timestamp updTime;

    public Timestamp getUpdTime() {
        return updTime;
    }

    public void setUpdTime(Timestamp updTime) {
        this.updTime = updTime;
    }

    @Basic
    @Column(name = "mac")
    private String mac;

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    @Basic
    @Column(name = "vpd_entity")
    private BigDecimal vpdEntity;

    public BigDecimal getVpdEntity() {
        return vpdEntity;
    }

    public void setVpdEntity(BigDecimal vpdEntity) {
        this.vpdEntity = vpdEntity;
    }

    @Basic
    @Column(name = "opn_amt")
    private BigDecimal opnAmt;

    public BigDecimal getOpnAmt() {
        return opnAmt;
    }

    public void setOpnAmt(BigDecimal opnAmt) {
        this.opnAmt = opnAmt;
    }

    @Basic
    @Column(name = "opn_channel")
    private String opnChannel;

    public String getOpnChannel() {
        return opnChannel;
    }

    public void setOpnChannel(String opnChannel) {
        this.opnChannel = opnChannel;
    }

    @Basic
    @Column(name = "dd_cancel_flag")
    private String ddCancelFlag;

    public String getDdCancelFlag() {
        return ddCancelFlag;
    }

    public void setDdCancelFlag(String ddCancelFlag) {
        this.ddCancelFlag = ddCancelFlag;
    }

    @Basic
    @Column(name = "dd_cancel_dc_ind")
    private String ddCancelDcInd;

    public String getDdCancelDcInd() {
        return ddCancelDcInd;
    }

    public void setDdCancelDcInd(String ddCancelDcInd) {
        this.ddCancelDcInd = ddCancelDcInd;
    }

    @Basic
    @Column(name = "opn_teller_no")
    private String opnTellerNo;

    public String getOpnTellerNo() {
        return opnTellerNo;
    }

    public void setOpnTellerNo(String opnTellerNo) {
        this.opnTellerNo = opnTellerNo;
    }

    @Basic
    @Column(name = "cls_amt")
    private BigDecimal clsAmt;

    public BigDecimal getClsAmt() {
        return clsAmt;
    }

    public void setClsAmt(BigDecimal clsAmt) {
        this.clsAmt = clsAmt;
    }

    @Basic
    @Column(name = "cls_channel")
    private String clsChannel;

    public String getClsChannel() {
        return clsChannel;
    }

    public void setClsChannel(String clsChannel) {
        this.clsChannel = clsChannel;
    }

    @Basic
    @Column(name = "cls_teller_no")
    private String clsTellerNo;

    public String getClsTellerNo() {
        return clsTellerNo;
    }

    public void setClsTellerNo(String clsTellerNo) {
        this.clsTellerNo = clsTellerNo;
    }

    @Basic
    @Column(name = "cls_date")
    private BigDecimal clsDate;

    public BigDecimal getClsDate() {
        return clsDate;
    }

    public void setClsDate(BigDecimal clsDate) {
        this.clsDate = clsDate;
    }

    @Basic
    @Column(name = "manual_trance_flag")
    private String manualTranceFlag;

    public String getManualTranceFlag() {
        return manualTranceFlag;
    }

    public void setManualTranceFlag(String manualTranceFlag) {
        this.manualTranceFlag = manualTranceFlag;
    }

    @Basic
    @Column(name = "nature_type")
    private String natureType;

    public String getNatureType() {
        return natureType;
    }

    public void setNatureType(String natureType) {
        this.natureType = natureType;
    }

    @Basic
    @Column(name = "draw_order")
    private String drawOrder;

    public String getDrawOrder() {
        return drawOrder;
    }

    public void setDrawOrder(String drawOrder) {
        this.drawOrder = drawOrder;
    }

    @Basic
    @Column(name = "acct_class")
    private String acctClass;

    public String getAcctClass() {
        return acctClass;
    }

    public void setAcctClass(String acctClass) {
        this.acctClass = acctClass;
    }

    @Basic
    @Column(name = "ctrl_attr")
    private String ctrlAttr;

    public String getCtrlAttr() {
        return ctrlAttr;
    }

    public void setCtrlAttr(String ctrlAttr) {
        this.ctrlAttr = ctrlAttr;
    }

    @Basic
    @Column(name = "free_trade_type")
    private String freeTradeType;

    public String getFreeTradeType() {
        return freeTradeType;
    }

    public void setFreeTradeType(String freeTradeType) {
        this.freeTradeType = freeTradeType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DdAcctMastEntity that = (DdAcctMastEntity) o;
        return Objects.equals(legalEntity, that.legalEntity) && Objects.equals(ddAcId, that.ddAcId) && Objects.equals(opnBrNo, that.opnBrNo) && Objects.equals(prdtNo, that.prdtNo) && Objects.equals(curCode, that.curCode) && Objects.equals(acName, that.acName) && Objects.equals(balDcFlag, that.balDcFlag) && Objects.equals(balDcDirect, that.balDcDirect) && Objects.equals(currBal, that.currBal) && Objects.equals(balLimit, that.balLimit) && Objects.equals(holdBal, that.holdBal) && Objects.equals(sweepHoldBal, that.sweepHoldBal) && Objects.equals(overdrawBal, that.overdrawBal) && Objects.equals(clsCapAmt, that.clsCapAmt) && Objects.equals(odClsCapAmt, that.odClsCapAmt) && Objects.equals(opnDate, that.opnDate) && Objects.equals(acLevel, that.acLevel) && Objects.equals(acNatureFlag, that.acNatureFlag) && Objects.equals(acSts, that.acSts) && Objects.equals(dormantSts, that.dormantSts) && Objects.equals(holdSts, that.holdSts) && Objects.equals(drawFlag, that.drawFlag) && Objects.equals(drawPartFlag, that.drawPartFlag) && Objects.equals(drawMaxTimes, that.drawMaxTimes) && Objects.equals(drawTimes, that.drawTimes) && Objects.equals(drawFundFlag, that.drawFundFlag) && Objects.equals(universalDrawFlag, that.universalDrawFlag) && Objects.equals(universalDrawArea, that.universalDrawArea) && Objects.equals(universalDepoFlag, that.universalDepoFlag) && Objects.equals(universalDepoArea, that.universalDepoArea) && Objects.equals(universalClsFlag, that.universalClsFlag) && Objects.equals(universalClsArea, that.universalClsArea) && Objects.equals(taxFlag, that.taxFlag) && Objects.equals(sweepInFlag, that.sweepInFlag) && Objects.equals(sweepOutFlag, that.sweepOutFlag) && Objects.equals(odttFlag, that.odttFlag) && Objects.equals(dormantFlag, that.dormantFlag) && Objects.equals(sttlFlag, that.sttlFlag) && Objects.equals(bookFlag, that.bookFlag) && Objects.equals(fundType, that.fundType) && Objects.equals(overdrawFlag, that.overdrawFlag) && Objects.equals(overdrawLmt, that.overdrawLmt) && Objects.equals(acAttrFlag, that.acAttrFlag) && Objects.equals(chrgPkgNo, that.chrgPkgNo) && Objects.equals(acCnt, that.acCnt) && Objects.equals(custId, that.custId) && Objects.equals(updCnt, that.updCnt) && Objects.equals(updTime, that.updTime) && Objects.equals(mac, that.mac) && Objects.equals(vpdEntity, that.vpdEntity) && Objects.equals(opnAmt, that.opnAmt) && Objects.equals(opnChannel, that.opnChannel) && Objects.equals(ddCancelFlag, that.ddCancelFlag) && Objects.equals(ddCancelDcInd, that.ddCancelDcInd) && Objects.equals(opnTellerNo, that.opnTellerNo) && Objects.equals(clsAmt, that.clsAmt) && Objects.equals(clsChannel, that.clsChannel) && Objects.equals(clsTellerNo, that.clsTellerNo) && Objects.equals(clsDate, that.clsDate) && Objects.equals(manualTranceFlag, that.manualTranceFlag) && Objects.equals(natureType, that.natureType) && Objects.equals(drawOrder, that.drawOrder) && Objects.equals(acctClass, that.acctClass) && Objects.equals(ctrlAttr, that.ctrlAttr) && Objects.equals(freeTradeType, that.freeTradeType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(legalEntity, ddAcId, opnBrNo, prdtNo, curCode, acName, balDcFlag, balDcDirect, currBal, balLimit, holdBal, sweepHoldBal, overdrawBal, clsCapAmt, odClsCapAmt, opnDate, acLevel, acNatureFlag, acSts, dormantSts, holdSts, drawFlag, drawPartFlag, drawMaxTimes, drawTimes, drawFundFlag, universalDrawFlag, universalDrawArea, universalDepoFlag, universalDepoArea, universalClsFlag, universalClsArea, taxFlag, sweepInFlag, sweepOutFlag, odttFlag, dormantFlag, sttlFlag, bookFlag, fundType, overdrawFlag, overdrawLmt, acAttrFlag, chrgPkgNo, acCnt, custId, updCnt, updTime, mac, vpdEntity, opnAmt, opnChannel, ddCancelFlag, ddCancelDcInd, opnTellerNo, clsAmt, clsChannel, clsTellerNo, clsDate, manualTranceFlag, natureType, drawOrder, acctClass, ctrlAttr, freeTradeType);
    }
}
