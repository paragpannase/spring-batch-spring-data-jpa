package com.hovs.demo.repo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "tbmstbenefit", schema = "empbenefit")
public class Benefit implements Serializable {

	// @NotAudited
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "BENEFITID")
	private Integer benefitId;

	@Column(name = "ENTITYID")
	private Integer entityId;

	@NotNull(message = "Request Parameter 'benefit' Requires")
	@NotEmpty(message = "Request Parameter 'benefit' May Not Be Empty")
	@Column(name = "BENEFIT")
	private String benefit;

	@NotNull(message = "Request Parameter 'benefitDesc' Requires")
	@NotEmpty(message = "Request Parameter 'benefitDesc' May Not Be Empty")
	@Column(name = "BENEFITDESC")
	private String benefitDesc;

	public Integer getBenefitId() {
		return benefitId;
	}

	public void setBenefitId(Integer benefitId) {
		this.benefitId = benefitId;
	}

	public Integer getEntityId() {
		return entityId;
	}

	public void setEntityId(Integer entityId) {
		this.entityId = entityId;
	}

	public String getBenefit() {
		return benefit.trim();
	}

	public void setBenefit(String benefit) {
		this.benefit = benefit.trim();
	}

	public String getBenefitDesc() {
		return benefitDesc;
	}

	public void setBenefitDesc(String benefitDesc) {
		this.benefitDesc = benefitDesc;
	}

	@Override
	public String toString() {
		return "Benefit [benefitId=" + benefitId + ", entityId=" + entityId + ", benefit=" + benefit + ", benefitDesc="
				+ benefitDesc + "]";
	}

}
