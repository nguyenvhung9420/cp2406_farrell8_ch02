import javax.swing.JOptionPane;
import javax.swing.JFrame;

public class DebugTwo4
{
   public static void main(String[] args)
   {
      String costString;
      double cost;
      final double TAX = 0.06;
      JFrame frame = new JFrame("Enter price of item you are buying");
      costString = JOptionPane.showInputDialog(frame, "Purchases", JOptionPane.INFORMATION_MESSAGE);
      cost = Double.parseDouble(costString);
      JOptionPane.showMessageDialog(null,"With " + TAX * 100 + "% tax,  purchase  is $" + (cost - cost * TAX));
   }
}
