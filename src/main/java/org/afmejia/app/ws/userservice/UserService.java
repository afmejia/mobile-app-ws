package org.afmejia.app.ws.userservice;

import org.afmejia.app.ws.ui.model.request.UserDetailsRequestModel;
import org.afmejia.app.ws.ui.model.response.UserRest;

public interface UserService {
	UserRest createUser (UserDetailsRequestModel userDetails);
}
