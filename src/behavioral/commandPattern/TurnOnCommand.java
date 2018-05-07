package behavioral.commandPattern;

class TurnOnCommand implements Command {

    private final Light light;

    TurnOnCommand(Light l) {
        light = l;
    }

    @Override
    public void execute() {
        light.turnOn();
    }

    @Override
    public void undo() {
        System.out.println("撤消打开操作");
    }

}
