package C02ClassBasic;

public class C0202Person {
//    private 접근제어자는 해당 클래스내에서만 접근가능
//    클래스에서 객체변수는 일반적으로 변수의 안정성을 위해 private로 설정
    private String name;
    private int age;
    private String email;


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void eating() {
        System.out.println(this.name + "님이 밥을 먹고 있습니다..");
    }

    public String whoIs() {
        String result = "이름 : " + this.name + "나이 : " + this.name + "email은 : " + this.email;
        return result;

    }
}
