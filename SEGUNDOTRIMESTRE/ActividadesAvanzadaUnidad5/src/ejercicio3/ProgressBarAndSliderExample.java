package ejercicio3;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class ProgressBarAndSliderExample extends JFrame {

    /**
	 * 
	 */
	private static final long serialVersionUID = 8998918546036017061L;
	private JProgressBar progressBar;
    private JSlider slider;

    public ProgressBarAndSliderExample() {
        setTitle("Progress Bar and Slider Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 200);
        setLayout(new BorderLayout());

        // Crear el ProgressBar
        progressBar = new JProgressBar(0, 100);
        progressBar.setStringPainted(true);
        add(progressBar, BorderLayout.NORTH);

        // Crear el Slider
        slider = new JSlider(JSlider.HORIZONTAL, 0, 100, 0);
        slider.setMajorTickSpacing(20);
        slider.setMinorTickSpacing(5);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);
        add(slider, BorderLayout.CENTER);

        // Añadir un ChangeListener al Slider para actualizar el ProgressBar
        slider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                int value = slider.getValue();
                progressBar.setValue(value);
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ProgressBarAndSliderExample();
            }
        });
    }
}
