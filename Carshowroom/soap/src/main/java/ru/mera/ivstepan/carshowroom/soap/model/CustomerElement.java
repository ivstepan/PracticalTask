package ru.mera.ivstepan.carshowroom.soap.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.*;
import java.util.Date;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerElement", propOrder = {
        "id",
        "customerFirstName",
        "customerLastName",
        "customerEmail",
        "birthday"
})
@XmlRootElement(name = "CustomerElement")
public class CustomerElement {

    @XmlElement(name = "Id")
    private Integer id;

    @XmlElement(name = "CustomerFirstName")
    private String customerFirstName;

    @XmlElement(name = "CustomerLastName")
    private String customerLastName;

    @XmlElement(name = "CustomerEmail")
    private String customerEmail;

    @XmlElement(name = "Date")
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birthday;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCustomerFirstName() {
        return customerFirstName;
    }

    public void setCustomerFirstName(String customerFirstName) {
        this.customerFirstName = customerFirstName;
    }

    public String getCustomerLastName() {
        return customerLastName;
    }

    public void setCustomerLastName(String customerLastName) {
        this.customerLastName = customerLastName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "CustomerElement{" +
                "id=" + id +
                ", customerFirstName='" + customerFirstName + '\'' +
                ", customerLastName='" + customerLastName + '\'' +
                ", customerEmail='" + customerEmail + '\'' +
                ", birthday=" + birthday +
                '}';
    }
}
