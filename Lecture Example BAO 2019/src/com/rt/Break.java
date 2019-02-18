package com.rt;

class Break {
    public static void main(String[] args) {

        int[][] arrayOfInts = { 
            { 32, 87, 3, 589 },
            { 12, 1076, 2000, 8 },
            { 622, 127, 77, 955 }
        };
        int searchfor = 12;

        int i;
        int j = 0;
        boolean foundIt = false;



xyz:
       for (i = 0; i < 3; i++) {
        	  for (j = 0; j < 4;j++) { 
                if (arrayOfInts[i][j] == searchfor) {
                    foundIt = true;
                    break xyz;
                } 
            }
        }
		

        if (foundIt) {
            System.out.println("Found " + searchfor + " at " + i + ", " + j);
        } else {
            System.out.println(searchfor + " not in the array");
        }
    }
}