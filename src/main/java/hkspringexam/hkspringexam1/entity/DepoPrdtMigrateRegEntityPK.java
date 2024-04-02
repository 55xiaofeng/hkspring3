package hkspringexam.hkspringexam1.entity;

import lombok.Data;

import javax.persistence.Basic;
import javax.persistence.Column;
import java.io.Serializable;
@Data
public class DepoPrdtMigrateRegEntityPK implements Serializable {
    @Basic
    @Column(name = "legal_entity")
    private String legalEntity;
    @Basic
    @Column(name = "prdt_no")
    private String prdtNo;
    @Basic
    @Column(name = "out_br_no")
    private String outBrNo;
    @Basic
    @Column(name = "in_br_no")
    private String inBrNo;
}
