/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package training;

import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

/**
 *
 * @author PSD-DANNY
 */
public class Training {

    /**
     * @param args the command line arguments
     */
    public static Questions itilQuestions = new Questions();
    
    private static final String FILE_NAME = "question.xml";
    //public static String FILE_NAME =""; 
    public static void main(String[] args) {
//        Question q = new Question();
//        Questions ques = new Questions();
//        List question = new ArrayList();
//        q.setQuestion("Which role is responsible for carrying out the activities of a process?");
//        q.setAnswer("D.Process practitioner");
//        q.setQID("1001");
//        String[] option = {"A.Process owner","B.Change manager","C.Service manager","D.Process practitioner"};
//        q.setOption(option);
//        Question q2 = new Question();
//        
//        q2.setQuestion("Question2");
//        q2.setAnswer("Answer2");
//        q2.setQID("1002");
//        String[] option2 = {"A.AAAA","B.BBB","Answer2","D.DDDD"};
//        q2.setOption(option2);
//
//        question.add(q);
//        question.add(q2);
//        ques.setQuestions(question);
//        itilQuestions = ques;
        
       //System.out.println(itilQuestions.getQuestions());
        //System.out.println(question);
        //jaxbObjectToXML(ques);
//        view.QuestionView1 qv = new view.QuestionView1(xmlObject);
//        qv.show(true);
          view.QuestionViewGrid qGrid = new view.QuestionViewGrid();
          qGrid.setVisible(true);
    }
    
public static void jaxbObjectToXML(Questions emp) {

        try {
            JAXBContext context = JAXBContext.newInstance(Questions.class);
            Marshaller m = context.createMarshaller();
            //for pretty-print XML in JAXB
            m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

            // Write to System.out for debugging
            // m.marshal(emp, System.out);

            // Write to File
            m.marshal(emp, new File(FILE_NAME));
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }    

public static Questions jaxbXMLToObject() {
        try {
            JAXBContext context = JAXBContext.newInstance(Questions.class);
            Unmarshaller un = context.createUnmarshaller();
            Questions qs = (Questions) un.unmarshal(new File(FILE_NAME));
            return qs;
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return null;
    }
}
