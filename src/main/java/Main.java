import ru.netology.SqrService.sqr.SQRService;

public class Main {
    public static void main(String[] args) {
        SQRService service = new SQRService();
        int min = 10;
        int max = 99;
        int counter = service.calculate(min, max);
        System.out.println(counter);
    }
}
