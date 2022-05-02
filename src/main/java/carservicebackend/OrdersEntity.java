package carservicebackend;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "ORDERS", schema = "ORDERS")
public class OrdersEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID", nullable = false)
    private int id;
    @Basic
    @Column(name = "FULLNAME", nullable = true, length = 256)
    private String fullname;
    @Basic
    @Column(name = "PHONENUMBER", nullable = true, length = 256)
    private String phonenumber;
    @Basic
    @Column(name = "STATENUMBER", nullable = true, length = 256)
    private String statenumber;
    @Basic
    @Column(name = "INSURANCETYPE", nullable = true, length = 256)
    private String insurancetype;
    @Basic
    @Column(name = "INSURANCEPOLICYDATESTART", nullable = true, length = 256)
    private String insurancepolicydatestart;
    @Basic
    @Column(name = "INSURANCEPOLICYDATEEND", nullable = true, length = 256)
    private String insurancepolicydateend;
    @Basic
    @Column(name = "INSPECTIONTYPE", nullable = true, length = 256)
    private String inspectiontype;

    public int getId() {
        return id;
    }

    public void setId(int column1) {
        this.id = column1;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getStatenumber() {
        return statenumber;
    }

    public void setStatenumber(String statenumber) {
        this.statenumber = statenumber;
    }

    public String getInsurancetype() {
        return insurancetype;
    }

    public void setInsurancetype(String insurancetype) {
        this.insurancetype = insurancetype;
    }

    public String getInsurancepolicydatestart() {
        return insurancepolicydatestart;
    }

    public void setInsurancepolicydatestart(String insurancepolicydatestart) {
        this.insurancepolicydatestart = insurancepolicydatestart;
    }

    public String getInsurancepolicydateend() {
        return insurancepolicydateend;
    }

    public void setInsurancepolicydateend(String insurancepolicydateend) {
        this.insurancepolicydateend = insurancepolicydateend;
    }

    public String getInspectiontype() {
        return inspectiontype;
    }

    public void setInspectiontype(String inspectiontype) {
        this.inspectiontype = inspectiontype;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrdersEntity that = (OrdersEntity) o;
        return id == that.id && Objects.equals(fullname, that.fullname) && Objects.equals(phonenumber, that.phonenumber) && Objects.equals(statenumber, that.statenumber) && Objects.equals(insurancetype, that.insurancetype) && Objects.equals(insurancepolicydatestart, that.insurancepolicydatestart) && Objects.equals(insurancepolicydateend, that.insurancepolicydateend) && Objects.equals(inspectiontype, that.inspectiontype);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, fullname, phonenumber, statenumber, insurancetype, insurancepolicydatestart, insurancepolicydateend, inspectiontype);
    }
}
