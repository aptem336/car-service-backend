package carservicebackend;

import javax.persistence.*;

@Entity
@Table(name = "orders", schema = "orders")
public class OrdersEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int Id;
    @Basic
    private String fullName;
    @Basic
    private String phoneNumber;
    @Basic
    private String stateNumber;
    @Basic
    private String insuranceType;
    @Basic
    private String insurancePolicyDateStart;
    @Basic
    private String insurancePolicyDateEnd;
    @Basic
    private String inspectionType;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getStateNumber() {
        return stateNumber;
    }

    public void setStateNumber(String stateNumber) {
        this.stateNumber = stateNumber;
    }

    public String getInsuranceType() {
        return insuranceType;
    }

    public void setInsuranceType(String insuranceType) {
        this.insuranceType = insuranceType;
    }

    public String getInsurancePolicyDateStart() {
        return insurancePolicyDateStart;
    }

    public void setInsurancePolicyDateStart(String insurancePolicyDateStart) {
        this.insurancePolicyDateStart = insurancePolicyDateStart;
    }

    public String getInsurancePolicyDateEnd() {
        return insurancePolicyDateEnd;
    }

    public void setInsurancePolicyDateEnd(String insurancePolicyDateEnd) {
        this.insurancePolicyDateEnd = insurancePolicyDateEnd;
    }

    public String getInspectionType() {
        return inspectionType;
    }

    public void setInspectionType(String inspectionType) {
        this.inspectionType = inspectionType;
    }
}
