package lesson22;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class URIRunner {
    public static void main(String[] args) throws URISyntaxException, IOException {
        URI uri = new URI();
        System.out.println("Протокол:" + uri.getScheme());
        System.out.println("Хост " + uri.getHost());
        System.out.println("Порт " + uri.getPort());
        System.out.println("Путь " + uri.getPath());
        System.out.println("Параметры " + uri.getRawQuery());
        System.out.println("Фрагмент: " + uri.getFragment());
        System.out.println("------------------");
        URL url = new uri.toURL();
        URLConnection urlConnection = url.openConnection();
        urlConnection.addRequestProperty();
        urlConnection.connect();
        Scanner scanner = new Scanner(urlConnection.getInputStream());
//        Scanner scanner = new Scanner(url.openStream());
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
        System.out.println("------------------");
        URL resource =URIRunner.class.getResource("/data.csv");
        System.out.println(resource.toURI().getScheme());
        System.out.println(resource);
    }

}
