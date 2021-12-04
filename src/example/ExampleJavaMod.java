package example;

import arc.*;
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

        //listen for game load event
        Events.on(ClientLoadEvent.class, e -> {
            BaseDialog dialog = new BaseDialog("Shit");
            dialog.cont.add("behold").row();
            //mod sprites are prefixed with the mod name (this mod is called 'example-java-mod' in its config)
            dialog.cont.image(Core.atlas.find("example-java-mod-frog")).pad(20f).row();
            dialog.cont.button("I see", dialog::hide).size(100f, 50f);
            dialog.show();
            Log.info("ClientLoad Start correctly");
        });
        Events.on(WorldLoadEvent.class, e -> {
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
