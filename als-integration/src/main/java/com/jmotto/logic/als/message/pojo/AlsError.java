package com.jmotto.logic.als.message.pojo;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "error")
@XmlAccessorType(XmlAccessType.FIELD)
public class AlsError
{
	@XmlElementWrapper(name="row")
    @XmlElement(name="row")
    private List<Row> rows;

    public List<Row> getRow()
    {
        return rows;
    }

    public void setRow(List<Row> rows)
    {
        this.rows = rows;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [row = "+rows+"]";
    }
}
