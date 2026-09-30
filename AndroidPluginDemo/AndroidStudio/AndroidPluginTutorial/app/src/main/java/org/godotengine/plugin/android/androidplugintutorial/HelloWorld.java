package org.godotengine.plugin.android.androidplugintutorial;
import android.widget.Toast;
import org.godotengine.godot.Godot;
import androidx.annotation.NonNull;
import org.godotengine.godot.plugin.GodotPlugin;
import org.godotengine.godot.plugin.UsedByGodot;


public class HelloWorld extends GodotPlugin{


    /**
     * Base constructor passing a {@link Godot} instance through which the plugin can access Godot's
     * APIs and lifecycle events.
     *
     * @param godot
     */
    public HelloWorld(Godot godot) {
        super(godot);
    }

    @Override
    public String getPluginName() {
        return "HelloWorld";
    }
    @UsedByGodot
    public void Hell(){
        getGodot().getActivity().runOnUiThread(new Runnable() {
            @Override
            public void run() {
                Toast.makeText(getGodot().getActivity(), "HelloWorld!!", Toast.LENGTH_LONG).show();
            }
        });
    }

}
