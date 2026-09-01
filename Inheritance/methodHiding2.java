package Inheritance;
class Database {
    // Generic default port for any unknown database
    public static int getDefaultPort() {
        return 8080;
    }
}

class PostgresDB extends Database {
    // Hides the parent method to provide the Postgres-specific port
    public static int getDefaultPort() {
        return 5432;
    }
}
public class methodHiding2 {
    public static void main(String[] args) {
        // 1. Calling via Class Names (The Correct Way)
        System.out.println("Generic Port: " + Database.getDefaultPort());    // Output: 8080
        System.out.println("Postgres Port: " + PostgresDB.getDefaultPort()); // Output: 5432
        
        // 2. The "Method Hiding" Trap (Calling via Object Reference)
        Database myDb = new PostgresDB();
        
        // Because the method is static, the compiler looks at the REFERENCE type (Database),
        // completely ignoring that the actual object is a PostgresDB.
        System.out.println("Hidden Port: " + myDb.getDefaultPort());         // Output: 8080
    }
}
