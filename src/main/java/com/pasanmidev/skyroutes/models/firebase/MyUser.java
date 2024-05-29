package com.pasanmidev.skyroutes.models.firebase;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class MyUser {
    private String userID;
    private String userEmail;

    // TODO posible mejora agregar proveedores


    public MyUser(String userID, String userEmail) {
        this.userID = userID;
        this.userEmail = userEmail;
    }
}
