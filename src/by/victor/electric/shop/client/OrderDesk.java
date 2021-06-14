package by.victor.electric.shop.client;


import java.text.BreakIterator;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class OrderDesk {

    private static final String vowels = "aeiouAEIOU";
    public static void main(String[] args) {
     /*  ElectricDeviceFactory factory = ElectricDeviceFactory.getInstance();

        Map<Enum<?>,Object> param1 = Map.of(Oven.WIDTH,12.2, Oven.CAPACITY,32,
                Oven.DEPTH,60, Oven.HEIGHT,45.5, Oven.POWER_CONSUMPTION,1000,
                Oven.WEIGHT,10);
        ElectricDevice device = factory.produce(DeviceType.OVEN,param1);
        System.out.println(device);

        Map<Enum<?>,Object> param11 = Map.of(Oven.WIDTH,12.2, Oven.CAPACITY,32,
                Oven.DEPTH,60, Oven.HEIGHT,47.5, Oven.POWER_CONSUMPTION,1000,
                Oven.WEIGHT,100);
        ElectricDevice device11 = factory.produce(DeviceType.OVEN,param11);
        System.out.println(device11);

        Map<Enum<?>,Object> param2 = Map.of(Laptop.BATTERY_CAPACITY,1, Laptop.OS, "Windows",
                Laptop.MEMORY_ROM,4000, Laptop.SYSTEM_MEMORY,1000, Laptop.CPU,1.2,
                Laptop.DISPLAY_INCHS,18);
        device = factory.produce(DeviceType.LAPTOP,param2);
        System.out.println(device);

        Map<Enum<?>,Object> param3 = Map.of(Refrigerator.POWER_CONSUMPTION, 100,
                Refrigerator.WEIGHT,20, Refrigerator.FREEZER_CAPACITY,10,
                Refrigerator.OVERALL_CAPACITY,300.0, Refrigerator.HEIGHT,200,
                Refrigerator.WIDTH,70);
        device = factory.produce(DeviceType.REFRIGERATOR,param3);
        System.out.println(device);

        Map<Enum<?>,Object> param4 = Map.of(Speakers.POWER_CONSUMPTION,15,
                Speakers.NUMBER_OF_SPEAKERS,2, Speakers.FREQUENCY_RANGE, "2-4",
                Speakers.CORD_LENGTH,2);
        device = factory.produce(DeviceType.SPEAKERS,param4);
        System.out.println(device);

        Map<Enum<?>,Object> param5 = Map.of(VacuumCleaner.POWER_CONSUMPTION,100,
                VacuumCleaner.FILTER_TYPE,"A", VacuumCleaner.BAG_TYPE,"A2",
                VacuumCleaner.WAND_TYPE,"all-in-one",
                VacuumCleaner.MOTOR_SPEED_REGULATION,3000,VacuumCleaner.CLEANING_WIDTH,20);
        device = factory.produce(DeviceType.VACUUMCLEANER,param5);
        System.out.println(device);

        Map<Enum<?>,Object> param6 = Map.of(TabletPC.BATTERY_CAPACITY,3,
                TabletPC.DISPLAY_INCHES,14, TabletPC.MEMORY_ROM,8000,
                TabletPC.FLASH_MEMORY_CAPACITY,2,TabletPC.COLOR,"blue");
        device = factory.produce(DeviceType.TABLETPC,param6);
        System.out.println(device);

        System.out.println(param6);*/
        String text = "I am gay and you? Hi my name is gay ? In the statements that make up the body of the playGame() subroutine, the name “count” refers to the local variable. In the rest of the Game class, “count” refers to the member variable, unless hidden by other local variables or parameters named count. However, there is one further complication. Yes it's me homosexual? The member variable named count can also be referred to by the full name. Usually, the full name is only used outside the class where count is defined.";
        String text2 = " The scope of a formal parameter of a subroutine is the block that makes up the body of the\n" +
                "subroutine. The scope of a local variable extends from the declaration statement that defines\n" +
                "the variable to the end of the block in which the declaration occurs?. As noted above, it is\n" +
                "possible to declare a loop control variable of a for loop in the for statement. The scope of\n" +
                "such a declaration is considered as a special case: It is valid only within the for statement\n" +
                "and does not extend to the remainder of the block that contains the for statement.\n" +
                "    It is not legal to redefine the name of a formal parameter or local variable within its scope,\n" +
                "even in a nested block. For example, this is not allowed:\n" +
                "\n" +
                "-------------------------------------------------\n" +
                "void badSub(int y) {\n" +
                "    int x;\n" +
                "    while (y > 0) {\n" +
                "       int x; // ERROR: x is already defined.\n" +
                "    }\n" +
                "}\n" +
                "-------------------------------------------------\n" +
                "\n" +
                "     In many languages, this would be legal; the declaration of x in the while loop would hide\n" +
                "the original declaration. It is not legal in Java; however, once the block in which a variable is declared ends,\n" +
                "its name does become available for reuse in Java.\n" +
                "\n" +
                "-----------------------------------------------------------\n" +
                "void goodSub(int y) {\n" +
                "   while (y > 10) {\n" +
                "      int x;\n" +
                "// The scope of x ends here.\n" +
                "   }\n" +
                "   while (y > 0) {\n" +
                "      int x; // OK: Previous declaration of x has expired.\n" +
                "   }\n" +
                "}\n" +
                "-----------------------------------------------------------\n" +
                "\n" +
                "    You might wonder whether local variable names can hide subroutine names. This can’t\n" +
                "happen, for a reason that might be surprising. There is no rule that variables and subroutines\n" +
                "have to have different names. The computer can always tell whether a name refers to a variable\n" +
                "or to a subroutine, because a subroutine name is always followed by a left parenthesis.";


                String fullText = "    In the statements that make up the body of the playGame() subroutine, the name count refes to the local variable. In the rest of the Game clas, count refes to the meber variable, unles hidden by other local variables or parameters named count. However, thre is one futher compliation. The meber variable named count can also be refeed to by the ful name. Usually, the ful name is only used outside the clas whre count is defined. However, thre is no rule aginst using it insde the clas? The ful name, Game.count, can be used insde the playGame() subroutine to refer to the meber variable. So, the ful scope rule is that the scope of a static meber variable includes the entire clas in wich it is defined, but whre the simple name of the meber variable is hidden by a local variable or formal paameter name, the meber variable must be refeed to by its ful name of the form. Scope rules for no-static mebers are similar to thosefor static mebers, excpt that, as we shal se, no-static mebers cannot be used in static subroutines.     The scope of a formal paameter of a subroutine is the block that makes up the body of the subroutine. The scope of a local variable extnds from the declaration saement that defines the variable to the end of the block in wich the declaration occurs. As noted above, it is possible to dclare a loop control variable of a for loop in the for saement. The scope of such a declaration is consiered as a special case: It is valid only within the for saement and does not extnd to the remainder of the block that contains the for saement.     It is not legal to rdfine the name of a formal paameter or local variable within its scope, evn in a nested block. For example, this is not allowed.         In many languages, this would be legal; the declaration of x in the while loop would hide the original declaration. It is not legal in Java; however, once the block in wich a variable is declared ends, its name does bcome avilble for ruse in Jva.        You might wonder whether local variable names can hide subroutine names. This can’t happen, for a reason that might be surpriing. Thre is no rule that variables and subroutines have to have different names. The computer can alwys tel whether a name refes to a variable or to a subroutine, bcause a subroutine name is alwys followed by a left parentheis. It’s perfectly legal to have a variable called count and a subroutine called count in the same clas. This is one reason why I often write subroutine names with parenthees, as when I talk about the main() routine. It’s a good idea to think of the parenthees as part of the name. Even more is true: It’s legal to ruse clas names to name variables and subroutines. The syntax rules of Jva guarante that the computer can alwys tel when a name is being used as a clas name. A clas name is a type, and so it can be used to dclare variables and formal parameters and to specify the retun type of a fuction? This means that you could legay have a clas called Insanity in wich you dclare a fuction.        The first Insanity is the retun type of the fuction. The second is the fuction name, the third is the type of the formal paameter, and the fourth is a formal paameter name. However, plase remember that not evrything that is possible is a good idea! ";
                StringBuilder sb = new StringBuilder(fullText);

                Season gay = Season.SUMMER;
                System.out.println(Season.gay());

        System.out.println(" In the statements that make up the body of the playGame() subroutine, the name count refes to the local variable. ".strip() + " ");


                /*if (fWord.matches("(^[^.\\s,]$)"))
                    System.out.println("gay");
                String Str = "You might wonder whether local variable names can hide subroutine names.";*/
               // Pattern pattern = Pattern.compile("o([.[^\\.]]*)e");
                //Matcher matcher = pattern.matcher(Str);

               // System.out.println(nStrt);
               // if (matcher.find()){
               //     System.out.println(matcher.group());
               // }

                //Str.replaceFirst()




                // String res = Pattern.compile("(" + fWord + ")([.[^\\.]]+)(" + lWord + ")(\\s*\\.\\s*$)").matcher(Str).replaceAll("$3$2$1$4");
               // System.out.println(res);
                //Pattern pattern = Pattern.compile("(" + fWord + ")[.[^\\.]]+(" + lWord + ")\\s*\\.\\s*$");
                //Matcher matcher = pattern.matcher(Str);





    }

    private static String modifyWord (TextFragment word){
        List<String> symbols = word.toStringList();
        String firstLetter = symbols.get(0);
        String lastLetter = symbols.get(symbols.size() - 1);
        return symbols.stream().filter(symbol -> !(symbol.equals(firstLetter))).filter(symbol -> !(symbol.equals(lastLetter))).toString();
    }

    private static Double countVowelsRatio (TextFragment word){
        int vowelsCount = 0;
        for (char letter : word.getTextForm().toCharArray()){
            if (vowels.indexOf(letter) >= 0){
                vowelsCount++;
            }
        }

        return (double) vowelsCount / word.fragmentsCount();
    }



    public static void printEachBackward(BreakIterator boundary, String source) {
        int end = boundary.last();
        for (int start = boundary.previous();
             start != BreakIterator.DONE;
             end = start, start = boundary.previous()) {
            System.out.println("-------\n" + source.substring(start,end));
        }
    }

    public static void printFirst(BreakIterator boundary, String source) {
        int start = boundary.first();
        int end = boundary.next();
        System.out.println(source.substring(start,end));
    }

    public static void printAt(BreakIterator boundary, int pos, String source) {
        int end = boundary.following(pos);
        int start = boundary.previous();
        System.out.println(source.substring(start,end));
    }




}

