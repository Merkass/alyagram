package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

public class AlyagramConfig {

    // сюда добавляешь всех разработчиков Alyagram
    private static final String[] DEV_USERNAMES = {
            "alya_bridgz"
    };

    public static boolean isDevUser(TLRPC.User user) {
        if (user == null || user.username == null) return false;
        String uname = user.username.toLowerCase();
        for (String dev : DEV_USERNAMES) {
            if (uname.equals(dev.toLowerCase())) return true;
        }
        return false;
    }
}