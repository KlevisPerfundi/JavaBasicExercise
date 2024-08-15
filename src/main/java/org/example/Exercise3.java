package org.example;

public class Exercise3 {

    int vlera;

    public int getVlera() {
        return vlera;
    }

    public void setVlera(int vlera) {
        this.vlera = vlera;
    }

    public int getSize(){
        return vlera;
    }
    public static void main(String[] args) {


    Exercise3 exercise3 = new Exercise3();
    exercise3.setVlera(4);


        for (int i = 0; i < exercise3.getVlera(); i++) {
            for (int j = 0; j < exercise3.getVlera(); j++) {
                if (j <= i) {
                    System.out.print(" # ");
                }else
                    System.out.print(" ");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < exercise3.getVlera(); i++) {
            for (int j = exercise3.getSize(); j > 0; j--) {
                if (j-1 >= i) {
                    System.out.print(" # ");
                }else
                    System.out.print(" ");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < exercise3.getVlera(); i++) {
            for (int j = exercise3.getSize(); j >= 0; j--) {
                if (j-1 >= i) {
                    System.out.print("   ");
                }else
                    System.out.print(" # ");
            }
            System.out.println();
        }

        System.out.println();

         for (int i = 0; i < exercise3.getVlera(); i++) {
            for (int j = 0; j < exercise3.getVlera(); j++) {
                if (i>j) {
                    System.out.print("   ");
                }else
                    System.out.print(" # ");
            }
            System.out.println();
        }

        System.out.println();

            for (int i = 0; i < exercise3.getVlera(); i++) {
            for (int j = 0; j < exercise3.getVlera(); j++) {
                if (i == 0 || i == exercise3.getVlera() - 1) {
                    System.out.print(" # ");
                } else if (i != 1 || i != exercise3.getVlera() - 1) {
                    if (j == 0 || j == exercise3.getVlera() - 1) {
                        System.out.print(" # ");
                    }else
                        System.out.print("   ");
                }
            }
            System.out.println();
        }

        System.out.println();

          for (int i = 0; i < exercise3.getVlera(); i++) {
            for (int j = 0; j < exercise3.getVlera(); j++) {
                if (i == 0 || i == exercise3.getVlera() - 1) {
                    System.out.print(" # ");
                } else if (i != 1 || i != exercise3.getVlera() - 1) {
                    if (j == i ) {
                        System.out.print(" # ");
                    }else
                        System.out.print("   ");
                }
            }
            System.out.println();
        }
        System.out.println();

              for (int i = 0; i < exercise3.getVlera(); i++) {
            for (int j = exercise3.getVlera()-1; j >= 0; j--) {
                if (i == 0 || i == exercise3.getVlera() - 1) {
                    System.out.print(" # ");
                } else if (i != 1 || i != 8 - 1) {
                    if (j == i ) {
                        System.out.print(" # ");
                    }else
                        System.out.print("   ");
                }
            }
            System.out.println();
        }

        System.out.println();

             for (int i = 0; i < exercise3.getVlera(); i++) {
            for (int j = 0; j < exercise3.getVlera(); j++) {
                if (i == 0 || i == exercise3.getVlera() - 1) {
                    System.out.print(" # ");
                } else if (i != 1 || i != exercise3.getVlera() - 1) {
                    if (j == i || j== exercise3.getVlera()-1-i) {
                        System.out.print(" # ");
                    }else
                        System.out.print("   ");
                }
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < exercise3.getVlera(); i++) {
            for (int j = 0; j < exercise3.getVlera(); j++) {
                if (i == 0 || i == exercise3.getVlera() - 1) {
                    System.out.print(" # ");
                } else if (i != 1 || i != exercise3.getVlera() - 1) {
                    if (j == i || j== exercise3.getVlera()-1-i||j==0||j== exercise3.getVlera()-1) {
                        System.out.print(" # ");
                    }else
                        System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
