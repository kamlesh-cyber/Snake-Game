import javax.swing.JFrame;
public class Frame extends JFrame{
    Frame(){
        //adding the panel to the snake
        this.add(new Panel());

        this.setTitle("Snake");
        //setting the closing action to close all instances of Jfram
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //ensuring uniformity of the panel
        this.setResizable(false);
        //ensuring system prefferd size id set
        this.pack(); //game experience will be same regardless the screen size
        //displaying the panel to the user
        this.setVisible(true);
        //ensuring the game starts at the centre of the display
        this.setLocationRelativeTo(null);


    }
}
