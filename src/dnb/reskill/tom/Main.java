//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package dnb.reskill.tom;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        String bufferText = testStringBuffer("Hello");
        System.out.println(bufferText);
    }

    public static String testStringBuffer(String initialString) {
        StringBuffer buffer = new StringBuffer(2);
        buffer.append(initialString);
        buffer.delete(2, 5);
        buffer.deleteCharAt(1);
        buffer.append("llaisitre");
        buffer.insert(1, 'a');
        buffer.replace(buffer.length() - 3, buffer.length(), "ken");
        buffer.reverse();
        return buffer.toString();
    }

    public static void runVarArgs() {
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;
        int e = 5;
        int[] var10001 = new int[]{a, b, c};
        System.out.println("sum of three integers are :" + getSum(var10001));
        var10001 = new int[]{a, b, c, d, e};
        System.out.println("sum of five integers are " + getSum(var10001));
    }

    public static int getSum(int... intList) {
        int result = 0;

        for(int i = 0; i < intList.length; ++i) {
            result = Integer.sum(result, intList[i]);
        }

        return result;
    }
}
