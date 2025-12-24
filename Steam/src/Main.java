import com.acme.libmanager.service.LibManagerService;

import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        LibManagerService manager = new LibManagerService();

        System.out.println(manager.getBookByTitle("Learning Java"));

//        System.out.println("manager.getBookTitles() = " + manager.getBookTitles());
//        System.out.println("manager.getBookTitleCsv() = " + manager.getBookTitleCsv());
        System.out.println(manager.getTitlePriceMap());
        System.out.println(manager.titleLegacy());

        Stream<String> stringStream = manager.getBookList().stream().flatMap(b -> b.getTags().stream());
        Stream <Stream<String>> streamStream = manager.getBookList().stream()

    }
}