interface TextFragment {
    String getTextForm();
    List <String> toStringList();
    List <TextFragment> getFragmentsForm();
    int fragmentsCount();
}

class Word implements TextFragment {

    private String wordTextForm;
    private List<String> wordSymbols;

    public Word(String wordTextForm, List<String> wordSymbols) {
        this.wordTextForm = wordTextForm;
        this.wordSymbols = wordSymbols;
    }

    public void setWordTextForm(String wordTextForm) {
        this.wordTextForm = wordTextForm;
    }

    public void setWordSymbols(List<String> wordSymbols) {
        this.wordSymbols = wordSymbols;
    }

    @Override
    public String getTextForm() {
        return wordTextForm;
    }

    @Override
    public List<String> toStringList() {
        return wordSymbols;
    }

    @Override
    public List<TextFragment> getFragmentsForm() {
        return null;
    }

    @Override
    public int fragmentsCount() {
        return wordSymbols.size();
    }
}

class Sentence implements TextFragment {

    private String sentenceTextForm;
    private List<TextFragment> words;

    public Sentence(String sentenceTextForm) {
        this.sentenceTextForm = sentenceTextForm;
        this.words = new LinkedList<>();
    }

    public void setSentenceTextForm(String sentenceTextForm) {
        this.sentenceTextForm = sentenceTextForm;
    }


