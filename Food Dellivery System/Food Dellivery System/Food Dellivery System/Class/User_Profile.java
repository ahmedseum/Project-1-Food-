package Class;

import Interfaces.IUserInformation;

public abstract class User_Profile implements IUserInformation {
    private String Phone_NUmber;
    private String Location, name;
    public void UserName(String name) {
        this.name=name;
    }
    public void getuserLocation(String location)
    {
        this.Location=location;
    };
    public void getuserPhoneNUmber(String Phone_number)
    {
        this.Phone_NUmber=Phone_number;
    }

    public void set_Information(String name, String Location, String Phone_NUmber) {
        this.name = name;
        this.Location = Location;
        this.Phone_NUmber = Phone_NUmber;
    }
}