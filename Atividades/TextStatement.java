package Atividades;
import java.util.Enumeration;
public class TextStatement extends Statement {
    
        public String value(Customer aCustomer) {
            Enumeration rentals = aCustomer.getRentals();
            String result = getHeader(aCustomer);
            while (rentals.hasMoreElements()) {
                Rental each = (Rental) rentals.nextElement();
                result += getRentalLine(each);
            }
            result += getFooter(aCustomer);
            return result;
        }
    
        protected String getHeader(Customer aCustomer) {
            return "Rental Record for " + aCustomer.getName() + "\n";
        }
    
        protected String getRentalLine(Rental aRental) {
            return "\t" + aRental.getMovie().getTitle() + "\t" +
                   String.valueOf(aRental.getCharge()) + "\n";
        }
    
        protected String getFooter(Customer aCustomer) {
            String result = "Amount owed is " + 
                            String.valueOf(aCustomer.getTotalCharge()) + "\n";
            result += "You earned " + 
                      String.valueOf(aCustomer.getTotalFrequentRenterPoints()) +
                      " frequent renter points";
            return result;
        }
    }
