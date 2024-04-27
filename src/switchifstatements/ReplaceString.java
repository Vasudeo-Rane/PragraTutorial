package switchifstatements;

class Replace {
    public static String replaceCharacter(String text, char charToReplace, char replacement) {
        // Add your code below
        int i = 0;
        String reversed = "";
        char nextCharacter;
        while (i < text.length()) {
            if (text.charAt(i) == charToReplace) {
                nextCharacter = replacement;
                reversed = reversed + nextCharacter;
            } else {
                nextCharacter = text.charAt(i);
                reversed = reversed + nextCharacter;
            }
            i++;
        }
        return reversed;
    }

    public static void main(String[] args) {
        String text = "Th<n this <bony bird b<guiling my sad fancy into smiling, By th< grav< and st<rn d<corum of th< count<nanc< it wor<,\"Though thy cr<st b< shorn and shav<n, thou,\" I said, \"art sur< no crav<n, Ghastly grim and anci<nt Rav<n wand<ring from th< Nightly shor<— T<ll m< what thy lordly nam< is on th< Night's Plutonian shor<!\" \nQuoth th< Rav<n \"N<v<rmor<.\"\n\nMuch I marv<ll<d this ungainly fowl to h<ar discours< so plainly, Though its answ<r littl< m<aning—littl< r<l<vancy bor<; For w< cannot h<lp agr<<ing that no living human b<ing <v<r y<t was bl<ss<d with s<<ing bird abov< his chamb<r door— Bird or b<ast upon th< sculptur<d bust abov< his chamb<r door, \nWith such nam< as \"N<v<rmor<.\"";
        System.out.println(replaceCharacter(text, '<', 'e'));

    }
}