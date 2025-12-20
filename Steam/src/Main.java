import com.acme.libmanager.service.LibManagerService;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        LibManagerService manager = new LibManagerService();

        System.out.println(manager.getBookByTitle("Learning Java"));

        System.out.println("manager.getBookTitles() = " + manager.getBookTitles());

    }
}