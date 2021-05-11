package day6;

class Database1 {
    void open() { System.out.println("Database open"); }
}
class Oracle1 extends Database1 {
    void select_oracle() {
        System.out.println("Oracle select");
    }
    void open() { System.out.println("Oracle open"); }
}
class MySql1 extends Database1 {
    void select_mysql() {
        System.out.println("MySql select");
    }
    void open() { System.out.println("MySql open"); }
}
class SqlServer1 extends Database1 {
    void select_sqlserver() {
        System.out.println("SqlServer select");
    }
    void open() { System.out.println("SqlServer open"); }
}
public class Sample10 {
    static void openDb(Database1 db) {
        db.open();
    }
    static Database1 CreateDatabase(String dbName) {
        Database1 db = null;
        switch(dbName) {
            case "Oracle":
                db = new Oracle1();
                break;
            case "MySql":
                db = new MySql1();
                break;
            case "SqlServer":
                db = new SqlServer1();
                break;
        }
        return db;
    }
    public static void main(String[] args) {
//		Database db = new Oracle();
//		db.open();
//		Database db2 = new MySql();
//		db2.open();
//		openDb(new Oracle());
//		openDb(new MySql());
        Database1 db = CreateDatabase("SqlServer");
        db.open();
//		Database db2 = CreateDatabase("MySql");
    }
}