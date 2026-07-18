package org.powernukkitx.waterdog;

import org.powernukkitx.plugin.PluginBase;

public class WaterdogPlugin extends PluginBase {

    @Override
    public void onEnable() {
        getServer().setProxyAuthProvider(new WaterdogProxyAuthProvider());
        getServer().checkLoginTime = false;
        getLogger().info("WaterdogPE proxy support enabled");
    }
}
