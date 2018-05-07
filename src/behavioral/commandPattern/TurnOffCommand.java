package behavioral.commandPattern;

class TurnOffCommand implements Command {

    private final Light light;

    TurnOffCommand(Light l) {
        light = l;
    }

    @Override
    public void execute() {
        light.turnOff();
    }

    @Override
    public void undo() {
        System.out.println("撤消关闭操作");
    }

}
