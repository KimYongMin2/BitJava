package test.object;

class Member{
    static String name;
    static String id;
    static int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
public class Quiz01 {
    public static void main(String[] args) {
        Member member = new Member();
        member.setName("김용민");
        member.setId("Ym8374");
        member.setAge(26);
        System.out.println(member.getName());
        System.out.println(member.getId());
        System.out.println(member.getAge());
    }
}
