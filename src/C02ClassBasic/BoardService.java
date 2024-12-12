package C02ClassBasic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BoardService {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        Author 와 List 를 만들기 위해 list 생성
        List<Author> at = new ArrayList<>();
        List<Post> ps = new ArrayList<>();
//        while 문으로 계속 반복
        while(true) {
            System.out.println("서비스 입력");
            int input = Integer.parseInt(sc.nextLine());

            switch (input) {
//        1.회원가입 : 이름, 이메일(unique,,,,), 비밀번호, id값(auto_increment)
                case 1:
                    System.out.println("이름을 입력하시오");
                    String name = sc.nextLine();
                    System.out.println("이메일을 입력하시오.");
                    String email = sc.nextLine();
                    System.out.println("비밀번호 입력하시오");
                    String pass = sc.nextLine();

                    Author a1 = new Author(name, email, pass);
                    at.add(a1);
                    break;


//        2.회원 전체 목록 조회 : id, email
                case 2:
                    for (Author a : at) {
                        System.out.print(a.getId()+"\t");
                        System.out.println(a.getEmail());
                    }
                    break;

//        3.회원 상세 조회(id로 조회) : id, email, name, password, 작성글 수    관리자가 id를 알고있으니 id로 조회
                case 3:
                    System.out.println("id를 입력하시오");
                    int id = Integer.parseInt(sc.nextLine());
                    int count = 0;
                    for (Author a : at) {
                        if (a.getId() == id) {
                            System.out.println(a.getId());
                            System.out.println(a.getEmail());
                            System.out.println(a.getName());
                            System.out.println(a.getPass());
                        }
                        for (Post p : ps) {
                            if (p.getAuthor().equals(a)) {
                                count++;
                            }
                        }

                    }
                    System.out.println(count);

                    break;

 //        4.게시글 작성 : 제목, 내용, 작성자email -> author_id를 찾아서 id로 변경 입력  사용자는 id를 모르니
//          email로 조회해서 찾기. post의 id값(auto_increment)
                case 4:
                    System.out.println("제목 입력");
                    String title = sc.nextLine();
                    System.out.println("내용 입력");
                    String contents = sc.nextLine();
                    System.out.println("이메일 입력");
                    String email2 = sc.nextLine();

                    Author author = null;
                    for (Author a : at) {
                        if (a.getEmail().equals(email2)) {
                            author = a;
                        }
                    }
                    Post p1 = new Post(title, contents, author);
                    ps.add(p1);

                    System.out.println(title);
                    System.out.println(contents);
                    System.out.println(author.getId());
                    System.out.println(p1.getId());
                    break;

//        5.게시물 목록 조회 : id(post), title   for문?
                case 5:
                    for (Post p : ps) {
                        System.out.print(p.getId()+ "\t");
                        System.out.println(p.getTitle());
                    }
                    break;
//        6.게시물 상세 조회 : id(post), title, contents, 작성자email
                case 6:
                    System.out.println("작성자 이메일을 입력하세요");
                    String email3 = sc.nextLine();

                    for (Author a : at) {
                        if (a.getEmail().equals(email3)) {
                            for (Post p : ps) {
                                System.out.println(p.getId());
                                System.out.println(p.getTitle());
                                System.out.println(p.getContent());
                            }
                        }
                    }
                    break;

//        7.서비스 종료
                case 7:
                    System.out.println("종료");
                    break;
            }
        }


    }
}

class Author {
    private String name;
    private String email;
    private String pass;
    private int id;
    static int static_id = 0;

    public Author(String name, String email, String pass) {
        static_id++;
        this.name = name;
        this.email = email;
        this.pass = pass;
        this.id = static_id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPass() {
        return pass;
    }
}

class Post {
    private String title;
    private String content;
    private Author author;
    private int id;
    static int static_id=0;

    public Post(String title, String content, Author author) {
        static_id++;
        this.title = title;
        this.content = content;
        this.author  = author;
        this.id = static_id;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public Author getAuthor() {
        return author;
    }
}
