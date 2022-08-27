public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Book сrimeAndPunishment= new Book(" Преступление и наказание", 1866);
        Book deadSouls= new Book(" Мертвые души", 1842);
        Author dostoevskii = new Author("Достоевский", "Федор Михайлович");
        Author gogol = new Author(" Гоголь", " Николай Васильевич");
        System.out.println(сrimeAndPunishment.getName()+","+сrimeAndPunishment.getYearIssue()+","+dostoevskii.getNameAuthor()+" "+dostoevskii.getLastNameAuthor()+".");
        сrimeAndPunishment.setYearIssue(1900);
        System.out.println(сrimeAndPunishment.getName()+","+сrimeAndPunishment.getYearIssue()+","+dostoevskii.getNameAuthor()+" "+dostoevskii.getLastNameAuthor()+".");
        System.out.println(deadSouls.getName()+","+deadSouls.getYearIssue()+","+gogol.getNameAuthor()+" "+gogol.getLastNameAuthor()+".");
    }


}