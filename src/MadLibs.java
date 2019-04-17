import javax.swing.*;

public class MadLibs
{
    public static void main(String[] args)
    {
        String color;
        String wordEST;
        String bodyPartPlural;
        String animal;
        String noun;
        String pluralNoun;
        String aString;
        String bString;
        int a;
        int b;
        int c;

        color = JOptionPane.showInputDialog(null,
                "Enter a color. ", JOptionPane.INFORMATION_MESSAGE);

        wordEST = JOptionPane.showInputDialog(null,
                "Enter a word ending in EST. ", JOptionPane.INFORMATION_MESSAGE);

        bodyPartPlural = JOptionPane.showInputDialog(null,
                "Enter a plural body part. ", JOptionPane.INFORMATION_MESSAGE);

        animal = JOptionPane.showInputDialog(null,
                "Enter a animal. ", JOptionPane.INFORMATION_MESSAGE);

        noun = JOptionPane.showInputDialog(null,
                "Enter a noun. ", JOptionPane.INFORMATION_MESSAGE);

        pluralNoun = JOptionPane.showInputDialog(null,
                "Enter a plural noun. ", JOptionPane.INFORMATION_MESSAGE);

        aString = JOptionPane.showInputDialog(null,
                "Enter a number. ", JOptionPane.INFORMATION_MESSAGE);
        a = Integer.parseInt(aString);

        bString = JOptionPane.showInputDialog(null,
                "Enter another number. ", JOptionPane.INFORMATION_MESSAGE);
        b = Integer.parseInt(bString);

        c = a + b;

        JOptionPane.showMessageDialog(null, "The " + color + " Dragon is the "
                + wordEST + " Dragon of all it has \n " + c + bodyPartPlural +
                ", and a " + animal + " shaped like a " + noun + ". \nIt loves to eat " +
                pluralNoun + ", although it will feast on nearly anything.");

    }
}
