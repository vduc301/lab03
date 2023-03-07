package vn.edu.tdtu;
import com.sun.xml.bind.v2.model.core.ID;
import org.hibernate.Session;
import utils.HibernateUtils;
import vn.edu.tdtu.dao.PhoneDAO;
import vn.edu.tdtu.domain.Phone;

import java.util.List;

public class    Program {
    public static void main(String[] args) {
//        try(Session session = HibernateUtils.getSessionFactory().openSession();){
//            session.beginTransaction();
//
//            //insert
//            Phone phone1 = new Phone(1, "Iphone", 1200, "Purple", "USA", 20);
//            System.out.println("PhoneID: " + phone1.getId() + "\nname: " + phone1.getName()+"\nprice: " + phone1.getPrice()+"\ncolor: " + phone1.getColor()+"\ncountry: " +phone1.getCountry()+ "\nquantity: "+phone1.getQuantity());
//            session.save(phone1);
//            session.getTransaction().commit();


//
//        }

        PhoneDAO phoneDAO = new PhoneDAO();

        Phone phone1 = new Phone("IPad", 1200, "Purple", "USA", 20, null);
        phoneDAO.add(phone1);
    }
}
