
public class Main {
    public static void main(String[] args) {
        playQuiz p1 = new playQuiz();
        p1.displayQuestions();

        Studetns aman = new Studetns(1, "aman",-1);
        p1.Letsplay(aman);
        aman.getMarks();


        Studetns vinay = new Studetns(1, "vinay",-1);
        p1.Letsplay(vinay);
        vinay.getMarks();
        aman.getMarks();
    }
}
