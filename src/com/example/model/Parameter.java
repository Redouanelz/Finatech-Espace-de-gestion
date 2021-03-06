package com.example.model;
// Generated Apr 18, 2017 6:49:25 PM by Hibernate Tools 4.3.5.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Parameter generated by hbm2java
 */
@Entity
@Table(name = "parameter", catalog = "Redouane")
public class Parameter implements java.io.Serializable {

	private Integer id;
	private Meter meter;
	private String label;
	private Set<Validity> validities = new HashSet<Validity>(0);

	public Parameter() {
	}

	public Parameter(Meter meter, String label) {
		this.meter = meter;
		this.label = label;
	}

	public Parameter(Meter meter, String label, Set<Validity> validities) {
		this.meter = meter;
		this.label = label;
		this.validities = validities;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_meter", nullable = false)
	public Meter getMeter() {
		return this.meter;
	}

	public void setMeter(Meter meter) {
		this.meter = meter;
	}

	@Column(name = "label", nullable = false, length = 50)
	public String getLabel() {
		return this.label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "parameter")
	public Set<Validity> getValidities() {
		return this.validities;
	}

	public void setValidities(Set<Validity> validities) {
		this.validities = validities;
	}

}
