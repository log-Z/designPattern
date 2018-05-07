package behavioral.commandPattern;

import java.util.ArrayList;
import java.util.List;

class Switch {

    private List<Command> history = new ArrayList<>();

    void onAction(Command cmd) {
        history.add(cmd);
        cmd.execute();
    }

    void lollBack(Command cmd) {
        var index = history.indexOf(cmd);
        if (index < 0 || index >= history.size()) return;

        for (var i = history.size() - 1; i >= index; i--) {
            var invalid = history.get(i);
            invalid.undo();
            history.remove(invalid);
        }
    }

}
