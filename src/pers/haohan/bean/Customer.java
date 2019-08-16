package pers.haohan.bean;

public class Customer {

    String name; // 客户姓名
    char gender; // 性别
    int age;     // 年龄
    String email;// 电子邮箱
    String phone;// 电话号码


    public Customer() {
    }

    public Customer(String name, char gender, int age, String phone, String email) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.phone = phone;
        this.email = email;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    //显示当前对象的信息
    public String info(){
        return name + "\t" + gender + "\t" + age + "\t" + phone + "\t\t" + email;
    }
}
