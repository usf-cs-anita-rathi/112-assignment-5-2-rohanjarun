import java.util.Scanner;

public class Grading {
       int q1, q2, q3, midTerm, finalExam;
       char grade;
       double overAllScore;
       public Grading()
       {
              q1 = q2 = q3 = midTerm = finalExam = 0;
              grade = 'F';
              overAllScore = 0;
       }
       public int getQ1() {
              return q1;

       }
       public void setQ1(int q1) {
              this.q1 = q1;
       }

       public int getQ2() {
              return q2;
       }

       public void setQ2(int q2) {
              this.q2 = q2;
       }

       public int getQ3() {
              return q3;
       }

       public void setQ3(int q3) {
              this.q3 = q3;
       }

       public int getMidTerm() {
              return midTerm;
       }

       public void setMidTerm(int midTerm) {
              this.midTerm = midTerm;
       }

       public int getFinalExam() {
              return finalExam;

       }

       public void setFinalExam(int finalExam) {

              this.finalExam = finalExam;

       }
       public char getGrade() {
              return grade;

       }

       public void setGrade(char grade) {
              this.grade = grade;

       }

       public double getOverAllScore() {
              return overAllScore;

       }

       public void setOverAllScore(double overAllScore) {
              this.overAllScore = overAllScore;

       }
       public void CalculateGrade()

       {

              overAllScore = overAllScore + ((double)(getQ1()+getQ2()+getQ3())/30)*25;
              overAllScore = overAllScore + ((double)(getMidTerm())/100)*35;
              overAllScore = overAllScore + ((double)(getFinalExam())/100)*40;
              if(overAllScore >= 90)
                     setGrade('A');
              else if(overAllScore >= 80)
                     setGrade('B');
              else if(overAllScore >= 70)
                     setGrade('C');
              else if(overAllScore >= 60)

                     setGrade('D');
              else
                     setGrade('F');

       }
       @Override

       public String toString() {
              return "grade = " + grade + "\noverAllScore = " + overAllScore;

       }
       public static void main(String[] args) {

              Scanner sc = new Scanner(System.in); //scanner object
              Grading g = new Grading();
              System.out.print("Enter quiz1 score: ");
              g.setQ1(sc.nextInt());
              System.out.print("Enter quiz2 score: ");
              g.setQ2(sc.nextInt());
              System.out.print("Enter quiz3 score: ");
              g.setQ3(sc.nextInt());             
              System.out.print("Enter mid term score: ");
              g.setMidTerm(sc.nextInt());
              System.out.print("Enter final exam score: ");
              g.setFinalExam(sc.nextInt());
              g.CalculateGrade(); //calculate grade
              System.out.println(g); //print grade
              sc.close();
       }

}
