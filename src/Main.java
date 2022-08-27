public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Book prestuplenie_I_nakazanie= new Book(" Преступление и наказание", 1866);
        System.out.println(prestuplenie_I_nakazanie.name);
        System.out.println(prestuplenie_I_nakazanie.yearIssue);
        Author dostoevskii = new Author("Достоевский", "Федор Михайлович");
        System.out.println(dostoevskii.nameAuthor);
        System.out.println(dostoevskii.lastNameAuthor);
    }


}