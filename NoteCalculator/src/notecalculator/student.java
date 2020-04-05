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

    double midterNote, finalNote, labNote;

    public double termNote() {
        double termNote = 0.0;
        termNote = (((0.3 * midterNote) + (0.5 * finalNote) + (0.2 * labNote)) / 3);
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
        } else if (termNote() > 59 && termNote() < 0) {
            letterNote = "FF";
        }
        return letterNote;
    }

}
