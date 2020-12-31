public class Main {
    public static void main(String[] args) {
        //1 -> 26
        int[] zeroTo26 = new int[26];
        char[] capitalsToZ = new char[26];
        char[] lowersToZ = new char[26];

        //0 -> 26
        int i = 0;
        while(i < 26) {
            int toSave = i + 1;
            int element = i;
            zeroTo26[element] = toSave;
            //System.out.println("Saving " + toSave  + " to element " + element + " in the zeroTo26 Array");
            i++;
        }


        // A -> Z
        int c = 65;
        while(c <= 90) {
            char built = (char) c;
            capitalsToZ[c - 65] = built;
            //System.out.println("Saving " + built  + " to element " + (c-65) + " in the capitalsToZ Array");
            c++;
        }

        // a -> z
        int l = 97;
        while(l <= 122) {
            char built = (char) l;
            lowersToZ[l - 97] = built;
            //System.out.println("Saving " + built  + " to element " + (l-97) + " in the capitalsToZ Array");
            l++;
        }

        int lastTicker = 0;
        while (lastTicker < 26) {
            System.out.println("|" + zeroTo26[lastTicker] + "\t" + "\t" + lowersToZ[lastTicker] + "\t" + "\t" + capitalsToZ[lastTicker] + "|");
            lastTicker++;
        }

    }
}
