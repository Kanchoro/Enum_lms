import java.util.Scanner;
public class Main {
    public enum Days {
        MONDAY("Дүйшөмбү"),
        TUESDAY("Шейшемби"),
        WEDNESDAY("Шаршемби"),
        THURSDAY("Бейшемби"),
        FRIDAY("Жума"),
        SATURDAY("Ишемби"),
        SUNDAY("Жекшемби");

        private final String kyrgyzName;

        Days(String kyrgyzName) {
            this.kyrgyzName = kyrgyzName;
        }

        public String getKyrgyzName() {
            return kyrgyzName;
        }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Күндү англис тилинде жазыңыз (Monday, Tuesday, ...):");
        String inputDay = scanner.nextLine().toUpperCase();

        try {
            Days day = Days.valueOf(inputDay);

            // Сабактарга жараша билдирүү чыгаруу
            switch (day) {
                case MONDAY:
                    System.out.println(day.getKyrgyzName() + " күнү: Жава окуйм.");
                    break;
                case TUESDAY:
                    System.out.println(day.getKyrgyzName() + " күнү: Англис тили сабагын окуйм.");
                    break;
                case WEDNESDAY:
                    System.out.println(day.getKyrgyzName() + " күнү: Математика сабагын окуйм.");
                    break;
                case THURSDAY:
                    System.out.println(day.getKyrgyzName() + " күнү: Физика сабагын окуйм.");
                    break;
                case FRIDAY:
                    System.out.println(day.getKyrgyzName() + " күнү: Спорт сабагын окуйм.");
                    break;
                case SATURDAY:
                    System.out.println(day.getKyrgyzName() + " күнү: Достор менен жолугушам.");
                    break;
                case SUNDAY:
                    System.out.println(day.getKyrgyzName() + " күнү: Бош убакыт өткөрөм.");
                    break;
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Туура эмес күн киргиздиңиз. Күндү англис тилинде туура жазыңыз (мисалы: Monday).");
        }
    }
    }
}