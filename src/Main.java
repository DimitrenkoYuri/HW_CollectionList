import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> products = new ArrayList<>();

        while (true) {
            System.out.println("Выберите номер одной из операций: \n1. Добавить, \n2. Показать, \n3. Удалить");
            String input = scanner.next();

            switch (input) {
                case "1": {
                    System.out.println("Что вы хотите добавить в список?");
                    products.add(scanner.next());

                    break;
                }
                case "2": {
                    showOrders(products);

                    break;
                }
                case "3":
                    showOrders(products);
                    System.out.println("Какую покупку Вы хотите удалить? Введите либо порядковый номер продукта, либо название продукта");
                    String nameOrNumber = scanner.next();
                    try {
                        int index = Integer.parseInt(nameOrNumber) - 1;
                        products.remove(index);
                    } catch (Exception e) {
                        products.remove(nameOrNumber);
                    }
                    break;
            }
        }
    }

    private static void showOrders(List<String> products) {
        System.out.println("Список покупок:");
        for (int i = 0; i < products.size(); i++) {
            int count = i + 1;
            System.out.println(count + ". " + products.get(i));
        }
    }
}

