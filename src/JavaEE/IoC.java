package JavaEE;
// imagine there is a XML configuration file -> which our container can help use manage these object
/*
*<XML>
*<bean name="Mysql" class="Mysql">
*<bean name="Oracle" class="Oracle">
*
* <If you want to change input to two database>
* <bean name="User" class="...User">
*   <arg ref="Mysql">
*   <arg ref="Oracle">
*
* */




// Dependency Injection: rely on abstraction rather than specific implementation
public class IoC {
    // Let's take a look for traditional object desgin
//    private MysqlDB mysqlDB; // 1/2. traditional design with specific implementation
    private DataBase dataBase; // 3. DI design
    private DataBase dataBase2;

    public IoC(DataBase dataBase) {

//        this.mysqlDB = new MysqlDB(); // 1. traditional design but if you want to test this code, it will be difficult because you have cannot pass outside database inside.
//        this.mysqlDB = mysqlDB; // 2. improvement 1.0 put MySQL database as dynamic input in constructor, which can import database from outside. But if you want to use different database?
        this.dataBase = dataBase; // 3. improvement 2.0 make database as an interface which is more abstract
    }

//    // 4. if we want to add second database in IoC class then previous code included single DB will not work anymore too much need to change
//    public IoC(DataBase dataBase, DataBase dataBase2) {
//        this.dataBase = dataBase;
//        this.dataBase2 = dataBase2;
//    }


    public static void main(String[] args) {
        MysqlDB myDB = new MysqlDB();
        IoC container = new IoC(myDB);

    }
}


// 3. make object more abstraction -> create an interface and implement that interface into different specific objects.
interface DataBase {
}

class MysqlDB implements DataBase{
    public MysqlDB() {
        System.out.println("This is Mysql");
    }
}

class OracleDB implements DataBase{
    public OracleDB() {
        System.out.println("This is Oracle");
    }
}
