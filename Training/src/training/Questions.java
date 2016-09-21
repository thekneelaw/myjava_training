/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package training;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author PSD-DANNY
 */
@XmlRootElement(name = "questions-root")
@XmlAccessorType(XmlAccessType.FIELD)
public class Questions {

    private List<Question> questions = new ArrayList<Question>();

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }

    @Override
    public String toString() {
        return "ClassPojo [questions = " + questions + "]";
    }

    public static boolean containsQID(Collection<Question> c, String qid) {
        if (c.stream().anyMatch((o) -> (o != null && o.getQID().equals(qid)))) {
            return true;
        }
        return false;
    }
}
