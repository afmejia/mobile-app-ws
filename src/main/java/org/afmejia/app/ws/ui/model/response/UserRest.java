package org.afmejia.app.ws.ui.model.response;

import org.springframework.stereotype.Component;

@Component
public class UserRest {
    private String firstName;
    private String lastName;
    private String email;
    private String usrId;

    public String getFirstName() {
        return firstName;
    }

    public String getUsrId() {
        return usrId;
    }

    public void setUsrId(String usrId) {
        this.usrId = usrId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}