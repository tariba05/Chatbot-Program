public class StringExplorer{
    public static void main(String[] args)
    {
        String sample = "The quick brown fox jumped over the lazy dog.";
        System.out.println("sample = " + sample);
        System.out.println();

        //  Demonstrate the indexOf method.
        int position = sample.indexOf("quick");
        System.out.println("sample.indexOf(\"quick\") = " + position);

        int notFoundPos  = sample.indexOf("slow");
        System.out.println("sample.indexOf(\"slow\") = " + notFoundPos);

        position = sample.indexOf("o");
        System.out.println("sample.indexOf(\"o\") = "+ position);
        position = sample.indexOf("o", position + 1);
        System.out.println("sample.indexOf(\"o\", position + 1) = " + position);

        System.out.println();

        //  Demonstrate the toLowerCase method.
        String lowerCase = sample.toLowerCase();
        System.out.println("sample.toLowerCase() = " + lowerCase);
        System.out.println("After toLowerCase(), sample = " + sample);
        System.out.println();

        boolean isEqual = sample.equals(sample.toLowerCase());
        System.out.println("sample.equals(sample.toLowerCase() = "+ isEqual);

        // Assign a new value to sample. Use a phrase of your choosing.
        // Pad the beginning and end of the string literal with spaces.
        sample = " We went to eat ice cream when we came back. ";
        System.out.println();
        System.out.println("sample: " + sample);

        //  Add examples below for the following methods:
        //    trim()
            String trimmed = sample.trim();
        //    length()
        System.out.println("The length is : " + sample.length());
        //    indexOf with one and two parameters
        System.out.println("The index of \"eat\" is at: " + trimmed.toLowerCase().indexOf("eat"));
        System.out.println("The index of \"we\" is at:" + trimmed.indexOf("we", 20));
        //    substring() with one and two parameters
        System.out.println("Substring of the trimed string is: " +  trimmed.substring(15, 24));
        System.out.println("Substring with one paramenter: " + trimmed.substring(11, 15));
        //    compareTo()
        System.out.println("Compare to method: W and w :" + trimmed.substring(0,1).compareTo(trimmed.substring(3, 4)));
        //    any other String methods you'd like to try

    }

}
