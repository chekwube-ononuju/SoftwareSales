import javax.swing.JOptionPane; //used to get the dialogue box
import java.util.Scanner; // Scanner class imported to intpret the information

  public class Softwaresales {
       public static void main(String[] args) {

            String Words;
               int Qty; // Qty = Quantity of packages sold
            final double Price = 99; //purchase price declared as final so it can be edited later
            double discount; // the discount amount
            double total; // the total amount

            Scanner pen = new Scanner(System.in); // the scanner class imported o interpret the information
            Qty = pen.nextInt(); // so the quantity doesnt have to be initialized

            Words = JOptionPane.showInputDialog("Enter Quantity" + Qty); //the dialogue box to input the information
            Qty = Integer.parseInt(Words); // converting the string to integer

            JOptionPane.showMessageDialog( null,"Price:" + Price);

            if (Qty >= 10 && Qty <= 19) {
            discount = 0.2;
            total = (Price - (Price * discount)) * Qty;
            JOptionPane.showMessageDialog(null,"Discount is: 20%");
            JOptionPane.showMessageDialog(null,"Total:" + total);
            } else if (Qty >= 20 && Qty <= 49) {
            discount = 0.3;
            total = (Price - (Price * discount)) * Qty;
            JOptionPane.showMessageDialog(null,"Discount is 30%:");
            JOptionPane.showMessageDialog(null,"Total:" + total);
             } else if (Qty >= 50 && Qty <= 99) {
            discount = 0.4;
              total = (Price - (Price * discount)) * Qty;

            JOptionPane.showMessageDialog(null,"Discount is 40%:");
            JOptionPane.showMessageDialog(null,"Total:" + total);
            } else if (Qty >= 100) {
            discount = 0.5;
              total = (Price - (Price * discount)) * Qty;

             JOptionPane.showMessageDialog(null,"Discount is 50%:");
              JOptionPane.showMessageDialog(null,"Total:" + total);
              }else total = Price * Qty;

              JOptionPane.showMessageDialog(null,"Discount is 50%:");
            JOptionPane.showMessageDialog(null,"Total:" + total);

             // conditions to meet

      System.exit(0);
  }
}

      int id =2; //declaring variable and choosing output

        switch (id ) {

                case 1:
                System.out.println("You selected 1.");
                break;
                case 2: {
                System.out.println("You selected 2 .");
                break;
                }
                case 3: {
                System.out.println("You selected  3.");
                break;
                }
                case 4: {
                System.out.println("You selected 4.");
                }
default: {
        System.out.println("Select again please.");
        ///switch statements
        }
        }
        }
        }
