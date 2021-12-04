package example;

import arc.*;
import arc.scene.ui.Button;
import arc.scene.ui.layout.Table;
import arc.util.*;
import arc.Events;
import mindustry.*;
import mindustry.content.*;
import mindustry.game.EventType.*;
import mindustry.gen.*;
import mindustry.mod.*;
import mindustry.ui.dialogs.*;

public class ExampleJavaMod extends Mod{

    public ExampleJavaMod() {
        Log.info("Loaded ExampleJavaMod constructor.");
        Events.on(WorldLoadEvent.class, e -> {

            Table but = new Table();
            but.button("hi",null);

            BaseDialog dialog = new BaseDialog("Shit");
            dialog.cont.add("behold").row();
            dialog.cont.image(Core.atlas.find("example-java-mod-frog")).pad(20f).row();
            dialog.cont.button("I see", dialog::hide).size(100f, 50f);
            dialog.show();
            Log.info("WorldEvent Start correctly");
        });
    }

    @Override
    public void loadContent(){
        Log.info("Loading some example content.");
    }

}
