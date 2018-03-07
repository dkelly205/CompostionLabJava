import behaviours.IInput;
import behaviours.IOutput;
import device_management.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ComputerTest {
    Computer computer;
    Monitor monitor;
    Mouse mouse;

    @Before
    public void before() {
        monitor = new Monitor(22, 786432);
        mouse = new Mouse("wireless", 2);
        computer = new Computer(8, 512, monitor, mouse);
    }

    @Test
    public void hasRam() {
        assertEquals(8, computer.getRam());
    }

    @Test
    public void hasHddSize() {
        assertEquals(512, computer.getHddSize());
    }

    @Test
    public void hasOutputDevice() {
        IOutput outputDevice = computer.getOutputDevice();
        assertNotNull(outputDevice);
    }

    @Test
    public void canOutputData() {
        assertEquals("space invaders is now on screen", computer.outputData("space invaders"));
    }

    @Test
    public void testCanOutputDataUsingPrinter() {
        Printer printer = new Printer("Epson", "Stylus", 120, 4);
        Computer computer2 = new Computer(8, 512, printer, mouse);
        assertEquals("printing: space invaders", computer2.outputData("space invaders"));
    }

    @Test
    public void testCanOutputDataUsingSpeaker(){
        Speaker speaker = new Speaker(100);
        Computer computer = new Computer(8, 512, speaker, mouse);
        assertEquals("playing: Beep!", computer.outputData("Beep!"));
    }

    @Test
    public void testCanSetOutputDevice(){
        Printer printer = new Printer("Epson", "Stylus", 120, 4);
        computer.setOutputDevice(printer);
        assertEquals("printing: space invaders", computer.outputData("space invaders"));
    }

    @Test
    public void testHasInputDevice(){
        IInput inputDevice = computer.getInputDevice();
        assertNotNull(inputDevice);
    }

    @Test
    public void testCanInputDataWithMouse(){
        assertEquals("sending form", computer.inputData("form"));
    }

    @Test
    public void testCanInputDataWithKeyboard(){
        Keyboard keyboard = new Keyboard("qwerty");
        Computer computer = new Computer(8, 512, monitor, keyboard);
        assertEquals("typing details", computer.inputData("details"));
    }

    @Test
    public void testCanSetInputDevice() {
        Keyboard keyboard = new Keyboard("qwerty");
        computer.setInputDevice(keyboard);
        assertEquals("typing details", computer.inputData("details"));
    }

    @Test
    public void testDataStreamIsInitiallyNull(){
        assertEquals(null, computer.getDataStream());
    }
}
