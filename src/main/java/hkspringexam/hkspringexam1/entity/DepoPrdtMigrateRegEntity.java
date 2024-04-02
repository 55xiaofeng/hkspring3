package hkspringexam.hkspringexam1.entity;

import javax.persistence.*;
import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.Objects;

@Entity(name = "depo_prdt_migrate_reg")
@IdClass(hkspringexam.hkspringexam1.entity.DepoPrdtMigrateRegEntityPK.class)
public class DepoPrdtMigrateRegEntity {
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
    @javax.persistence.Column(name = "prdt_no")
    private String prdtNo;

    public String getPrdtNo() {
        return prdtNo;
    }

    public void setPrdtNo(String prdtNo) {
        this.prdtNo = prdtNo;
    }

    @Basic
    @Column(name = "prdt_module_code")
    private String prdtModuleCode;

    public String getPrdtModuleCode() {
        return prdtModuleCode;
    }

    public void setPrdtModuleCode(String prdtModuleCode) {
        this.prdtModuleCode = prdtModuleCode;
    }

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "out_br_no")
    private String outBrNo;

    public String getOutBrNo() {
        return outBrNo;
    }

    public void setOutBrNo(String outBrNo) {
        this.outBrNo = outBrNo;
    }

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "in_br_no")
    private String inBrNo;

    public String getInBrNo() {
        return inBrNo;
    }

    public void setInBrNo(String inBrNo) {
        this.inBrNo = inBrNo;
    }

    @Basic
    @Column(name = "is_effective")
    private String isEffective;

    public String getIsEffective() {
        return isEffective;
    }

    public void setIsEffective(String isEffective) {
        this.isEffective = isEffective;
    }

    @Basic
    @Column(name = "teller_no")
    private String tellerNo;

    public String getTellerNo() {
        return tellerNo;
    }

    public void setTellerNo(String tellerNo) {
        this.tellerNo = tellerNo;
    }

    @Basic
    @Column(name = "checker_no")
    private String checkerNo;

    public String getCheckerNo() {
        return checkerNo;
    }

    public void setCheckerNo(String checkerNo) {
        this.checkerNo = checkerNo;
    }

    @Basic
    @Column(name = "auther_no")
    private String autherNo;

    public String getAutherNo() {
        return autherNo;
    }

    public void setAutherNo(String autherNo) {
        this.autherNo = autherNo;
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
    private BigInteger vpdEntity;

    public BigInteger getVpdEntity() {
        return vpdEntity;
    }

    public void setVpdEntity(BigInteger vpdEntity) {
        this.vpdEntity = vpdEntity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DepoPrdtMigrateRegEntity that = (DepoPrdtMigrateRegEntity) o;
        return Objects.equals(legalEntity, that.legalEntity) && Objects.equals(prdtNo, that.prdtNo) && Objects.equals(prdtModuleCode, that.prdtModuleCode) && Objects.equals(outBrNo, that.outBrNo) && Objects.equals(inBrNo, that.inBrNo) && Objects.equals(isEffective, that.isEffective) && Objects.equals(tellerNo, that.tellerNo) && Objects.equals(checkerNo, that.checkerNo) && Objects.equals(autherNo, that.autherNo) && Objects.equals(updTime, that.updTime) && Objects.equals(mac, that.mac) && Objects.equals(vpdEntity, that.vpdEntity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(legalEntity, prdtNo, prdtModuleCode, outBrNo, inBrNo, isEffective, tellerNo, checkerNo, autherNo, updTime, mac, vpdEntity);
    }
}
