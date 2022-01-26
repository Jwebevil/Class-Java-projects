// This class uses a DebugBox class to instantiate two Box objects
public class DebugFour3
{
   public static void main(String args[])
   {
      int width = 12;// replaced "," with ";"
      int lenght = 10;//added int to length replaced "," with ";"
      int height = 8;//added int to height
      DebugBox box1 = new DebugBox();
      DebugBox box2 = new DebugBox(width ,lenght ,height);//capitalized debugBox
      System.out.println("The dimensions of the first box are");
      box1.showData();//added "()" after showData
      System.out.print("  The volume of the first box is ");
      showVolume(box1);
      System.out.println("The dimensions of the second box are");
      box2.showData();//added " before the word The
      System.out.print("  The volume of the second box is ");
      showVolume(box2);
   }
   public static void showVolume(DebugBox aBox)
   {
      double vol = aBox.getVolume();
      System.out.println(vol);//replaced the word volume with vol
   }
}
