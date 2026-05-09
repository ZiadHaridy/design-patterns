public class SetTempCommand implements Command {
    private final Thermostat thermostat;
    private final int newTemp;
    private int prevTemp;

    public SetTempCommand(Thermostat thermostat, int newTemp) {
        this.thermostat = thermostat;
        this.newTemp = newTemp;
    }

    @Override
    public void execute() {
        prevTemp = thermostat.getTemp();
        thermostat.setTemp(newTemp);
    }

    @Override
    public void undo() {
        thermostat.setTemp(prevTemp);
    }
}
