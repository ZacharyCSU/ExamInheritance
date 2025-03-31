/**
 A class that holds a grade for assessment.
 */
public class Assessment {
    private int score;  // Numeric score

    /**
     * Sets the score field.
     * @param s The value to store in score.
     */
    public void setScore(int s) {
        this.score = s;
    }

    /**
     * Returns the score.
     * @return The value stored in the score field.
     */
    public int getScore() {
        return this.score;
    }

    /**
     * Returns a letter grade based on the score.
     * @return The letter grade.
     */
    public char getGrade() {
        char letterGrade;
        switch (this.score / 10) {
            case 10:
            case 9:
                letterGrade = 'A';
                break;
            case 8:
                letterGrade = 'B';
                break;
            case 7:
                letterGrade = 'C';
                break;
            case 6:
                letterGrade = 'D';
                break;
            default:
                letterGrade = 'F';
                break;
        }
        return letterGrade;
    }
}