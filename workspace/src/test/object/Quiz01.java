package test.object;

class Member{
    static String name;
    static String id;
    static int age;

    public static String getName() { return name; }

    public static void setName(String name) { Member.name = name; }

    public static String getId() { return id; }

    public static void setId(String id) { Member.id = id; }

    public static int getAge() { return age; }

    public static void setAge(int age) { Member.age = age; }
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
