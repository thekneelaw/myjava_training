/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package training;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author PSD-DANNY
 */
@XmlRootElement(name = "question")
@XmlAccessorType (XmlAccessType.FIELD)
public class Question
{
    private String answer;

    private String question;

    private String[] option;

    private String QID;

    public String getAnswer ()
    {
        return answer;
    }

    public void setAnswer (String answer)
    {
        this.answer = answer;
    }

    public String getQuestion ()
    {
        return question;
    }

    public void setQuestion (String question)
    {
        this.question = question;
    }

    public String[] getOption ()
    {
        return option;
    }

    public void setOption (String[] option)
    {
        this.option = option;
    }

    public String getQID ()
    {
        return QID;
    }

    public void setQID (String QID)
    {
        this.QID = QID;
    }

    @Override
    public String toString()
    {
        return "\nClassPojo [answer = "+answer+", question = "+question+", option = "+option+", QID = "+QID+"]";
    }
}
