package com.logging.spring.SpringLogging;

import java.io.Serializable;

public class RawTestResult  implements Serializable{
	
	String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	String date;
	String comments;
	String isFailedTestCase;
	public String getGroupTags() {
		return groupTags;
	}
	public void setGroupTags(String groupTags) {
		this.groupTags = groupTags;
	}
	public String getTestTags() {
		return testTags;
	}
	public void setTestTags(String testTags) {
		this.testTags = testTags;
	}
	public String getTestName() {
		return testName;
	}
	public void setTestName(String testName) {
		this.testName = testName;
	}
	public String getTestGroupName() {
		return testGroupName;
	}
	public void setTestGroupName(String testGroupName) {
		this.testGroupName = testGroupName;
	}
	String groupTags;
	String testTags;
	String testName;
	String testGroupName;

	
	
	
	
	public String getIsFailedTestCase() {
		return isFailedTestCase;
	}
	public void setIsFailedTestCase(String isFailedTestCase) {
		this.isFailedTestCase = isFailedTestCase;
	}
	@Override
	public String toString(){
		return "{\"testGroupName\" : \"" + this.testGroupName + "\",\"testName\" : \"" + this.testName + "\",\"groupTags\" : \"" + this.groupTags + "\",\"status\":\"" +this.isFailedTestCase+ "\"  }";
	}
	

}
