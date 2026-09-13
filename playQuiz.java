import java.util.Scanner;

public class playQuiz {
    Question queArr[] = new Question[5];

    public void displayQuestions() {

        Question q1 = new Question(1, "Which of the following is used to create an object in Java?", "class", "new",
                "this", "object", "new");
        Question q2 = new Question(2, "What is the default value of an int instance variable in Java?", "null", "1",
                "0", "Garbage value", "0");
        Question q3 = new Question(3, "Which keyword is used to inherit a class in Java?", "implements", "inherits",
                "extends", "super", "extends");
        Question q4 = new Question(4, "What is the size of an int in Java?", "2 bytes", "4 bytes", "8 bytes",
                "Depends on the system", "4 bytes");
        Question q5 = new Question(5, "Which of these is NOT a Java primitive data type?", "int", "boolean", "string",
                "char", "string");

        queArr[0] = q1;
        queArr[1] = q2;
        queArr[2] = q3;
        queArr[3] = q4;
        queArr[4] = q5;
    }

    // ------------------Play---------------------------------
    float calculateTotal = 0;

    public void Letsplay(Studetns s) {
        int i = 1;
        for (Question q : queArr) {
            System.out.println("Question :" + i++);
            System.out.println(q.getQuestion());
            System.out.println(q.getOption1());
            System.out.println(q.getOption2());
            System.out.println(q.getOption3());
            System.out.println(q.getOption4());

            Scanner sc = new Scanner(System.in);
            System.out.print("Choose the option : ");
            String val = sc.nextLine();
            String ans = q.getAnswer();
            System.out.println(ans);
            if (val.equals(ans)) {
                System.out.println("correct +2");
                calculateTotal += 2;
            } else {
                System.out.println("Wrong ans -0.25");
                calculateTotal -= 0.25;
            }
        }

        s.setMarks(calculateTotal);
    }

}
