package org.farm.fms.etntity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "sales", schema = "myfms")
@NamedQueries(value = {
		@NamedQuery(name = "findSalesHistoryOrederByDate", query = "select sale FROM Sales sale ORDER BY :date DESC") })
public class Sales implements Serializable {

	private static final long serialVersionUID = 966903096023682335L;

	private Integer idSales;
	private Integer dispensary;
	private String drugName;
	private Integer quantity;
	private String weight;
	private String brand;
	private String batchNumber;
	private String unit;
	private Date registrationdate;
	private Double unitPrice;
	private Double totalPrice;
	private Integer dose;
	private String salesPerson;
	private String packUnit;

	public Sales() {
		// defuale constructor
	}

	@Id
	@SequenceGenerator(name = "myfms.sales_id_sales_seq", sequenceName = "myfms.sales_id_sales_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "myfms.sales_id_sales_seq")
	@Column(name = "id_sales", unique = true, nullable = false)
	public Integer getIdSales() {
		return idSales;
	}

	@Column(name = "drug_name", nullable = false, length = 255)
	public String getDrugName() {
		return drugName;
	}

	@Column(name = "quantity", nullable = false)
	public Integer getQuantity() {
		return quantity;
	}

	@Column(name = "weight", nullable = false)
	public String getWeight() {
		return weight;
	}

	@Column(name = "brand")
	public String getBrand() {
		return brand;
	}

	@Column(name = "batch_number")
	public String getBatchNumber() {
		return batchNumber;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "registration_date")
	public Date getRegistrationdate() {
		return registrationdate;
	}

	@Column(name = "unit_price", nullable = false)
	public Double getUnitPrice() {
		return unitPrice;
	}

	@Column(name = "total_price", nullable = false)
	public Double getTotalPrice() {
		return totalPrice;
	}

	@Column(name = "dose")
	public Integer getDose() {
		return dose;
	}

	@Column(name = "sales_person")
	public String getSalesPerson() {
		return salesPerson;
	}

	@Column(name = "id_dispensary")
	public Integer getDispensary() {
		return dispensary;
	}

	@Column(name = "pack_unit")
	public String getPackUnit() {
		return packUnit;
	}

	public void setPackUnit(String packUnit) {
		this.packUnit = packUnit;
	}

	public void setDispensary(Integer dispensary) {
		this.dispensary = dispensary;
	}

	public void setIdSales(Integer idSales) {
		this.idSales = idSales;
	}

	public void setDrugName(String drugName) {
		this.drugName = drugName;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setBatchNumber(String batchNumber) {
		this.batchNumber = batchNumber;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public void setRegistrationdate(Date registrationdate) {
		this.registrationdate = registrationdate;
	}

	public void setUnitPrice(Double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public void setTotalPrice(Double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public void setDose(Integer dose) {
		this.dose = dose;
	}

	public void setSalesPerson(String salesPerson) {
		this.salesPerson = salesPerson;
	}

}
