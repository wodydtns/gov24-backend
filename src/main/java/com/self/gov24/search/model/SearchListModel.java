package com.self.gov24.search.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
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
@Table(name="gov24_service_list")
public class SearchListModel {
	
	@Id
	@Column(name="service_id",length = 12)
	public String serviceId;
	
	@Column(name="department",length = 14)
	public String department;
	
	@Column(name="detail_url",length = 50)
	public String detailUrl;
	
	@Column(name="service_name",length = 55)
	public String serviceName;
	
	@Column(name="service_purpose")
	public String servicePurpose;
	
	@Column(name="standard")
	public String standard;
	
	@Column(name="jurisdiction_name",length = 10)
	public String jurisdictionName;
	
	@Column(name="jurisdiction_cd",length = 10)
	public String jurisdictionCd;
	
	@Column(name="application_period")
	public String applicationPeriod;
	
	@Column(name="apply_method")
	public String applyMethod;
	
	@Column(name="view_count")
	public int viewCount;
	
	@Column(name="apply_contents")
	public String applyContents;
	
	@Column(name="apply_object")
	public String applyObject;
	
	@Column(name="apply_type",length = 60)
	public String applyType;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="service_id")
	private SearchListDetailModel searchListDetail;
	
}
