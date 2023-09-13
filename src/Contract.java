import java.time.LocalDate;

public class Contract {
    private int UnitID;
    private int CustomerID;
    private int amount;
    private LocalDate StartDate;
    private LocalDate EndDate;

    public void setUnitID(int unitID) {
        UnitID = unitID;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setCustomerID(int customerID) {
        CustomerID = customerID;
    }

    public void setEndDate(LocalDate endDate) {
        EndDate = endDate;
    }

    public void setStartDate(LocalDate startDate) {
        StartDate = startDate;
    }
}
