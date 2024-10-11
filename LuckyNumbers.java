public class LuckyNumbers {
    public LuckyNumbers() { }
  
    /* Generates a random number between min and max, inclusive,
       and returns that random number
     */
    public int randomIntegerBetween(int min, int max) {
        return (int) (Math.random() * (max - min + 1)) + min;
    }
    
    public String getLuckyNumbers() {
        String str = "Your lucky numbers are: ";
        for (int i = 0; i < 5; i ++) {
            str += String.valueOf(randomIntegerBetween(1, 65)) + " ";
        }
        str += "\nThe super ball is: " + String.valueOf(randomIntegerBetween(1, 30));
        return str;
      }    
}
  