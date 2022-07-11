package core.model.request.editacc;

import java.io.File;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class editAccRequestModel {
    private String email;
    private String address;
    private String name;
    private String phone;
    private File avatar;

    public editAccRequestModel(String email, String address , String name, String phone, File avatar) {
        this.email = email;
        this.address = address;
        this.name = name;
        this.phone = phone;
        this.avatar = avatar;
    }
}
