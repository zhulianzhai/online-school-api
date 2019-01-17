package com.liuxu.online.entity;

import java.io.Serializable;

public class MyScore implements Serializable{

	private static final long serialVersionUID = 8521108755726721024L;
	
	private Long id;
	private Long testId;
	private Double score;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getTestId() {
		return testId;
	}
	public void setTestId(Long testId) {
		this.testId = testId;
	}
	public Double getScore() {
		return score;
	}
	public void setScore(Double score) {
		this.score = score;
	}
	
	

}
