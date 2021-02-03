package dnb.reskill.tom;


public class Main {

    public static void main(String[] args) {

        //runVarArgs();
        String bufferText = testStringBuffer("Hello");
        System.out.println(bufferText);
    }
    /*method to change a basic Hello message to a proper Bergensk greeting in reverse*/
    public static String testStringBuffer (String initialString){
        StringBuffer buffer = new StringBuffer(2);
        buffer.append(initialString);
        buffer.delete(2,5);
        buffer.deleteCharAt(1);
        buffer.append("llaisitre");
        buffer.insert(1,'a');
        buffer.replace(buffer.length()-3,buffer.length(),"ken");
        buffer.reverse();
        return buffer.toString();
    }
    public static void runVarArgs(){
        //Excersise 2 - varargs

        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;
        int e = 5;

        System.out.println("sum of three integers are :" + getSum(a, b, c));
        System.out.println("sum of five integers are " + getSum(a,b,c,d,e));




    }
    public static int getSum(int ...intList){
        int result  = 0;
        for (int i =0; i<intList.length;i++)
        {
            result = Integer.sum(result,intList[i]);
        }
        return result;
    }

}