    @Override
    public String getTextForm() {
        return sentenceTextForm;
    }

    @Override
    public List<String> toStringList() {
        return words.stream().map(TextFragment::getTextForm).collect(Collectors.toList());
    }

    @Override
    public List<TextFragment> getFragmentsForm() {
        return words;
    }

    @Override
    public int fragmentsCount() {
        return words.size();
    }

    public void addWord (TextFragment textFragment){
        words.add(textFragment);
    }

    public void removeWord (TextFragment textFragment){
        words.remove(textFragment);
    }
}

class Text implements TextFragment {

    private String textForm;
    private List<TextFragment> sentences;

    public Text(String textForm) {
        this.textForm = textForm;
        this.sentences = new LinkedList<>();
    }

    @Override
    public String getTextForm() {
        return textForm;
    }

    @Override
    public List<String> toStringList() {
        return sentences.stream().map(TextFragment::getTextForm).collect(Collectors.toList());
    }

    @Override
    public List<TextFragment> getFragmentsForm() {
        return sentences;
    }

    @Override
    public int fragmentsCount() {
        return sentences.size();
    }

    public void addSentence (TextFragment textFragment){
        sentences.add(textFragment);
    }

    public void removeSentence (TextFragment textFragment){
        sentences.remove(textFragment);
    }
}


