package Homework8;

/**
 * Abstract class representing a generic user of the student management system.
 * Extended by Student, Professor, and Admin classes.
 */
public abstract class User {
    protected String id;
    protected String name;
    protected String username;
    protected String password;

    /**
     * Constructs a new User.
     */
    public User(String id, String name, String username, String password) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.password = password;
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public String getUsername() { return username; }
    public String getPassword() { return password; }

    /**
     * Displays the menu specific to the user role.
     */
    public abstract void showMenu();


}
