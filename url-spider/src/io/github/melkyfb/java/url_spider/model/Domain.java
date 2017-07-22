package io.github.melkyfb.java.url_spider.model;

import java.util.Date;
import java.util.List;

public class Domain {
	
	private long id;
	private String domain;
	private List<URL> urls;
	private Date updateDate;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getDomain() {
		return domain;
	}
	public void setDomain(String domain) {
		this.domain = domain;
	}
	public List<URL> getUrls() {
		return urls;
	}
	public void setUrls(List<URL> urls) {
		this.urls = urls;
	}
	public Date getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
}
