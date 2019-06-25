package com.zeyilinxin.pixelmonmoretask.listener;

import catserver.api.bukkit.event.ForgeEvent;
import com.pixelmonmod.pixelmon.api.events.CaptureEvent;
import com.zeyilinxin.pixelmonmoretask.PixelmonMoreTask;
import net.minecraftforge.fml.common.eventhandler.Event;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class PixelmonEventListener implements Listener {

    private PixelmonMoreTask task;

    public PixelmonEventListener(PixelmonMoreTask task) {
        this.task = task;
    }

    @EventHandler
    public void onCaptureEvent(ForgeEvent forgeEvent){
        Event fEvent = forgeEvent.getForgeEvent();
        if (fEvent instanceof CaptureEvent.SuccessfulCapture){
            CaptureEvent.SuccessfulCapture event = (CaptureEvent.SuccessfulCapture) fEvent;

        }
    }
}
