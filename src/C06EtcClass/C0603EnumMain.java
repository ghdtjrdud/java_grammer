package C06EtcClass;

public class C0603EnumMain {
    public static void main(String[] args) {

//        일반문자열로 class_grade 설정
//        EnumStudent e1 = new EnumStudent("hong1", "firstgrade");
////        calss를 별도로 생성해서, static final 변수를 가져다 쓰는 방법
//        EnumStudent e2 = new EnumStudent("hong2", CalssGrade.c1);
//        EnumStudent e3 = new EnumStudent("hong2", CalssGrade.c2);
//        EnumStudent e4 = new EnumStudent("hong3", "1stgrade");
//        Enum 클래스를 활용한 classGrade 세팅
//        Enum 클래스의 변수값을 세팅핟도록 강제함으로서, 특정변수값의 종류를 제한
        EnumStudent e1 = new EnumStudent("hong1", CalssGrade.FIRST_GRADE);
//        EnumStudent e2 = new EnumStudent("hong1", "SECOND_GRADE"); // String 으로 입력 시 에러
        System.out.println(e1.getClassGrade());
        System.out.println(e1.getClassGrade().getClass());
//        enum값 내부에는 저장된순서대로 0부터 index값이 내부적으로 할당
        System.out.println(e1.getClassGrade().ordinal());

    }
}

//class CalssGrade {
//    static final String c1 = "first_grade";
//    static final String c2 = "second_grade";
//    static final String c3 = "third_grade";
//}

enum CalssGrade {
//    각각의 상수값들의 타입은 ClassGrade라는 점에서 static final String과의 차이점이 있다.
//    enum 사용시엔 타입이 ClassGrade
    FIRST_GRADE, SECOND_GRADE, THIRD_GRADE;
}



class EnumStudent {
    private String name;
//    private String classGrade;
    private CalssGrade classGrade;
    public EnumStudent(String name, CalssGrade classGrade) {
        this.name = name;
        this.classGrade = classGrade;
    }

    public String getName() {
        return name;
    }

    public CalssGrade getClassGrade() {
        return classGrade;
    }
}
