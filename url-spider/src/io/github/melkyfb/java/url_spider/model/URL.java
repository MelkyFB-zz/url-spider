package io.github.melkyfb.java.url_spider.model;

import java.util.Date;
import java.util.Map;

public class URL {
	
	private long id;
	private String url;
	private Map<String,Integer> wordlist;
	private Date updateDate;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public Map<String, Integer> getWordlist() {
		return wordlist;
	}
	public void setWordlist(Map<String, Integer> wordlist) {
		this.wordlist = wordlist;
	}
	public Date getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	
}
