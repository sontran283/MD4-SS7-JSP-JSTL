package ra.ss7bt01listkhachhang;

import java.io.Serializable;

public class Customer implements Serializable {
    private String STT;
    private String name;
    private String birthday;
    private String address;
    private String image;

    public Customer() {
    }

    public Customer(String STT, String name, String birthday, String address, String image) {
        this.STT = STT;
        this.name = name;
        this.birthday = birthday;
        this.address = address;
        this.image = image;
    }

    public String getSTT() {
        return STT;
    }

    public void setSTT(String STT) {
        this.STT = STT;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
