package lesson8.recordcompany;

public class Management {
    public static void main(String[] args) {
        Database database = new Database();
        UserMenu userMenu = new UserMenu(database);
        userMenu.showMenu();
    }
}
