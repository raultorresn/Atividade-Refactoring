package Atividades;

import java.util.Enumeration;

public class HtmlStatement extends Statement {

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
        return "<H1>Rentals for <EM>" + aCustomer.getName() + "</EM></H1><P>\n";
    }

    protected String getRentalLine(Rental aRental) {
        return aRental.getMovie().getTitle() + ": " +
               String.valueOf(aRental.getCharge()) + "<BR>\n";
    }

    protected String getFooter(Customer aCustomer) {
        String result = "<P>You owe <EM>" + 
                        String.valueOf(aCustomer.getTotalCharge()) + "</EM><P>\n";
        result += "On this rental you earned <EM>" + 
                  String.valueOf(aCustomer.getTotalFrequentRenterPoints()) +
                  "</EM> frequent renter points<P>";
        return result;
    }

}

