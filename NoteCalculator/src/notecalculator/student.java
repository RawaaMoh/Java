/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notecalculator;

/**
 *
 * @author RawaaMoh
 */
public class student {

    int midterNote, finalNote, labNote;

    public student(int midterNote, int finalNote, int labNote) {
        this.midterNote = midterNote;
        this.finalNote = finalNote;
        this.labNote = labNote;
    }

    student() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
    }

    public double termNote() {
        double termNote = 0.0;
        termNote = ((0.3 * midterNote) + (0.5 * finalNote) + (0.2 * labNote));
        return termNote;
    }

    public String letterNote() {
        String letterNote = null;
        if (termNote() > 90 && termNote() < 100) {
            letterNote = "AA";
        } else if (termNote() > 85 && termNote() < 89) {
            letterNote = "BA";
        } else if (termNote() > 80 && termNote() < 84) {
            letterNote = "BB";
        } else if (termNote() > 75 && termNote() < 79) {
            letterNote = "CB";
        } else if (termNote() > 65 && termNote() < 74) {
            letterNote = "CC";
        } else if (termNote() > 60 && termNote() < 64) {
            letterNote = "DC";
        } else if (termNote() < 59 && termNote() > 0) {
            letterNote = "FF";
        }
        return letterNote;
    }

}
