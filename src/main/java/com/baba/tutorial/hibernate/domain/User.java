package com.baba.tutorial.hibernate.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import javax.persistence.Transient;

@Entity
@Table(name = "FINANCES_USER")
@Access(AccessType.FIELD)
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "table_generatore")
	@TableGenerator(name = "table_generatore", table = "ifinances_keys", pkColumnName = "PK_NAME", valueColumnName = "PK_VALUE")
	@Column(name = "USER_ID")
	private Long userId;

	@Column(name = "FIRST_NAME")
	private String firstName;

	@Column(name = "LAST_NAME")
	private String lastName;

	@Column(name = "BIRTH_DATE")
	private Date birthDate;

	@Column(name = "EMAIL_ADDRESS")
	private String emailAddress;

	@Column(name = "LAST_UPDATED_DATE")
	private Date lastUpdatedDate;

	@Column(name = "LAST_UPDATED_BY")
	private String lastUpdatedBy;

	@Column(name = "CREATED_DATE")
	private Date createdDate;

	@Column(name = "CREATED_BY")
	private String createdBy;

	@ElementCollection
	@CollectionTable(name = "USER_ADDRESS", joinColumns = @JoinColumn(name = "USER_ID"))
	@AttributeOverrides({ @AttributeOverride(name = "addressLine1", column = @Column(name = "USER_ADDRESS_LINE_1")),
			@AttributeOverride(name = "addressLine2", column = @Column(name = "USER_ADDRESS_LINE_2")),
			@AttributeOverride(name = "city", column = @Column(name = "CITY")),
			@AttributeOverride(name = "state", column = @Column(name = "STATE")),
			@AttributeOverride(name = "zipCode", column = @Column(name = "ZIP_CODE")) })
	private List<Address> address = new ArrayList<>();

	@OneToOne(mappedBy = "user")
	private Credential credentail;

	public Credential getCredentail() {
		return credentail;
	}

	public void setCredentail(Credential credentail) {
		this.credentail = credentail;
	}

	public List<Address> getAddress() {
		return address;
	}

	public void setAddress(List<Address> address) {
		this.address = address;
	}

	@Transient
	private boolean valid;

	public boolean isValid() {
		return valid;
	}

	public void setValid(boolean valid) {
		this.valid = valid;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public Date getLastUpdatedDate() {
		return lastUpdatedDate;
	}

	public void setLastUpdatedDate(Date lastUpdatedDate) {
		this.lastUpdatedDate = lastUpdatedDate;
	}

	public String getLastUpdatedBy() {
		return lastUpdatedBy;
	}

	public void setLastUpdatedBy(String lastUpdatedBy) {
		this.lastUpdatedBy = lastUpdatedBy;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

}