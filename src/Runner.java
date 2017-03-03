
public class Runner {
    public static void main(String[] args) {

        Flover flover =new Flover("Romashka", 2, 0.9, true);
        Flover copyFlover = null;
        try {
            copyFlover = flover.clone();
        } catch (CloneNotSupportedException e) {
//            e.printStackTrace();
            System.out.println("Клонирование не подерживается");
        }
        System.out.println(flover);
        System.out.println(copyFlover);
    }
}
