package com.jmotto.logic.als.message.pojo;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * @author Kalpaka
 *
 */
@XmlRootElement(name = "row")
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class NameSpace {
	
	@XmlAttribute
	private String name;
	
	private String data;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "NameSpace [name=" + name + ", data=" + data + "]";
	}
	
}