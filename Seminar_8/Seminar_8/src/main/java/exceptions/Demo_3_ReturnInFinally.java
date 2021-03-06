package exceptions;

/**
 *
 */
public class Demo_3_ReturnInFinally {

    public static void main(String[] args){
        System.out.println("got number: " + getNumber1(5));
        System.out.println("got number: " + getNumber2(5));
    }

    static int getNumber1(int n){
        try {
            return n * n;
        } finally {
            return 0;
        }
    }

    static int getNumber2(int n){
        int result = 0;
        try {
            result = n * n;
        } finally {
            result = 7;
        }
        return result;
    }
}
