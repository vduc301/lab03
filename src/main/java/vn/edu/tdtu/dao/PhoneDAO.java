package vn.edu.tdtu.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import utils.HibernateUtils;
import vn.edu.tdtu.domain.Phone;
import vn.edu.tdtu.repository.Repository;

import java.util.List;

public class PhoneDAO implements Repository<Phone,Integer> {


    @Override
    public Integer add(Phone phone) {
        Session session = HibernateUtils.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        int id = (int) session.save(phone);
        transaction.commit();
        session.close();
        return id;
    }

    @Override
    public List<Phone> readAll() {

        return null;
    }

    @Override
    public Phone read(Integer id) {
        return null;
    }

    @Override
    public boolean update(Phone item) {
        return false;
    }

    @Override
    public boolean delete(Integer id) {
        return false;
    }
}
