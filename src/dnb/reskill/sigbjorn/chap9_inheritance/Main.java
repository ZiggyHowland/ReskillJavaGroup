package src.dnb.reskill.sigbjorn.chap9_inheritance;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Member> members = new HashMap<>();
        members.put("Sigbjørn", new Member("Sigbjørn", 43));
        members.put("Sander", new Member("Sander", 17));
        members.put("Anne", new Member("Anne", 42));
        members.put("Adrian", new Member("Adrian", 14));
        members.put("Aiko", new Member("Aiko", 8));

        LibraryItem[] items = {
                new Book("Kniven", "001", "Jo Nesbø","9387382HSJBD2", Book.Genre.FICTION ),
                new Book("Sult", "002", "Knut Hamsun", "838237382HUEG2", Book.Genre.FICTION),
                new Book("En pingles dagbok", "003", "Ole Olsen", "SHFIJHE783763", Book.Genre.CHILDREN ),
                new DVD("Ringenes Herre", "D001", 162, DVD.ClassificationType.YOUTH),
                new DVD("Taxi Driver", "D002", 132, DVD.ClassificationType.ADULT) };


        items[0].borrowItemBy(members.get("Sigbjørn")); // Sigbjørn borrows Kniven
        items[4].borrowItemBy(members.get("Adrian")); // Adrian try to borrow DVD Taxi Driver (not allowed)
        items[4].borrowItemBy(members.get("Sigbjørn")); // Sigbjørn borrows DVD Taxi Driver
        items[3].borrowItemBy(members.get("Adrian")); // Adrian borrows Ringenes Herre
        items[3].borrowItemBy(members.get("Sigbjørn")); // Tries to borrow same DVD as Adrian allready has borrowed


        System.out.println(members.get("Sigbjørn").toString());
        System.out.println(members.get("Adrian").toString());

        for (LibraryItem i : items) {
            System.out.println(i.toString());
        }


    }
}
