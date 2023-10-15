package domain.entities;

import java.util.Date;

public class Contract {
    private final Date date;
    private final double valuePerHour;
    private final int hours;

    private Contract(Date date, double valuePerHour, int hours) {
        this.date = date;
        this.valuePerHour = valuePerHour;
        this.hours = hours;
    }

    public static Contract createContract(Date date, double valuePerHour, int hours) {
        return new Contract(date, valuePerHour, hours);
    }

    protected Date getDate() {
        return this.date;
    }

    protected double getValuePerHour() {
        return this.valuePerHour;
    }

    protected int getHours() {
        return this.hours;
    }

    protected double getTotalValue() {
        return this.valuePerHour * this.hours;
    }
}
