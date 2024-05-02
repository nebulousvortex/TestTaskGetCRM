import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OptimalRoute {
    public static void main(String[] args) {
        List<Attraction> attractions = new ArrayList<>();
        attractions.add(new Attraction("Исаакиевский собор", 5, 10));
        attractions.add(new Attraction("Эрмитаж", 8, 11));
        attractions.add(new Attraction("Кунсткамера", 3.5, 4));
        attractions.add(new Attraction("Петропавловская крепость", 10, 7));
        attractions.add(new Attraction("Ленинградский зоопарк", 9, 15));
        attractions.add(new Attraction("Медный всадник", 1, 17));
        attractions.add(new Attraction("Казанский собор", 4, 3));
        attractions.add(new Attraction("Спас на Крови", 2, 9));
        attractions.add(new Attraction("Зимний дворец Петра I", 7, 12));
        attractions.add(new Attraction("Зоологический музей", 5.5, 6));
        attractions.add(new Attraction("Музей обороны и блокады Ленинграда (1)", 2, 19));
        attractions.add(new Attraction("Музей обороны и блокады Ленинграда (2)", 5, 8));
        attractions.add(new Attraction("Навестить друзей", 12, 20));
        attractions.add(new Attraction("Музей восковых фигур", 2, 13));
        attractions.add(new Attraction("Литературно-мемориальный музей Ф.М. Достоевского", 4, 2));
        attractions.add(new Attraction("Екатерининский дворец", 1.5, 5));
        attractions.add(new Attraction("Петербургский музей кукол", 1, 14));
        attractions.add(new Attraction("Музей микроминиатюры «Русский Левша»", 3, 18));
        attractions.add(new Attraction("Всероссийский музей А.С. Пушкина и филиалы", 6, 1));
        attractions.add(new Attraction("Музей современного искусства Эрарта", 7, 16));

        // Сортировка по коэффициенту ценности
        attractions.sort((a1, a2) -> Double.compare(a2.getValueCoefficient(), a1.getValueCoefficient()));

        // Оставшееся время и накопленная ценность
        double remainingTime = 48 - 2 * 8;
        int currentImportance = 0;


        List<Attraction> optimalRoute = new ArrayList<>();
        for (Attraction attraction : attractions) {
            if (remainingTime >= attraction.time) {
                optimalRoute.add(attraction);
                remainingTime -= attraction.time;
            }
        }

        System.out.println("Оптимальный маршрут:");
        for (Attraction attraction : optimalRoute) {
            System.out.println("    " + attraction.name);
            currentImportance += attraction.importance;
        }

        System.out.println("Накопленная ценность:");
        System.out.println("    " + currentImportance);
    }
}
