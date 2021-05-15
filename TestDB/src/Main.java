import java.sql.*;

public class Main {

    public static final String DB_NAME = "testjava.db";
    public static final String CONNECTION_STRING = "jdbc:sqlite:D:\\JAVA\\TestDB\\" + DB_NAME;
    public static final String TABLE_CONTACTS = "contacts";
    public static final String COLUMN_NAME = "name";
    public static final String COLUMN_PHONE = "phone";
    public static final String COLUMN_EMAIL = "email";

    public static void main(String[] args) {
//        try(Connection conn = DriverManager.getConnection("jdbc:sqlite:D:\\JAVA\\TestDB\\testjava.db");
//            Statement statement = conn.createStatement()){
//            statement.execute("create table if not exists contacts (name text, phone integer, email text)");
        try{
            Connection conn = DriverManager.getConnection(CONNECTION_STRING);
            Statement statement = conn.createStatement();
//            conn.setAutoCommit(false);//doesn't let the db browser update the data
            statement.execute("drop table if exists " + TABLE_CONTACTS);
            statement.execute("create table if not exists " + TABLE_CONTACTS + "(" + COLUMN_NAME + " text, " +
                                COLUMN_PHONE + " integer, " +
                                COLUMN_EMAIL + " text)");
//            statement.execute("insert into " + TABLE_CONTACTS + " (" +
//                    COLUMN_NAME + ", " + COLUMN_PHONE + ", " + COLUMN_EMAIL + ") " +
//                    "values('Tim', 458216,'tim@gmail.com')");
//
//            statement.execute("insert into " + TABLE_CONTACTS + " (" +
//                    COLUMN_NAME + ", " + COLUMN_PHONE + ", " + COLUMN_EMAIL + ") " +
//                    "values('Joe', 1562246,'joe@gmail.com')");
//
//            statement.execute("insert into " + TABLE_CONTACTS + " (" +
//                    COLUMN_NAME + ", " + COLUMN_PHONE + ", " + COLUMN_EMAIL + ") " +
//                    "values('Jane', 4017987,'jane@gmail.com')");
//
//            statement.execute("insert into " + TABLE_CONTACTS + " (" +
//                    COLUMN_NAME + ", " + COLUMN_PHONE + ", " + COLUMN_EMAIL + ") " +
//                    "values('Fido', 305689,'fido@gmail.com')");

            insertContact(statement, "Tim", 458216,"tim@gmail.com");
            insertContact(statement, "Joe", 154854,"joe@gmail.com");
            insertContact(statement, "Jane", 1025487,"jane@gmail.com");
            insertContact(statement, "Fido", 3060501,"fido@gmail.com");

            statement.execute("update " + TABLE_CONTACTS + " set " + COLUMN_PHONE + "=201478 where " + COLUMN_NAME + "='Jane'");
            statement.execute("delete from " + TABLE_CONTACTS + " where " + COLUMN_NAME + "='Joe'");

//            statement.execute("select * from " + TABLE_CONTACTS);
//            ResultSet results = statement.getResultSet();
            ResultSet results = statement.executeQuery("select * from " + TABLE_CONTACTS);

            while (results.next()){
                System.out.println(results.getString(COLUMN_NAME) + " " + results.getInt(COLUMN_PHONE) + " " + results.getString(COLUMN_EMAIL));
            }

            results.close();
            statement.close();
            conn.close();


        } catch(SQLException e){
            System.out.println("Something went wrong: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private static void insertContact(Statement statement, String name, int phone, String email ) throws SQLException{
        statement.execute("insert into " + TABLE_CONTACTS + " (" +
                COLUMN_NAME + ", " + COLUMN_PHONE + ", " + COLUMN_EMAIL + ") " +
                "values('" + name + "', " + phone + ", '" + email + "')");
    }
}
