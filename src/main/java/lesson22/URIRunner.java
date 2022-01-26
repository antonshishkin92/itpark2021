package lesson22;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class URIRunner {
    public static void main(String[] args) throws URISyntaxException, IOException {
        URI uri = new URI("https://www.rbc.ru/rbcfreenews/61f10e6d9a7947ec6efa2931?utm_source=yxnews&utm_medium=desktop");
        System.out.println("Протокол:" + uri.getScheme());
        System.out.println("Хост: " + uri.getHost());
        System.out.println("Порт: " + uri.getPort());
        System.out.println("Путь: " + uri.getPath());
        System.out.println("Параметры: " + uri.getRawQuery());
        System.out.println("Фрагмент: " + uri.getFragment());
        System.out.println("------------------");
        URL url = uri.toURL();
        URLConnection urlConnection = url.openConnection();
        urlConnection.addRequestProperty("User-Agent","Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/96.0.4664.110 Safari/537.36 OPR/82.0.4227.58");
        urlConnection.connect();
        Scanner scanner = new Scanner(urlConnection.getInputStream());
//        Scanner scanner = new Scanner(url.openStream());
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
        System.out.println("------------------");
        URL resource =URIRunner.class.getResource("/data.csv");
        System.out.println("Протокол: " + resource.toURI().getScheme());
        System.out.println("Адрес ресурса: " + resource);
    }


}
