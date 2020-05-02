package inheritance;

public class Nokia1100 extends PreNokia1100 {

   public static void main(String[] args) {
      PreNokia1100 p1 = new Nokia1100();
      p1.sendText();
      p1.contactList();
      p1.makeCall();

   }
}
