public class DebugBox
{
   private int width;
   private int length;
   private int height;
   public  DebugBox()
   {
      length = 1;
      width = 1;
      height = 1;
   }
   public  DebugBox(int width, int length, int height)//added int in from of height
   {
      this.width = width;//include this. before each variable in this section
      this.length = length;
      this.height = height;
   }
   public void showData()
   {
      System.out.println("Width: "   + width + "  Length: " +
        length + "  Height: "+ height);//put " after Width
   }
   public double getVolume()
   { 
      double vol = length * width * height;//corrected the spelling of width, vol is l*W*h not + replaced additon for multiplication
      return vol;
   }
}
