package com.jmotto.logic.als.message.pojo;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "row")
public class Row
{
    private String error;

    private String errorcode;

    public String getError ()
    {
        return error;
    }

    public void setError (String error)
    {
        this.error = error;
    }

    public String getErrorcode ()
    {
        return errorcode;
    }

    public void setErrorcode (String errorcode)
    {
        this.errorcode = errorcode;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [error = "+error+", errorcode = "+errorcode+"]";
    }
}
		