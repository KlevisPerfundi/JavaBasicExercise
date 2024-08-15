package org.example.Exercise6;

public class IdCard {

    private  char[]  visi;
    private String result;



    public static void validation(char[] visi) {


        for (int i = 0; i < visi.length; i++) {

            switch (visi[i]) {
                case '0':
                    visi[i] = 'A';
                    break;
                case '1':
                    visi[i] = 'B';
                    break;
                case '2':
                    visi[i] = 'C';
                    ;
                    break;
                case '3':
                    visi[i] = 'D';
                    ;
                    break;
                case '4':
                    visi[i] = 'E';
                    ;
                    break;
                case '5':
                    visi[i] = 'F';
                    ;
                    break;
                case '6':
                    visi[i] = 'G';
                    ;
                    break;
                case '7':
                    visi[i] = 'H';
                    ;
                    break;
                case '8':
                    visi[i] = 'I';
                    ;
                    break;
                case '9':
                    visi[i] = 'J';
                    ;
                    break;

            }
        }
    }

    public  String correction(String result,char[] visi) {
        if (result.length() % 11 == 0) {
           String visi1 =String.valueOf(visi);
           return"Your new Id card is: "+ visi1;


        } else
            return "Incorrect number";
    }
}
