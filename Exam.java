/**
 A class representing an Exam, which is a type of Assessment.
 */
public class Exam extends Assessment {
    private int numQuestions;   // Number of questions on the exam
    private int numMissed;      // Number of questions missed
    private double pointsEach;  // Points for each question

    /**
     * Constructor to create an Exam object.
     * @param questions The number of questions on the exam.
     * @param missed The number of questions the student missed.
     */
    public Exam(int questions, int missed) {
        this.numQuestions = questions;
        this.numMissed = missed;
        this.calculateScore();
    }

    /**
     * Calculates the score and updates it using the setScore method.
     */
    private void calculateScore() {
        pointsEach = 100.0 / numQuestions;
        double numericScore = 100.0 - (numMissed * pointsEach);
        setScore((int) Math.round(numericScore)); // Rounds to nearest int
    }

    /**
     * Gets the point value of each question.
     * @return The point value of each question.
     */
    public double getPointsEach() {
        return pointsEach;
    }
}
