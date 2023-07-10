package com.debasish.hibernateproject1;

import com.debasish.hibernateproject1.entity.OrderData;
import com.debasish.hibernateproject1.entity.Person;
import com.debasish.hibernateproject1.repository.OrderdataRepository;
import com.debasish.hibernateproject1.repository.PersonRepository;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
      //  Person person = new Person(1,"Legain Tenzing","Male",30,"7418529630"); 
       // Person person = new Person(2,"Legain Tenzing","Male",30,"74185255145"); 
       // Person person = new Person(3,"Lily","female",25,"9876543210"); 
      //  Person person = new Person(4,"Nirnai","male",29,"12123363"); 
        Person person = new Person(1,"Nirnai","male",29,"121233630"); 
    //    Person person = new Person(25,"Nirnai","male",29,"121233630"); 
        PersonRepository repository = new PersonRepository();
        repository.savePerson(person);
        System.out.println(repository.savePerson(person));
        System.out.println(repository.updatePerson(person));
        System.out.println(repository.getPersonById(2));
        System.out.println(repository.deletePerson(4));
        System.out.println(repository.getAllData());
        System.out.println(repository.getPhoneNumberByName("Legain Tenzing"));
        System.out.println(repository.personDataByPersonNameAndAge("lily",25));
        OrderData data = new OrderData("laptop",50,"electronics");
       // OrderData data = new OrderData("UA lockdown4",2,"Shoes");
        OrderdataRepository repository1 = new OrderdataRepository();
        System.out.println(repository1.saveOrder(data));
        System.out.println(repository1.deleteOrder(2));
        
     
    }
   // Person person = new Person(6,"vijay","male",23,"9965346522");
   // PersonRepository repository = new PersonRepository();
    //System.out.println(repository.savePerson(person));
   //System.out.println(repository.updatePerson(person));
    //System.out.println(repository.getPersonById(2));
   // System.out.println(repository.deletePerson(2));
    //System.out.println(repository.getAllData()); 
  // System.out.println(repository.getPhoneNumberByName("Debasish"));
   // System.out.println(repository.savePerson(person));

    }

