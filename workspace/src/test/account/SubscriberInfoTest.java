package test.account;
class SubscriberInfo{
    private String name;
    private String id;
    private String password;
    private String phoneNo;
    private String address;

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public SubscriberInfo() {
        this("이름 미입력", "아이디 미입력", "비밀번호 미입력", "전화번호 미입력", "주소 미입력");

    }
    public SubscriberInfo(String name,  String id, String password){
        this(name, id, password, "전화번호 미입력", "주소 미입력");
    }
    public SubscriberInfo(String name, String id, String password, String phoneNo, String address){
        setName(name);
        setId(id);
        setPassword(password);
        setPhoneNo(phoneNo);
        setAddress(address);
    }


}
public class SubscriberInfoTest {

    public static void main(String[] args)
    {

        SubscriberInfo obj1, obj2,obj3;
        obj1=new SubscriberInfo("박유신","1017db","daewi");
        obj2=new SubscriberInfo("백곰","baekom","white", "200-000-0000","north pole");

        obj3=new SubscriberInfo();
        printSubscriberInfo(obj1);
        printSubscriberInfo(obj2);
        printSubscriberInfo(obj3);
        obj1.setAddress("교직원1숙사");
        obj1.setPhoneNo("133-1234-5678");
        printSubscriberInfo(obj1);

    }
    static void printSubscriberInfo(SubscriberInfo obj){
        System.out.println("이름:"+obj.getName());
        System.out.println("아이디:"+obj.getId());
        System.out.println("패스워드:"+obj.getPassword());
        System.out.println("전화번호:"+obj.getPhoneNo());
        System.out.println("주소:"+obj.getAddress());
        System.out.println();

    }

}
