package org.example.Exercise4;

public class Reducer {


        String visi = "1234";
        long sum = 1;

        public long reduce (String visi){
            for (int i = visi.length(); i > 0; i--) {
                sum = 1;
                for (int j = 0; j < visi.length(); j++) {
                    String visi1 = String.valueOf(visi.charAt(j));

                    int visi2 = Integer.parseInt(visi1);

                    sum = sum * visi2;
                    System.out.println(sum);
                }
                visi = String.valueOf(sum);
            }
            return sum;
        }

    }

