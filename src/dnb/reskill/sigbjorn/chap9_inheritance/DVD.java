package src.dnb.reskill.sigbjorn.chap9_inheritance;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DVD extends LibraryItem {
    private int playingTime;
    private ClassificationType classification;

    private final int NUM_OF_DAYS_TO_BORROW = 7; // Could this be declared abstract in superclass an implemented here?

    public enum ClassificationType { UNIVERSAL, YOUTH, ADULT}


    public DVD(String title, String code, int playingTime, ClassificationType classification) {
        super(title, code);
        this.playingTime = playingTime;
        this.classification = classification;
    }

    public String getPlayingTimeHourMinute() {
        if (playingTime > 0) {
            int hours = this.playingTime / 60;
            int minutes = this.playingTime % 60;
            return String.format("%d:%02d", hours, minutes);
        }
        else {
            return "00:00";
        }
    }

    @Override
    public boolean canBeBorrowedBy(Member m) {
        switch (this.classification) {
            case ADULT:
                return m.isAdult();
            case YOUTH:
                return m.isYouth();
            default:
                return true;
        }
    }

    public String dateDueBack() {
        Calendar cal = Calendar.getInstance();
        cal.setTime(super.dateBorrowed);
        cal.add(Calendar.DATE, NUM_OF_DAYS_TO_BORROW); // Can constants be made abstract and not declared in superclass???
        return new SimpleDateFormat("dd.MM.yyyy").format(cal.getTime());
    }


    @Override
    public String toString() {
        return String.format("(DVD) %s \nPlaying time: %s",
                super.toString(),
                this.getPlayingTimeHourMinute());
    }

}
