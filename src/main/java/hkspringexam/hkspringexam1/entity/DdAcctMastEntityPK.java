package hkspringexam.hkspringexam1.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import java.io.Serializable;
import java.math.BigDecimal;

public class DdAcctMastEntityPK implements Serializable {
    @Basic
    @Column(name = "legal_entity")
    private String legalEntity;
    @Basic
    @Column(name = "dd_ac_id")
    private BigDecimal ddAcId;
}
