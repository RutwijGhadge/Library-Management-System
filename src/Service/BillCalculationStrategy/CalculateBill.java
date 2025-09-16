package Service.BillCalculationStrategy;

import Models.Constants.Category;
import Models.Receipt;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class CalculateBill implements BillCalculationStrategy{

    public final double PER_HOUR_RENT_EDUCATION= 5;
    public final double PER_HOUR_RENT_ROMANCE= 4;
    public final double PER_HOUR_DRAMA= 3;
    public final double PER_HOUR_FICTION= 3.5;
    public final double PER_HOUR_DEFAULT_RATE= 2.5;

    @Override
    public double calculateBillAmount(Receipt receipt , LocalDateTime timeOfReturn) {
        LocalDateTime timeOfPurchase=receipt.timeOfPurchase;

        long totalNumberOfHours= ChronoUnit.HOURS.between(timeOfPurchase,timeOfReturn);
        Category category=receipt.getBook().getCategory();
        if(category.equals(Category.EDUCATION)){
            return totalNumberOfHours*PER_HOUR_RENT_EDUCATION;
        }else if(category.equals(Category.DRAMA)){
            return totalNumberOfHours*PER_HOUR_DRAMA;
        }else if(category.equals(Category.FICTION)){
            return totalNumberOfHours*PER_HOUR_FICTION;
        }else if(category.equals(Category.ROMANCE)){
            return totalNumberOfHours*PER_HOUR_RENT_ROMANCE;
        }
        return totalNumberOfHours*PER_HOUR_DEFAULT_RATE;
    }
}
