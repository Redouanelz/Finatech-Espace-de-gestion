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
 * Meter generated by hbm2java
 */
@Entity
@Table(name = "meter", catalog = "Redouane")
public class Meter implements java.io.Serializable {

	private Integer id;
	private Client client;
	private String reference;
	private String location;
	private Set<Consumption> consumptions = new HashSet<Consumption>(0);
	private Set<Parameter> parameters = new HashSet<Parameter>(0);

	public Meter() {
	}

	public Meter(Client client, String reference, String location) {
		this.client = client;
		this.reference = reference;
		this.location = location;
	}

	public Meter(Client client, String reference, String location, Set<Consumption> consumptions,
			Set<Parameter> parameters) {
		this.client = client;
		this.reference = reference;
		this.location = location;
		this.consumptions = consumptions;
		this.parameters = parameters;
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
	@JoinColumn(name = "id_client", nullable = false)
	public Client getClient() {
		return this.client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	@Column(name = "reference", nullable = false, length = 25)
	public String getReference() {
		return this.reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	@Column(name = "location", nullable = false, length = 30)
	public String getLocation() {
		return this.location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "meter")
	public Set<Consumption> getConsumptions() {
		return this.consumptions;
	}

	public void setConsumptions(Set<Consumption> consumptions) {
		this.consumptions = consumptions;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "meter")
	public Set<Parameter> getParameters() {
		return this.parameters;
	}

	public void setParameters(Set<Parameter> parameters) {
		this.parameters = parameters;
	}

}
