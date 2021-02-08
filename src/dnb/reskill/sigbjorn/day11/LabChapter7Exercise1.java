package src.dnb.reskill.sigbjorn.day11;

public class LabChapter7Exercise1 {
    public static void main(String[] args) {
        stringExercises();

    }


    private static void stringExercises() {
        StringBuilder sb = new StringBuilder(50);
        sb.append("Adding some text....1");
        System.out.println(sb.toString());

        sb.delete(7,11);
        System.out.println(sb.toString());

        sb.deleteCharAt(15);
        System.out.println(sb.toString());

        char[] array1 = {'R', 's', '*', 'U', '*'};
        sb.insert(4, array1, 2, 3);
        System.out.println(sb.toString());

        char[] letterArray = new char[5];
        letterArray[0] = '#';
        letterArray[1] = 'B';
        letterArray[2] = 'c';
        letterArray[3] = 'd';
        letterArray[4] = '#';
        sb.insert(10, letterArray);
        System.out.println(sb.toString());

        sb.insert(11, "Test");
        System.out.println(sb.toString());

        int i = sb.indexOf("Test");
        sb.replace(i,i+4, "SNOW" );
        System.out.println(sb.toString());

        i = sb.indexOf("#", i);
        sb.setCharAt(i, '¤');
        System.out.println(sb.toString());

        sb.reverse();
        String finalString = sb.toString();
        System.out.println(finalString);

    }
}

