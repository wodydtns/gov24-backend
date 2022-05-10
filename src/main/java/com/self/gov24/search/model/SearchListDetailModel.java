package com.self.gov24.search.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name="gov24_service_detail")
public class SearchListDetailModel {
	@Id
	@Column(name="service_id")
	public String serviceId;
	@Column(name="need_document")
	public String needDocument;
	@Column(name="answering_number")
	public String answeringNumber;
	@Column(name="statute")
	public String statute;
	@Column(name="service_name")
	public String serviceName;
	@Column(name="service_purpose")
	public String servicePurpose;
	@Column(name="select_standard")
	public String selectStandard;
	@Column(name="jurisdiction_name")
	public String jurisdictionName;
	@Column(name="update_date")
	public String updateDate;
	@Column(name="application_period")
	public String applicationPeriod;
	@Column(name="apply_method")
	public String applyMethod;
	@Column(name="application_site_url")
	public String applicationSiteUrl;
	@Column(name="autonomy_statue")
	public String autonomyStatue;
	@Column(name="application_agency_name")
	public String applicationAgencyName;
	@Column(name="application_content")
	public String applicationContent;
	@Column(name="application_object")
	public String applicationObject;
	@Column(name="application_type")
	public String applicationType;
	@Column(name="administration_rules")
	public String administrationRules;
	/*
	@OneToOne(mappedBy = "searchListDetail")
	private SearchListModel searchList;
	*/
}
