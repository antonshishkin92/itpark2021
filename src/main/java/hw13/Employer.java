package hw13;


import java.util.List;
import java.util.Objects;

public class Employer implements Comparable<Employer>{

    private int id;
    private String PNS;
    private int workAge;

    public Employer(int id,String PNS,int workAge) {
        this.id = id;
        this.PNS = PNS;
        this.workAge = workAge;
    }

    private Employer(){

    }


    public String getPNS() {
        return PNS;
    }

    public void setPNS(String PNS) {
        this.PNS = PNS;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getWorkAge() {
        return workAge;
    }

    public void setWorkAge(int workAge) {
        this.workAge = workAge;
    }

    @Override
    public String toString() {
        return "Employer{" +
                "id=" + id +
                ", PNS='" + PNS + '\'' +
                ", workAge=" + workAge +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employer employer = (Employer) o;
        return id == employer.id && workAge == employer.workAge && PNS.equals(employer.PNS);
    }

    @Override
    public int hashCode() {
        return Objects.hash(PNS, id, workAge);
    }

    @Override
    public int compareTo(Employer o) {
        return 0;
    }
}
