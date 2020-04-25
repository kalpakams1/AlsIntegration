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
public class ShoppingCart {
	
	@XmlAttribute
	private String html;
	
	private String encoded_html;

	public String getHtml() {
		return html;
	}

	public void setHtml(String html) {
		this.html = html;
	}

	public String getEncoded_html() {
		return encoded_html;
	}

	public void setEncoded_html(String encoded_html) {
		this.encoded_html = encoded_html;
	}

	@Override
	public String toString() {
		return "ShoppingCart [html=" + html + ", encoded_html=" + encoded_html + "]";
	}
	
}