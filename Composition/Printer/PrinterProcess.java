package Composition.Printer;

/**
 * Created by braij on 4/7/2017.
 */
public class PrinterProcess {

    private DuplexProcess duplexProcess;
    private LaserProcess laserProcess;

    protected PrinterProcess(DuplexProcess duplexProcess, LaserProcess laserProcess) {
        this.duplexProcess = duplexProcess;
        this.laserProcess = laserProcess;
    }

    public DuplexProcess getDuplexProcess() {
        return duplexProcess;
    }
    public LaserProcess getLaserProcess() {
        return laserProcess;
    }

}
