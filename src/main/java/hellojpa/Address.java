package hellojpa;

import javax.persistence.Embeddable;
import lombok.Getter;

@Embeddable
@Getter
public class Address {

    public Address() {

    }

    public Address(String city, String street, String zipcode) {
        this.city = city;
        this.street = street;
        this.zipcode = zipcode;
    }

    private String city;
    private String street;
    private String zipcode;
}
