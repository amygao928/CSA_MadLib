public class runner{ // main runner class for the program (sneha +surya)
  public static void main(String[] args){
        inputCollection scanned = new inputCollection(); // create instance of the input collection class
        // call input method and split returned string into an array
        String [] storageList = scanned.inputCol().split(",");
        // extract each specific word from array into its own variable
        String adjective = storageList[0];
        String noun = storageList[1];
        String exclamation = storageList[2];
        String ingVerb = storageList[3];
        String pluralNoun = storageList[4];
        String pastVerb = storageList[5];
        String place = storageList[6];
        // create storyGeneration object using collected variables
        storyGeneration print = new storyGeneration();
        String printer = print.storyGen(adjective, noun, exclamation, ingVerb, pluralNoun, pastVerb, place);
        // print final story result
        System.out.println(printer);
        
    }
    
}
