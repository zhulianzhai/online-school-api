package com.liuxu.online.entity;

import java.io.Serializable;

/**
 * 测试表
 * @author lishouxu-ds
 *
 */
public class MyTest  implements Serializable {
	private static final long serialVersionUID = 810310692463418899L;
	private Long id;
	private String name;
	private Long age;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getAge() {
		return age;
	}
	public void setAge(Long age) {
		this.age = age;
	}

	

}
