package base;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import org.hibernate.sql.Select;
import org.junit.experimental.theories.Theories;

import domain.RateDomainModel;
import util.HibernateUtil;
import org.apache.poi.ss.formula.functions.FinanceLib;
import Student.hbm.xml;
public class RateDAL{
	


	public static double getRate(int GivenCreditScore) {
		//FinalExam - please implement		
		// Figure out which row makes sense- return back the 
		// right interest rate from the table based on the given credit score
		double InterestRate = 0.0;
		if (GivenCreditScore > (Select MINCREDITSCORE from , RateID = 1)) &&
				(GivenCreditScore < (Select MINCREDITSCORE from , RateID = 2)){
					InterestRate = (Select INTERESTRATE from , RateID = 1);
					
				}
		if (GivenCreditScore > (Select MINCREDITSCORE from , RateID = 2) &&
				(GivenCreditScore > (Select MINCREDITSCORE from , RateID = 3))){
			InterestRate =(Select INTERESTRATE from , RateID = 2);
		}
				
		if (GivenCreditScore > (Select MINCREDITSCORE from , RateID = 3) &&
				(GivenCreditScore > (Select MINCREDITSCORE from , RateID = 4))){
					InterestRate = (Select INTERESTRATE from , RateID = 3);
				}
		if (GivenCreditScore > (Select MINCREDITSCORE from , RateID = 4) &&
				(GivenCreditScore > (Select MINCREDITSCORE from , RateID = 5))){
					InterestRate = (Select INTERESTRATE from , RateID = 4);
				}
		else {
					InterestRate = (Select INTERESTRATE from , RateID = 5);
				}
		
		//FinalExam - obviously change the return value
		return InterestRate;
	}

}