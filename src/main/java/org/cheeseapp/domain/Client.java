package org.cheeseapp.domain;

import javax.persistence.*;

@Entity
@Table(name="clients")
public class Client {
    @Column(name = "id_пользователя")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer clientId;
    @Column(name= "фамилия")
    private String clientSurname;
    @Column(name= "имя")
    private String clientName;
    @Column(name= "номер_телефона")
    private String phone;
    @Column(name="e_mail")
    private String mail;
    @Column(name= "логин")
    private String clientLogin;
    @Column(name= "пароль")
    private String clientPassword;
    @Column(name= "адрес")
    private String address;

    public Client() {
    }

    public Client(String clientName, String clientSurname) {
        this.clientName = clientName;
        this.clientSurname = clientSurname;
    }

    public Integer getClientId() {
        return clientId;
    }

    public void setClientId(Integer clientId) {
        this.clientId = clientId;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getClientSurname() {
        return clientSurname;
    }

    public void setClientSurname(String clientSurname) {
        this.clientSurname = clientSurname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getClientLogin() {
        return clientLogin;
    }

    public void setClientLogin(String clientLogin) {
        this.clientLogin = clientLogin;
    }

    public String getClientPassword() {
        return clientPassword;
    }

    public void setClientPassword(String clientPassword) {
        this.clientPassword = clientPassword;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Client{" +
                "clientId=" + clientId +
                ", clientName='" + clientName + '\'' +
                ", clientSurname='" + clientSurname + '\'' +
                ", phone='" + phone + '\'' +
                ", mail='" + mail + '\'' +
                ", clientLogin='" + clientLogin + '\'' +
                ", clientPassword='" + clientPassword + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
