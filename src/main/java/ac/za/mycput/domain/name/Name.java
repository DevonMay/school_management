package ac.za.mycput.domain.name;
/*
Name.java
This is the domain class for Name
@author: Anicka Schouw 217284183
June 2022
 */
import com.sun.istack.NotNull;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import java.io.Serializable;
import com.sun.istack.NotNull;
import javax.persistence.Entity;
import java.io.Serializable;

@Entity
@Embeddable
public class Name implements Serializable {

    @NotNull private String firstName;
    private  String middleName;
    @NotNull private String lastName;

    protected Name(){}

    private Name(Builder builder){
        this.firstName = builder.firstName;
        this.middleName = builder.middleName;
        this.lastName = builder.lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "Name{" +
                "firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    public static class Builder{
        private String firstName;
        private String middleName;
        private String lastName;

        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder setMiddleName(String middleName) {
            this.middleName = middleName;
            return this;
        }

        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder copy(Name name){
            this.firstName = name.firstName;
            this.middleName = name.middleName;
            this.lastName = name.lastName;
            return this;
        }

        public Name build(){
            return new Name(this);
        }
    }


}
