import java.time.LocalDate;

public class Unit {
    private String UnitNo;
    private String PhaseName;
    private String ProjectName;
    private  String Zone;
    private LocalDate HOD;
    private int BUA;
    private int GA;

    public void setBUA(int BUA) {
        this.BUA = BUA;
    }

    public void setGA(int GA) {
        this.GA = GA;
    }

    public void setHOD(LocalDate HOD) {
        this.HOD = HOD;
    }


    public void setUnitNo(String unitNo) {
        UnitNo = unitNo;
    }

    public void setProjectName(String projectName) {
        ProjectName = projectName;
    }

    public void setZone(String zone) {
        Zone = zone;
    }

    public void setPhaseName(String phaseName) {
        PhaseName = phaseName;
    }
    public Unit(){

    }

}
