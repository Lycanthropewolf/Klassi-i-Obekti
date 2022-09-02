public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        var dostoevskii = new Author("Достоевский", "Федор Михайлович");
        var gogol = new Author(" Гоголь", " Николай Васильевич");
        var crimeAndPunishment= new Book(" Преступление и наказание", dostoevskii ,1866);
        var deadSouls= new Book(" Мертвые души",gogol   ,1842);
        var deadSouls1= new Book(" Мертвые души",gogol   ,1842);
        System.out.println(crimeAndPunishment.getName()+","+crimeAndPunishment.getYearIssue()+",");
        crimeAndPunishment.setYearIssue(1900);
        System.out.println(deadSouls.toString());
        System.out.println(crimeAndPunishment.toString());
        System.out.println(deadSouls.equals(deadSouls1));
        System.out.println(deadSouls.equals(crimeAndPunishment));

    }


}