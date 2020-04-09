/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package noteCalculator02;

/**
 *
 * @author RawaaMoh
 */
public class student {

    private double midtermNote;
    private int finalNote;
    private double labNote;

    public student(double midtermNote, int finalNote, double labNote) {
        this.midtermNote = midtermNote;
        this.finalNote = finalNote;
        this.labNote = labNote;
    }

    public double getMidtermNote() {
        return midtermNote;
    }

    public void setMidtermNote(double midtermNote) {
        this.midtermNote = midtermNote;
    }

    public int getFinalNote() {
        return finalNote;
    }

    public void setFinalNote(int finalNote) {
        this.finalNote = finalNote;
    }

    public double getLabNote() {
        return labNote;
    }

    public void setLabNote(double labNote) {
        this.labNote = labNote;
    }

    public double getTermNote() {
        double termNote = 0.0;
        termNote = ((0.3 * midtermNote) + (0.5 * finalNote) + (0.2 * labNote));
        return termNote;
    }

    public String getLetterNote() {
        String letterNote = null;
        double termNote = getTermNote();
        if (termNote > 90 && termNote < 100) {
            letterNote = "AA";
        } else if (termNote > 85 && termNote < 89) {
            letterNote = "BA";
        } else if (termNote > 80 && termNote < 84) {
            letterNote = "BB";
        } else if (termNote > 75 && termNote < 79) {
            letterNote = "CB";
        } else if (termNote > 65 && termNote < 74) {
            letterNote = "CC";
        } else if (termNote > 60 && termNote < 64) {
            letterNote = "DC";
        } else if (termNote < 59 && termNote > 0) {
            letterNote = "FF";
        }
        return letterNote;
    }
}
