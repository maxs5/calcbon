public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 213;
        int miles = service.calculate(price);
        System.out.println("Ваш бонус " + miles + " миль");
    }
}