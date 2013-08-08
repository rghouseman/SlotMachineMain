
package slotmachinemain;

public class SlotMachineMain {

    public static void main(String[] args) {
      
        
     java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SlotGui().setVisible(true);
            }
        });
     
     
    }
}
