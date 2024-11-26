package Atividades;
import java.util.Enumeration;
public class TextStatement extends Statement {
    
    @Override
    protected String getHeader(Customer aCustomer) {
        return "Rental Record for " + aCustomer.getName() + "\n";
    }

    @Override
    protected String getRentalLine(Rental aRental) {
        return "\t" + aRental.getMovie().getTitle() + "\t" +
               String.valueOf(aRental.getCharge()) + "\n";
    }

    @Override
    protected String getFooter(Customer aCustomer) {
        String result = "Amount owed is " + 
                        String.valueOf(aCustomer.getTotalCharge()) + "\n";
        result += "You earned " + 
                  String.valueOf(aCustomer.getTotalFrequentRenterPoints()) +
                  " frequent renter points";
        return result;
    }
    }
