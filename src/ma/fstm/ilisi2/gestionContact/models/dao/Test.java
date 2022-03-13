package ma.fstm.ilisi2.gestionContact.models.dao;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import javax.transaction.Transaction;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.hibernate.SharedSessionContract;
import org.hibernate.cfg.Configuration;


import ma.fstm.ilisi2.gestionContact.models.bo.Contact;
import ma.fstm.ilisi2.gestionContact.models.bo.Type;

public class Test {

	public static void main(String[] args) {
		
		Type type=new Type("Familly");
		type.setId(Long.valueOf(1));
		Contact contact=new Contact("Salah Eddine","ABID","0621337194",type);
		contact.setId(Long.valueOf(5));
		DaoContact daoContact=new DaoContact();
		DaoType daoType=new DaoType();
		Collection<Type> list=daoType.getAll();
		for(Type c:list) {
			System.out.println(c.getTitle());
		}
		//Contact c=daoContact.findByID(Long.valueOf(5));
		//System.out.println(c.getPhone());
	}
}
