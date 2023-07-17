package com.study.interface_.DB_;

public class useDBtest {
    public static void main(String[] args) {
        MongoDB mongoDB = new MongoDB();
        MySQL mySQL = new MySQL();
        Oracle oracle = new Oracle();
        Server.getDB(mongoDB);
        Server.getDB(mySQL);
        Server.getDB(oracle);// argument is a class that implemented the interface.

    }
}

class Server{
    public static void getDB(DBconnector dbcnt){// parameter is an interface
        dbcnt.connect();
        dbcnt.close();
    }
}
