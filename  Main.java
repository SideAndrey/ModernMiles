public class Main {
    public void main(String[] args) { 
        BonusMilesService service = new BonusMilesService();
            int price = 12150;
            int miles = service.calculate(price);
            System.out.println(miles); 
    }
}
